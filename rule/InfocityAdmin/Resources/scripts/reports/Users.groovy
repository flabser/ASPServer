package reports
import kz.flabs.dataengine.IDBConnectionPool
import kz.flabs.dataengine.h2.Database
import kz.nextbase.script._Session
import kz.nextbase.script._WebFormData
import kz.nextbase.script.events._DoScript
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.util.WorkbookUtil

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class Users extends _DoScript {

    @Override
    void doProcess(_Session session, _WebFormData formData, String lang) {
        Workbook wb = new HSSFWorkbook();

        Sheet sheet = wb.createSheet(
                WorkbookUtil.createSafeSheetName("Пользователи"));
        Row header = sheet.createRow(0);

        CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setBold(true);
        style.setFont(font);

        Cell orgCell = header.createCell(0);
        orgCell.setCellValue("Организация");
        orgCell.setCellStyle(style);
        Cell fioCell = header.createCell(1);
        fioCell.setCellValue("ФИО");
        fioCell.setCellStyle(style);
        Cell loginCell = header.createCell(2);
        loginCell.setCellValue("Логин");
        loginCell.setCellStyle(style);

        IDBConnectionPool dbPool = ((Database)session.getCurrentDatabase().baseObject).dbPool
        Connection conn = dbPool.getConnection();
        String query = "" +
                "select org.viewtext as org_name, emp.fullname as emp_name, emp.userid emp_login\n" +
                "from employers as emp\n" +
                "inner join organizations as org\n" +
                "\ton emp.orgid = org.orgid;";

        PreparedStatement ps = null;
        ResultSet resultSet = null;
        OutputStream out = null;
        int i = 1;
        try {
            ps = conn.prepareStatement(query);
            resultSet = ps.executeQuery()

            while (resultSet.next()) {
                Row row = sheet.createRow(i++);
                row.createCell(0).setCellValue(resultSet.getString("org_name"));
                row.createCell(1).setCellValue(resultSet.getString("emp_name"));
                row.createCell(2).setCellValue(resultSet.getString("emp_login"));
            }

            sheet.autoSizeColumn(0)
            sheet.autoSizeColumn(1)
            sheet.autoSizeColumn(2)
            String sep = File.separator;
            File dir = new File(new File("").absolutePath + "${sep}webapps${sep}InfocityServices${sep}reports${sep}${ses.getCurrentUserID()}");
            if(!dir.exists())
                dir.mkdirs();

            out = new FileOutputStream(dir.getAbsolutePath() + "${sep}Пользователи.xls");
            wb.write(out);

            showFile(dir.getAbsolutePath() + "${sep}Пользователи.xls", "Пользователи.xls")

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
