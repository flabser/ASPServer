/**
 * SocialServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.social;

public interface SocialServiceService extends javax.xml.rpc.Service {
    public String getSocialServiceAddress();

    public SocialService getSocialService() throws javax.xml.rpc.ServiceException;

    public SocialService getSocialService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
