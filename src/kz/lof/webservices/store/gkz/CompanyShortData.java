/**
 * CompanyShortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.gkz;

public class CompanyShortData  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String bankRnn;

    private java.lang.String bossFIO;

    private java.lang.String district;

    private java.lang.String id;

    private java.lang.String nameCompany;

    private java.lang.String ownerType;

    private java.lang.String telefon;

    public CompanyShortData() {
    }

    public CompanyShortData(
           java.lang.String address,
           java.lang.String bankRnn,
           java.lang.String bossFIO,
           java.lang.String district,
           java.lang.String id,
           java.lang.String nameCompany,
           java.lang.String ownerType,
           java.lang.String telefon) {
           this.address = address;
           this.bankRnn = bankRnn;
           this.bossFIO = bossFIO;
           this.district = district;
           this.id = id;
           this.nameCompany = nameCompany;
           this.ownerType = ownerType;
           this.telefon = telefon;
    }


    /**
     * Gets the address value for this CompanyShortData.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CompanyShortData.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the bankRnn value for this CompanyShortData.
     * 
     * @return bankRnn
     */
    public java.lang.String getBankRnn() {
        return bankRnn;
    }


    /**
     * Sets the bankRnn value for this CompanyShortData.
     * 
     * @param bankRnn
     */
    public void setBankRnn(java.lang.String bankRnn) {
        this.bankRnn = bankRnn;
    }


    /**
     * Gets the bossFIO value for this CompanyShortData.
     * 
     * @return bossFIO
     */
    public java.lang.String getBossFIO() {
        return bossFIO;
    }


    /**
     * Sets the bossFIO value for this CompanyShortData.
     * 
     * @param bossFIO
     */
    public void setBossFIO(java.lang.String bossFIO) {
        this.bossFIO = bossFIO;
    }


    /**
     * Gets the district value for this CompanyShortData.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this CompanyShortData.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the id value for this CompanyShortData.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CompanyShortData.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the nameCompany value for this CompanyShortData.
     * 
     * @return nameCompany
     */
    public java.lang.String getNameCompany() {
        return nameCompany;
    }


    /**
     * Sets the nameCompany value for this CompanyShortData.
     * 
     * @param nameCompany
     */
    public void setNameCompany(java.lang.String nameCompany) {
        this.nameCompany = nameCompany;
    }


    /**
     * Gets the ownerType value for this CompanyShortData.
     * 
     * @return ownerType
     */
    public java.lang.String getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this CompanyShortData.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.String ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the telefon value for this CompanyShortData.
     * 
     * @return telefon
     */
    public java.lang.String getTelefon() {
        return telefon;
    }


    /**
     * Sets the telefon value for this CompanyShortData.
     * 
     * @param telefon
     */
    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyShortData)) return false;
        CompanyShortData other = (CompanyShortData) obj;
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
            ((this.bankRnn==null && other.getBankRnn()==null) || 
             (this.bankRnn!=null &&
              this.bankRnn.equals(other.getBankRnn()))) &&
            ((this.bossFIO==null && other.getBossFIO()==null) || 
             (this.bossFIO!=null &&
              this.bossFIO.equals(other.getBossFIO()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nameCompany==null && other.getNameCompany()==null) || 
             (this.nameCompany!=null &&
              this.nameCompany.equals(other.getNameCompany()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.telefon==null && other.getTelefon()==null) || 
             (this.telefon!=null &&
              this.telefon.equals(other.getTelefon())));
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
        if (getBankRnn() != null) {
            _hashCode += getBankRnn().hashCode();
        }
        if (getBossFIO() != null) {
            _hashCode += getBossFIO().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNameCompany() != null) {
            _hashCode += getNameCompany().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getTelefon() != null) {
            _hashCode += getTelefon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompanyShortData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "CompanyShortData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRnn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "bankRnn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bossFIO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "bossFIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "nameCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "ownerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.gkz.webservices.lof.kz", "telefon"));
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
