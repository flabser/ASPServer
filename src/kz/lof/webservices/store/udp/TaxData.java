/**
 * TaxData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class TaxData  implements java.io.Serializable {
    private java.lang.String privType;

    private java.lang.String docSerial;

    private java.lang.String docNumber;

    private java.lang.String payType;

    private java.lang.String payerRnn;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.util.Calendar payDate;

    private float sum;

    public TaxData() {
    }

    public TaxData(
           java.lang.String privType,
           java.lang.String docSerial,
           java.lang.String docNumber,
           java.lang.String payType,
           java.lang.String payerRnn,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.util.Calendar payDate,
           float sum) {
           this.privType = privType;
           this.docSerial = docSerial;
           this.docNumber = docNumber;
           this.payType = payType;
           this.payerRnn = payerRnn;
           this.startDate = startDate;
           this.endDate = endDate;
           this.payDate = payDate;
           this.sum = sum;
    }


    /**
     * Gets the privType value for this TaxData.
     * 
     * @return privType
     */
    public java.lang.String getPrivType() {
        return privType;
    }


    /**
     * Sets the privType value for this TaxData.
     * 
     * @param privType
     */
    public void setPrivType(java.lang.String privType) {
        this.privType = privType;
    }


    /**
     * Gets the docSerial value for this TaxData.
     * 
     * @return docSerial
     */
    public java.lang.String getDocSerial() {
        return docSerial;
    }


    /**
     * Sets the docSerial value for this TaxData.
     * 
     * @param docSerial
     */
    public void setDocSerial(java.lang.String docSerial) {
        this.docSerial = docSerial;
    }


    /**
     * Gets the docNumber value for this TaxData.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this TaxData.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the payType value for this TaxData.
     * 
     * @return payType
     */
    public java.lang.String getPayType() {
        return payType;
    }


    /**
     * Sets the payType value for this TaxData.
     * 
     * @param payType
     */
    public void setPayType(java.lang.String payType) {
        this.payType = payType;
    }


    /**
     * Gets the payerRnn value for this TaxData.
     * 
     * @return payerRnn
     */
    public java.lang.String getPayerRnn() {
        return payerRnn;
    }


    /**
     * Sets the payerRnn value for this TaxData.
     * 
     * @param payerRnn
     */
    public void setPayerRnn(java.lang.String payerRnn) {
        this.payerRnn = payerRnn;
    }


    /**
     * Gets the startDate value for this TaxData.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TaxData.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TaxData.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TaxData.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the payDate value for this TaxData.
     * 
     * @return payDate
     */
    public java.util.Calendar getPayDate() {
        return payDate;
    }


    /**
     * Sets the payDate value for this TaxData.
     * 
     * @param payDate
     */
    public void setPayDate(java.util.Calendar payDate) {
        this.payDate = payDate;
    }


    /**
     * Gets the sum value for this TaxData.
     * 
     * @return sum
     */
    public float getSum() {
        return sum;
    }


    /**
     * Sets the sum value for this TaxData.
     * 
     * @param sum
     */
    public void setSum(float sum) {
        this.sum = sum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxData)) return false;
        TaxData other = (TaxData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.privType==null && other.getPrivType()==null) || 
             (this.privType!=null &&
              this.privType.equals(other.getPrivType()))) &&
            ((this.docSerial==null && other.getDocSerial()==null) || 
             (this.docSerial!=null &&
              this.docSerial.equals(other.getDocSerial()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.payType==null && other.getPayType()==null) || 
             (this.payType!=null &&
              this.payType.equals(other.getPayType()))) &&
            ((this.payerRnn==null && other.getPayerRnn()==null) || 
             (this.payerRnn!=null &&
              this.payerRnn.equals(other.getPayerRnn()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.payDate==null && other.getPayDate()==null) || 
             (this.payDate!=null &&
              this.payDate.equals(other.getPayDate()))) &&
            this.sum == other.getSum();
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
        if (getPrivType() != null) {
            _hashCode += getPrivType().hashCode();
        }
        if (getDocSerial() != null) {
            _hashCode += getDocSerial().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getPayType() != null) {
            _hashCode += getPayType().hashCode();
        }
        if (getPayerRnn() != null) {
            _hashCode += getPayerRnn().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPayDate() != null) {
            _hashCode += getPayDate().hashCode();
        }
        _hashCode += new Float(getSum()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TaxData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "privType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "docSerial"));
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
        elemField.setFieldName("payType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "payType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerRnn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "payerRnn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "payDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "sum"));
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
