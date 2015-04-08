/**
 * Street.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.bti;

public class Street  implements java.io.Serializable {
    private int id;

    private int statId;

    private kz.lof.webservices.store.bti.StreetType type;

    private kz.lof.webservices.store.bti.StreetType crossType;

    private java.lang.String name;

    public Street() {
    }

    public Street(
           int id,
           int statId,
           kz.lof.webservices.store.bti.StreetType type,
           kz.lof.webservices.store.bti.StreetType crossType,
           java.lang.String name) {
           this.id = id;
           this.statId = statId;
           this.type = type;
           this.crossType = crossType;
           this.name = name;
    }


    /**
     * Gets the id value for this Street.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Street.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the statId value for this Street.
     * 
     * @return statId
     */
    public int getStatId() {
        return statId;
    }


    /**
     * Sets the statId value for this Street.
     * 
     * @param statId
     */
    public void setStatId(int statId) {
        this.statId = statId;
    }


    /**
     * Gets the type value for this Street.
     * 
     * @return type
     */
    public kz.lof.webservices.store.bti.StreetType getType() {
        return type;
    }


    /**
     * Sets the type value for this Street.
     * 
     * @param type
     */
    public void setType(kz.lof.webservices.store.bti.StreetType type) {
        this.type = type;
    }


    /**
     * Gets the crossType value for this Street.
     * 
     * @return crossType
     */
    public kz.lof.webservices.store.bti.StreetType getCrossType() {
        return crossType;
    }


    /**
     * Sets the crossType value for this Street.
     * 
     * @param crossType
     */
    public void setCrossType(kz.lof.webservices.store.bti.StreetType crossType) {
        this.crossType = crossType;
    }


    /**
     * Gets the name value for this Street.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Street.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Street)) return false;
        Street other = (Street) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.statId == other.getStatId() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.crossType==null && other.getCrossType()==null) || 
             (this.crossType!=null &&
              this.crossType.equals(other.getCrossType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        _hashCode += getStatId();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCrossType() != null) {
            _hashCode += getCrossType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Street.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "Street"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "statId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "StreetType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "crossType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "StreetType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "name"));
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
