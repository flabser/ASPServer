/**
 * TSCountByAddr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class TSCountByAddr  implements java.io.Serializable {
    private kz.lof.webservices.store.udp.Address address;

    private int fizTSCount;

    private int urTSCount;

    public TSCountByAddr() {
    }

    public TSCountByAddr(
           kz.lof.webservices.store.udp.Address address,
           int fizTSCount,
           int urTSCount) {
           this.address = address;
           this.fizTSCount = fizTSCount;
           this.urTSCount = urTSCount;
    }


    /**
     * Gets the address value for this TSCountByAddr.
     * 
     * @return address
     */
    public kz.lof.webservices.store.udp.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TSCountByAddr.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.udp.Address address) {
        this.address = address;
    }


    /**
     * Gets the fizTSCount value for this TSCountByAddr.
     * 
     * @return fizTSCount
     */
    public int getFizTSCount() {
        return fizTSCount;
    }


    /**
     * Sets the fizTSCount value for this TSCountByAddr.
     * 
     * @param fizTSCount
     */
    public void setFizTSCount(int fizTSCount) {
        this.fizTSCount = fizTSCount;
    }


    /**
     * Gets the urTSCount value for this TSCountByAddr.
     * 
     * @return urTSCount
     */
    public int getUrTSCount() {
        return urTSCount;
    }


    /**
     * Sets the urTSCount value for this TSCountByAddr.
     * 
     * @param urTSCount
     */
    public void setUrTSCount(int urTSCount) {
        this.urTSCount = urTSCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSCountByAddr)) return false;
        TSCountByAddr other = (TSCountByAddr) obj;
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
            this.fizTSCount == other.getFizTSCount() &&
            this.urTSCount == other.getUrTSCount();
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
        _hashCode += getFizTSCount();
        _hashCode += getUrTSCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSCountByAddr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByAddr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fizTSCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "fizTSCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urTSCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "urTSCount"));
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
