/**
 * TheftSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class TheftSearchResult  implements java.io.Serializable {
    private java.lang.String initiator;

    private kz.lof.webservices.store.udp.VehicleShortData shortData;

    public TheftSearchResult() {
    }

    public TheftSearchResult(
           java.lang.String initiator,
           kz.lof.webservices.store.udp.VehicleShortData shortData) {
           this.initiator = initiator;
           this.shortData = shortData;
    }


    /**
     * Gets the initiator value for this TheftSearchResult.
     * 
     * @return initiator
     */
    public java.lang.String getInitiator() {
        return initiator;
    }


    /**
     * Sets the initiator value for this TheftSearchResult.
     * 
     * @param initiator
     */
    public void setInitiator(java.lang.String initiator) {
        this.initiator = initiator;
    }


    /**
     * Gets the shortData value for this TheftSearchResult.
     * 
     * @return shortData
     */
    public kz.lof.webservices.store.udp.VehicleShortData getShortData() {
        return shortData;
    }


    /**
     * Sets the shortData value for this TheftSearchResult.
     * 
     * @param shortData
     */
    public void setShortData(kz.lof.webservices.store.udp.VehicleShortData shortData) {
        this.shortData = shortData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TheftSearchResult)) return false;
        TheftSearchResult other = (TheftSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.initiator==null && other.getInitiator()==null) || 
             (this.initiator!=null &&
              this.initiator.equals(other.getInitiator()))) &&
            ((this.shortData==null && other.getShortData()==null) || 
             (this.shortData!=null &&
              this.shortData.equals(other.getShortData())));
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
        if (getInitiator() != null) {
            _hashCode += getInitiator().hashCode();
        }
        if (getShortData() != null) {
            _hashCode += getShortData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TheftSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TheftSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "initiator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "shortData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleShortData"));
        elemField.setNillable(true);
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
