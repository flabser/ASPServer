/**
 * RealtyShortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.bti;

public class RealtyShortData  implements java.io.Serializable {
    private kz.lof.webservices.store.bti.DocKind DKind;

    private java.lang.String DNumber;

    private java.util.Calendar DRegDate;

    private kz.lof.webservices.store.bti.DocType DType;

    private java.util.Calendar OBirthDate;

    private java.lang.String OFirstName;

    private java.lang.String OLastName;

    private java.lang.String OMiddleName;

    private long ownerId;

    private long docId;

    private short ownerStatus;

    private kz.lof.webservices.store.bti.BuildingKind buildingKind;

    private kz.lof.webservices.store.bti.Address address;

    public RealtyShortData() {
    }

    public RealtyShortData(
           kz.lof.webservices.store.bti.DocKind DKind,
           java.lang.String DNumber,
           java.util.Calendar DRegDate,
           kz.lof.webservices.store.bti.DocType DType,
           java.util.Calendar OBirthDate,
           java.lang.String OFirstName,
           java.lang.String OLastName,
           java.lang.String OMiddleName,
           long ownerId,
           long docId,
           short ownerStatus,
           kz.lof.webservices.store.bti.BuildingKind buildingKind,
           kz.lof.webservices.store.bti.Address address) {
           this.DKind = DKind;
           this.DNumber = DNumber;
           this.DRegDate = DRegDate;
           this.DType = DType;
           this.OBirthDate = OBirthDate;
           this.OFirstName = OFirstName;
           this.OLastName = OLastName;
           this.OMiddleName = OMiddleName;
           this.ownerId = ownerId;
           this.docId = docId;
           this.ownerStatus = ownerStatus;
           this.buildingKind = buildingKind;
           this.address = address;
    }


    /**
     * Gets the DKind value for this RealtyShortData.
     * 
     * @return DKind
     */
    public kz.lof.webservices.store.bti.DocKind getDKind() {
        return DKind;
    }


    /**
     * Sets the DKind value for this RealtyShortData.
     * 
     * @param DKind
     */
    public void setDKind(kz.lof.webservices.store.bti.DocKind DKind) {
        this.DKind = DKind;
    }


    /**
     * Gets the DNumber value for this RealtyShortData.
     * 
     * @return DNumber
     */
    public java.lang.String getDNumber() {
        return DNumber;
    }


    /**
     * Sets the DNumber value for this RealtyShortData.
     * 
     * @param DNumber
     */
    public void setDNumber(java.lang.String DNumber) {
        this.DNumber = DNumber;
    }


    /**
     * Gets the DRegDate value for this RealtyShortData.
     * 
     * @return DRegDate
     */
    public java.util.Calendar getDRegDate() {
        return DRegDate;
    }


    /**
     * Sets the DRegDate value for this RealtyShortData.
     * 
     * @param DRegDate
     */
    public void setDRegDate(java.util.Calendar DRegDate) {
        this.DRegDate = DRegDate;
    }


    /**
     * Gets the DType value for this RealtyShortData.
     * 
     * @return DType
     */
    public kz.lof.webservices.store.bti.DocType getDType() {
        return DType;
    }


    /**
     * Sets the DType value for this RealtyShortData.
     * 
     * @param DType
     */
    public void setDType(kz.lof.webservices.store.bti.DocType DType) {
        this.DType = DType;
    }


    /**
     * Gets the OBirthDate value for this RealtyShortData.
     * 
     * @return OBirthDate
     */
    public java.util.Calendar getOBirthDate() {
        return OBirthDate;
    }


    /**
     * Sets the OBirthDate value for this RealtyShortData.
     * 
     * @param OBirthDate
     */
    public void setOBirthDate(java.util.Calendar OBirthDate) {
        this.OBirthDate = OBirthDate;
    }


    /**
     * Gets the OFirstName value for this RealtyShortData.
     * 
     * @return OFirstName
     */
    public java.lang.String getOFirstName() {
        return OFirstName;
    }


    /**
     * Sets the OFirstName value for this RealtyShortData.
     * 
     * @param OFirstName
     */
    public void setOFirstName(java.lang.String OFirstName) {
        this.OFirstName = OFirstName;
    }


    /**
     * Gets the OLastName value for this RealtyShortData.
     * 
     * @return OLastName
     */
    public java.lang.String getOLastName() {
        return OLastName;
    }


    /**
     * Sets the OLastName value for this RealtyShortData.
     * 
     * @param OLastName
     */
    public void setOLastName(java.lang.String OLastName) {
        this.OLastName = OLastName;
    }


    /**
     * Gets the OMiddleName value for this RealtyShortData.
     * 
     * @return OMiddleName
     */
    public java.lang.String getOMiddleName() {
        return OMiddleName;
    }


    /**
     * Sets the OMiddleName value for this RealtyShortData.
     * 
     * @param OMiddleName
     */
    public void setOMiddleName(java.lang.String OMiddleName) {
        this.OMiddleName = OMiddleName;
    }


    /**
     * Gets the ownerId value for this RealtyShortData.
     * 
     * @return ownerId
     */
    public long getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RealtyShortData.
     * 
     * @param ownerId
     */
    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the docId value for this RealtyShortData.
     * 
     * @return docId
     */
    public long getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this RealtyShortData.
     * 
     * @param docId
     */
    public void setDocId(long docId) {
        this.docId = docId;
    }


    /**
     * Gets the ownerStatus value for this RealtyShortData.
     * 
     * @return ownerStatus
     */
    public short getOwnerStatus() {
        return ownerStatus;
    }


    /**
     * Sets the ownerStatus value for this RealtyShortData.
     * 
     * @param ownerStatus
     */
    public void setOwnerStatus(short ownerStatus) {
        this.ownerStatus = ownerStatus;
    }


    /**
     * Gets the buildingKind value for this RealtyShortData.
     * 
     * @return buildingKind
     */
    public kz.lof.webservices.store.bti.BuildingKind getBuildingKind() {
        return buildingKind;
    }


    /**
     * Sets the buildingKind value for this RealtyShortData.
     * 
     * @param buildingKind
     */
    public void setBuildingKind(kz.lof.webservices.store.bti.BuildingKind buildingKind) {
        this.buildingKind = buildingKind;
    }


    /**
     * Gets the address value for this RealtyShortData.
     * 
     * @return address
     */
    public kz.lof.webservices.store.bti.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this RealtyShortData.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.bti.Address address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RealtyShortData)) return false;
        RealtyShortData other = (RealtyShortData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DKind==null && other.getDKind()==null) || 
             (this.DKind!=null &&
              this.DKind.equals(other.getDKind()))) &&
            ((this.DNumber==null && other.getDNumber()==null) || 
             (this.DNumber!=null &&
              this.DNumber.equals(other.getDNumber()))) &&
            ((this.DRegDate==null && other.getDRegDate()==null) || 
             (this.DRegDate!=null &&
              this.DRegDate.equals(other.getDRegDate()))) &&
            ((this.DType==null && other.getDType()==null) || 
             (this.DType!=null &&
              this.DType.equals(other.getDType()))) &&
            ((this.OBirthDate==null && other.getOBirthDate()==null) || 
             (this.OBirthDate!=null &&
              this.OBirthDate.equals(other.getOBirthDate()))) &&
            ((this.OFirstName==null && other.getOFirstName()==null) || 
             (this.OFirstName!=null &&
              this.OFirstName.equals(other.getOFirstName()))) &&
            ((this.OLastName==null && other.getOLastName()==null) || 
             (this.OLastName!=null &&
              this.OLastName.equals(other.getOLastName()))) &&
            ((this.OMiddleName==null && other.getOMiddleName()==null) || 
             (this.OMiddleName!=null &&
              this.OMiddleName.equals(other.getOMiddleName()))) &&
            this.ownerId == other.getOwnerId() &&
            this.docId == other.getDocId() &&
            this.ownerStatus == other.getOwnerStatus() &&
            ((this.buildingKind==null && other.getBuildingKind()==null) || 
             (this.buildingKind!=null &&
              this.buildingKind.equals(other.getBuildingKind()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getDKind() != null) {
            _hashCode += getDKind().hashCode();
        }
        if (getDNumber() != null) {
            _hashCode += getDNumber().hashCode();
        }
        if (getDRegDate() != null) {
            _hashCode += getDRegDate().hashCode();
        }
        if (getDType() != null) {
            _hashCode += getDType().hashCode();
        }
        if (getOBirthDate() != null) {
            _hashCode += getOBirthDate().hashCode();
        }
        if (getOFirstName() != null) {
            _hashCode += getOFirstName().hashCode();
        }
        if (getOLastName() != null) {
            _hashCode += getOLastName().hashCode();
        }
        if (getOMiddleName() != null) {
            _hashCode += getOMiddleName().hashCode();
        }
        _hashCode += new Long(getOwnerId()).hashCode();
        _hashCode += new Long(getDocId()).hashCode();
        _hashCode += getOwnerStatus();
        if (getBuildingKind() != null) {
            _hashCode += getBuildingKind().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RealtyShortData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "RealtyShortData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DocKind"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRegDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DRegDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DocType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBirthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "OBirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "OFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "OLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OMiddleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "OMiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "ownerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "ownerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "buildingKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BuildingKind"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "Address"));
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
