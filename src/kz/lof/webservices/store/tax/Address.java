/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.tax;

public class Address  implements java.io.Serializable {
    private kz.lof.webservices.store.tax.State state;

    private kz.lof.webservices.store.tax.Region region;

    private kz.lof.webservices.store.tax.Place place;

    private kz.lof.webservices.store.tax.Street street;

    private java.lang.String house;

    private java.lang.String flat;

    public Address() {
    }

    public Address(
           kz.lof.webservices.store.tax.State state,
           kz.lof.webservices.store.tax.Region region,
           kz.lof.webservices.store.tax.Place place,
           kz.lof.webservices.store.tax.Street street,
           java.lang.String house,
           java.lang.String flat) {
           this.state = state;
           this.region = region;
           this.place = place;
           this.street = street;
           this.house = house;
           this.flat = flat;
    }


    /**
     * Gets the state value for this Address.
     * 
     * @return state
     */
    public kz.lof.webservices.store.tax.State getState() {
        return state;
    }


    /**
     * Sets the state value for this Address.
     * 
     * @param state
     */
    public void setState(kz.lof.webservices.store.tax.State state) {
        this.state = state;
    }


    /**
     * Gets the region value for this Address.
     * 
     * @return region
     */
    public kz.lof.webservices.store.tax.Region getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Address.
     * 
     * @param region
     */
    public void setRegion(kz.lof.webservices.store.tax.Region region) {
        this.region = region;
    }


    /**
     * Gets the place value for this Address.
     * 
     * @return place
     */
    public kz.lof.webservices.store.tax.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this Address.
     * 
     * @param place
     */
    public void setPlace(kz.lof.webservices.store.tax.Place place) {
        this.place = place;
    }


    /**
     * Gets the street value for this Address.
     * 
     * @return street
     */
    public kz.lof.webservices.store.tax.Street getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Address.
     * 
     * @param street
     */
    public void setStreet(kz.lof.webservices.store.tax.Street street) {
        this.street = street;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.house==null && other.getHouse()==null) || 
             (this.house!=null &&
              this.house.equals(other.getHouse()))) &&
            ((this.flat==null && other.getFlat()==null) || 
             (this.flat!=null &&
              this.flat.equals(other.getFlat())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHouse() != null) {
            _hashCode += getHouse().hashCode();
        }
        if (getFlat() != null) {
            _hashCode += getFlat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "State"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "Region"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "Place"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "Street"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "house"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "flat"));
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
