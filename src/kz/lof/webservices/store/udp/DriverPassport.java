/**
 * DriverPassport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class DriverPassport  implements java.io.Serializable {
    private long vu_id;

    private java.lang.String vu_expires;

    private java.lang.String serial;

    private java.lang.String number;

    private boolean categoryA;

    private boolean categoryB;

    private boolean categoryC;

    private boolean categoryD;

    private boolean categoryE;

    private java.util.Calendar vu_date;

    public DriverPassport() {
    }

    public DriverPassport(
           long vu_id,
           java.lang.String vu_expires,
           java.lang.String serial,
           java.lang.String number,
           boolean categoryA,
           boolean categoryB,
           boolean categoryC,
           boolean categoryD,
           boolean categoryE,
           java.util.Calendar vu_date) {
           this.vu_id = vu_id;
           this.vu_expires = vu_expires;
           this.serial = serial;
           this.number = number;
           this.categoryA = categoryA;
           this.categoryB = categoryB;
           this.categoryC = categoryC;
           this.categoryD = categoryD;
           this.categoryE = categoryE;
           this.vu_date = vu_date;
    }


    /**
     * Gets the vu_id value for this DriverPassport.
     * 
     * @return vu_id
     */
    public long getVu_id() {
        return vu_id;
    }


    /**
     * Sets the vu_id value for this DriverPassport.
     * 
     * @param vu_id
     */
    public void setVu_id(long vu_id) {
        this.vu_id = vu_id;
    }


    /**
     * Gets the vu_expires value for this DriverPassport.
     * 
     * @return vu_expires
     */
    public java.lang.String getVu_expires() {
        return vu_expires;
    }


    /**
     * Sets the vu_expires value for this DriverPassport.
     * 
     * @param vu_expires
     */
    public void setVu_expires(java.lang.String vu_expires) {
        this.vu_expires = vu_expires;
    }


    /**
     * Gets the serial value for this DriverPassport.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this DriverPassport.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the number value for this DriverPassport.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this DriverPassport.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the categoryA value for this DriverPassport.
     * 
     * @return categoryA
     */
    public boolean isCategoryA() {
        return categoryA;
    }


    /**
     * Sets the categoryA value for this DriverPassport.
     * 
     * @param categoryA
     */
    public void setCategoryA(boolean categoryA) {
        this.categoryA = categoryA;
    }


    /**
     * Gets the categoryB value for this DriverPassport.
     * 
     * @return categoryB
     */
    public boolean isCategoryB() {
        return categoryB;
    }


    /**
     * Sets the categoryB value for this DriverPassport.
     * 
     * @param categoryB
     */
    public void setCategoryB(boolean categoryB) {
        this.categoryB = categoryB;
    }


    /**
     * Gets the categoryC value for this DriverPassport.
     * 
     * @return categoryC
     */
    public boolean isCategoryC() {
        return categoryC;
    }


    /**
     * Sets the categoryC value for this DriverPassport.
     * 
     * @param categoryC
     */
    public void setCategoryC(boolean categoryC) {
        this.categoryC = categoryC;
    }


    /**
     * Gets the categoryD value for this DriverPassport.
     * 
     * @return categoryD
     */
    public boolean isCategoryD() {
        return categoryD;
    }


    /**
     * Sets the categoryD value for this DriverPassport.
     * 
     * @param categoryD
     */
    public void setCategoryD(boolean categoryD) {
        this.categoryD = categoryD;
    }


    /**
     * Gets the categoryE value for this DriverPassport.
     * 
     * @return categoryE
     */
    public boolean isCategoryE() {
        return categoryE;
    }


    /**
     * Sets the categoryE value for this DriverPassport.
     * 
     * @param categoryE
     */
    public void setCategoryE(boolean categoryE) {
        this.categoryE = categoryE;
    }


    /**
     * Gets the vu_date value for this DriverPassport.
     * 
     * @return vu_date
     */
    public java.util.Calendar getVu_date() {
        return vu_date;
    }


    /**
     * Sets the vu_date value for this DriverPassport.
     * 
     * @param vu_date
     */
    public void setVu_date(java.util.Calendar vu_date) {
        this.vu_date = vu_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DriverPassport)) return false;
        DriverPassport other = (DriverPassport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.vu_id == other.getVu_id() &&
            ((this.vu_expires==null && other.getVu_expires()==null) || 
             (this.vu_expires!=null &&
              this.vu_expires.equals(other.getVu_expires()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            this.categoryA == other.isCategoryA() &&
            this.categoryB == other.isCategoryB() &&
            this.categoryC == other.isCategoryC() &&
            this.categoryD == other.isCategoryD() &&
            this.categoryE == other.isCategoryE() &&
            ((this.vu_date==null && other.getVu_date()==null) || 
             (this.vu_date!=null &&
              this.vu_date.equals(other.getVu_date())));
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
        _hashCode += new Long(getVu_id()).hashCode();
        if (getVu_expires() != null) {
            _hashCode += getVu_expires().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        _hashCode += (isCategoryA() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCategoryB() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCategoryC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCategoryD() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCategoryE() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVu_date() != null) {
            _hashCode += getVu_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DriverPassport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "DriverPassport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vu_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "vu_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vu_expires");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "vu_expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "categoryA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "categoryB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "categoryC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "categoryD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "categoryE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vu_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "vu_date"));
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
