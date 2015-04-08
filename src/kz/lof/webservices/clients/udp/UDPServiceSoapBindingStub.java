/**
 * UDPServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.udp;

public class UDPServiceSoapBindingStub extends org.apache.axis.client.Stub implements kz.lof.webservices.clients.udp.UDPService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[24];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getLogReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByOrgName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "orgName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.HumanSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByOrgNameReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataBySRTS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "srtsSerial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "srtsNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataBySRTSReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByGRNZ");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "grnz"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByGRNZReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByOwnerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ownerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByOwnerIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByRegId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "srtsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleFullData"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleFullData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByRegIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCountAMTSByAdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"), kz.lof.webservices.store.udp.Address[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByAddr"));
        oper.setReturnClass(kz.lof.webservices.store.udp.TSCountByAddr[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountAMTSByAdrReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCountAMTSByCodeRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District"), kz.lof.webservices.store.udp.District[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByAddr"));
        oper.setReturnClass(kz.lof.webservices.store.udp.TSCountByAddr[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountAMTSByCodeRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarkAMTSByCodeRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District"), kz.lof.webservices.store.udp.District[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleCountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getMarkAMTSByCodeRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarkAMTSByAdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"), kz.lof.webservices.store.udp.Address[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleCountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getMarkAMTSByAdrReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoYearAMTSByCodeRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District"), kz.lof.webservices.store.udp.District[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleCountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoYearAMTSByCodeRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoYearAMTSByAdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"), kz.lof.webservices.store.udp.Address[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleCountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoYearAMTSByAdrReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoDrivLicByCodeRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "distrcit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District"), kz.lof.webservices.store.udp.District[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountData"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleCountData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoDrivLicByCodeRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoDrivLicByAdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"), kz.lof.webservices.store.udp.Address[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountData"));
        oper.setReturnClass(kz.lof.webservices.store.udp.VehicleCountData[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoDrivLicByAdrReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoOwnerTSByAdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"), kz.lof.webservices.store.udp.Address[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.HumanSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoOwnerTSByAdrReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoOwnerTSByCodeRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District"), kz.lof.webservices.store.udp.District[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.HumanSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoOwnerTSByCodeRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCountOwnerTSByAdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"), kz.lof.webservices.store.udp.Address[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByOwnType"));
        oper.setReturnClass(kz.lof.webservices.store.udp.TSCountByOwnType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountOwnerTSByAdrReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCountOwnerTSByCodeRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District"), kz.lof.webservices.store.udp.District[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByOwnType"));
        oper.setReturnClass(kz.lof.webservices.store.udp.TSCountByOwnType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountOwnerTSByCodeRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoTypeAMTSByAdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"), kz.lof.webservices.store.udp.Address[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.HumanSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoTypeAMTSByAdrReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfoTypeAMTSByCodeRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District"), kz.lof.webservices.store.udp.District[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.HumanSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoTypeAMTSByCodeRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testService");
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservices.lof.kz", "ServiceInfo"));
        oper.setReturnClass(kz.lof.webservices.common.ServiceInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "testServiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByIIN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "iin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.HumanSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByIINReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByFIO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "firstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "middleName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.HumanSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByFIOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTheftData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "grnz"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TheftSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.udp.TheftSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getTheftDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

    }

    public UDPServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public UDPServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public UDPServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://common.webservices.lof.kz", "InfoEntry");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.common.InfoEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservices.lof.kz", "ServiceInfo");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.common.ServiceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "CheckupData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.CheckupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Color");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.Color.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "District");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.District.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "DriverPassport");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.DriverPassport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.HumanSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.HumanShortData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Region");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.Region.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TaxData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TaxData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TheftSearchResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TheftSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TrustData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TrustData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TrustType");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TrustType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByAddr");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByAddr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByCategory");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByMark");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByMark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByOwnType");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByOwnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByYear");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByYear.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.VehicleCountData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.VehicleCountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleFullData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.VehicleFullData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleSearchResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.VehicleSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.VehicleShortData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_CheckupData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.CheckupData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "CheckupData");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_HumanShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.HumanShortData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanShortData");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_TaxData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TaxData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TaxData");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_TrustData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TrustData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TrustData");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_TSCountByCategory");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByCategory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByCategory");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_TSCountByMark");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByMark[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByMark");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_TSCountByYear");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.TSCountByYear[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByYear");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_VehicleCountData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.VehicleCountData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountData");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns1_VehicleShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.udp.VehicleShortData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleShortData");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "ArrayOf_tns2_InfoEntry");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.common.InfoEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.webservices.lof.kz", "InfoEntry");
            qName2 = new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String[] getLog(java.util.Date date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getDataByOrgName(java.lang.String orgName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByOrgName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orgName, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.HumanSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.HumanSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.HumanSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleSearchResult getDataBySRTS(java.lang.String srtsSerial, java.lang.String srtsNumber, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataBySRTS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {srtsSerial, srtsNumber, lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleSearchResult getDataByGRNZ(java.lang.String grnz, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByGRNZ"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {grnz, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleSearchResult getDataByOwnerId(long ownerId, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByOwnerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(ownerId), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleFullData getDataByRegId(long srtsId, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByRegId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(srtsId), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleFullData) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleFullData) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleFullData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountAMTSByAdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.TSCountByAddr[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.TSCountByAddr[]) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.TSCountByAddr[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.TSCountByAddr[] getCountAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountAMTSByCodeRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.TSCountByAddr[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.TSCountByAddr[]) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.TSCountByAddr[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getMarkAMTSByCodeRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleCountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleCountResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleCountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getMarkAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getMarkAMTSByAdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleCountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleCountResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleCountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoYearAMTSByCodeRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleCountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleCountResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleCountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleCountResult getInfoYearAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoYearAMTSByAdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleCountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleCountResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleCountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByCodeRegion(kz.lof.webservices.store.udp.District[] distrcit, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoDrivLicByCodeRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {distrcit, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleCountData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleCountData[]) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleCountData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.VehicleCountData[] getInfoDrivLicByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoDrivLicByAdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.VehicleCountData[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.VehicleCountData[]) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.VehicleCountData[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoOwnerTSByAdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.HumanSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.HumanSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.HumanSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoOwnerTSByCodeRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.HumanSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.HumanSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.HumanSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.TSCountByOwnType[] getCountOwnerTSByAdr(kz.lof.webservices.store.udp.Address[] address, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountOwnerTSByAdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.TSCountByOwnType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.TSCountByOwnType[]) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.TSCountByOwnType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.TSCountByOwnType[] getCountOwnerTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getCountOwnerTSByCodeRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.TSCountByOwnType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.TSCountByOwnType[]) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.TSCountByOwnType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByAdr(kz.lof.webservices.store.udp.Address[] address, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoTypeAMTSByAdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {address, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.HumanSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.HumanSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.HumanSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getInfoTypeAMTSByCodeRegion(kz.lof.webservices.store.udp.District[] district, java.util.Calendar startDate, java.util.Calendar endDate, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getInfoTypeAMTSByCodeRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, startDate, endDate, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.HumanSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.HumanSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.HumanSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.common.ServiceInfo testService() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "testService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.common.ServiceInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.common.ServiceInfo) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.common.ServiceInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getDataByIIN(java.lang.String iin, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByIIN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {iin, lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.HumanSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.HumanSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.HumanSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.HumanSearchResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getDataByFIO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firstName, lastName, middleName, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.HumanSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.HumanSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.HumanSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.udp.TheftSearchResult getTheftData(java.lang.String grnz, java.lang.String lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "getTheftData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {grnz, lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.udp.TheftSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.udp.TheftSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.udp.TheftSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
