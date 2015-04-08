/**
 * HumanSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.social;

public class HumanSearchResult  implements java.io.Serializable {
    private HumanShortData[] crowd;

    private int totalFound;

    public HumanSearchResult() {
    }

    public HumanSearchResult(
           HumanShortData[] crowd,
           int totalFound) {
           this.crowd = crowd;
           this.totalFound = totalFound;
    }


    /**
     * Gets the crowd value for this HumanSearchResult.
     * 
     * @return crowd
     */
    public HumanShortData[] getCrowd() {
        return crowd;
    }


    /**
     * Sets the crowd value for this HumanSearchResult.
     * 
     * @param crowd
     */
    public void setCrowd(HumanShortData[] crowd) {
        this.crowd = crowd;
    }


    /**
     * Gets the totalFound value for this HumanSearchResult.
     * 
     * @return totalFound
     */
    public int getTotalFound() {
        return totalFound;
    }


    /**
     * Sets the totalFound value for this HumanSearchResult.
     * 
     * @param totalFound
     */
    public void setTotalFound(int totalFound) {
        this.totalFound = totalFound;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HumanSearchResult)) return false;
        HumanSearchResult other = (HumanSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.crowd==null && other.getCrowd()==null) || 
             (this.crowd!=null &&
              java.util.Arrays.equals(this.crowd, other.getCrowd()))) &&
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
        if (getCrowd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrowd());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCrowd(), i);
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
        new org.apache.axis.description.TypeDesc(HumanSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "HumanSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crowd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "crowd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "HumanShortData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://social.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "totalFound"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
