/**
 * HumanFullData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.social;

public class HumanFullData  implements java.io.Serializable {
    private Address address;

    private float allowanceAmount;

    private float areaReal;

    private float areaStandard;

    private float averageIncome;

    private java.util.Calendar dateRevalidation;

    private int familyMembers;

    private String firstname;

    private int idPerson;

    private float invoiceAmount;

    private String lastname;

    private String middlename;

    private float standardAmount;

    private float tenPercent;

    public HumanFullData() {
    }

    public HumanFullData(
           Address address,
           float allowanceAmount,
           float areaReal,
           float areaStandard,
           float averageIncome,
           java.util.Calendar dateRevalidation,
           int familyMembers,
           String firstname,
           int idPerson,
           float invoiceAmount,
           String lastname,
           String middlename,
           float standardAmount,
           float tenPercent) {
           this.address = address;
           this.allowanceAmount = allowanceAmount;
           this.areaReal = areaReal;
           this.areaStandard = areaStandard;
           this.averageIncome = averageIncome;
           this.dateRevalidation = dateRevalidation;
           this.familyMembers = familyMembers;
           this.firstname = firstname;
           this.idPerson = idPerson;
           this.invoiceAmount = invoiceAmount;
           this.lastname = lastname;
           this.middlename = middlename;
           this.standardAmount = standardAmount;
           this.tenPercent = tenPercent;
    }


    /**
     * Gets the address value for this HumanFullData.
     * 
     * @return address
     */
    public Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this HumanFullData.
     * 
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * Gets the allowanceAmount value for this HumanFullData.
     * 
     * @return allowanceAmount
     */
    public float getAllowanceAmount() {
        return allowanceAmount;
    }


    /**
     * Sets the allowanceAmount value for this HumanFullData.
     * 
     * @param allowanceAmount
     */
    public void setAllowanceAmount(float allowanceAmount) {
        this.allowanceAmount = allowanceAmount;
    }


    /**
     * Gets the areaReal value for this HumanFullData.
     * 
     * @return areaReal
     */
    public float getAreaReal() {
        return areaReal;
    }


    /**
     * Sets the areaReal value for this HumanFullData.
     * 
     * @param areaReal
     */
    public void setAreaReal(float areaReal) {
        this.areaReal = areaReal;
    }


    /**
     * Gets the areaStandard value for this HumanFullData.
     * 
     * @return areaStandard
     */
    public float getAreaStandard() {
        return areaStandard;
    }


    /**
     * Sets the areaStandard value for this HumanFullData.
     * 
     * @param areaStandard
     */
    public void setAreaStandard(float areaStandard) {
        this.areaStandard = areaStandard;
    }


    /**
     * Gets the averageIncome value for this HumanFullData.
     * 
     * @return averageIncome
     */
    public float getAverageIncome() {
        return averageIncome;
    }


    /**
     * Sets the averageIncome value for this HumanFullData.
     * 
     * @param averageIncome
     */
    public void setAverageIncome(float averageIncome) {
        this.averageIncome = averageIncome;
    }


    /**
     * Gets the dateRevalidation value for this HumanFullData.
     * 
     * @return dateRevalidation
     */
    public java.util.Calendar getDateRevalidation() {
        return dateRevalidation;
    }


    /**
     * Sets the dateRevalidation value for this HumanFullData.
     * 
     * @param dateRevalidation
     */
    public void setDateRevalidation(java.util.Calendar dateRevalidation) {
        this.dateRevalidation = dateRevalidation;
    }


    /**
     * Gets the familyMembers value for this HumanFullData.
     * 
     * @return familyMembers
     */
    public int getFamilyMembers() {
        return familyMembers;
    }


    /**
     * Sets the familyMembers value for this HumanFullData.
     * 
     * @param familyMembers
     */
    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }


    /**
     * Gets the firstname value for this HumanFullData.
     * 
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this HumanFullData.
     * 
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the idPerson value for this HumanFullData.
     * 
     * @return idPerson
     */
    public int getIdPerson() {
        return idPerson;
    }


    /**
     * Sets the idPerson value for this HumanFullData.
     * 
     * @param idPerson
     */
    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }


    /**
     * Gets the invoiceAmount value for this HumanFullData.
     * 
     * @return invoiceAmount
     */
    public float getInvoiceAmount() {
        return invoiceAmount;
    }


    /**
     * Sets the invoiceAmount value for this HumanFullData.
     * 
     * @param invoiceAmount
     */
    public void setInvoiceAmount(float invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }


    /**
     * Gets the lastname value for this HumanFullData.
     * 
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this HumanFullData.
     * 
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the middlename value for this HumanFullData.
     * 
     * @return middlename
     */
    public String getMiddlename() {
        return middlename;
    }


    /**
     * Sets the middlename value for this HumanFullData.
     * 
     * @param middlename
     */
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }


    /**
     * Gets the standardAmount value for this HumanFullData.
     * 
     * @return standardAmount
     */
    public float getStandardAmount() {
        return standardAmount;
    }


    /**
     * Sets the standardAmount value for this HumanFullData.
     * 
     * @param standardAmount
     */
    public void setStandardAmount(float standardAmount) {
        this.standardAmount = standardAmount;
    }


    /**
     * Gets the tenPercent value for this HumanFullData.
     * 
     * @return tenPercent
     */
    public float getTenPercent() {
        return tenPercent;
    }


    /**
     * Sets the tenPercent value for this HumanFullData.
     * 
     * @param tenPercent
     */
    public void setTenPercent(float tenPercent) {
        this.tenPercent = tenPercent;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HumanFullData)) return false;
        HumanFullData other = (HumanFullData) obj;
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
            this.allowanceAmount == other.getAllowanceAmount() &&
            this.areaReal == other.getAreaReal() &&
            this.areaStandard == other.getAreaStandard() &&
            this.averageIncome == other.getAverageIncome() &&
            ((this.dateRevalidation==null && other.getDateRevalidation()==null) || 
             (this.dateRevalidation!=null &&
              this.dateRevalidation.equals(other.getDateRevalidation()))) &&
            this.familyMembers == other.getFamilyMembers() &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            this.idPerson == other.getIdPerson() &&
            this.invoiceAmount == other.getInvoiceAmount() &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.middlename==null && other.getMiddlename()==null) || 
             (this.middlename!=null &&
              this.middlename.equals(other.getMiddlename()))) &&
            this.standardAmount == other.getStandardAmount() &&
            this.tenPercent == other.getTenPercent();
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
        _hashCode += new Float(getAllowanceAmount()).hashCode();
        _hashCode += new Float(getAreaReal()).hashCode();
        _hashCode += new Float(getAreaStandard()).hashCode();
        _hashCode += new Float(getAverageIncome()).hashCode();
        if (getDateRevalidation() != null) {
            _hashCode += getDateRevalidation().hashCode();
        }
        _hashCode += getFamilyMembers();
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        _hashCode += getIdPerson();
        _hashCode += new Float(getInvoiceAmount()).hashCode();
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getMiddlename() != null) {
            _hashCode += getMiddlename().hashCode();
        }
        _hashCode += new Float(getStandardAmount()).hashCode();
        _hashCode += new Float(getTenPercent()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HumanFullData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "HumanFullData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "allowanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaReal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "areaReal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaStandard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "areaStandard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "averageIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRevalidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "dateRevalidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "familyMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("invoiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "invoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "standardAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.social.webservices.lof.kz", "tenPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
