/**
 * StreetSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.gkz;

public class StreetSearchResult  implements java.io.Serializable {
    private kz.lof.webservices.store.gkz.Street[] street;

    private int totalFound;

    public StreetSearchResult() {
    }

    public StreetSearchResult(
           kz.lof.webservices.store.gkz.Street[] street,
           int totalFound) {
           this.street = street;
           this.totalFound = totalFound;
    }


    /**
     * Gets the street value for this StreetSearchResult.
     * 
     * @return street
     */
    public kz.lof.webservices.store.gkz.Street[] getStreet() {
        return street;
    }


    /**
     * Sets the street value for this StreetSearchResult.
     * 
     * @param street
     */
    public void setStreet(kz.lof.webservices.store.gkz.Street[] street) {
        this.street = street;
    }


    /**
     * Gets the totalFound value for this StreetSearchResult.
     * 
     * @return totalFound
     */
    public int getTotalFound() {
        return totalFound;
    }


    /**
     * Sets the totalFound value for this StreetSearchResult.
     * 
     * @param totalFound
     */
    public void setTotalFound(int totalFound) {
        this.totalFound = totalFound;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StreetSearchResult)) return false;
        StreetSearchResult other = (StreetSearchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              java.util.Arrays.equals(this.street, other.getStreet()))) &&
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
        if (getStreet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStreet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStreet(), i);
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
        new org.apache.axis.description.TypeDesc(StreetSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "StreetSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "Street"));
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
