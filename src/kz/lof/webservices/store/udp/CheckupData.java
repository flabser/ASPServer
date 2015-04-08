/**
 * CheckupData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class CheckupData  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String place;

    private java.lang.String checker;

    private java.lang.String ticketNo;

    private java.lang.String certNo;

    private java.lang.String edkNo;

    private java.util.Calendar date;

    public CheckupData() {
    }

    public CheckupData(
           java.lang.String type,
           java.lang.String place,
           java.lang.String checker,
           java.lang.String ticketNo,
           java.lang.String certNo,
           java.lang.String edkNo,
           java.util.Calendar date) {
           this.type = type;
           this.place = place;
           this.checker = checker;
           this.ticketNo = ticketNo;
           this.certNo = certNo;
           this.edkNo = edkNo;
           this.date = date;
    }


    /**
     * Gets the type value for this CheckupData.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CheckupData.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the place value for this CheckupData.
     * 
     * @return place
     */
    public java.lang.String getPlace() {
        return place;
    }


    /**
     * Sets the place value for this CheckupData.
     * 
     * @param place
     */
    public void setPlace(java.lang.String place) {
        this.place = place;
    }


    /**
     * Gets the checker value for this CheckupData.
     * 
     * @return checker
     */
    public java.lang.String getChecker() {
        return checker;
    }


    /**
     * Sets the checker value for this CheckupData.
     * 
     * @param checker
     */
    public void setChecker(java.lang.String checker) {
        this.checker = checker;
    }


    /**
     * Gets the ticketNo value for this CheckupData.
     * 
     * @return ticketNo
     */
    public java.lang.String getTicketNo() {
        return ticketNo;
    }


    /**
     * Sets the ticketNo value for this CheckupData.
     * 
     * @param ticketNo
     */
    public void setTicketNo(java.lang.String ticketNo) {
        this.ticketNo = ticketNo;
    }


    /**
     * Gets the certNo value for this CheckupData.
     * 
     * @return certNo
     */
    public java.lang.String getCertNo() {
        return certNo;
    }


    /**
     * Sets the certNo value for this CheckupData.
     * 
     * @param certNo
     */
    public void setCertNo(java.lang.String certNo) {
        this.certNo = certNo;
    }


    /**
     * Gets the edkNo value for this CheckupData.
     * 
     * @return edkNo
     */
    public java.lang.String getEdkNo() {
        return edkNo;
    }


    /**
     * Sets the edkNo value for this CheckupData.
     * 
     * @param edkNo
     */
    public void setEdkNo(java.lang.String edkNo) {
        this.edkNo = edkNo;
    }


    /**
     * Gets the date value for this CheckupData.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this CheckupData.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckupData)) return false;
        CheckupData other = (CheckupData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.checker==null && other.getChecker()==null) || 
             (this.checker!=null &&
              this.checker.equals(other.getChecker()))) &&
            ((this.ticketNo==null && other.getTicketNo()==null) || 
             (this.ticketNo!=null &&
              this.ticketNo.equals(other.getTicketNo()))) &&
            ((this.certNo==null && other.getCertNo()==null) || 
             (this.certNo!=null &&
              this.certNo.equals(other.getCertNo()))) &&
            ((this.edkNo==null && other.getEdkNo()==null) || 
             (this.edkNo!=null &&
              this.edkNo.equals(other.getEdkNo()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        if (getChecker() != null) {
            _hashCode += getChecker().hashCode();
        }
        if (getTicketNo() != null) {
            _hashCode += getTicketNo().hashCode();
        }
        if (getCertNo() != null) {
            _hashCode += getCertNo().hashCode();
        }
        if (getEdkNo() != null) {
            _hashCode += getEdkNo().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckupData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "CheckupData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "checker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "ticketNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "certNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edkNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "edkNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
