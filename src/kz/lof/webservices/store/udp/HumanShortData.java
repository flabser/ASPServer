/**
 * HumanShortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class HumanShortData  implements java.io.Serializable {
    private java.lang.String lastName;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String phone;

    private java.lang.String rnn;

    private java.lang.String iin;

    private java.lang.String docNumber;

    private java.util.Calendar birthDate;

    private kz.lof.webservices.store.udp.Address address;

    private kz.lof.webservices.store.udp.DriverPassport vu;

    private java.lang.String status;

    private long id;

    public HumanShortData() {
    }

    public HumanShortData(
           java.lang.String lastName,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String phone,
           java.lang.String rnn,
           java.lang.String iin,
           java.lang.String docNumber,
           java.util.Calendar birthDate,
           kz.lof.webservices.store.udp.Address address,
           kz.lof.webservices.store.udp.DriverPassport vu,
           java.lang.String status,
           long id) {
           this.lastName = lastName;
           this.firstName = firstName;
           this.middleName = middleName;
           this.phone = phone;
           this.rnn = rnn;
           this.iin = iin;
           this.docNumber = docNumber;
           this.birthDate = birthDate;
           this.address = address;
           this.vu = vu;
           this.status = status;
           this.id = id;
    }


    /**
     * Gets the lastName value for this HumanShortData.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this HumanShortData.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the firstName value for this HumanShortData.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this HumanShortData.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this HumanShortData.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this HumanShortData.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the phone value for this HumanShortData.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this HumanShortData.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the rnn value for this HumanShortData.
     * 
     * @return rnn
     */
    public java.lang.String getRnn() {
        return rnn;
    }


    /**
     * Sets the rnn value for this HumanShortData.
     * 
     * @param rnn
     */
    public void setRnn(java.lang.String rnn) {
        this.rnn = rnn;
    }


    /**
     * Gets the iin value for this HumanShortData.
     * 
     * @return iin
     */
    public java.lang.String getIin() {
        return iin;
    }


    /**
     * Sets the iin value for this HumanShortData.
     * 
     * @param iin
     */
    public void setIin(java.lang.String iin) {
        this.iin = iin;
    }


    /**
     * Gets the docNumber value for this HumanShortData.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this HumanShortData.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the birthDate value for this HumanShortData.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this HumanShortData.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the address value for this HumanShortData.
     * 
     * @return address
     */
    public kz.lof.webservices.store.udp.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this HumanShortData.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.udp.Address address) {
        this.address = address;
    }


    /**
     * Gets the vu value for this HumanShortData.
     * 
     * @return vu
     */
    public kz.lof.webservices.store.udp.DriverPassport getVu() {
        return vu;
    }


    /**
     * Sets the vu value for this HumanShortData.
     * 
     * @param vu
     */
    public void setVu(kz.lof.webservices.store.udp.DriverPassport vu) {
        this.vu = vu;
    }


    /**
     * Gets the status value for this HumanShortData.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HumanShortData.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the id value for this HumanShortData.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this HumanShortData.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
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
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.rnn==null && other.getRnn()==null) || 
             (this.rnn!=null &&
              this.rnn.equals(other.getRnn()))) &&
            ((this.iin==null && other.getIin()==null) || 
             (this.iin!=null &&
              this.iin.equals(other.getIin()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.vu==null && other.getVu()==null) || 
             (this.vu!=null &&
              this.vu.equals(other.getVu()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.id == other.getId();
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getRnn() != null) {
            _hashCode += getRnn().hashCode();
        }
        if (getIin() != null) {
            _hashCode += getIin().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getVu() != null) {
            _hashCode += getVu().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HumanShortData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanShortData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "rnn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "iin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "docNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "vu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "DriverPassport"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
