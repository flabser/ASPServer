package kz.lof.webservices.clients.uaig;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.Calendar;

import kz.flabs.users.User;
import kz.lof.webservices.store.uaig.FullData;
import kz.lof.webservices.store.uaig.ShortData;
import kz.pchelka.env.Environment;

public class Launcher {

    private static UAIGServiceProxy uAIGProxy;
    
    public static void main(String[] args) throws ParseException {
        Environment.addExtHost("uaig", "localhost:15045", "УАИГ");
        uAIGProxy = new UAIGServiceProxy(new User("temp_user"));
        
        String rnn = "123456";
        String numberDeclaration = "555555";
        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.YEAR, 2001);
        Calendar endDate = Calendar.getInstance();
        endDate.set(Calendar.YEAR, 2008);
        int id = 1;
        
        try {
            testUAIGServiceGetDataByRNNCustomer(rnn);
            testUAIGServiceGetDataByNumberDeclaration(numberDeclaration);
            testUAIGServiceGetDataByPeriod(startDate, endDate);
            testUAIGServiceGetDataById(id);
           
        } catch (RemoteException re) {
            System.out.println("ошибка");
            re.printStackTrace();
        }
    }
    
    public static void testUAIGServiceGetDataByRNNCustomer(String rnn) throws RemoteException {
        ShortData[] iData = uAIGProxy.getDataByRNNCustomer(rnn);
        System.out.println();
    }
    
    public static void testUAIGServiceGetDataByNumberDeclaration(String numberDeclaration) throws RemoteException {
        ShortData[] iData = uAIGProxy.getDataByNumberDeclaration(numberDeclaration);
        System.out.println();
    }
    
    public static void testUAIGServiceGetDataByPeriod(Calendar startDate, Calendar endDate) throws RemoteException {
        ShortData[] iData = uAIGProxy.getDataByPeriod(startDate, endDate);
        System.out.println();
    }
    
    public static void testUAIGServiceGetDataById(int id) throws RemoteException {
        FullData iData = uAIGProxy.getDataById(id);
        System.out.println();
    }
    
}
