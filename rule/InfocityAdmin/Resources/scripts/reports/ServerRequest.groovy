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

class ServerRequest extends _DoScript {

        /**
         * параметр _WebFormData должен содержать поле <b>server</b>, равный одному из значении
         *"HumansSearchService",
         *"ForeignersSearchService",
         *"TaxIndService",
         *"TaxPayService",
         *"UDPService",
         *"BTIService",
         *"GKZService";
         * поля <b>fromdate</b> и <b>todate</b>, начальная дата и конечная дата в формате yyyy.MM.dd
        */

    @Override
    void doProcess(_Session session, _WebFormData formData, String lang) {


        String server = formData.getValueSilently("server")
        String fullServerName;
        switch(server) {
            case "HumansSearchService" : fullServerName = "миграционной полиции"; break;
            case "ForeignersSearchService" : fullServerName = "миграционной полиции"; break;
            case "TaxIndService" : fullServerName = "налогового комитета"; break;
            case "TaxPayService" : fullServerName = "налогового комитета"; break;
            case "UDPService" : fullServerName = "дорожной полиции"; break;
            case "BTIService" : fullServerName = "БТИ"; break;
            case "GKZService" : fullServerName = "АлматыЖер"; break;
            default: log("Unknown server '${server}'"); return;
        }

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
                WorkbookUtil.createSafeSheetName("Обращение к серверам-источникам"));

        Row header = sheet.createRow(0);

        CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setBold(true);
        style.setFont(font);

        Cell orgCell = header.createCell(0);
        orgCell.setCellValue("Организация");
        orgCell.setCellStyle(style);
        Cell empCell = header.createCell(1);
        empCell.setCellValue("ФИО");
        empCell.setCellStyle(style);
        Cell serviceCell = header.createCell(2);
        serviceCell.setCellValue("Сервис");
        serviceCell.setCellStyle(style);
        Cell amountCell = header.createCell(3);
        amountCell.setCellValue("Кол-во обращений");
        amountCell.setCellStyle(style);

        IDBConnectionPool dbPool = ((Database)session.getCurrentDatabase().baseObject).dbPool
        Connection conn = dbPool.getConnection();
        String query = "" +
                "select org.viewtext as org_name, emp.fullname as emp_name, method_name, count\n" +
                "from (\n" +
                "   select activity.userid, activity.method_name, count(*)\n" +
                "   from activity \n" +
                "   where service_name = ? and event_time >= ? and event_time <= ? \n" +
                "   group by activity.userid, activity.method_name \n" +
                ") as data\n" +
                "inner join employers as emp\n" +
                "   on data.userid = emp.userid\n" +
                "inner join organizations as org\n" +
                "   on emp.orgid = org.orgid\n" +
                "order by emp_name, method_name asc;"

        PreparedStatement ps = null;
        ResultSet resultSet = null;
        OutputStream out = null;
        int i = 0;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, server);
            ps.setDate(2, new Date(fromDate.getTime()));
            ps.setDate(3, new Date(toDate.getTime()));
            resultSet = ps.executeQuery()

            while (resultSet.next()) {
                Row row = sheet.createRow(i++ + 1);
                row.createCell(0).setCellValue(resultSet.getString("org_name"));
                row.createCell(1).setCellValue(resultSet.getString("emp_name"));
                row.createCell(2).setCellValue(resultSet.getString("method_name"));
                row.createCell(3).setCellValue(resultSet.getString("count"));
            }


            sheet.autoSizeColumn(0)
            sheet.autoSizeColumn(1)
            sheet.autoSizeColumn(2)
            sheet.autoSizeColumn(3)

            String sep = File.separator;
            File dir = new File(new File("").absolutePath + "${sep}webapps${sep}InfocityServices${sep}reports${sep}${ses.getCurrentUserID()}");
            if(!dir.exists())
                dir.mkdirs();

            out = new FileOutputStream(dir.getAbsolutePath() + "${sep}Обращение к серверу-источнику ${fullServerName}.xls");
            wb.write(out);

            showFile(dir.getAbsolutePath() + "${sep}Обращение к серверу-источнику ${fullServerName}.xls", "Обращение к серверу-источнику ${fullServerName}.xls")

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
