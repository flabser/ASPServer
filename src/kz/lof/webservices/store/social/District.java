/**
 * District.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.social;

public class District  implements java.io.Serializable {
    private int idDistrict;

    private String nameDistrict;

    public District() {
    }

    public District(
           int idDistrict,
           String nameDistrict) {
           this.idDistrict = idDistrict;
           this.nameDistrict = nameDistrict;
    }


    /**
     * Gets the idDistrict value for this District.
     * 
     * @return idDistrict
     */
    public int getIdDistrict() {
        return idDistrict;
    }


    /**
     * Sets the idDistrict value for this District.
     * 
     * @param idDistrict
     */
    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }


    /**
     * Gets the nameDistrict value for this District.
     * 
     * @return nameDistrict
     */
    public String getNameDistrict() {
        return nameDistrict;
    }


    /**
     * Sets the nameDistrict value for this District.
     * 
     * @param nameDistrict
     */
    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof District)) return false;
        District other = (District) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idDistrict == other.getIdDistrict() &&
            ((this.nameDistrict==null && other.getNameDistrict()==null) || 
             (this.nameDistrict!=null &&
              this.nameDistrict.equals(other.getNameDistrict())));
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
        _hashCode += getIdDistrict();
        if (getNameDistrict() != null) {
            _hashCode += getNameDistrict().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(District.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "District"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDistrict");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "idDistrict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameDistrict");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "nameDistrict"));
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
