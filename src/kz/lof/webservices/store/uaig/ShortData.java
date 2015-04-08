/**
 * ShortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.uaig;

public class ShortData  implements java.io.Serializable {
    private java.lang.String correspondence;

    private java.util.Calendar date;

    private java.lang.String docType;

    private int idKarta;

    private java.lang.String incomingNumber;

    private java.lang.String rnn;

    public ShortData() {
    }

    public ShortData(
           java.lang.String correspondence,
           java.util.Calendar date,
           java.lang.String docType,
           int idKarta,
           java.lang.String incomingNumber,
           java.lang.String rnn) {
           this.correspondence = correspondence;
           this.date = date;
           this.docType = docType;
           this.idKarta = idKarta;
           this.incomingNumber = incomingNumber;
           this.rnn = rnn;
    }


    /**
     * Gets the correspondence value for this ShortData.
     * 
     * @return correspondence
     */
    public java.lang.String getCorrespondence() {
        return correspondence;
    }


    /**
     * Sets the correspondence value for this ShortData.
     * 
     * @param correspondence
     */
    public void setCorrespondence(java.lang.String correspondence) {
        this.correspondence = correspondence;
    }


    /**
     * Gets the date value for this ShortData.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this ShortData.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the docType value for this ShortData.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this ShortData.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the idKarta value for this ShortData.
     * 
     * @return idKarta
     */
    public int getIdKarta() {
        return idKarta;
    }


    /**
     * Sets the idKarta value for this ShortData.
     * 
     * @param idKarta
     */
    public void setIdKarta(int idKarta) {
        this.idKarta = idKarta;
    }


    /**
     * Gets the incomingNumber value for this ShortData.
     * 
     * @return incomingNumber
     */
    public java.lang.String getIncomingNumber() {
        return incomingNumber;
    }


    /**
     * Sets the incomingNumber value for this ShortData.
     * 
     * @param incomingNumber
     */
    public void setIncomingNumber(java.lang.String incomingNumber) {
        this.incomingNumber = incomingNumber;
    }


    /**
     * Gets the rnn value for this ShortData.
     * 
     * @return rnn
     */
    public java.lang.String getRnn() {
        return rnn;
    }


    /**
     * Sets the rnn value for this ShortData.
     * 
     * @param rnn
     */
    public void setRnn(java.lang.String rnn) {
        this.rnn = rnn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShortData)) return false;
        ShortData other = (ShortData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correspondence==null && other.getCorrespondence()==null) || 
             (this.correspondence!=null &&
              this.correspondence.equals(other.getCorrespondence()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            this.idKarta == other.getIdKarta() &&
            ((this.incomingNumber==null && other.getIncomingNumber()==null) || 
             (this.incomingNumber!=null &&
              this.incomingNumber.equals(other.getIncomingNumber()))) &&
            ((this.rnn==null && other.getRnn()==null) || 
             (this.rnn!=null &&
              this.rnn.equals(other.getRnn())));
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
        if (getCorrespondence() != null) {
            _hashCode += getCorrespondence().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        _hashCode += getIdKarta();
        if (getIncomingNumber() != null) {
            _hashCode += getIncomingNumber().hashCode();
        }
        if (getRnn() != null) {
            _hashCode += getRnn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShortData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.uaig.webservices.lof.kz", "ShortData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.uaig.webservices.lof.kz", "correspondence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.uaig.webservices.lof.kz", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.uaig.webservices.lof.kz", "docType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idKarta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.uaig.webservices.lof.kz", "idKarta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.uaig.webservices.lof.kz", "incomingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.uaig.webservices.lof.kz", "rnn"));
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
