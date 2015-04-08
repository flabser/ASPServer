/**
 * TaxIndFullData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.tax;

public class TaxIndFullData  implements java.io.Serializable {
    private long id;

    private long payerId;

    private java.lang.String rnn;

    private java.lang.String iin;

    private short declarationType;

    private short isFarm;

    private short businessType;

    private short cooperativeType;

    private java.lang.String businessName;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String middleName;

    private java.lang.String docSerial;

    private java.lang.String docNumber;

    private java.lang.String docAuthority;

    private java.lang.String activityType;

    private java.lang.String activityPlace;

    private java.lang.String officerFullName;

    private java.util.Calendar docReleaseDate;

    private java.util.Calendar licenseStartDate;

    private java.util.Calendar licenseEndDate;

    private java.util.Calendar declarationSentDate;

    private java.util.Calendar declarationReceivedDate;

    private int cooperativeCount;

    private kz.lof.webservices.store.tax.Address address;

    private kz.lof.webservices.store.tax.TaxOffice taxingOffice;

    public TaxIndFullData() {
    }

    public TaxIndFullData(
           long id,
           long payerId,
           java.lang.String rnn,
           java.lang.String iin,
           short declarationType,
           short isFarm,
           short businessType,
           short cooperativeType,
           java.lang.String businessName,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String middleName,
           java.lang.String docSerial,
           java.lang.String docNumber,
           java.lang.String docAuthority,
           java.lang.String activityType,
           java.lang.String activityPlace,
           java.lang.String officerFullName,
           java.util.Calendar docReleaseDate,
           java.util.Calendar licenseStartDate,
           java.util.Calendar licenseEndDate,
           java.util.Calendar declarationSentDate,
           java.util.Calendar declarationReceivedDate,
           int cooperativeCount,
           kz.lof.webservices.store.tax.Address address,
           kz.lof.webservices.store.tax.TaxOffice taxingOffice) {
           this.id = id;
           this.payerId = payerId;
           this.rnn = rnn;
           this.iin = iin;
           this.declarationType = declarationType;
           this.isFarm = isFarm;
           this.businessType = businessType;
           this.cooperativeType = cooperativeType;
           this.businessName = businessName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.middleName = middleName;
           this.docSerial = docSerial;
           this.docNumber = docNumber;
           this.docAuthority = docAuthority;
           this.activityType = activityType;
           this.activityPlace = activityPlace;
           this.officerFullName = officerFullName;
           this.docReleaseDate = docReleaseDate;
           this.licenseStartDate = licenseStartDate;
           this.licenseEndDate = licenseEndDate;
           this.declarationSentDate = declarationSentDate;
           this.declarationReceivedDate = declarationReceivedDate;
           this.cooperativeCount = cooperativeCount;
           this.address = address;
           this.taxingOffice = taxingOffice;
    }


    /**
     * Gets the id value for this TaxIndFullData.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this TaxIndFullData.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the payerId value for this TaxIndFullData.
     * 
     * @return payerId
     */
    public long getPayerId() {
        return payerId;
    }


    /**
     * Sets the payerId value for this TaxIndFullData.
     * 
     * @param payerId
     */
    public void setPayerId(long payerId) {
        this.payerId = payerId;
    }


    /**
     * Gets the rnn value for this TaxIndFullData.
     * 
     * @return rnn
     */
    public java.lang.String getRnn() {
        return rnn;
    }


    /**
     * Sets the rnn value for this TaxIndFullData.
     * 
     * @param rnn
     */
    public void setRnn(java.lang.String rnn) {
        this.rnn = rnn;
    }


    /**
     * Gets the iin value for this TaxIndFullData.
     * 
     * @return iin
     */
    public java.lang.String getIin() {
        return iin;
    }


    /**
     * Sets the iin value for this TaxIndFullData.
     * 
     * @param iin
     */
    public void setIin(java.lang.String iin) {
        this.iin = iin;
    }


    /**
     * Gets the declarationType value for this TaxIndFullData.
     * 
     * @return declarationType
     */
    public short getDeclarationType() {
        return declarationType;
    }


    /**
     * Sets the declarationType value for this TaxIndFullData.
     * 
     * @param declarationType
     */
    public void setDeclarationType(short declarationType) {
        this.declarationType = declarationType;
    }


    /**
     * Gets the isFarm value for this TaxIndFullData.
     * 
     * @return isFarm
     */
    public short getIsFarm() {
        return isFarm;
    }


    /**
     * Sets the isFarm value for this TaxIndFullData.
     * 
     * @param isFarm
     */
    public void setIsFarm(short isFarm) {
        this.isFarm = isFarm;
    }


    /**
     * Gets the businessType value for this TaxIndFullData.
     * 
     * @return businessType
     */
    public short getBusinessType() {
        return businessType;
    }


    /**
     * Sets the businessType value for this TaxIndFullData.
     * 
     * @param businessType
     */
    public void setBusinessType(short businessType) {
        this.businessType = businessType;
    }


    /**
     * Gets the cooperativeType value for this TaxIndFullData.
     * 
     * @return cooperativeType
     */
    public short getCooperativeType() {
        return cooperativeType;
    }


    /**
     * Sets the cooperativeType value for this TaxIndFullData.
     * 
     * @param cooperativeType
     */
    public void setCooperativeType(short cooperativeType) {
        this.cooperativeType = cooperativeType;
    }


    /**
     * Gets the businessName value for this TaxIndFullData.
     * 
     * @return businessName
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this TaxIndFullData.
     * 
     * @param businessName
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the firstName value for this TaxIndFullData.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this TaxIndFullData.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this TaxIndFullData.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TaxIndFullData.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the middleName value for this TaxIndFullData.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this TaxIndFullData.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the docSerial value for this TaxIndFullData.
     * 
     * @return docSerial
     */
    public java.lang.String getDocSerial() {
        return docSerial;
    }


    /**
     * Sets the docSerial value for this TaxIndFullData.
     * 
     * @param docSerial
     */
    public void setDocSerial(java.lang.String docSerial) {
        this.docSerial = docSerial;
    }


    /**
     * Gets the docNumber value for this TaxIndFullData.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this TaxIndFullData.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the docAuthority value for this TaxIndFullData.
     * 
     * @return docAuthority
     */
    public java.lang.String getDocAuthority() {
        return docAuthority;
    }


    /**
     * Sets the docAuthority value for this TaxIndFullData.
     * 
     * @param docAuthority
     */
    public void setDocAuthority(java.lang.String docAuthority) {
        this.docAuthority = docAuthority;
    }


    /**
     * Gets the activityType value for this TaxIndFullData.
     * 
     * @return activityType
     */
    public java.lang.String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this TaxIndFullData.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the activityPlace value for this TaxIndFullData.
     * 
     * @return activityPlace
     */
    public java.lang.String getActivityPlace() {
        return activityPlace;
    }


    /**
     * Sets the activityPlace value for this TaxIndFullData.
     * 
     * @param activityPlace
     */
    public void setActivityPlace(java.lang.String activityPlace) {
        this.activityPlace = activityPlace;
    }


    /**
     * Gets the officerFullName value for this TaxIndFullData.
     * 
     * @return officerFullName
     */
    public java.lang.String getOfficerFullName() {
        return officerFullName;
    }


    /**
     * Sets the officerFullName value for this TaxIndFullData.
     * 
     * @param officerFullName
     */
    public void setOfficerFullName(java.lang.String officerFullName) {
        this.officerFullName = officerFullName;
    }


    /**
     * Gets the docReleaseDate value for this TaxIndFullData.
     * 
     * @return docReleaseDate
     */
    public java.util.Calendar getDocReleaseDate() {
        return docReleaseDate;
    }


    /**
     * Sets the docReleaseDate value for this TaxIndFullData.
     * 
     * @param docReleaseDate
     */
    public void setDocReleaseDate(java.util.Calendar docReleaseDate) {
        this.docReleaseDate = docReleaseDate;
    }


    /**
     * Gets the licenseStartDate value for this TaxIndFullData.
     * 
     * @return licenseStartDate
     */
    public java.util.Calendar getLicenseStartDate() {
        return licenseStartDate;
    }


    /**
     * Sets the licenseStartDate value for this TaxIndFullData.
     * 
     * @param licenseStartDate
     */
    public void setLicenseStartDate(java.util.Calendar licenseStartDate) {
        this.licenseStartDate = licenseStartDate;
    }


    /**
     * Gets the licenseEndDate value for this TaxIndFullData.
     * 
     * @return licenseEndDate
     */
    public java.util.Calendar getLicenseEndDate() {
        return licenseEndDate;
    }


    /**
     * Sets the licenseEndDate value for this TaxIndFullData.
     * 
     * @param licenseEndDate
     */
    public void setLicenseEndDate(java.util.Calendar licenseEndDate) {
        this.licenseEndDate = licenseEndDate;
    }


    /**
     * Gets the declarationSentDate value for this TaxIndFullData.
     * 
     * @return declarationSentDate
     */
    public java.util.Calendar getDeclarationSentDate() {
        return declarationSentDate;
    }


    /**
     * Sets the declarationSentDate value for this TaxIndFullData.
     * 
     * @param declarationSentDate
     */
    public void setDeclarationSentDate(java.util.Calendar declarationSentDate) {
        this.declarationSentDate = declarationSentDate;
    }


    /**
     * Gets the declarationReceivedDate value for this TaxIndFullData.
     * 
     * @return declarationReceivedDate
     */
    public java.util.Calendar getDeclarationReceivedDate() {
        return declarationReceivedDate;
    }


    /**
     * Sets the declarationReceivedDate value for this TaxIndFullData.
     * 
     * @param declarationReceivedDate
     */
    public void setDeclarationReceivedDate(java.util.Calendar declarationReceivedDate) {
        this.declarationReceivedDate = declarationReceivedDate;
    }


    /**
     * Gets the cooperativeCount value for this TaxIndFullData.
     * 
     * @return cooperativeCount
     */
    public int getCooperativeCount() {
        return cooperativeCount;
    }


    /**
     * Sets the cooperativeCount value for this TaxIndFullData.
     * 
     * @param cooperativeCount
     */
    public void setCooperativeCount(int cooperativeCount) {
        this.cooperativeCount = cooperativeCount;
    }


    /**
     * Gets the address value for this TaxIndFullData.
     * 
     * @return address
     */
    public kz.lof.webservices.store.tax.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TaxIndFullData.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.tax.Address address) {
        this.address = address;
    }


    /**
     * Gets the taxingOffice value for this TaxIndFullData.
     * 
     * @return taxingOffice
     */
    public kz.lof.webservices.store.tax.TaxOffice getTaxingOffice() {
        return taxingOffice;
    }


    /**
     * Sets the taxingOffice value for this TaxIndFullData.
     * 
     * @param taxingOffice
     */
    public void setTaxingOffice(kz.lof.webservices.store.tax.TaxOffice taxingOffice) {
        this.taxingOffice = taxingOffice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxIndFullData)) return false;
        TaxIndFullData other = (TaxIndFullData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.payerId == other.getPayerId() &&
            ((this.rnn==null && other.getRnn()==null) || 
             (this.rnn!=null &&
              this.rnn.equals(other.getRnn()))) &&
            ((this.iin==null && other.getIin()==null) || 
             (this.iin!=null &&
              this.iin.equals(other.getIin()))) &&
            this.declarationType == other.getDeclarationType() &&
            this.isFarm == other.getIsFarm() &&
            this.businessType == other.getBusinessType() &&
            this.cooperativeType == other.getCooperativeType() &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.docSerial==null && other.getDocSerial()==null) || 
             (this.docSerial!=null &&
              this.docSerial.equals(other.getDocSerial()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.docAuthority==null && other.getDocAuthority()==null) || 
             (this.docAuthority!=null &&
              this.docAuthority.equals(other.getDocAuthority()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.activityPlace==null && other.getActivityPlace()==null) || 
             (this.activityPlace!=null &&
              this.activityPlace.equals(other.getActivityPlace()))) &&
            ((this.officerFullName==null && other.getOfficerFullName()==null) || 
             (this.officerFullName!=null &&
              this.officerFullName.equals(other.getOfficerFullName()))) &&
            ((this.docReleaseDate==null && other.getDocReleaseDate()==null) || 
             (this.docReleaseDate!=null &&
              this.docReleaseDate.equals(other.getDocReleaseDate()))) &&
            ((this.licenseStartDate==null && other.getLicenseStartDate()==null) || 
             (this.licenseStartDate!=null &&
              this.licenseStartDate.equals(other.getLicenseStartDate()))) &&
            ((this.licenseEndDate==null && other.getLicenseEndDate()==null) || 
             (this.licenseEndDate!=null &&
              this.licenseEndDate.equals(other.getLicenseEndDate()))) &&
            ((this.declarationSentDate==null && other.getDeclarationSentDate()==null) || 
             (this.declarationSentDate!=null &&
              this.declarationSentDate.equals(other.getDeclarationSentDate()))) &&
            ((this.declarationReceivedDate==null && other.getDeclarationReceivedDate()==null) || 
             (this.declarationReceivedDate!=null &&
              this.declarationReceivedDate.equals(other.getDeclarationReceivedDate()))) &&
            this.cooperativeCount == other.getCooperativeCount() &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.taxingOffice==null && other.getTaxingOffice()==null) || 
             (this.taxingOffice!=null &&
              this.taxingOffice.equals(other.getTaxingOffice())));
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
        _hashCode += new Long(getId()).hashCode();
        _hashCode += new Long(getPayerId()).hashCode();
        if (getRnn() != null) {
            _hashCode += getRnn().hashCode();
        }
        if (getIin() != null) {
            _hashCode += getIin().hashCode();
        }
        _hashCode += getDeclarationType();
        _hashCode += getIsFarm();
        _hashCode += getBusinessType();
        _hashCode += getCooperativeType();
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
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
        if (getDocSerial() != null) {
            _hashCode += getDocSerial().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getDocAuthority() != null) {
            _hashCode += getDocAuthority().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getActivityPlace() != null) {
            _hashCode += getActivityPlace().hashCode();
        }
        if (getOfficerFullName() != null) {
            _hashCode += getOfficerFullName().hashCode();
        }
        if (getDocReleaseDate() != null) {
            _hashCode += getDocReleaseDate().hashCode();
        }
        if (getLicenseStartDate() != null) {
            _hashCode += getLicenseStartDate().hashCode();
        }
        if (getLicenseEndDate() != null) {
            _hashCode += getLicenseEndDate().hashCode();
        }
        if (getDeclarationSentDate() != null) {
            _hashCode += getDeclarationSentDate().hashCode();
        }
        if (getDeclarationReceivedDate() != null) {
            _hashCode += getDeclarationReceivedDate().hashCode();
        }
        _hashCode += getCooperativeCount();
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getTaxingOffice() != null) {
            _hashCode += getTaxingOffice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxIndFullData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "TaxIndFullData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "payerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("declarationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "declarationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "isFarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "businessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cooperativeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "cooperativeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "businessName"));
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
        elemField.setFieldName("docAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "docAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "activityPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officerFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "officerFullName"));
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
        elemField.setFieldName("licenseStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "licenseStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "licenseEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declarationSentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "declarationSentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declarationReceivedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "declarationReceivedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cooperativeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "cooperativeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxingOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "taxingOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.tax.webservices.lof.kz", "TaxOffice"));
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
