//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package kz.lof.webservices.frontface.ump;

import kz.lof.webservices.common.InfoEntry;
import kz.lof.webservices.common.ServiceInfo;
import kz.lof.webservices.store.ump.Address;
import kz.lof.webservices.store.ump.Apartment;
import kz.lof.webservices.store.ump.ApartmentType;
import kz.lof.webservices.store.ump.City;
import kz.lof.webservices.store.ump.CountByAddr;
import kz.lof.webservices.store.ump.CountByAge;
import kz.lof.webservices.store.ump.CountByReason;
import kz.lof.webservices.store.ump.CountMigByApartment;
import kz.lof.webservices.store.ump.CountMigByNat;
import kz.lof.webservices.store.ump.Country;
import kz.lof.webservices.store.ump.CriminalsData;
import kz.lof.webservices.store.ump.District;
import kz.lof.webservices.store.ump.DocType;
import kz.lof.webservices.store.ump.Document;
import kz.lof.webservices.store.ump.Education;
import kz.lof.webservices.store.ump.HumanFullData;
import kz.lof.webservices.store.ump.HumanShortData;
import kz.lof.webservices.store.ump.HumansSearchResult;
import kz.lof.webservices.store.ump.MigrationData;
import kz.lof.webservices.store.ump.MigrationLiveData;
import kz.lof.webservices.store.ump.MigrationNatData;
import kz.lof.webservices.store.ump.MigrationReasonData;
import kz.lof.webservices.store.ump.NatCount;
import kz.lof.webservices.store.ump.NatEducData;
import kz.lof.webservices.store.ump.Nationality;
import kz.lof.webservices.store.ump.RegType;
import kz.lof.webservices.store.ump.RegTypeCount;
import kz.lof.webservices.store.ump.Region;
import kz.lof.webservices.store.ump.Relation;
import kz.lof.webservices.store.ump.SpecCount;
import kz.lof.webservices.store.ump.Street;
import kz.lof.webservices.store.ump.TypeRegData;
import kz.lof.webservices.store.ump.VisitPurpose;
import kz.lof.webservices.store.ump.VisitReason;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.encoding.ser.EnumDeserializerFactory;
import org.apache.axis.encoding.ser.EnumSerializerFactory;
import org.apache.axis.encoding.ser.SimpleDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListSerializerFactory;
import org.apache.axis.encoding.ser.SimpleSerializerFactory;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.encoding.SerializerFactory;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class HumansSearchServiceSoapBindingStub extends Stub implements HumansSearchService {
    private Vector cachedSerClasses;
    private Vector cachedSerQNames;
    private Vector cachedSerFactories;
    private Vector cachedDeserFactories;
    static OperationDesc[] _operations = new OperationDesc[34];

    private static void _initOperationDesc1() {
        OperationDesc oper = new OperationDesc();
        oper.setName("getLog");
        ParameterDesc param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "date"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "date"), Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getLogReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[0] = oper;
        oper = new OperationDesc();
        oper.setName("getCountry");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "name"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "Country"));
        oper.setReturnClass(Country[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getCountryReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[1] = oper;
        oper = new OperationDesc();
        oper.setName("getInfoMigrationNationByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "MigrationNatData"));
        oper.setReturnClass(MigrationNatData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationNationByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[2] = oper;
        oper = new OperationDesc();
        oper.setName("getInfoMigrationReasonByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "MigrationReasonData"));
        oper.setReturnClass(MigrationReasonData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationReasonByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[3] = oper;
        oper = new OperationDesc();
        oper.setName("getMigrationNatSpecByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "nacId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "NatEducData"));
        oper.setReturnClass(NatEducData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getMigrationNatSpecByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[4] = oper;
        oper = new OperationDesc();
        oper.setName("getMigrationNatEducByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "nacId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "NatEducData"));
        oper.setReturnClass(NatEducData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getMigrationNatEducByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[5] = oper;
        oper = new OperationDesc();
        oper.setName("getCountCriminalsByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "idNac"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "sex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startAge"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endAge"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "CriminalsData"));
        oper.setReturnClass(CriminalsData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getCountCriminalsByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[6] = oper;
        oper = new OperationDesc();
        oper.setName("getInfoMigrationLiveByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "MigrationLiveData"));
        oper.setReturnClass(MigrationLiveData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationLiveByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[7] = oper;
        oper = new OperationDesc();
        oper.setName("testService");
        oper.setReturnType(new QName("http://common.webservices.lof.kz", "ServiceInfo"));
        oper.setReturnClass(ServiceInfo.class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "testServiceReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[8] = oper;
        oper = new OperationDesc();
        oper.setName("getFullData");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "id"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "long"), Long.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "HumanFullData"));
        oper.setReturnClass(HumanFullData.class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getFullDataReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[9] = oper;
    }

    private static void _initOperationDesc2() {
        OperationDesc oper = new OperationDesc();
        oper.setName("getDistricts");
        ParameterDesc param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "name"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "District"));
        oper.setReturnClass(District[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getDistrictsReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[10] = oper;
        oper = new OperationDesc();
        oper.setName("getStreets");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "name"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "Street"));
        oper.setReturnClass(Street[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getStreetsReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[11] = oper;
        oper = new OperationDesc();
        oper.setName("getHumanByFIO");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "firstName"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lastName"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "middleName"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "HumansSearchResult"));
        oper.setReturnClass(HumansSearchResult.class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getHumanByFIOReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[12] = oper;
        oper = new OperationDesc();
        oper.setName("getHumanByAddr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "street"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Street"), Street.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "house"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "flat"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "flatPart"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "HumansSearchResult"));
        oper.setReturnClass(HumansSearchResult.class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getHumanByAddrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[13] = oper;
        oper = new OperationDesc();
        oper.setName("getHumanByDoc");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "docNumber"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "HumansSearchResult"));
        oper.setReturnClass(HumansSearchResult.class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getHumanByDocReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[14] = oper;
        oper = new OperationDesc();
        oper.setName("getCitizenByIIN");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "iin"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "HumansSearchResult"));
        oper.setReturnClass(HumansSearchResult.class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getCitizenByIINReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[15] = oper;
        oper = new OperationDesc();
        oper.setName("getAllCountries");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "Country"));
        oper.setReturnClass(Country[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getAllCountriesReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[16] = oper;
        oper = new OperationDesc();
        oper.setName("getAllDistricts");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "District"));
        oper.setReturnClass(District[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getAllDistrictsReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[17] = oper;
        oper = new OperationDesc();
        oper.setName("getAllStreets");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "Street"));
        oper.setReturnClass(Street[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getAllStreetsReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[18] = oper;
        oper = new OperationDesc();
        oper.setName("getNationalityByAddr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "NatCount"));
        oper.setReturnClass(NatCount[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getNationalityByAddrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[19] = oper;
    }

    private static void _initOperationDesc3() {
        OperationDesc oper = new OperationDesc();
        oper.setName("getProzhivByCodeRegion");
        ParameterDesc param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "CountByAddr"));
        oper.setReturnClass(CountByAddr[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getProzhivByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[20] = oper;
        oper = new OperationDesc();
        oper.setName("getProzhivByAddr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "CountByAddr"));
        oper.setReturnClass(CountByAddr[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getProzhivByAddrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[21] = oper;
        oper = new OperationDesc();
        oper.setName("getCntAdamByAge");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startAge"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endAge"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "sex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "CountByAddr"));
        oper.setReturnClass(CountByAddr[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getCntAdamByAgeReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[22] = oper;
        oper = new OperationDesc();
        oper.setName("getInfoMigrationByAdr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "MigrationData"));
        oper.setReturnClass(MigrationData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[23] = oper;
        oper = new OperationDesc();
        oper.setName("getInfoMigrationByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "MigrationData"));
        oper.setReturnClass(MigrationData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[24] = oper;
        oper = new OperationDesc();
        oper.setName("getInfoMigrationNationByAdr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "MigrationNatData"));
        oper.setReturnClass(MigrationNatData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationNationByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[25] = oper;
        oper = new OperationDesc();
        oper.setName("getInfoMigrationReasonByAdr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endDate"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "dateTime"), Calendar.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "MigrationReasonData"));
        oper.setReturnClass(MigrationReasonData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationReasonByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[26] = oper;
        oper = new OperationDesc();
        oper.setName("getMigrationSpecByAdr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "SpecCount"));
        oper.setReturnClass(SpecCount[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getMigrationSpecByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[27] = oper;
        oper = new OperationDesc();
        oper.setName("getMigrationSpecByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "SpecCount"));
        oper.setReturnClass(SpecCount[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getMigrationSpecByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[28] = oper;
        oper = new OperationDesc();
        oper.setName("getMigrationNatSpecByAdr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "nacId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "NatEducData"));
        oper.setReturnClass(NatEducData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getMigrationNatSpecByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[29] = oper;
    }

    private static void _initOperationDesc4() {
        OperationDesc oper = new OperationDesc();
        oper.setName("getMigrationNatEducByAdr");
        ParameterDesc param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "nacId"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "NatEducData"));
        oper.setReturnClass(NatEducData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getMigrationNatEducByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[30] = oper;
        oper = new OperationDesc();
        oper.setName("getCountTypeRegByAdr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "TypeRegData"));
        oper.setReturnClass(TypeRegData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getCountTypeRegByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[31] = oper;
        oper = new OperationDesc();
        oper.setName("getCountCriminalsByAdr");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "address"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Address"), Address[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "idNac"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "sex"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "startAge"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "endAge"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "CriminalsData"));
        oper.setReturnClass(CriminalsData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getCountCriminalsByAdrReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[32] = oper;
        oper = new OperationDesc();
        oper.setName("getCountTypeRegByCodeRegion");
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "region"), (byte)1, new QName("http://store.ump.webservices.lof.kz", "Region"), Region[].class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "pageNum"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "resultsOnPage"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "int"), Integer.TYPE, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://ump.webservices.lof.kz", "lang"), (byte)1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://store.ump.webservices.lof.kz", "TypeRegData"));
        oper.setReturnClass(TypeRegData[].class);
        oper.setReturnQName(new QName("http://ump.webservices.lof.kz", "getCountTypeRegByCodeRegionReturn"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        _operations[33] = oper;
    }

    public HumansSearchServiceSoapBindingStub() throws AxisFault {
        this((Service)null);
    }

    public HumansSearchServiceSoapBindingStub(URL endpointURL, Service service) throws AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public HumansSearchServiceSoapBindingStub(Service service) throws AxisFault {
        this.cachedSerClasses = new Vector();
        this.cachedSerQNames = new Vector();
        this.cachedSerFactories = new Vector();
        this.cachedDeserFactories = new Vector();
        if(service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }

        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
        Class beansf = BeanSerializerFactory.class;
        Class beandf = BeanDeserializerFactory.class;
        Class enumsf = EnumSerializerFactory.class;
        Class enumdf = EnumDeserializerFactory.class;
        Class arraysf = ArraySerializerFactory.class;
        Class arraydf = ArrayDeserializerFactory.class;
        Class simplesf = SimpleSerializerFactory.class;
        Class simpledf = SimpleDeserializerFactory.class;
        Class simplelistsf = SimpleListSerializerFactory.class;
        Class simplelistdf = SimpleListDeserializerFactory.class;
        QName qName = new QName("http://common.webservices.lof.kz", "InfoEntry");
        this.cachedSerQNames.add(qName);
        Class cls = InfoEntry.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://common.webservices.lof.kz", "ServiceInfo");
        this.cachedSerQNames.add(qName);
        cls = ServiceInfo.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Address");
        this.cachedSerQNames.add(qName);
        cls = Address.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Apartment");
        this.cachedSerQNames.add(qName);
        cls = Apartment.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "ApartmentType");
        this.cachedSerQNames.add(qName);
        cls = ApartmentType.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "City");
        this.cachedSerQNames.add(qName);
        cls = City.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountByAddr");
        this.cachedSerQNames.add(qName);
        cls = CountByAddr.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountByAge");
        this.cachedSerQNames.add(qName);
        cls = CountByAge.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountByReason");
        this.cachedSerQNames.add(qName);
        cls = CountByReason.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountMigByApartment");
        this.cachedSerQNames.add(qName);
        cls = CountMigByApartment.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountMigByNat");
        this.cachedSerQNames.add(qName);
        cls = CountMigByNat.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Country");
        this.cachedSerQNames.add(qName);
        cls = Country.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "CriminalsData");
        this.cachedSerQNames.add(qName);
        cls = CriminalsData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "District");
        this.cachedSerQNames.add(qName);
        cls = District.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "DocType");
        this.cachedSerQNames.add(qName);
        cls = DocType.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Document");
        this.cachedSerQNames.add(qName);
        cls = Document.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Education");
        this.cachedSerQNames.add(qName);
        cls = Education.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "HumanFullData");
        this.cachedSerQNames.add(qName);
        cls = HumanFullData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "HumanShortData");
        this.cachedSerQNames.add(qName);
        cls = HumanShortData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "HumansSearchResult");
        this.cachedSerQNames.add(qName);
        cls = HumansSearchResult.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "MigrationData");
        this.cachedSerQNames.add(qName);
        cls = MigrationData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "MigrationLiveData");
        this.cachedSerQNames.add(qName);
        cls = MigrationLiveData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "MigrationNatData");
        this.cachedSerQNames.add(qName);
        cls = MigrationNatData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "MigrationReasonData");
        this.cachedSerQNames.add(qName);
        cls = MigrationReasonData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "NatCount");
        this.cachedSerQNames.add(qName);
        cls = NatCount.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "NatEducData");
        this.cachedSerQNames.add(qName);
        cls = NatEducData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Nationality");
        this.cachedSerQNames.add(qName);
        cls = Nationality.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Region");
        this.cachedSerQNames.add(qName);
        cls = Region.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "RegType");
        this.cachedSerQNames.add(qName);
        cls = RegType.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "RegTypeCount");
        this.cachedSerQNames.add(qName);
        cls = RegTypeCount.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Relation");
        this.cachedSerQNames.add(qName);
        cls = Relation.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "SpecCount");
        this.cachedSerQNames.add(qName);
        cls = SpecCount.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "Street");
        this.cachedSerQNames.add(qName);
        cls = Street.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "TypeRegData");
        this.cachedSerQNames.add(qName);
        cls = TypeRegData.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "VisitPurpose");
        this.cachedSerQNames.add(qName);
        cls = VisitPurpose.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://store.ump.webservices.lof.kz", "VisitReason");
        this.cachedSerQNames.add(qName);
        cls = VisitReason.class;
        this.cachedSerClasses.add(cls);
        this.cachedSerFactories.add(beansf);
        this.cachedDeserFactories.add(beandf);
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_CountByAge");
        this.cachedSerQNames.add(qName);
        cls = CountByAge[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountByAge");
        QName qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_CountByReason");
        this.cachedSerQNames.add(qName);
        cls = CountByReason[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountByReason");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_CountMigByApartment");
        this.cachedSerQNames.add(qName);
        cls = CountMigByApartment[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountMigByApartment");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_CountMigByNat");
        this.cachedSerQNames.add(qName);
        cls = CountMigByNat[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "CountMigByNat");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_Document");
        this.cachedSerQNames.add(qName);
        cls = Document[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "Document");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_HumanShortData");
        this.cachedSerQNames.add(qName);
        cls = HumanShortData[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "HumanShortData");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_RegTypeCount");
        this.cachedSerQNames.add(qName);
        cls = RegTypeCount[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "RegTypeCount");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns1_SpecCount");
        this.cachedSerQNames.add(qName);
        cls = SpecCount[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://store.ump.webservices.lof.kz", "SpecCount");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
        qName = new QName("http://ump.webservices.lof.kz", "ArrayOf_tns2_InfoEntry");
        this.cachedSerQNames.add(qName);
        cls = InfoEntry[].class;
        this.cachedSerClasses.add(cls);
        qName = new QName("http://common.webservices.lof.kz", "InfoEntry");
        qName2 = new QName("http://ump.webservices.lof.kz", "item");
        this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
        this.cachedDeserFactories.add(new ArrayDeserializerFactory());
    }

    protected Call createCall() throws RemoteException {
        try {
            Call _t = super._createCall();
            if(super.maintainSessionSet) {
                _t.setMaintainSession(super.maintainSession);
            }

            if(super.cachedUsername != null) {
                _t.setUsername(super.cachedUsername);
            }

            if(super.cachedPassword != null) {
                _t.setPassword(super.cachedPassword);
            }

            if(super.cachedEndpoint != null) {
                _t.setTargetEndpointAddress(super.cachedEndpoint);
            }

            if(super.cachedTimeout != null) {
                _t.setTimeout(super.cachedTimeout);
            }

            if(super.cachedPortName != null) {
                _t.setPortName(super.cachedPortName);
            }

            Enumeration keys = super.cachedProperties.keys();

            while(keys.hasMoreElements()) {
                String key = (String)keys.nextElement();
                _t.setProperty(key, super.cachedProperties.get(key));
            }

            synchronized(this) {
                if(this.firstCall()) {
                    _t.setEncodingStyle((String)null);

                    for(int i = 0; i < this.cachedSerFactories.size(); ++i) {
                        Class cls = (Class)this.cachedSerClasses.get(i);
                        QName qName = (QName)this.cachedSerQNames.get(i);
                        Object x = this.cachedSerFactories.get(i);
                        if(x instanceof Class) {
                            Class sf = (Class)this.cachedSerFactories.get(i);
                            Class df = (Class)this.cachedDeserFactories.get(i);
                            _t.registerTypeMapping(cls, qName, sf, df, false);
                        } else if(x instanceof SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory var13 = (org.apache.axis.encoding.SerializerFactory)this.cachedSerFactories.get(i);
                            DeserializerFactory var14 = (DeserializerFactory)this.cachedDeserFactories.get(i);
                            _t.registerTypeMapping(cls, qName, var13, var14, false);
                        }
                    }
                }
            }

            return _t;
        } catch (Throwable var12) {
            throw new AxisFault("Failure trying to get the Call object", var12);
        }
    }

    public String[] getLog(Date date) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[0]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getLog"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{date});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (String[])((String[])axisFaultException);
                    } catch (Exception var5) {
                        return (String[])((String[])JavaUtils.convert(axisFaultException, String[].class));
                    }
                }
            } catch (AxisFault var6) {
                throw var6;
            }
        }
    }

    public Country[] getCountry(String name, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[1]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getCountry"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{name, lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (Country[])((Country[])axisFaultException);
                    } catch (Exception var6) {
                        return (Country[])((Country[])JavaUtils.convert(axisFaultException, Country[].class));
                    }
                }
            } catch (AxisFault var7) {
                throw var7;
            }
        }
    }

    public MigrationNatData[] getInfoMigrationNationByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[2]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationNationByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, startDate, endDate, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (MigrationNatData[])((MigrationNatData[])axisFaultException);
                    } catch (Exception var10) {
                        return (MigrationNatData[])((MigrationNatData[])JavaUtils.convert(axisFaultException, MigrationNatData[].class));
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public MigrationReasonData[] getInfoMigrationReasonByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[3]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationReasonByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, startDate, endDate, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (MigrationReasonData[])((MigrationReasonData[])axisFaultException);
                    } catch (Exception var10) {
                        return (MigrationReasonData[])((MigrationReasonData[])JavaUtils.convert(axisFaultException, MigrationReasonData[].class));
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public NatEducData[] getMigrationNatSpecByCodeRegion(Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[4]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getMigrationNatSpecByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, new Integer(nacId), new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (NatEducData[])((NatEducData[])axisFaultException);
                    } catch (Exception var9) {
                        return (NatEducData[])((NatEducData[])JavaUtils.convert(axisFaultException, NatEducData[].class));
                    }
                }
            } catch (AxisFault var10) {
                throw var10;
            }
        }
    }

    public NatEducData[] getMigrationNatEducByCodeRegion(Region[] region, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[5]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getMigrationNatEducByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, new Integer(nacId), new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (NatEducData[])((NatEducData[])axisFaultException);
                    } catch (Exception var9) {
                        return (NatEducData[])((NatEducData[])JavaUtils.convert(axisFaultException, NatEducData[].class));
                    }
                }
            } catch (AxisFault var10) {
                throw var10;
            }
        }
    }

    public CriminalsData[] getCountCriminalsByCodeRegion(Region[] region, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[6]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getCountCriminalsByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, new Integer(idNac), new Integer(sex), new Integer(startAge), new Integer(endAge), new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (CriminalsData[])((CriminalsData[])axisFaultException);
                    } catch (Exception var12) {
                        return (CriminalsData[])((CriminalsData[])JavaUtils.convert(axisFaultException, CriminalsData[].class));
                    }
                }
            } catch (AxisFault var13) {
                throw var13;
            }
        }
    }

    public MigrationLiveData[] getInfoMigrationLiveByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[7]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationLiveByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (MigrationLiveData[])((MigrationLiveData[])axisFaultException);
                    } catch (Exception var8) {
                        return (MigrationLiveData[])((MigrationLiveData[])JavaUtils.convert(axisFaultException, MigrationLiveData[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public ServiceInfo testService() throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[8]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "testService"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[0]);
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (ServiceInfo)axisFaultException;
                    } catch (Exception var4) {
                        return (ServiceInfo)JavaUtils.convert(axisFaultException, ServiceInfo.class);
                    }
                }
            } catch (AxisFault var5) {
                throw var5;
            }
        }
    }

    public HumanFullData getFullData(long id, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[9]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getFullData"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{new Long(id), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (HumanFullData)axisFaultException;
                    } catch (Exception var7) {
                        return (HumanFullData)JavaUtils.convert(axisFaultException, HumanFullData.class);
                    }
                }
            } catch (AxisFault var8) {
                throw var8;
            }
        }
    }

    public District[] getDistricts(String name, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[10]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getDistricts"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{name, lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (District[])((District[])axisFaultException);
                    } catch (Exception var6) {
                        return (District[])((District[])JavaUtils.convert(axisFaultException, District[].class));
                    }
                }
            } catch (AxisFault var7) {
                throw var7;
            }
        }
    }

    public Street[] getStreets(String name, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[11]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getStreets"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{name, lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (Street[])((Street[])axisFaultException);
                    } catch (Exception var6) {
                        return (Street[])((Street[])JavaUtils.convert(axisFaultException, Street[].class));
                    }
                }
            } catch (AxisFault var7) {
                throw var7;
            }
        }
    }

    public HumansSearchResult getHumanByFIO(String firstName, String lastName, String middleName, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[12]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getHumanByFIO"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{firstName, lastName, middleName, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (HumansSearchResult)axisFaultException;
                    } catch (Exception var10) {
                        return (HumansSearchResult)JavaUtils.convert(axisFaultException, HumansSearchResult.class);
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public HumansSearchResult getHumanByAddr(Street street, String house, String flat, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[13]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getHumanByAddr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{street, house, flat, "", new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (HumansSearchResult)axisFaultException;
                    } catch (Exception var10) {
                        return (HumansSearchResult)JavaUtils.convert(axisFaultException, HumansSearchResult.class);
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public HumansSearchResult getHumanByDoc(String docNumber, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[14]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getHumanByDoc"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{docNumber, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (HumansSearchResult)axisFaultException;
                    } catch (Exception var8) {
                        return (HumansSearchResult)JavaUtils.convert(axisFaultException, HumansSearchResult.class);
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public HumansSearchResult getCitizenByIIN(String iin, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[15]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getCitizenByIIN"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{iin, lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (HumansSearchResult)axisFaultException;
                    } catch (Exception var6) {
                        return (HumansSearchResult)JavaUtils.convert(axisFaultException, HumansSearchResult.class);
                    }
                }
            } catch (AxisFault var7) {
                throw var7;
            }
        }
    }

    public Country[] getAllCountries(String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[16]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getAllCountries"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (Country[])((Country[])axisFaultException);
                    } catch (Exception var5) {
                        return (Country[])((Country[])JavaUtils.convert(axisFaultException, Country[].class));
                    }
                }
            } catch (AxisFault var6) {
                throw var6;
            }
        }
    }

    public District[] getAllDistricts(String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[17]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getAllDistricts"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (District[])((District[])axisFaultException);
                    } catch (Exception var5) {
                        return (District[])((District[])JavaUtils.convert(axisFaultException, District[].class));
                    }
                }
            } catch (AxisFault var6) {
                throw var6;
            }
        }
    }

    public Street[] getAllStreets(String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[18]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getAllStreets"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (Street[])((Street[])axisFaultException);
                    } catch (Exception var5) {
                        return (Street[])((Street[])JavaUtils.convert(axisFaultException, Street[].class));
                    }
                }
            } catch (AxisFault var6) {
                throw var6;
            }
        }
    }

    public NatCount[] getNationalityByAddr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[19]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getNationalityByAddr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (NatCount[])((NatCount[])axisFaultException);
                    } catch (Exception var8) {
                        return (NatCount[])((NatCount[])JavaUtils.convert(axisFaultException, NatCount[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public CountByAddr[] getProzhivByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[20]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getProzhivByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (CountByAddr[])((CountByAddr[])axisFaultException);
                    } catch (Exception var8) {
                        return (CountByAddr[])((CountByAddr[])JavaUtils.convert(axisFaultException, CountByAddr[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public CountByAddr[] getProzhivByAddr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[21]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getProzhivByAddr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (CountByAddr[])((CountByAddr[])axisFaultException);
                    } catch (Exception var8) {
                        return (CountByAddr[])((CountByAddr[])JavaUtils.convert(axisFaultException, CountByAddr[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public CountByAddr[] getCntAdamByAge(Address[] address, int startAge, int endAge, int sex, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[22]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getCntAdamByAge"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(startAge), new Integer(endAge), new Integer(sex), new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (CountByAddr[])((CountByAddr[])axisFaultException);
                    } catch (Exception var11) {
                        return (CountByAddr[])((CountByAddr[])JavaUtils.convert(axisFaultException, CountByAddr[].class));
                    }
                }
            } catch (AxisFault var12) {
                throw var12;
            }
        }
    }

    public MigrationData[] getInfoMigrationByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[23]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, startDate, endDate, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (MigrationData[])((MigrationData[])axisFaultException);
                    } catch (Exception var10) {
                        return (MigrationData[])((MigrationData[])JavaUtils.convert(axisFaultException, MigrationData[].class));
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public MigrationData[] getInfoMigrationByCodeRegion(Region[] region, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[24]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, startDate, endDate, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (MigrationData[])((MigrationData[])axisFaultException);
                    } catch (Exception var10) {
                        return (MigrationData[])((MigrationData[])JavaUtils.convert(axisFaultException, MigrationData[].class));
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public MigrationNatData[] getInfoMigrationNationByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[25]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationNationByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, startDate, endDate, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (MigrationNatData[])((MigrationNatData[])axisFaultException);
                    } catch (Exception var10) {
                        return (MigrationNatData[])((MigrationNatData[])JavaUtils.convert(axisFaultException, MigrationNatData[].class));
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public MigrationReasonData[] getInfoMigrationReasonByAdr(Address[] address, Calendar startDate, Calendar endDate, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[26]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getInfoMigrationReasonByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, startDate, endDate, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (MigrationReasonData[])((MigrationReasonData[])axisFaultException);
                    } catch (Exception var10) {
                        return (MigrationReasonData[])((MigrationReasonData[])JavaUtils.convert(axisFaultException, MigrationReasonData[].class));
                    }
                }
            } catch (AxisFault var11) {
                throw var11;
            }
        }
    }

    public SpecCount[] getMigrationSpecByAdr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[27]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getMigrationSpecByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (SpecCount[])((SpecCount[])axisFaultException);
                    } catch (Exception var8) {
                        return (SpecCount[])((SpecCount[])JavaUtils.convert(axisFaultException, SpecCount[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public SpecCount[] getMigrationSpecByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[28]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getMigrationSpecByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (SpecCount[])((SpecCount[])axisFaultException);
                    } catch (Exception var8) {
                        return (SpecCount[])((SpecCount[])JavaUtils.convert(axisFaultException, SpecCount[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public NatEducData[] getMigrationNatSpecByAdr(Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[29]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getMigrationNatSpecByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(nacId), new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (NatEducData[])((NatEducData[])axisFaultException);
                    } catch (Exception var9) {
                        return (NatEducData[])((NatEducData[])JavaUtils.convert(axisFaultException, NatEducData[].class));
                    }
                }
            } catch (AxisFault var10) {
                throw var10;
            }
        }
    }

    public NatEducData[] getMigrationNatEducByAdr(Address[] address, int nacId, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[30]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getMigrationNatEducByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(nacId), new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (NatEducData[])((NatEducData[])axisFaultException);
                    } catch (Exception var9) {
                        return (NatEducData[])((NatEducData[])JavaUtils.convert(axisFaultException, NatEducData[].class));
                    }
                }
            } catch (AxisFault var10) {
                throw var10;
            }
        }
    }

    public TypeRegData[] getCountTypeRegByAdr(Address[] address, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[31]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getCountTypeRegByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (TypeRegData[])((TypeRegData[])axisFaultException);
                    } catch (Exception var8) {
                        return (TypeRegData[])((TypeRegData[])JavaUtils.convert(axisFaultException, TypeRegData[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    public CriminalsData[] getCountCriminalsByAdr(Address[] address, int idNac, int sex, int startAge, int endAge, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[32]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getCountCriminalsByAdr"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{address, new Integer(idNac), new Integer(sex), new Integer(startAge), new Integer(endAge), new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (CriminalsData[])((CriminalsData[])axisFaultException);
                    } catch (Exception var12) {
                        return (CriminalsData[])((CriminalsData[])JavaUtils.convert(axisFaultException, CriminalsData[].class));
                    }
                }
            } catch (AxisFault var13) {
                throw var13;
            }
        }
    }

    public TypeRegData[] getCountTypeRegByCodeRegion(Region[] region, int pageNum, int resultsOnPage, String lang) throws RemoteException {
        if(super.cachedEndpoint == null) {
            throw new NoEndPointException();
        } else {
            Call _call = this.createCall();
            _call.setOperation(_operations[33]);
            _call.setUseSOAPAction(true);
            _call.setSOAPActionURI("");
            _call.setEncodingStyle((String)null);
            _call.setProperty("sendXsiTypes", Boolean.FALSE);
            _call.setProperty("sendMultiRefs", Boolean.FALSE);
            _call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
            _call.setOperationName(new QName("http://ump.webservices.lof.kz", "getCountTypeRegByCodeRegion"));
            this.setRequestHeaders(_call);
            this.setAttachments(_call);

            try {
                Object axisFaultException = _call.invoke(new Object[]{region, new Integer(pageNum), new Integer(resultsOnPage), lang});
                if(axisFaultException instanceof RemoteException) {
                    throw (RemoteException)axisFaultException;
                } else {
                    this.extractAttachments(_call);

                    try {
                        return (TypeRegData[])((TypeRegData[])axisFaultException);
                    } catch (Exception var8) {
                        return (TypeRegData[])((TypeRegData[])JavaUtils.convert(axisFaultException, TypeRegData[].class));
                    }
                }
            } catch (AxisFault var9) {
                throw var9;
            }
        }
    }

    static {
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }
}
