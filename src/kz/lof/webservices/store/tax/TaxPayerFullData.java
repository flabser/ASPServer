/**
 * TaxPayerFullData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.tax;

public class TaxPayerFullData  implements java.io.Serializable {
    private int id;

    private short status;

    private java.lang.String rnn;

    private java.lang.String iin;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String middleName;

    private java.util.Calendar birthDate;

    private kz.lof.webservices.store.tax.Address regAddress;

    private kz.lof.webservices.store.tax.Address realAddress;

    private java.util.Calendar regDate;

    private java.lang.String docSerial;

    private java.lang.String docNumber;

    private java.util.Calendar docReleaseDate;

    private java.lang.String docAuthority;

    private java.lang.String regAuthority;

    private java.lang.String registryNumber;

    private kz.lof.webservices.store.tax.ActivityType activityType;

    private kz.lof.webservices.store.tax.OrgForm orgForm;

    private kz.lof.webservices.store.tax.PropertyForm propForm;

    private kz.lof.webservices.store.tax.LegalPersonType personType;

    private java.lang.String okpo;

    public TaxPayerFullData() {
    }

    public TaxPayerFullData(
           int id,
           short status,
           java.lang.String rnn,
           java.lang.String iin,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String middleName,
           java.util.Calendar birthDate,
           kz.lof.webservices.store.tax.Address regAddress,
           kz.lof.webservices.store.tax.Address realAddress,
           java.util.Calendar regDate,
           java.lang.String docSerial,
           java.lang.String docNumber,
           java.util.Calendar docReleaseDate,
           java.lang.String docAuthority,
           java.lang.String regAuthority,
           java.lang.String registryNumber,
           kz.lof.webservices.store.tax.ActivityType activityType,
           kz.lof.webservices.store.tax.OrgForm orgForm,
           kz.lof.webservices.store.tax.PropertyForm propForm,
           kz.lof.webservices.store.tax.LegalPersonType personType,
           java.lang.String okpo) {
           this.id = id;
           this.status = status;
           this.rnn = rnn;
           this.iin = iin;
           this.firstName = firstName;
           this.lastName = lastName;
           this.middleName = middleName;
           this.birthDate = birthDate;
           this.regAddress = regAddress;
           this.realAddress = realAddress;
           this.regDate = regDate;
           this.docSerial = docSerial;
           this.docNumber = docNumber;
           this.docReleaseDate = docReleaseDate;
           this.docAuthority = docAuthority;
           this.regAuthority = regAuthority;
           this.registryNumber = registryNumber;
           this.activityType = activityType;
           this.orgForm = orgForm;
           this.propForm = propForm;
           this.personType = personType;
           this.okpo = okpo;
    }


    /**
     * Gets the id value for this TaxPayerFullData.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this TaxPayerFullData.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the status value for this TaxPayerFullData.
     * 
     * @return status
     */
    public short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TaxPayerFullData.
     * 
     * @param status
     */
    public void setStatus(short status) {
        this.status = status;
    }


    /**
     * Gets the rnn value for this TaxPayerFullData.
     * 
     * @return rnn
     */
    public java.lang.String getRnn() {
        return rnn;
    }


    /**
     * Sets the rnn value for this TaxPayerFullData.
     * 
     * @param rnn
     */
    public void setRnn(java.lang.String rnn) {
        this.rnn = rnn;
    }


    /**
     * Gets the iin value for this TaxPayerFullData.
     * 
     * @return iin
     */
    public java.lang.String getIin() {
        return iin;
    }


    /**
     * Sets the iin value for this TaxPayerFullData.
     * 
     * @param iin
     */
    public void setIin(java.lang.String iin) {
        this.iin = iin;
    }


    /**
     * Gets the firstName value for this TaxPayerFullData.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this TaxPayerFullData.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this TaxPayerFullData.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TaxPayerFullData.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the middleName value for this TaxPayerFullData.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this TaxPayerFullData.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the birthDate value for this TaxPayerFullData.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this TaxPayerFullData.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the regAddress value for this TaxPayerFullData.
     * 
     * @return regAddress
     */
    public kz.lof.webservices.store.tax.Address getRegAddress() {
        return regAddress;
    }


    /**
     * Sets the regAddress value for this TaxPayerFullData.
     * 
     * @param regAddress
     */
    public void setRegAddress(kz.lof.webservices.store.tax.Address regAddress) {
        this.regAddress = regAddress;
    }


    /**
     * Gets the realAddress value for this TaxPayerFullData.
     * 
     * @return realAddress
     */
    public kz.lof.webservices.store.tax.Address getRealAddress() {
        return realAddress;
    }


    /**
     * Sets the realAddress value for this TaxPayerFullData.
     * 
     * @param realAddress
     */
    public void setRealAddress(kz.lof.webservices.store.tax.Address realAddress) {
        this.realAddress = realAddress;
    }


    /**
     * Gets the regDate value for this TaxPayerFullData.
     * 
     * @return regDate
     */
    public java.util.Calendar getRegDate() {
        return regDate;
    }


    /**
     * Sets the regDate value for this TaxPayerFullData.
     * 
     * @param regDate
     */
    public void setRegDate(java.util.Calendar regDate) {
        this.regDate = regDate;
    }


    /**
     * Gets the docSerial value for this TaxPayerFullData.
     * 
     * @return docSerial
     */
    public java.lang.String getDocSerial() {
        return docSerial;
    }


    /**
     * Sets the docSerial value for this TaxPayerFullData.
     * 
     * @param docSerial
     */
    public void setDocSerial(java.lang.String docSerial) {
        this.docSerial = docSerial;
    }


    /**
     * Gets the docNumber value for this TaxPayerFullData.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this TaxPayerFullData.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the docReleaseDate value for this TaxPayerFullData.
     * 
     * @return docReleaseDate
     */
    public java.util.Calendar getDocReleaseDate() {
        return docReleaseDate;
    }


    /**
     * Sets the docReleaseDate value for this TaxPayerFullData.
     * 
     * @param docReleaseDate
     */
    public void setDocReleaseDate(java.util.Calendar docReleaseDate) {
        this.docReleaseDate = docReleaseDate;
    }


    /**
     * Gets the docAuthority value for this TaxPayerFullData.
     * 
     * @return docAuthority
     */
    public java.lang.String getDocAuthority() {
        return docAuthority;
    }


    /**
     * Sets the docAuthority value for this TaxPayerFullData.
     * 
     * @param docAuthority
     */
    public void setDocAuthority(java.lang.String docAuthority) {
        this.docAuthority = docAuthority;
    }


    /**
     * Gets the regAuthority value for this TaxPayerFullData.
     * 
     * @return regAuthority
     */
    public java.lang.String getRegAuthority() {
        return regAuthority;
    }


    /**
     * Sets the regAuthority value for this TaxPayerFullData.
     * 
     * @param regAuthority
     */
    public void setRegAuthority(java.lang.String regAuthority) {
        this.regAuthority = regAuthority;
    }


    /**
     * Gets the registryNumber value for this TaxPayerFullData.
     * 
     * @return registryNumber
     */
    public java.lang.String getRegistryNumber() {
        return registryNumber;
    }


    /**
     * Sets the registryNumber value for this TaxPayerFullData.
     * 
     * @param registryNumber
     */
    public void setRegistryNumber(java.lang.String registryNumber) {
        this.registryNumber = registryNumber;
    }


    /**
     * Gets the activityType value for this TaxPayerFullData.
     * 
     * @return activityType
     */
    public kz.lof.webservices.store.tax.ActivityType getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this TaxPayerFullData.
     * 
     * @param activityType
     */
    public void setActivityType(kz.lof.webservices.store.tax.ActivityType activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the orgForm value for this TaxPayerFullData.
     * 
     * @return orgForm
     */
    public kz.lof.webservices.store.tax.OrgForm getOrgForm() {
        return orgForm;
    }


    /**
     * Sets the orgForm value for this TaxPayerFullData.
     * 
     * @param orgForm
     */
    public void setOrgForm(kz.lof.webservices.store.tax.OrgForm orgForm) {
        this.orgForm = orgForm;
    }


    /**
     * Gets the propForm value for this TaxPayerFullData.
     * 
     * @return propForm
     */
    public kz.lof.webservices.store.tax.PropertyForm getPropForm() {
        return propForm;
    }


    /**
     * Sets the propForm value for this TaxPayerFullData.
     * 
     * @param propForm
     */
    public void setPropForm(kz.lof.webservices.store.tax.PropertyForm propForm) {
        this.propForm = propForm;
    }


    /**
     * Gets the personType value for this TaxPayerFullData.
     * 
     * @return personType
     */
    public kz.lof.webservices.store.tax.LegalPersonType getPersonType() {
        return personType;
    }


    /**
     * Sets the personType value for this TaxPayerFullData.
     * 
     * @param personType
     */
    public void setPersonType(kz.lof.webservices.store.tax.LegalPersonType personType) {
        this.personType = personType;
    }


    /**
     * Gets the okpo value for this TaxPayerFullData.
     * 
     * @return okpo
     */
    public java.lang.String getOkpo() {
        return okpo;
    }


    /**
     * Sets the okpo value for this TaxPayerFullData.
     * 
     * @param okpo
     */
    public void setOkpo(java.lang.String okpo) {
        this.okpo = okpo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxPayerFullData)) return false;
        TaxPayerFullData other = (TaxPayerFullData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.status == other.getStatus() &&
            ((this.rnn==null && other.getRnn()==null) || 
             (this.rnn!=null &&
              this.rnn.equals(other.getRnn()))) &&
            ((this.iin==null && other.getIin()==null) || 
             (this.iin!=null &&
              this.iin.equals(other.getIin()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.regAddress==null && other.getRegAddress()==null) || 
             (this.regAddress!=null &&
              this.regAddress.equals(other.getRegAddress()))) &&
            ((this.realAddress==null && other.getRealAddress()==null) || 
             (this.realAddress!=null &&
              this.realAddress.equals(other.getRealAddress()))) &&
            ((this.regDate==null && other.getRegDate()==null) || 
             (this.regDate!=null &&
              this.regDate.equals(other.getRegDate()))) &&
            ((this.docSerial==null && other.getDocSerial()==null) || 
             (this.docSerial!=null &&
              this.docSerial.equals(other.getDocSerial()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.docReleaseDate==null && other.getDocReleaseDate()==null) || 
             (this.docReleaseDate!=null &&
              this.docReleaseDate.equals(other.getDocReleaseDate()))) &&
            ((this.docAuthority==null && other.getDocAuthority()==null) || 
             (this.docAuthority!=null &&
              this.docAuthority.equals(other.getDocAuthority()))) &&
            ((this.regAuthority==null && other.getRegAuthority()==null) || 
             (this.regAuthority!=null &&
              this.regAuthority.equals(other.getRegAuthority()))) &&
            ((this.registryNumber==null && other.getRegistryNumber()==null) || 
             (this.registryNumber!=null &&
              this.registryNumber.equals(other.getRegistryNumber()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.orgForm==null && other.getOrgForm()==null) || 
             (this.orgForm!=null &&
              this.orgForm.equals(other.getOrgForm()))) &&
            ((this.propForm==null && other.getPropForm()==null) || 
             (this.propForm!=null &&
              this.propForm.equals(other.getPropForm()))) &&
            ((this.personType==null && other.getPersonType()==null) || 
             (this.personType!=null &&
              this.personType.equals(other.getPersonType()))) &&
            ((this.okpo==null && other.getOkpo()==null) || 
             (this.okpo!=null &&
              this.okpo.equals(other.getOkpo())));
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
        _hashCode += getId();
        _hashCode += getStatus();
        if (getRnn() != null) {
            _hashCode += getRnn().hashCode();
        }
        if (getIin() != null) {
            _hashCode += getIin().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getRegAddress() != null) {
            _hashCode += getRegAddress().hashCode();
        }
        if (getRealAddress() != null) {
            _hashCode += getRealAddress().hashCode();
        }
        if (getRegDate() != null) {
            _hashCode += getRegDate().hashCode();
        }
        if (getDocSerial() != null) {
            _hashCode += getDocSerial().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getDocReleaseDate() != null) {
            _hashCode += getDocReleaseDate().hashCode();
        }
        if (getDocAuthority() != null) {
            _hashCode += getDocAuthority().hashCode();
        }
        if (getRegAuthority() != null) {
            _hashCode += getRegAuthority().hashCode();
        }
        if (getRegistryNumber() != null) {
            _hashCode += getRegistryNumber().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getOrgForm() != null) {
            _hashCode += getOrgForm().hashCode();
        }
        if (getPropForm() != null) {
            _hashCode += getPropForm().hashCode();
        }
        if (getPersonType() != null) {
            _hashCode += getPersonType().hashCode();
        }
        if (getOkpo() != null) {
            _hashCode += getOkpo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxPayerFullData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "TaxPayerFullData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "regDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "docSerial"));
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
        elemField.setFieldName("docReleaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "docReleaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "docAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "regAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "registryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "ActivityType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "orgForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "OrgForm"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "propForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "PropertyForm"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "personType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "LegalPersonType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("okpo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "okpo"));
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
