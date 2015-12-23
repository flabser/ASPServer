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

import java.sql.*

class UsersWork extends _DoScript {

    private static HashMap<String, HashMap<String, String>> availableMethods = new HashMap<>();
    static{
        HashMap<String, String> bti = new HashMap<>();
        bti.put("serverName", "Центр недвижимости");
        bti.put("getDataByFIO", "Поиск по ФИО");
        bti.put("getDataByDoc", "Поиск по документу на владение");
        bti.put("getDataByIIN", "Поиск по ИИН");
        bti.put("getDataByAddress", "Поиск по адресу");
        availableMethods.put("BTIService", bti);

        HashMap<String, String> citizen = new HashMap<>();
        citizen.put("serverName", "Граждане РК");
        citizen.put("getHumanByFIO", "Поиск по ФИО");
        citizen.put("getHumanByDoc", "Поиск по номеру удостоверения");
        citizen.put("getCitizenByIIN", "Поиск по ИИН");
        citizen.put("getHumanByAddr", "Поиск по адресу");
        availableMethods.put("HumansSearchService", citizen);

        HashMap<String, String> foreigner = new HashMap<>();
        foreigner.put("serverName", "Иностранцы");
        foreigner.put("getPersonByFIO", "Поиск по ФИО");
        foreigner.put("getPersonByDoc", "Поиск паспорту");
        availableMethods.put("ForeignersSearchService", foreigner);

        HashMap<String, String> zher = new HashMap<>();
        zher.put("serverName", "Алматы Жер");
        zher.put("getDataByFIO", "Поиск по ФИО");
        zher.put("getDataByCompany", "Поиск по наименованию организации");
        zher.put("getDataByCadastrNumber", "Поиск по кадастровому номеру");
        zher.put("getDataByDocument", "Поиск по документу на участок");
        availableMethods.put("GKZService", zher);

        HashMap<String, String> nk = new HashMap<>();
        nk.put("serverName", "Налоговый комитет");
        nk.put("getDataByFIO", "Поиск по ФИО");
        nk.put("getDataByOrgName", "Поиск по наименованию организации");
        nk.put("getDataByIIN", "Поиск по ИИН");
        nk.put("getDataByRNN", "Поиск по РНН");
        availableMethods.put("TaxPayService", nk);

        HashMap<String, String> udp = new HashMap<>();
        udp.put("serverName", "Управление дорожной полиций");
        udp.put("getDataByOrgName", "Поиск по наименованию организации");
        udp.put("getDataByFIO", "Поиск по ФИО");
        udp.put("getDataByIIN", "Поиск по ИИН");
        udp.put("getDataByGRNZ", "Поиск по гос. номеру");
        udp.put("getDataBySRTS", "Поиск по тех. паспорту");
        availableMethods.put("UDPService", udp);
    }

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

        Cell nameCell = header.createCell(0);
        nameCell.setCellValue("ФИО");
        nameCell.setCellStyle(style);
        Cell orgCell = header.createCell(1);
        orgCell.setCellValue("Организация");
        orgCell.setCellStyle(style);
        Cell serverCell = header.createCell(2);
        serverCell.setCellValue("Сервер-источник");
        serverCell.setCellStyle(style);
        Cell serviceCell = header.createCell(3);
        serviceCell.setCellValue("Сервис");
        serviceCell.setCellStyle(style);
        Cell amountCell = header.createCell(4);
        amountCell.setCellValue("Кол-во обращений");
        amountCell.setCellStyle(style);

        IDBConnectionPool dbPool = ((Database)session.getCurrentDatabase().baseObject).dbPool
        Connection conn = dbPool.getConnection();

        String getUserData = "select emp.fullname as emp_name, org.viewtext as org_name " +
                "from employers as emp " +
                "inner join organizations as org " +
                "    on emp.orgid = org.orgid " +
                "where emp.userid = '${userId}'";

        String query = "" +
                "select service_name, method_name, count(*) " +
                "from activity where userid = ? and event_time between ? and ? " +
                "group by service_name, method_name " +
                "order by service_name, method_name asc"

        PreparedStatement ps = null;
        Statement st = null;
        ResultSet resultSet = null;
        OutputStream out = null;
        int i = 0;
        try {
            st = conn.createStatement();
            resultSet = st.executeQuery(getUserData);
            if(!resultSet.next()) {
                log("user '${userId}' not found!")
                return;
            }

            String userName = resultSet.getString("emp_name");
            String orgName = resultSet.getString("org_name");

            ps = conn.prepareStatement(query);
            ps.setString(1, userId);
            ps.setDate(2, new Date(fromDate.getTime()));
            ps.setDate(3, new Date(toDate.getTime()));
            resultSet = ps.executeQuery()

            while (resultSet.next()) {

                String methodName;
                String serviceName = resultSet.getString("service_name");
                if(availableMethods.get(serviceName) == null || (methodName = availableMethods.get(serviceName).get(resultSet.getString("method_name"))) == null)
                    continue;

                Row row = sheet.createRow(i++ + 1);
                row.createCell(0).setCellValue(userName);
                row.createCell(1).setCellValue(orgName);
                row.createCell(2).setCellValue(availableMethods.get(serviceName).get("serverName"));
                row.createCell(3).setCellValue(methodName);
                row.createCell(4).setCellValue(resultSet.getString("count"));
            }


            sheet.autoSizeColumn(0)
            sheet.autoSizeColumn(1)
            sheet.autoSizeColumn(2)
            sheet.autoSizeColumn(3)
            sheet.autoSizeColumn(4)
            String sep = File.separator;

            File dir = new File(new File("").absolutePath + "${sep}webapps${sep}InfocityServices${sep}reports${sep}${ses.getCurrentUserID()}");
            if(!dir.exists())
                dir.mkdirs();

            out = new FileOutputStream(dir.getAbsolutePath() + "${sep}Работа пользователя ${userId}.xls");
            wb.write(out);

            showFile(dir.getAbsolutePath() + "${sep}Работа пользователя ${userId}.xls", "Работа пользователя ${userId}.xls")

        } catch (SQLException e){
            print e;
        } finally {
            if(resultSet != null){
                try{resultSet.close();} catch (SQLException ignored){}
            }
            if(ps != null){
                try{ps.close();} catch (SQLException ignored){}
            }
            if(st != null){
                try{st.close();} catch (SQLException ignored){}
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
