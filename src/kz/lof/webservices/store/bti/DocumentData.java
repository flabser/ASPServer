/**
 * DocumentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.bti;

public class DocumentData  implements java.io.Serializable {
    private java.lang.String docNumber;

    private java.lang.String limitAuthority;

    private java.lang.String limitPerson;

    private java.lang.String limitCondition;

    private kz.lof.webservices.store.bti.PropertyForm propForm;

    private kz.lof.webservices.store.bti.PropertyKind propKind;

    private java.util.Calendar docDate;

    private java.util.Calendar docRegDate;

    private kz.lof.webservices.store.bti.DocKind docKind;

    private kz.lof.webservices.store.bti.DocType docType;

    private kz.lof.webservices.store.bti.BuildingPurpose purpose;

    private kz.lof.webservices.store.bti.PersonShortData owner;

    public DocumentData() {
    }

    public DocumentData(
           java.lang.String docNumber,
           java.lang.String limitAuthority,
           java.lang.String limitPerson,
           java.lang.String limitCondition,
           kz.lof.webservices.store.bti.PropertyForm propForm,
           kz.lof.webservices.store.bti.PropertyKind propKind,
           java.util.Calendar docDate,
           java.util.Calendar docRegDate,
           kz.lof.webservices.store.bti.DocKind docKind,
           kz.lof.webservices.store.bti.DocType docType,
           kz.lof.webservices.store.bti.BuildingPurpose purpose,
           kz.lof.webservices.store.bti.PersonShortData owner) {
           this.docNumber = docNumber;
           this.limitAuthority = limitAuthority;
           this.limitPerson = limitPerson;
           this.limitCondition = limitCondition;
           this.propForm = propForm;
           this.propKind = propKind;
           this.docDate = docDate;
           this.docRegDate = docRegDate;
           this.docKind = docKind;
           this.docType = docType;
           this.purpose = purpose;
           this.owner = owner;
    }


    /**
     * Gets the docNumber value for this DocumentData.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this DocumentData.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the limitAuthority value for this DocumentData.
     * 
     * @return limitAuthority
     */
    public java.lang.String getLimitAuthority() {
        return limitAuthority;
    }


    /**
     * Sets the limitAuthority value for this DocumentData.
     * 
     * @param limitAuthority
     */
    public void setLimitAuthority(java.lang.String limitAuthority) {
        this.limitAuthority = limitAuthority;
    }


    /**
     * Gets the limitPerson value for this DocumentData.
     * 
     * @return limitPerson
     */
    public java.lang.String getLimitPerson() {
        return limitPerson;
    }


    /**
     * Sets the limitPerson value for this DocumentData.
     * 
     * @param limitPerson
     */
    public void setLimitPerson(java.lang.String limitPerson) {
        this.limitPerson = limitPerson;
    }


    /**
     * Gets the limitCondition value for this DocumentData.
     * 
     * @return limitCondition
     */
    public java.lang.String getLimitCondition() {
        return limitCondition;
    }


    /**
     * Sets the limitCondition value for this DocumentData.
     * 
     * @param limitCondition
     */
    public void setLimitCondition(java.lang.String limitCondition) {
        this.limitCondition = limitCondition;
    }


    /**
     * Gets the propForm value for this DocumentData.
     * 
     * @return propForm
     */
    public kz.lof.webservices.store.bti.PropertyForm getPropForm() {
        return propForm;
    }


    /**
     * Sets the propForm value for this DocumentData.
     * 
     * @param propForm
     */
    public void setPropForm(kz.lof.webservices.store.bti.PropertyForm propForm) {
        this.propForm = propForm;
    }


    /**
     * Gets the propKind value for this DocumentData.
     * 
     * @return propKind
     */
    public kz.lof.webservices.store.bti.PropertyKind getPropKind() {
        return propKind;
    }


    /**
     * Sets the propKind value for this DocumentData.
     * 
     * @param propKind
     */
    public void setPropKind(kz.lof.webservices.store.bti.PropertyKind propKind) {
        this.propKind = propKind;
    }


    /**
     * Gets the docDate value for this DocumentData.
     * 
     * @return docDate
     */
    public java.util.Calendar getDocDate() {
        return docDate;
    }


    /**
     * Sets the docDate value for this DocumentData.
     * 
     * @param docDate
     */
    public void setDocDate(java.util.Calendar docDate) {
        this.docDate = docDate;
    }


    /**
     * Gets the docRegDate value for this DocumentData.
     * 
     * @return docRegDate
     */
    public java.util.Calendar getDocRegDate() {
        return docRegDate;
    }


    /**
     * Sets the docRegDate value for this DocumentData.
     * 
     * @param docRegDate
     */
    public void setDocRegDate(java.util.Calendar docRegDate) {
        this.docRegDate = docRegDate;
    }


    /**
     * Gets the docKind value for this DocumentData.
     * 
     * @return docKind
     */
    public kz.lof.webservices.store.bti.DocKind getDocKind() {
        return docKind;
    }


    /**
     * Sets the docKind value for this DocumentData.
     * 
     * @param docKind
     */
    public void setDocKind(kz.lof.webservices.store.bti.DocKind docKind) {
        this.docKind = docKind;
    }


    /**
     * Gets the docType value for this DocumentData.
     * 
     * @return docType
     */
    public kz.lof.webservices.store.bti.DocType getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this DocumentData.
     * 
     * @param docType
     */
    public void setDocType(kz.lof.webservices.store.bti.DocType docType) {
        this.docType = docType;
    }


    /**
     * Gets the purpose value for this DocumentData.
     * 
     * @return purpose
     */
    public kz.lof.webservices.store.bti.BuildingPurpose getPurpose() {
        return purpose;
    }


    /**
     * Sets the purpose value for this DocumentData.
     * 
     * @param purpose
     */
    public void setPurpose(kz.lof.webservices.store.bti.BuildingPurpose purpose) {
        this.purpose = purpose;
    }


    /**
     * Gets the owner value for this DocumentData.
     * 
     * @return owner
     */
    public kz.lof.webservices.store.bti.PersonShortData getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DocumentData.
     * 
     * @param owner
     */
    public void setOwner(kz.lof.webservices.store.bti.PersonShortData owner) {
        this.owner = owner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentData)) return false;
        DocumentData other = (DocumentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.limitAuthority==null && other.getLimitAuthority()==null) || 
             (this.limitAuthority!=null &&
              this.limitAuthority.equals(other.getLimitAuthority()))) &&
            ((this.limitPerson==null && other.getLimitPerson()==null) || 
             (this.limitPerson!=null &&
              this.limitPerson.equals(other.getLimitPerson()))) &&
            ((this.limitCondition==null && other.getLimitCondition()==null) || 
             (this.limitCondition!=null &&
              this.limitCondition.equals(other.getLimitCondition()))) &&
            ((this.propForm==null && other.getPropForm()==null) || 
             (this.propForm!=null &&
              this.propForm.equals(other.getPropForm()))) &&
            ((this.propKind==null && other.getPropKind()==null) || 
             (this.propKind!=null &&
              this.propKind.equals(other.getPropKind()))) &&
            ((this.docDate==null && other.getDocDate()==null) || 
             (this.docDate!=null &&
              this.docDate.equals(other.getDocDate()))) &&
            ((this.docRegDate==null && other.getDocRegDate()==null) || 
             (this.docRegDate!=null &&
              this.docRegDate.equals(other.getDocRegDate()))) &&
            ((this.docKind==null && other.getDocKind()==null) || 
             (this.docKind!=null &&
              this.docKind.equals(other.getDocKind()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.purpose==null && other.getPurpose()==null) || 
             (this.purpose!=null &&
              this.purpose.equals(other.getPurpose()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner())));
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
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getLimitAuthority() != null) {
            _hashCode += getLimitAuthority().hashCode();
        }
        if (getLimitPerson() != null) {
            _hashCode += getLimitPerson().hashCode();
        }
        if (getLimitCondition() != null) {
            _hashCode += getLimitCondition().hashCode();
        }
        if (getPropForm() != null) {
            _hashCode += getPropForm().hashCode();
        }
        if (getPropKind() != null) {
            _hashCode += getPropKind().hashCode();
        }
        if (getDocDate() != null) {
            _hashCode += getDocDate().hashCode();
        }
        if (getDocRegDate() != null) {
            _hashCode += getDocRegDate().hashCode();
        }
        if (getDocKind() != null) {
            _hashCode += getDocKind().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getPurpose() != null) {
            _hashCode += getPurpose().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DocumentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "docNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "limitAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "limitPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "limitCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "propForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "PropertyForm"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "propKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "PropertyKind"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "docDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docRegDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "docRegDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "docKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DocKind"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "docType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DocType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purpose");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "purpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BuildingPurpose"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "PersonShortData"));
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
