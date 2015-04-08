/**
 * HumanSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class HumanSearchResult  implements java.io.Serializable {
    private long countFiz;

    private long countUr;

    private kz.lof.webservices.store.udp.HumanShortData[] shortData;

    private int totalFound;

    public HumanSearchResult() {
    }

    public HumanSearchResult(
           long countFiz,
           long countUr,
           kz.lof.webservices.store.udp.HumanShortData[] shortData,
           int totalFound) {
           this.countFiz = countFiz;
           this.countUr = countUr;
           this.shortData = shortData;
           this.totalFound = totalFound;
    }


    /**
     * Gets the countFiz value for this HumanSearchResult.
     * 
     * @return countFiz
     */
    public long getCountFiz() {
        return countFiz;
    }


    /**
     * Sets the countFiz value for this HumanSearchResult.
     * 
     * @param countFiz
     */
    public void setCountFiz(long countFiz) {
        this.countFiz = countFiz;
    }


    /**
     * Gets the countUr value for this HumanSearchResult.
     * 
     * @return countUr
     */
    public long getCountUr() {
        return countUr;
    }


    /**
     * Sets the countUr value for this HumanSearchResult.
     * 
     * @param countUr
     */
    public void setCountUr(long countUr) {
        this.countUr = countUr;
    }


    /**
     * Gets the shortData value for this HumanSearchResult.
     * 
     * @return shortData
     */
    public kz.lof.webservices.store.udp.HumanShortData[] getShortData() {
        return shortData;
    }


    /**
     * Sets the shortData value for this HumanSearchResult.
     * 
     * @param shortData
     */
    public void setShortData(kz.lof.webservices.store.udp.HumanShortData[] shortData) {
        this.shortData = shortData;
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
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
            this.countFiz == other.getCountFiz() &&
            this.countUr == other.getCountUr() &&
            ((this.shortData==null && other.getShortData()==null) || 
             (this.shortData!=null &&
              java.util.Arrays.equals(this.shortData, other.getShortData()))) &&
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
        _hashCode += new Long(getCountFiz()).hashCode();
        _hashCode += new Long(getCountUr()).hashCode();
        if (getShortData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShortData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShortData(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countFiz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "countFiz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countUr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "countUr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "shortData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanShortData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "totalFound"));
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
