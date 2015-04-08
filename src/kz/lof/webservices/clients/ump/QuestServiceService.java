/**
 * QuestServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.ump;

public interface QuestServiceService extends javax.xml.rpc.Service {
    public java.lang.String getQuestServiceAddress();

    public kz.lof.webservices.clients.ump.QuestService getQuestService() throws javax.xml.rpc.ServiceException;

    public kz.lof.webservices.clients.ump.QuestService getQuestService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
