package reports
import kz.flabs.dataengine.IDBConnectionPool
import kz.flabs.dataengine.h2.Database
import kz.flabs.util.Util
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData
import kz.nextbase.script.events._DoScript
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.util.WorkbookUtil

import java.sql.Connection
import java.sql.Date
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class UsersWork extends _DoScript {

    /**
     * параметр _WebFormData должен содержать поле <b>userid</b>,
     * <b>fromdate</b> и <b>todate</b>,
     * начальная дата и конечная дата в формате yyyy.MM.dd
     */
    @Override
    void doProcess(_Session session, _WebFormData formData, String lang) {
        String userId = formData.getValueSilently("userid")

        java.util.Date fromDate = Util.convertStringToDate(formData.getValueSilently("fromdate"))
        if(fromDate == null) fromDate = Util.convertStringToDateTime(formData.getValueSilently("fromdate"))
        if(fromDate == null) fromDate = Util.convertStringToDateTimeSilently(formData.getValueSilently("fromdate"))
        if(fromDate == null) {
            log("unparseable date '" + formData.getValueSilently("fromdate") + "'")
            return;
        }
        java.util.Date toDate = Util.convertStringToDate(formData.getValueSilently("todate"))
        if(toDate == null) toDate = Util.convertStringToDateTime(formData.getValueSilently("todate"))
        if(toDate == null) toDate = Util.convertStringToDateTimeSilently(formData.getValueSilently("todate"))
        if(toDate == null) {
            log("unparseable date '" + formData.getValueSilently("todate") + "'")
            return;
        }


        Workbook wb = new HSSFWorkbook();

        Sheet sheet = wb.createSheet(
                WorkbookUtil.createSafeSheetName("Работа пользователя"));

        Row header = sheet.createRow(0);

        CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setBold(true);
        style.setFont(font);

        Cell serverCell = header.createCell(0);
        serverCell.setCellValue("Сервер-источник");
        serverCell.setCellStyle(style);
        Cell serviceCell = header.createCell(1);
        serviceCell.setCellValue("Сервис");
        serviceCell.setCellStyle(style);
        Cell amountCell = header.createCell(2);
        amountCell.setCellValue("Кол-во обращений");
        amountCell.setCellStyle(style);

        IDBConnectionPool dbPool = ((Database)session.getCurrentDatabase().baseObject).dbPool
        Connection conn = dbPool.getConnection();
        String query = "" +
                "select service_name, method_name, count(*) " +
                "from activity where userid = ? and event_time between ? and ? " +
                "group by service_name, method_name " +
                "order by service_name, method_name asc"

        PreparedStatement ps = null;
        ResultSet resultSet = null;
        OutputStream out = null;
        int i = 0;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, userId);
            ps.setDate(2, new Date(fromDate.getTime()));
            ps.setDate(3, new Date(toDate.getTime()));
            resultSet = ps.executeQuery()

            while (resultSet.next()) {
                Row row = sheet.createRow(i++ + 1);
                row.createCell(0).setCellValue(resultSet.getString("service_name"));
                row.createCell(1).setCellValue(resultSet.getString("method_name"));
                row.createCell(2).setCellValue(resultSet.getString("count"));
            }


            sheet.autoSizeColumn(0)
            sheet.autoSizeColumn(1)
            sheet.autoSizeColumn(2)
            String sep = File.separator;
            File dir = new File(new File("").absolutePath + "${sep}webapps${sep}InfocityServices${sep}reports${sep}${ses.getCurrentUserID()}");
            if(!dir.exists())
                dir.mkdirs();

            out = new FileOutputStream(dir.getAbsolutePath() + "${sep}Работа пользователя ${userId}.xls");
            wb.write(out);

        } catch (SQLException e){
            print e;
        } finally {
            if(resultSet != null){
                try{resultSet.close();} catch (SQLException ignored){}
            }
            if(ps != null){
                try{ps.close();} catch (SQLException ignored){}
            }
            if (out != null) {
                try { out.close(); } catch (IOException ignored) {}
            }
            if (wb != null) {
                try { wb.close(); } catch (IOException ignored) {}
            }
            dbPool.returnConnection(conn);
        }
    }
}
