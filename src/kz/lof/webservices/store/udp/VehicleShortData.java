/**
 * VehicleShortData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class VehicleShortData  implements java.io.Serializable {
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private int status;
    private java.lang.String grnz;

    private java.lang.String model;

    private java.lang.String year;

    private java.lang.String srts;

    private java.lang.String bodyNo;

    private java.lang.String chassisNo;

    private java.lang.String engineNo;

    private long id;

    private java.util.Calendar regDate;

    private java.util.Calendar regEndDate;

    private kz.lof.webservices.store.udp.Color color;

    public VehicleShortData() {
    }

    public VehicleShortData(
           java.lang.String grnz,
           java.lang.String model,
           java.lang.String year,
           java.lang.String srts,
           java.lang.String bodyNo,
           java.lang.String chassisNo,
           java.lang.String engineNo,
           long id,
           java.util.Calendar regDate,
           java.util.Calendar regEndDate,
           kz.lof.webservices.store.udp.Color color) {
           this.grnz = grnz;
           this.model = model;
           this.year = year;
           this.srts = srts;
           this.bodyNo = bodyNo;
           this.chassisNo = chassisNo;
           this.engineNo = engineNo;
           this.id = id;
           this.regDate = regDate;
           this.regEndDate = regEndDate;
           this.color = color;
    }


    /**
     * Gets the grnz value for this VehicleShortData.
     * 
     * @return grnz
     */
    public java.lang.String getGrnz() {
        return grnz;
    }


    /**
     * Sets the grnz value for this VehicleShortData.
     * 
     * @param grnz
     */
    public void setGrnz(java.lang.String grnz) {
        this.grnz = grnz;
    }


    /**
     * Gets the model value for this VehicleShortData.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this VehicleShortData.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the year value for this VehicleShortData.
     * 
     * @return year
     */
    public java.lang.String getYear() {
        return year;
    }


    /**
     * Sets the year value for this VehicleShortData.
     * 
     * @param year
     */
    public void setYear(java.lang.String year) {
        this.year = year;
    }


    /**
     * Gets the srts value for this VehicleShortData.
     * 
     * @return srts
     */
    public java.lang.String getSrts() {
        return srts;
    }


    /**
     * Sets the srts value for this VehicleShortData.
     * 
     * @param srts
     */
    public void setSrts(java.lang.String srts) {
        this.srts = srts;
    }


    /**
     * Gets the bodyNo value for this VehicleShortData.
     * 
     * @return bodyNo
     */
    public java.lang.String getBodyNo() {
        return bodyNo;
    }


    /**
     * Sets the bodyNo value for this VehicleShortData.
     * 
     * @param bodyNo
     */
    public void setBodyNo(java.lang.String bodyNo) {
        this.bodyNo = bodyNo;
    }


    /**
     * Gets the chassisNo value for this VehicleShortData.
     * 
     * @return chassisNo
     */
    public java.lang.String getChassisNo() {
        return chassisNo;
    }


    /**
     * Sets the chassisNo value for this VehicleShortData.
     * 
     * @param chassisNo
     */
    public void setChassisNo(java.lang.String chassisNo) {
        this.chassisNo = chassisNo;
    }


    /**
     * Gets the engineNo value for this VehicleShortData.
     * 
     * @return engineNo
     */
    public java.lang.String getEngineNo() {
        return engineNo;
    }


    /**
     * Sets the engineNo value for this VehicleShortData.
     * 
     * @param engineNo
     */
    public void setEngineNo(java.lang.String engineNo) {
        this.engineNo = engineNo;
    }


    /**
     * Gets the id value for this VehicleShortData.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this VehicleShortData.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the regDate value for this VehicleShortData.
     * 
     * @return regDate
     */
    public java.util.Calendar getRegDate() {
        return regDate;
    }


    /**
     * Sets the regDate value for this VehicleShortData.
     * 
     * @param regDate
     */
    public void setRegDate(java.util.Calendar regDate) {
        this.regDate = regDate;
    }


    /**
     * Gets the regEndDate value for this VehicleShortData.
     * 
     * @return regEndDate
     */
    public java.util.Calendar getRegEndDate() {
        return regEndDate;
    }


    /**
     * Sets the regEndDate value for this VehicleShortData.
     * 
     * @param regEndDate
     */
    public void setRegEndDate(java.util.Calendar regEndDate) {
        this.regEndDate = regEndDate;
    }


    /**
     * Gets the color value for this VehicleShortData.
     * 
     * @return color
     */
    public kz.lof.webservices.store.udp.Color getColor() {
        return color;
    }


    /**
     * Sets the color value for this VehicleShortData.
     * 
     * @param color
     */
    public void setColor(kz.lof.webservices.store.udp.Color color) {
        this.color = color;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleShortData)) return false;
        VehicleShortData other = (VehicleShortData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grnz==null && other.getGrnz()==null) || 
             (this.grnz!=null &&
              this.grnz.equals(other.getGrnz()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.srts==null && other.getSrts()==null) || 
             (this.srts!=null &&
              this.srts.equals(other.getSrts()))) &&
            ((this.bodyNo==null && other.getBodyNo()==null) || 
             (this.bodyNo!=null &&
              this.bodyNo.equals(other.getBodyNo()))) &&
            ((this.chassisNo==null && other.getChassisNo()==null) || 
             (this.chassisNo!=null &&
              this.chassisNo.equals(other.getChassisNo()))) &&
            ((this.engineNo==null && other.getEngineNo()==null) || 
             (this.engineNo!=null &&
              this.engineNo.equals(other.getEngineNo()))) &&
            this.id == other.getId() &&
            ((this.regDate==null && other.getRegDate()==null) || 
             (this.regDate!=null &&
              this.regDate.equals(other.getRegDate()))) &&
            ((this.regEndDate==null && other.getRegEndDate()==null) || 
             (this.regEndDate!=null &&
              this.regEndDate.equals(other.getRegEndDate()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.status==other.getStatus()));
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
        if (getGrnz() != null) {
            _hashCode += getGrnz().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getSrts() != null) {
            _hashCode += getSrts().hashCode();
        }
        if (getBodyNo() != null) {
            _hashCode += getBodyNo().hashCode();
        }
        if (getChassisNo() != null) {
            _hashCode += getChassisNo().hashCode();
        }
        if (getEngineNo() != null) {
            _hashCode += getEngineNo().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getRegDate() != null) {
            _hashCode += getRegDate().hashCode();
        }
        if (getRegEndDate() != null) {
            _hashCode += getRegEndDate().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }

        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleShortData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleShortData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grnz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "grnz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "srts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "bodyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chassisNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "chassisNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "engineNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "regDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "regEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "Color"));
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
