/**
 * TaxPayerShortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.tax;

public class TaxPayerShortData  implements java.io.Serializable {
    private java.lang.String rnn;

    private java.lang.String iin;

    private short status;

    private int id;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String middleName;

    private java.lang.String docNumber;

    private java.util.Calendar birthDate;

    private java.lang.String phone;

    private kz.lof.webservices.store.tax.Address regAddress;

    private kz.lof.webservices.store.tax.Address realAddress;

    public TaxPayerShortData() {
    }

    public TaxPayerShortData(
           java.lang.String rnn,
           java.lang.String iin,
           short status,
           int id,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String middleName,
           java.lang.String docNumber,
           java.util.Calendar birthDate,
           java.lang.String phone,
           kz.lof.webservices.store.tax.Address regAddress,
           kz.lof.webservices.store.tax.Address realAddress) {
           this.rnn = rnn;
           this.iin = iin;
           this.status = status;
           this.id = id;
           this.firstName = firstName;
           this.lastName = lastName;
           this.middleName = middleName;
           this.docNumber = docNumber;
           this.birthDate = birthDate;
           this.phone = phone;
           this.regAddress = regAddress;
           this.realAddress = realAddress;
    }


    /**
     * Gets the rnn value for this TaxPayerShortData.
     * 
     * @return rnn
     */
    public java.lang.String getRnn() {
        return rnn;
    }


    /**
     * Sets the rnn value for this TaxPayerShortData.
     * 
     * @param rnn
     */
    public void setRnn(java.lang.String rnn) {
        this.rnn = rnn;
    }


    /**
     * Gets the iin value for this TaxPayerShortData.
     * 
     * @return iin
     */
    public java.lang.String getIin() {
        return iin;
    }


    /**
     * Sets the iin value for this TaxPayerShortData.
     * 
     * @param iin
     */
    public void setIin(java.lang.String iin) {
        this.iin = iin;
    }


    /**
     * Gets the status value for this TaxPayerShortData.
     * 
     * @return status
     */
    public short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TaxPayerShortData.
     * 
     * @param status
     */
    public void setStatus(short status) {
        this.status = status;
    }


    /**
     * Gets the id value for this TaxPayerShortData.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this TaxPayerShortData.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the firstName value for this TaxPayerShortData.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this TaxPayerShortData.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this TaxPayerShortData.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TaxPayerShortData.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the middleName value for this TaxPayerShortData.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this TaxPayerShortData.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the docNumber value for this TaxPayerShortData.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this TaxPayerShortData.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the birthDate value for this TaxPayerShortData.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this TaxPayerShortData.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the phone value for this TaxPayerShortData.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this TaxPayerShortData.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the regAddress value for this TaxPayerShortData.
     * 
     * @return regAddress
     */
    public kz.lof.webservices.store.tax.Address getRegAddress() {
        return regAddress;
    }


    /**
     * Sets the regAddress value for this TaxPayerShortData.
     * 
     * @param regAddress
     */
    public void setRegAddress(kz.lof.webservices.store.tax.Address regAddress) {
        this.regAddress = regAddress;
    }


    /**
     * Gets the realAddress value for this TaxPayerShortData.
     * 
     * @return realAddress
     */
    public kz.lof.webservices.store.tax.Address getRealAddress() {
        return realAddress;
    }


    /**
     * Sets the realAddress value for this TaxPayerShortData.
     * 
     * @param realAddress
     */
    public void setRealAddress(kz.lof.webservices.store.tax.Address realAddress) {
        this.realAddress = realAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxPayerShortData)) return false;
        TaxPayerShortData other = (TaxPayerShortData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rnn==null && other.getRnn()==null) || 
             (this.rnn!=null &&
              this.rnn.equals(other.getRnn()))) &&
            ((this.iin==null && other.getIin()==null) || 
             (this.iin!=null &&
              this.iin.equals(other.getIin()))) &&
            this.status == other.getStatus() &&
            this.id == other.getId() &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.regAddress==null && other.getRegAddress()==null) || 
             (this.regAddress!=null &&
              this.regAddress.equals(other.getRegAddress()))) &&
            ((this.realAddress==null && other.getRealAddress()==null) || 
             (this.realAddress!=null &&
              this.realAddress.equals(other.getRealAddress())));
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
        if (getRnn() != null) {
            _hashCode += getRnn().hashCode();
        }
        if (getIin() != null) {
            _hashCode += getIin().hashCode();
        }
        _hashCode += getStatus();
        _hashCode += getId();
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getRegAddress() != null) {
            _hashCode += getRegAddress().hashCode();
        }
        if (getRealAddress() != null) {
            _hashCode += getRealAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxPayerShortData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "TaxPayerShortData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "rnn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "iin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "docNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "regAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "realAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "Address"));
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
