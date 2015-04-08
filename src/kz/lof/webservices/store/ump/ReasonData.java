/**
 * ReasonData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.ump;

public class ReasonData  implements java.io.Serializable {
    private kz.lof.webservices.store.ump.Address address;

    private kz.lof.webservices.store.ump.VisitReason[] getIn;

    private kz.lof.webservices.store.ump.VisitReason[] getOut;

    private int countGetIn;

    private int countGetOut;

    public ReasonData() {
    }

    public ReasonData(
           kz.lof.webservices.store.ump.Address address,
           kz.lof.webservices.store.ump.VisitReason[] getIn,
           kz.lof.webservices.store.ump.VisitReason[] getOut,
           int countGetIn,
           int countGetOut) {
           this.address = address;
           this.getIn = getIn;
           this.getOut = getOut;
           this.countGetIn = countGetIn;
           this.countGetOut = countGetOut;
    }


    /**
     * Gets the address value for this ReasonData.
     * 
     * @return address
     */
    public kz.lof.webservices.store.ump.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ReasonData.
     * 
     * @param address
     */
    public void setAddress(kz.lof.webservices.store.ump.Address address) {
        this.address = address;
    }


    /**
     * Gets the getIn value for this ReasonData.
     * 
     * @return getIn
     */
    public kz.lof.webservices.store.ump.VisitReason[] getGetIn() {
        return getIn;
    }


    /**
     * Sets the getIn value for this ReasonData.
     * 
     * @param getIn
     */
    public void setGetIn(kz.lof.webservices.store.ump.VisitReason[] getIn) {
        this.getIn = getIn;
    }


    /**
     * Gets the getOut value for this ReasonData.
     * 
     * @return getOut
     */
    public kz.lof.webservices.store.ump.VisitReason[] getGetOut() {
        return getOut;
    }


    /**
     * Sets the getOut value for this ReasonData.
     * 
     * @param getOut
     */
    public void setGetOut(kz.lof.webservices.store.ump.VisitReason[] getOut) {
        this.getOut = getOut;
    }


    /**
     * Gets the countGetIn value for this ReasonData.
     * 
     * @return countGetIn
     */
    public int getCountGetIn() {
        return countGetIn;
    }


    /**
     * Sets the countGetIn value for this ReasonData.
     * 
     * @param countGetIn
     */
    public void setCountGetIn(int countGetIn) {
        this.countGetIn = countGetIn;
    }


    /**
     * Gets the countGetOut value for this ReasonData.
     * 
     * @return countGetOut
     */
    public int getCountGetOut() {
        return countGetOut;
    }


    /**
     * Sets the countGetOut value for this ReasonData.
     * 
     * @param countGetOut
     */
    public void setCountGetOut(int countGetOut) {
        this.countGetOut = countGetOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReasonData)) return false;
        ReasonData other = (ReasonData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.getIn==null && other.getGetIn()==null) || 
             (this.getIn!=null &&
              java.util.Arrays.equals(this.getIn, other.getGetIn()))) &&
            ((this.getOut==null && other.getGetOut()==null) || 
             (this.getOut!=null &&
              java.util.Arrays.equals(this.getOut, other.getGetOut()))) &&
            this.countGetIn == other.getCountGetIn() &&
            this.countGetOut == other.getCountGetOut();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getGetIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGetOut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetOut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetOut(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCountGetIn();
        _hashCode += getCountGetOut();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReasonData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "ReasonData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "getIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "VisitReason"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "getOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "VisitReason"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ump.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countGetIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "countGetIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countGetOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.ump.webservices.lof.kz", "countGetOut"));
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
