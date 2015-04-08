/**
 * VisitData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.ump;

public class VisitData  implements java.io.Serializable {
    private java.lang.String regLicenseNumber;

    private java.util.Calendar regStartDate;

    private java.util.Calendar regEndDate;

    private java.lang.String visaSerial;

    private java.lang.String visaNumber;

    private java.lang.String visaRatio;

    private java.util.Calendar visaGetDate;

    private java.util.Calendar visaStartDate;

    private java.util.Calendar visaEndDate;

    private java.lang.String visaAuthority;

    private kz.lof.webservices.store.ump.VisitPurpose purpose;

    private kz.lof.webservices.store.ump.Address address;

    private java.lang.String livingPlace;

    private int childCount;

    public VisitData() {
    }

    public VisitData(
           java.lang.String regLicenseNumber,
           java.util.Calendar regStartDate,
           java.util.Calendar regEndDate,
           java.lang.String visaSerial,
           java.lang.String visaNumber,
           java.lang.String visaRatio,
           java.util.Calendar visaGetDate,
           java.util.Calendar visaStartDate,
           java.util.Calendar visaEndDate,
           java.lang.String visaAuthority,
           kz.lof.webservices.store.ump.VisitPurpose purpose,
           kz.lof.webservices.store.ump.Address address,
           java.lang.String livingPlace,
           int childCount) {
           this.regLicenseNumber = regLicenseNumber;
           this.regStartDate = regStartDate;
           this.regEndDate = regEndDate;
           this.visaSerial = visaSerial;
           this.visaNumber = visaNumber;
           this.visaRatio = visaRatio;
           this.visaGetDate = visaGetDate;
           this.visaStartDate = visaStartDate;
           this.visaEndDate = visaEndDate;
           this.visaAuthority = visaAuthority;
           this.purpose = purpose;
           this.address = address;
           this.livingPlace = livingPlace;
           this.childCount = childCount;
    }


    /**
     * Gets the regLicenseNumber value for this VisitData.
     * 
     * @return regLicenseNumber
     */
    public java.lang.String getRegLicenseNumber() {
        return regLicenseNumber;
    }


    /**
     * Sets the regLicenseNumber value for this VisitData.
     * 
     * @param regLicenseNumber
     */
    public void setRegLicenseNumber(java.lang.String regLicenseNumber) {
        this.regLicenseNumber = regLicenseNumber;
    }


    /**
     * Gets the regStartDate value for this VisitData.
     * 
     * @return regStartDate
     */
    public java.util.Calendar getRegStartDate() {
        return regStartDate;
    }


    /**
     * Sets the regStartDate value for this VisitData.
     * 
     * @param regStartDate
     */
    public void setRegStartDate(java.util.Calendar regStartDate) {
        this.regStartDate = regStartDate;
    }


    /**
     * Gets the regEndDate value for this VisitData.
     * 
     * @return regEndDate
     */
    public java.util.Calendar getRegEndDate() {
        return regEndDate;
    }


    /**
     * Sets the regEndDate value for this VisitData.
     * 
     * @param regEndDate
     */
    public void setRegEndDate(java.util.Calendar regEndDate) {
        this.regEndDate = regEndDate;
    }


    /**
     * Gets the visaSerial value for this VisitData.
     * 
     * @return visaSerial
     */
    public java.lang.String getVisaSerial() {
        return visaSerial;
    }


    /**
     * Sets the visaSerial value for this VisitData.
     * 
     * @param visaSerial
     */
    public void setVisaSerial(java.lang.String visaSerial) {
        this.visaSerial = visaSerial;
    }


    /**
     * Gets the visaNumber value for this VisitData.
     * 
     * @return visaNumber
     */
    public java.lang.String getVisaNumber() {
        return visaNumber;
    }


    /**
     * Sets the visaNumber value for this VisitData.
     * 
     * @param visaNumber
     */
    public void setVisaNumber(java.lang.String visaNumber) {
        this.visaNumber = visaNumber;
    }


    /**
     * Gets the visaRatio value for this VisitData.
     * 
     * @return visaRatio
     */
    public java.lang.String getVisaRatio() {
        return visaRatio;
    }


    /**
     * Sets the visaRatio value for this VisitData.
     * 
     * @param visaRatio
     */
    public void setVisaRatio(java.lang.String visaRatio) {
        this.visaRatio = visaRatio;
    }


    /**
     * Gets the visaGetDate value for this VisitData.
     * 
     * @return visaGetDate
     */
    public java.util.Calendar getVisaGetDate() {
        return visaGetDate;
    }


    /**
     * Sets the visaGetDate value for this VisitData.
     * 
     * @param visaGetDate
     */
    public void setVisaGetDate(java.util.Calendar visaGetDate) {
        this.visaGetDate = visaGetDate;
    }


    /**
     * Gets the visaStartDate value for this VisitData.
     * 
     * @return visaStartDate
     */
    public java.util.Calendar getVisaStartDate() {
        return visaStartDate;
    }


    /**
     * Sets the visaStartDate value for this VisitData.
     * 
     * @param visaStartDate
     */
    public void setVisaStartDate(java.util.Calendar visaStartDate) {
        this.visaStartDate = visaStartDate;
    }


    /**
     * Gets the visaEndDate value for this VisitData.
     * 
     * @return visaEndDate
     */
    public java.util.Calendar getVisaEndDate() {
        return visaEndDate;
    }


    /**
     * Sets the visaEndDate value for this VisitData.
     * 
     * @param visaEndDate
     */
    public void setVisaEndDate(java.util.Calendar visaEndDate) {
        this.visaEndDate = visaEndDate;
    }


    /**
     * Gets the visaAuthority value for this VisitData.
     * 
     * @return visaAuthority
     */
    public java.lang.String getVisaAuthority() {
        return visaAuthority;
    }


    /**
     * Sets the visaAuthority value for this VisitData.
     * 
     * @param visaAuthority
     */
    public void setVisaAuthority(java.lang.String visaAuthority) {
        this.visaAuthority = visaAuthority;
    }


    /**
     * Gets the purpose value for this VisitData.
     * 
     * @return purpose
     */
    public kz.lof.webservices.store.ump.VisitPurpose getPurpose() {
        return purpose;
    }


    /**
     * Sets the purpose value for this VisitData.
     * 
     * @param purpose
     */
    public void setPurpose(kz.lof.webservices.store.ump.VisitPurpose purpose) {
        this.purpose = purpose;
    }


    /**
     * Gets the address value for this VisitData.
     * 
     * @return address
     */
    public kz.lof.webservices.store.ump.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this VisitData.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.ump.Address address) {
        this.address = address;
    }


    /**
     * Gets the livingPlace value for this VisitData.
     * 
     * @return livingPlace
     */
    public java.lang.String getLivingPlace() {
        return livingPlace;
    }


    /**
     * Sets the livingPlace value for this VisitData.
     * 
     * @param livingPlace
     */
    public void setLivingPlace(java.lang.String livingPlace) {
        this.livingPlace = livingPlace;
    }


    /**
     * Gets the childCount value for this VisitData.
     * 
     * @return childCount
     */
    public int getChildCount() {
        return childCount;
    }


    /**
     * Sets the childCount value for this VisitData.
     * 
     * @param childCount
     */
    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VisitData)) return false;
        VisitData other = (VisitData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regLicenseNumber==null && other.getRegLicenseNumber()==null) || 
             (this.regLicenseNumber!=null &&
              this.regLicenseNumber.equals(other.getRegLicenseNumber()))) &&
            ((this.regStartDate==null && other.getRegStartDate()==null) || 
             (this.regStartDate!=null &&
              this.regStartDate.equals(other.getRegStartDate()))) &&
            ((this.regEndDate==null && other.getRegEndDate()==null) || 
             (this.regEndDate!=null &&
              this.regEndDate.equals(other.getRegEndDate()))) &&
            ((this.visaSerial==null && other.getVisaSerial()==null) || 
             (this.visaSerial!=null &&
              this.visaSerial.equals(other.getVisaSerial()))) &&
            ((this.visaNumber==null && other.getVisaNumber()==null) || 
             (this.visaNumber!=null &&
              this.visaNumber.equals(other.getVisaNumber()))) &&
            ((this.visaRatio==null && other.getVisaRatio()==null) || 
             (this.visaRatio!=null &&
              this.visaRatio.equals(other.getVisaRatio()))) &&
            ((this.visaGetDate==null && other.getVisaGetDate()==null) || 
             (this.visaGetDate!=null &&
              this.visaGetDate.equals(other.getVisaGetDate()))) &&
            ((this.visaStartDate==null && other.getVisaStartDate()==null) || 
             (this.visaStartDate!=null &&
              this.visaStartDate.equals(other.getVisaStartDate()))) &&
            ((this.visaEndDate==null && other.getVisaEndDate()==null) || 
             (this.visaEndDate!=null &&
              this.visaEndDate.equals(other.getVisaEndDate()))) &&
            ((this.visaAuthority==null && other.getVisaAuthority()==null) || 
             (this.visaAuthority!=null &&
              this.visaAuthority.equals(other.getVisaAuthority()))) &&
            ((this.purpose==null && other.getPurpose()==null) || 
             (this.purpose!=null &&
              this.purpose.equals(other.getPurpose()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.livingPlace==null && other.getLivingPlace()==null) || 
             (this.livingPlace!=null &&
              this.livingPlace.equals(other.getLivingPlace()))) &&
            this.childCount == other.getChildCount();
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
        if (getRegLicenseNumber() != null) {
            _hashCode += getRegLicenseNumber().hashCode();
        }
        if (getRegStartDate() != null) {
            _hashCode += getRegStartDate().hashCode();
        }
        if (getRegEndDate() != null) {
            _hashCode += getRegEndDate().hashCode();
        }
        if (getVisaSerial() != null) {
            _hashCode += getVisaSerial().hashCode();
        }
        if (getVisaNumber() != null) {
            _hashCode += getVisaNumber().hashCode();
        }
        if (getVisaRatio() != null) {
            _hashCode += getVisaRatio().hashCode();
        }
        if (getVisaGetDate() != null) {
            _hashCode += getVisaGetDate().hashCode();
        }
        if (getVisaStartDate() != null) {
            _hashCode += getVisaStartDate().hashCode();
        }
        if (getVisaEndDate() != null) {
            _hashCode += getVisaEndDate().hashCode();
        }
        if (getVisaAuthority() != null) {
            _hashCode += getVisaAuthority().hashCode();
        }
        if (getPurpose() != null) {
            _hashCode += getPurpose().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getLivingPlace() != null) {
            _hashCode += getLivingPlace().hashCode();
        }
        _hashCode += getChildCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VisitData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "VisitData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regLicenseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "regLicenseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "regStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "regEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visaSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visaNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visaRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaGetDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visaGetDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visaStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visaEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "visaAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purpose");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "purpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "VisitPurpose"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livingPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "livingPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "childCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
