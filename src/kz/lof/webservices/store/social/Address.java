/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.social;

public class Address  implements java.io.Serializable {
    private District district;

    private String flat;

    private String house;

    private Street street;

    public Address() {
    }

    public Address(
           District district,
           String flat,
           String house,
           Street street) {
           this.district = district;
           this.flat = flat;
           this.house = house;
           this.street = street;
    }


    /**
     * Gets the district value for this Address.
     * 
     * @return district
     */
    public District getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this Address.
     * 
     * @param district
     */
    public void setDistrict(District district) {
        this.district = district;
    }


    /**
     * Gets the flat value for this Address.
     * 
     * @return flat
     */
    public String getFlat() {
        return flat;
    }


    /**
     * Sets the flat value for this Address.
     * 
     * @param flat
     */
    public void setFlat(String flat) {
        this.flat = flat;
    }


    /**
     * Gets the house value for this Address.
     * 
     * @return house
     */
    public String getHouse() {
        return house;
    }


    /**
     * Sets the house value for this Address.
     * 
     * @param house
     */
    public void setHouse(String house) {
        this.house = house;
    }


    /**
     * Gets the street value for this Address.
     * 
     * @return street
     */
    public Street getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Address.
     * 
     * @param street
     */
    public void setStreet(Street street) {
        this.street = street;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.flat==null && other.getFlat()==null) || 
             (this.flat!=null &&
              this.flat.equals(other.getFlat()))) &&
            ((this.house==null && other.getHouse()==null) || 
             (this.house!=null &&
              this.house.equals(other.getHouse()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet())));
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
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getFlat() != null) {
            _hashCode += getFlat().hashCode();
        }
        if (getHouse() != null) {
            _hashCode += getHouse().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "District"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "flat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "house"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "Street"));
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
