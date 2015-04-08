/**
 * GKZServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.clients.gkz;

public class GKZServiceSoapBindingStub extends org.apache.axis.client.Stub implements kz.lof.webservices.clients.gkz.GKZService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStreet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "StreetSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.StreetSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getStreetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByFIO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "firstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "middleName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "HumanShortDataResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.HumanShortDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByFIOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByCompany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "companyName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "CompanyShortDataResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.CompanyShortDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByCompanyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataQuarter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "district"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "District"), kz.lof.webservices.store.gkz.District.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "nameQuarter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "QuarterSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.QuarterSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataQuarterReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "actType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "series"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandShortDataResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.LandShortDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByDocumentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataShort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "ownerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandShortDataResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.LandShortDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataShortReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLandFullData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "idRight"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandFullData"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.LandFullData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getLandFullDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataByCadastrNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "cadastrNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandShortDataResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.LandShortDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByCadastrNumberReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRegion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "pageNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "resultsOnPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "RegionSearchResult"));
        oper.setReturnClass(kz.lof.webservices.store.gkz.RegionSearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getRegionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public GKZServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GKZServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GKZServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "ArrayOf_tns1_CompanyShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.CompanyShortData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "CompanyShortData");
            qName2 = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "ArrayOf_tns1_District");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.District[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "District");
            qName2 = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "ArrayOf_tns1_HumanShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.HumanShortData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "HumanShortData");
            qName2 = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "ArrayOf_tns1_LandShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.LandShortData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandShortData");
            qName2 = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "ArrayOf_tns1_Quarter");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.Quarter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "Quarter");
            qName2 = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "ArrayOf_tns1_Street");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.Street[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "Street");
            qName2 = new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "CompanyShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.CompanyShortData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "CompanyShortDataResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.CompanyShortDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "District");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.District.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "HumanShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.HumanShortData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "HumanShortDataResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.HumanShortDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandFullData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.LandFullData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandShortData");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.LandShortData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "LandShortDataResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.LandShortDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "OwnerType");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.OwnerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "Quarter");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.Quarter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "QuarterSearchResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.QuarterSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "RegionSearchResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.RegionSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "Street");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.Street.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "StreetSearchResult");
            cachedSerQNames.add(qName);
            cls = kz.lof.webservices.store.gkz.StreetSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public kz.lof.webservices.store.gkz.StreetSearchResult getStreet(java.lang.String name, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getStreet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.StreetSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.StreetSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.StreetSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.HumanShortDataResult getDataByFIO(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByFIO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firstName, lastName, middleName, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.HumanShortDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.HumanShortDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.HumanShortDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.CompanyShortDataResult getDataByCompany(java.lang.String companyName, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByCompany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {companyName, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.CompanyShortDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.CompanyShortDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.CompanyShortDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.QuarterSearchResult getDataQuarter(kz.lof.webservices.store.gkz.District district, java.lang.String nameQuarter, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataQuarter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {district, nameQuarter, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.QuarterSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.QuarterSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.QuarterSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.LandShortDataResult getDataByDocument(int actType, java.lang.String series, java.lang.String number, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(actType), series, number, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.LandShortDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.LandShortDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.LandShortDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.LandShortDataResult getDataShort(int ownerId, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataShort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(ownerId), new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.LandShortDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.LandShortDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.LandShortDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.LandFullData getLandFullData(int idRight) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getLandFullData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(idRight)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.LandFullData) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.LandFullData) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.LandFullData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.LandShortDataResult getDataByCadastrNumber(java.lang.String cadastrNumber, int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getDataByCadastrNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cadastrNumber, new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.LandShortDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.LandShortDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.LandShortDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kz.lof.webservices.store.gkz.RegionSearchResult getRegion(int pageNum, int resultsOnPage, java.lang.String lang) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "getRegion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(pageNum), new java.lang.Integer(resultsOnPage), lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kz.lof.webservices.store.gkz.RegionSearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kz.lof.webservices.store.gkz.RegionSearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, kz.lof.webservices.store.gkz.RegionSearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
