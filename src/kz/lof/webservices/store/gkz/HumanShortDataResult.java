/**
 * HumanShortDataResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.gkz;

public class HumanShortDataResult  implements java.io.Serializable {
    private kz.lof.webservices.store.gkz.HumanShortData[] humanShortData;

    private int totalFound;

    public HumanShortDataResult() {
    }

    public HumanShortDataResult(
           kz.lof.webservices.store.gkz.HumanShortData[] humanShortData,
           int totalFound) {
           this.humanShortData = humanShortData;
           this.totalFound = totalFound;
    }


    /**
     * Gets the humanShortData value for this HumanShortDataResult.
     * 
     * @return humanShortData
     */
    public kz.lof.webservices.store.gkz.HumanShortData[] getHumanShortData() {
        return humanShortData;
    }


    /**
     * Sets the humanShortData value for this HumanShortDataResult.
     * 
     * @param humanShortData
     */
    public void setHumanShortData(kz.lof.webservices.store.gkz.HumanShortData[] humanShortData) {
        this.humanShortData = humanShortData;
    }


    /**
     * Gets the totalFound value for this HumanShortDataResult.
     * 
     * @return totalFound
     */
    public int getTotalFound() {
        return totalFound;
    }


    /**
     * Sets the totalFound value for this HumanShortDataResult.
     * 
     * @param totalFound
     */
    public void setTotalFound(int totalFound) {
        this.totalFound = totalFound;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HumanShortDataResult)) return false;
        HumanShortDataResult other = (HumanShortDataResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.humanShortData==null && other.getHumanShortData()==null) || 
             (this.humanShortData!=null &&
              java.util.Arrays.equals(this.humanShortData, other.getHumanShortData()))) &&
            this.totalFound == other.getTotalFound();
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
        if (getHumanShortData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHumanShortData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHumanShortData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalFound();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HumanShortDataResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "HumanShortDataResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humanShortData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "humanShortData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "HumanShortData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gkz.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "totalFound"));
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
