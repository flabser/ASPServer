/**
 * Street.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.social;

public class Street  implements java.io.Serializable {
    private int idStreet;

    private String nameStreet;

    public Street() {
    }

    public Street(
           int idStreet,
           String nameStreet) {
           this.idStreet = idStreet;
           this.nameStreet = nameStreet;
    }


    /**
     * Gets the idStreet value for this Street.
     * 
     * @return idStreet
     */
    public int getIdStreet() {
        return idStreet;
    }


    /**
     * Sets the idStreet value for this Street.
     * 
     * @param idStreet
     */
    public void setIdStreet(int idStreet) {
        this.idStreet = idStreet;
    }


    /**
     * Gets the nameStreet value for this Street.
     * 
     * @return nameStreet
     */
    public String getNameStreet() {
        return nameStreet;
    }


    /**
     * Sets the nameStreet value for this Street.
     * 
     * @param nameStreet
     */
    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Street)) return false;
        Street other = (Street) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idStreet == other.getIdStreet() &&
            ((this.nameStreet==null && other.getNameStreet()==null) || 
             (this.nameStreet!=null &&
              this.nameStreet.equals(other.getNameStreet())));
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
        _hashCode += getIdStreet();
        if (getNameStreet() != null) {
            _hashCode += getNameStreet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Street.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "Street"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "idStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "nameStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
