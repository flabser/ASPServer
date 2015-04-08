/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.bti;

public class Address  implements java.io.Serializable {
    private java.lang.String house;

    private java.lang.String flat;

    private kz.lof.webservices.store.bti.Region region;

    private kz.lof.webservices.store.bti.District district;

    private kz.lof.webservices.store.bti.City city;

    private kz.lof.webservices.store.bti.Street street;

    private kz.lof.webservices.store.bti.Street crossStreet;

    public Address() {
    }

    public Address(
           java.lang.String house,
           java.lang.String flat,
           kz.lof.webservices.store.bti.Region region,
           kz.lof.webservices.store.bti.District district,
           kz.lof.webservices.store.bti.City city,
           kz.lof.webservices.store.bti.Street street,
           kz.lof.webservices.store.bti.Street crossStreet) {
           this.house = house;
           this.flat = flat;
           this.region = region;
           this.district = district;
           this.city = city;
           this.street = street;
           this.crossStreet = crossStreet;
    }


    /**
     * Gets the house value for this Address.
     * 
     * @return house
     */
    public java.lang.String getHouse() {
        return house;
    }


    /**
     * Sets the house value for this Address.
     * 
     * @param house
     */
    public void setHouse(java.lang.String house) {
        this.house = house;
    }


    /**
     * Gets the flat value for this Address.
     * 
     * @return flat
     */
    public java.lang.String getFlat() {
        return flat;
    }


    /**
     * Sets the flat value for this Address.
     * 
     * @param flat
     */
    public void setFlat(java.lang.String flat) {
        this.flat = flat;
    }


    /**
     * Gets the region value for this Address.
     * 
     * @return region
     */
    public kz.lof.webservices.store.bti.Region getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Address.
     * 
     * @param region
     */
    public void setRegion(kz.lof.webservices.store.bti.Region region) {
        this.region = region;
    }


    /**
     * Gets the district value for this Address.
     * 
     * @return district
     */
    public kz.lof.webservices.store.bti.District getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this Address.
     * 
     * @param district
     */
    public void setDistrict(kz.lof.webservices.store.bti.District district) {
        this.district = district;
    }


    /**
     * Gets the city value for this Address.
     * 
     * @return city
     */
    public kz.lof.webservices.store.bti.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this Address.
     * 
     * @param city
     */
    public void setCity(kz.lof.webservices.store.bti.City city) {
        this.city = city;
    }


    /**
     * Gets the street value for this Address.
     * 
     * @return street
     */
    public kz.lof.webservices.store.bti.Street getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Address.
     * 
     * @param street
     */
    public void setStreet(kz.lof.webservices.store.bti.Street street) {
        this.street = street;
    }


    /**
     * Gets the crossStreet value for this Address.
     * 
     * @return crossStreet
     */
    public kz.lof.webservices.store.bti.Street getCrossStreet() {
        return crossStreet;
    }


    /**
     * Sets the crossStreet value for this Address.
     * 
     * @param crossStreet
     */
    public void setCrossStreet(kz.lof.webservices.store.bti.Street crossStreet) {
        this.crossStreet = crossStreet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
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
            ((this.house==null && other.getHouse()==null) || 
             (this.house!=null &&
              this.house.equals(other.getHouse()))) &&
            ((this.flat==null && other.getFlat()==null) || 
             (this.flat!=null &&
              this.flat.equals(other.getFlat()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.crossStreet==null && other.getCrossStreet()==null) || 
             (this.crossStreet!=null &&
              this.crossStreet.equals(other.getCrossStreet())));
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
        if (getHouse() != null) {
            _hashCode += getHouse().hashCode();
        }
        if (getFlat() != null) {
            _hashCode += getFlat().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getCrossStreet() != null) {
            _hashCode += getCrossStreet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "house"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "flat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "Region"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "District"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "City"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "Street"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "crossStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "Street"));
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
