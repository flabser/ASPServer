/**
 * PersonFullData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.ump;

public class PersonFullData  implements java.io.Serializable {
    private kz.lof.webservices.store.ump.PersonShortData basicData;

    private kz.lof.webservices.store.ump.VisitData[] visitData;

    public PersonFullData() {
    }

    public PersonFullData(
           kz.lof.webservices.store.ump.PersonShortData basicData,
           kz.lof.webservices.store.ump.VisitData[] visitData) {
           this.basicData = basicData;
           this.visitData = visitData;
    }


    /**
     * Gets the basicData value for this PersonFullData.
     * 
     * @return basicData
     */
    public kz.lof.webservices.store.ump.PersonShortData getBasicData() {
        return basicData;
    }


    /**
     * Sets the basicData value for this PersonFullData.
     * 
     * @param basicData
     */
    public void setBasicData(kz.lof.webservices.store.ump.PersonShortData basicData) {
        this.basicData = basicData;
    }


    /**
     * Gets the visitData value for this PersonFullData.
     * 
     * @return visitData
     */
    public kz.lof.webservices.store.ump.VisitData[] getVisitData() {
        return visitData;
    }


    /**
     * Sets the visitData value for this PersonFullData.
     * 
     * @param visitData
     */
    public void setVisitData(kz.lof.webservices.store.ump.VisitData[] visitData) {
        this.visitData = visitData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonFullData)) return false;
        PersonFullData other = (PersonFullData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basicData==null && other.getBasicData()==null) || 
             (this.basicData!=null &&
              this.basicData.equals(other.getBasicData()))) &&
            ((this.visitData==null && other.getVisitData()==null) || 
             (this.visitData!=null &&
              java.util.Arrays.equals(this.visitData, other.getVisitData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBasicData() != null) {
            _hashCode += getBasicData().hashCode();
        }
        if (getVisitData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisitData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisitData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonFullData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "PersonFullData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "basicData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "PersonShortData"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visitData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "VisitData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
