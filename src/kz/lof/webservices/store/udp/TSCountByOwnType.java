/**
 * TSCountByOwnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class TSCountByOwnType  implements java.io.Serializable {
    private kz.lof.webservices.store.udp.Address address;

    private int orgVehicleCount;

    private int personalVehicleCount;

    public TSCountByOwnType() {
    }

    public TSCountByOwnType(
           kz.lof.webservices.store.udp.Address address,
           int orgVehicleCount,
           int personalVehicleCount) {
           this.address = address;
           this.orgVehicleCount = orgVehicleCount;
           this.personalVehicleCount = personalVehicleCount;
    }


    /**
     * Gets the address value for this TSCountByOwnType.
     * 
     * @return address
     */
    public kz.lof.webservices.store.udp.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TSCountByOwnType.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.udp.Address address) {
        this.address = address;
    }


    /**
     * Gets the orgVehicleCount value for this TSCountByOwnType.
     * 
     * @return orgVehicleCount
     */
    public int getOrgVehicleCount() {
        return orgVehicleCount;
    }


    /**
     * Sets the orgVehicleCount value for this TSCountByOwnType.
     * 
     * @param orgVehicleCount
     */
    public void setOrgVehicleCount(int orgVehicleCount) {
        this.orgVehicleCount = orgVehicleCount;
    }


    /**
     * Gets the personalVehicleCount value for this TSCountByOwnType.
     * 
     * @return personalVehicleCount
     */
    public int getPersonalVehicleCount() {
        return personalVehicleCount;
    }


    /**
     * Sets the personalVehicleCount value for this TSCountByOwnType.
     * 
     * @param personalVehicleCount
     */
    public void setPersonalVehicleCount(int personalVehicleCount) {
        this.personalVehicleCount = personalVehicleCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSCountByOwnType)) return false;
        TSCountByOwnType other = (TSCountByOwnType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.orgVehicleCount == other.getOrgVehicleCount() &&
            this.personalVehicleCount == other.getPersonalVehicleCount();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += getOrgVehicleCount();
        _hashCode += getPersonalVehicleCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSCountByOwnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByOwnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgVehicleCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "orgVehicleCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalVehicleCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "personalVehicleCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
