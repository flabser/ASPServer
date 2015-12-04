//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.lof.webservices.frontface.ump;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import java.net.URL;

public interface HumansSearchServiceService extends Service {
    String getHumansSearchServiceAddress();

    HumansSearchService getHumansSearchService() throws ServiceException;

    HumansSearchService getHumansSearchService(URL var1) throws ServiceException;
}
