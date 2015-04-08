/**
 * QuarterSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.gkz;

public class QuarterSearchResult  implements java.io.Serializable {
    private kz.lof.webservices.store.gkz.Quarter[] quarter;

    private int totalFound;

    public QuarterSearchResult() {
    }

    public QuarterSearchResult(
           kz.lof.webservices.store.gkz.Quarter[] quarter,
           int totalFound) {
           this.quarter = quarter;
           this.totalFound = totalFound;
    }


    /**
     * Gets the quarter value for this QuarterSearchResult.
     * 
     * @return quarter
     */
    public kz.lof.webservices.store.gkz.Quarter[] getQuarter() {
        return quarter;
    }


    /**
     * Sets the quarter value for this QuarterSearchResult.
     * 
     * @param quarter
     */
    public void setQuarter(kz.lof.webservices.store.gkz.Quarter[] quarter) {
        this.quarter = quarter;
    }


    /**
     * Gets the totalFound value for this QuarterSearchResult.
     * 
     * @return totalFound
     */
    public int getTotalFound() {
        return totalFound;
    }


    /**
     * Sets the totalFound value for this QuarterSearchResult.
     * 
     * @param totalFound
     */
    public void setTotalFound(int totalFound) {
        this.totalFound = totalFound;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuarterSearchResult)) return false;
        QuarterSearchResult other = (QuarterSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quarter==null && other.getQuarter()==null) || 
             (this.quarter!=null &&
              java.util.Arrays.equals(this.quarter, other.getQuarter()))) &&
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
        if (getQuarter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuarter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuarter(), i);
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
        new org.apache.axis.description.TypeDesc(QuarterSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "QuarterSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quarter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "quarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "Quarter"));
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
