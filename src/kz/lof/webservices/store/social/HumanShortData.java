/**
 * HumanShortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.social;

public class HumanShortData  implements java.io.Serializable {
    private Address address;

    private String firstname;

    private int idPerson;

    private String lastname;

    private String middlename;

    public HumanShortData() {
    }

    public HumanShortData(
           Address address,
           String firstname,
           int idPerson,
           String lastname,
           String middlename) {
           this.address = address;
           this.firstname = firstname;
           this.idPerson = idPerson;
           this.lastname = lastname;
           this.middlename = middlename;
    }


    /**
     * Gets the address value for this HumanShortData.
     * 
     * @return address
     */
    public Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this HumanShortData.
     * 
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * Gets the firstname value for this HumanShortData.
     * 
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this HumanShortData.
     * 
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the idPerson value for this HumanShortData.
     * 
     * @return idPerson
     */
    public int getIdPerson() {
        return idPerson;
    }


    /**
     * Sets the idPerson value for this HumanShortData.
     * 
     * @param idPerson
     */
    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }


    /**
     * Gets the lastname value for this HumanShortData.
     * 
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this HumanShortData.
     * 
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the middlename value for this HumanShortData.
     * 
     * @return middlename
     */
    public String getMiddlename() {
        return middlename;
    }


    /**
     * Sets the middlename value for this HumanShortData.
     * 
     * @param middlename
     */
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HumanShortData)) return false;
        HumanShortData other = (HumanShortData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            this.idPerson == other.getIdPerson() &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.middlename==null && other.getMiddlename()==null) || 
             (this.middlename!=null &&
              this.middlename.equals(other.getMiddlename())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        _hashCode += getIdPerson();
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getMiddlename() != null) {
            _hashCode += getMiddlename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HumanShortData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "HumanShortData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "idPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "middlename"));
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
