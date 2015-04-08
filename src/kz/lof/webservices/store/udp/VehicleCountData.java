/**
 * VehicleCountData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class VehicleCountData  implements java.io.Serializable {
    private kz.lof.webservices.store.udp.Address address;

    private kz.lof.webservices.store.udp.TSCountByCategory[] tsCountByCategory;

    private kz.lof.webservices.store.udp.TSCountByMark[] tsCountByMark;

    private kz.lof.webservices.store.udp.TSCountByYear[] tsCountByYear;

    public VehicleCountData() {
    }

    public VehicleCountData(
           kz.lof.webservices.store.udp.Address address,
           kz.lof.webservices.store.udp.TSCountByCategory[] tsCountByCategory,
           kz.lof.webservices.store.udp.TSCountByMark[] tsCountByMark,
           kz.lof.webservices.store.udp.TSCountByYear[] tsCountByYear) {
           this.address = address;
           this.tsCountByCategory = tsCountByCategory;
           this.tsCountByMark = tsCountByMark;
           this.tsCountByYear = tsCountByYear;
    }


    /**
     * Gets the address value for this VehicleCountData.
     * 
     * @return address
     */
    public kz.lof.webservices.store.udp.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this VehicleCountData.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.udp.Address address) {
        this.address = address;
    }


    /**
     * Gets the tsCountByCategory value for this VehicleCountData.
     * 
     * @return tsCountByCategory
     */
    public kz.lof.webservices.store.udp.TSCountByCategory[] getTsCountByCategory() {
        return tsCountByCategory;
    }


    /**
     * Sets the tsCountByCategory value for this VehicleCountData.
     * 
     * @param tsCountByCategory
     */
    public void setTsCountByCategory(kz.lof.webservices.store.udp.TSCountByCategory[] tsCountByCategory) {
        this.tsCountByCategory = tsCountByCategory;
    }


    /**
     * Gets the tsCountByMark value for this VehicleCountData.
     * 
     * @return tsCountByMark
     */
    public kz.lof.webservices.store.udp.TSCountByMark[] getTsCountByMark() {
        return tsCountByMark;
    }


    /**
     * Sets the tsCountByMark value for this VehicleCountData.
     * 
     * @param tsCountByMark
     */
    public void setTsCountByMark(kz.lof.webservices.store.udp.TSCountByMark[] tsCountByMark) {
        this.tsCountByMark = tsCountByMark;
    }


    /**
     * Gets the tsCountByYear value for this VehicleCountData.
     * 
     * @return tsCountByYear
     */
    public kz.lof.webservices.store.udp.TSCountByYear[] getTsCountByYear() {
        return tsCountByYear;
    }


    /**
     * Sets the tsCountByYear value for this VehicleCountData.
     * 
     * @param tsCountByYear
     */
    public void setTsCountByYear(kz.lof.webservices.store.udp.TSCountByYear[] tsCountByYear) {
        this.tsCountByYear = tsCountByYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleCountData)) return false;
        VehicleCountData other = (VehicleCountData) obj;
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
            ((this.tsCountByCategory==null && other.getTsCountByCategory()==null) || 
             (this.tsCountByCategory!=null &&
              java.util.Arrays.equals(this.tsCountByCategory, other.getTsCountByCategory()))) &&
            ((this.tsCountByMark==null && other.getTsCountByMark()==null) || 
             (this.tsCountByMark!=null &&
              java.util.Arrays.equals(this.tsCountByMark, other.getTsCountByMark()))) &&
            ((this.tsCountByYear==null && other.getTsCountByYear()==null) || 
             (this.tsCountByYear!=null &&
              java.util.Arrays.equals(this.tsCountByYear, other.getTsCountByYear())));
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
        if (getTsCountByCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTsCountByCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTsCountByCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTsCountByMark() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTsCountByMark());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTsCountByMark(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTsCountByYear() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTsCountByYear());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTsCountByYear(), i);
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
        new org.apache.axis.description.TypeDesc(VehicleCountData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleCountData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tsCountByCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "tsCountByCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByCategory"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tsCountByMark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "tsCountByMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByMark"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tsCountByYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "tsCountByYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TSCountByYear"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item"));
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
