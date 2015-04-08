/**
 * UAIGService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.uaig;

public interface UAIGService extends java.rmi.Remote {
    public kz.lof.webservices.store.uaig.ShortData[] getDataByRNNCustomer(java.lang.String rnn) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.uaig.ShortData[] getDataByPeriod(java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.uaig.ShortData[] getDataByNumberDeclaration(java.lang.String numberDeclaration) throws java.rmi.RemoteException;
    public kz.lof.webservices.store.uaig.FullData getDataById(int id) throws java.rmi.RemoteException;
}
