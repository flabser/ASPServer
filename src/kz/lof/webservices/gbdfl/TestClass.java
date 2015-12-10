package kz.lof.webservices.gbdfl;


import org.junit.Assert;
import org.testng.annotations.Test;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Calendar;

public class TestClass {

    /**
     * ФИО, дата рождения, место регистрации, национальность, номер Удостоверения
     */

    @Test
    public void testResponse() throws RemoteException, ServiceException {
        GBDFL2009Service_ServiceLocator l = new GBDFL2009Service_ServiceLocator();
        GBDFL2009Service_PortType service = l.getGBDFL2009ServiceBinding();

        FIO_ fio = new FIO_("иван", "иванович", "иванов");

        //наверное что-то стандартное
        SystemInfo_ info = new SystemInfo_("1", "1", Calendar.getInstance(), "1", "1", "1", "");

        //собственно сам запрос
        FullResponse_[] response = service.getPersonByFIO(new FIORequest_(fio, info));

        Assert.assertTrue(response != null && response.length > 0);
        for (FullResponse_ fullResponse_ : response) {
            //фио
            System.out.println(fullResponse_.getCurrentFIO().getFirstName());
            System.out.println(fullResponse_.getCurrentFIO().getSurName());
            System.out.println(fullResponse_.getCurrentFIO().getMiddleName());

            //дата рождения
            System.out.println(fullResponse_.getCommonInfo().getBirthDate());

            //место регистрации
            System.out.println(fullResponse_.getCommonInfo().getCapableCourtName());

            //национальность
            System.out.println(fullResponse_.getCommonInfo().getNationalityName());

//          номер Удостоверения
            System.out.println(fullResponse_.getCommonInfo().getBirthCertificateNumber());
//          или этот
            System.out.println(fullResponse_.getCommonInfo().getCapableNumber());

        }

        System.out.println();
    }
}
