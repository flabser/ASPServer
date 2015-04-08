/**
 * ApartmentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.bti;

public class ApartmentData  implements java.io.Serializable {
    private java.lang.String PLiveSquare;

    private java.lang.String POverallSquare;

    private java.lang.String flatNumber;

    private java.lang.String partLetter;

    private java.lang.String phone;

    private java.lang.String partYear;

    private int rooms;

    private int premises;

    private short floor;

    private kz.lof.webservices.store.bti.HousePart partName;

    private kz.lof.webservices.store.bti.WallMaterial partWalls;

    private kz.lof.webservices.store.bti.BuildingKind partKind;

    private kz.lof.webservices.store.bti.DocumentData document;

    public ApartmentData() {
    }

    public ApartmentData(
           java.lang.String PLiveSquare,
           java.lang.String POverallSquare,
           java.lang.String flatNumber,
           java.lang.String partLetter,
           java.lang.String phone,
           java.lang.String partYear,
           int rooms,
           int premises,
           short floor,
           kz.lof.webservices.store.bti.HousePart partName,
           kz.lof.webservices.store.bti.WallMaterial partWalls,
           kz.lof.webservices.store.bti.BuildingKind partKind,
           kz.lof.webservices.store.bti.DocumentData document) {
           this.PLiveSquare = PLiveSquare;
           this.POverallSquare = POverallSquare;
           this.flatNumber = flatNumber;
           this.partLetter = partLetter;
           this.phone = phone;
           this.partYear = partYear;
           this.rooms = rooms;
           this.premises = premises;
           this.floor = floor;
           this.partName = partName;
           this.partWalls = partWalls;
           this.partKind = partKind;
           this.document = document;
    }


    /**
     * Gets the PLiveSquare value for this ApartmentData.
     * 
     * @return PLiveSquare
     */
    public java.lang.String getPLiveSquare() {
        return PLiveSquare;
    }


    /**
     * Sets the PLiveSquare value for this ApartmentData.
     * 
     * @param PLiveSquare
     */
    public void setPLiveSquare(java.lang.String PLiveSquare) {
        this.PLiveSquare = PLiveSquare;
    }


    /**
     * Gets the POverallSquare value for this ApartmentData.
     * 
     * @return POverallSquare
     */
    public java.lang.String getPOverallSquare() {
        return POverallSquare;
    }


    /**
     * Sets the POverallSquare value for this ApartmentData.
     * 
     * @param POverallSquare
     */
    public void setPOverallSquare(java.lang.String POverallSquare) {
        this.POverallSquare = POverallSquare;
    }


    /**
     * Gets the flatNumber value for this ApartmentData.
     * 
     * @return flatNumber
     */
    public java.lang.String getFlatNumber() {
        return flatNumber;
    }


    /**
     * Sets the flatNumber value for this ApartmentData.
     * 
     * @param flatNumber
     */
    public void setFlatNumber(java.lang.String flatNumber) {
        this.flatNumber = flatNumber;
    }


    /**
     * Gets the partLetter value for this ApartmentData.
     * 
     * @return partLetter
     */
    public java.lang.String getPartLetter() {
        return partLetter;
    }


    /**
     * Sets the partLetter value for this ApartmentData.
     * 
     * @param partLetter
     */
    public void setPartLetter(java.lang.String partLetter) {
        this.partLetter = partLetter;
    }


    /**
     * Gets the phone value for this ApartmentData.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this ApartmentData.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the partYear value for this ApartmentData.
     * 
     * @return partYear
     */
    public java.lang.String getPartYear() {
        return partYear;
    }


    /**
     * Sets the partYear value for this ApartmentData.
     * 
     * @param partYear
     */
    public void setPartYear(java.lang.String partYear) {
        this.partYear = partYear;
    }


    /**
     * Gets the rooms value for this ApartmentData.
     * 
     * @return rooms
     */
    public int getRooms() {
        return rooms;
    }


    /**
     * Sets the rooms value for this ApartmentData.
     * 
     * @param rooms
     */
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }


    /**
     * Gets the premises value for this ApartmentData.
     * 
     * @return premises
     */
    public int getPremises() {
        return premises;
    }


    /**
     * Sets the premises value for this ApartmentData.
     * 
     * @param premises
     */
    public void setPremises(int premises) {
        this.premises = premises;
    }


    /**
     * Gets the floor value for this ApartmentData.
     * 
     * @return floor
     */
    public short getFloor() {
        return floor;
    }


    /**
     * Sets the floor value for this ApartmentData.
     * 
     * @param floor
     */
    public void setFloor(short floor) {
        this.floor = floor;
    }


    /**
     * Gets the partName value for this ApartmentData.
     * 
     * @return partName
     */
    public kz.lof.webservices.store.bti.HousePart getPartName() {
        return partName;
    }


    /**
     * Sets the partName value for this ApartmentData.
     * 
     * @param partName
     */
    public void setPartName(kz.lof.webservices.store.bti.HousePart partName) {
        this.partName = partName;
    }


    /**
     * Gets the partWalls value for this ApartmentData.
     * 
     * @return partWalls
     */
    public kz.lof.webservices.store.bti.WallMaterial getPartWalls() {
        return partWalls;
    }


    /**
     * Sets the partWalls value for this ApartmentData.
     * 
     * @param partWalls
     */
    public void setPartWalls(kz.lof.webservices.store.bti.WallMaterial partWalls) {
        this.partWalls = partWalls;
    }


    /**
     * Gets the partKind value for this ApartmentData.
     * 
     * @return partKind
     */
    public kz.lof.webservices.store.bti.BuildingKind getPartKind() {
        return partKind;
    }


    /**
     * Sets the partKind value for this ApartmentData.
     * 
     * @param partKind
     */
    public void setPartKind(kz.lof.webservices.store.bti.BuildingKind partKind) {
        this.partKind = partKind;
    }


    /**
     * Gets the document value for this ApartmentData.
     * 
     * @return document
     */
    public kz.lof.webservices.store.bti.DocumentData getDocument() {
        return document;
    }


    /**
     * Sets the document value for this ApartmentData.
     * 
     * @param document
     */
    public void setDocument(kz.lof.webservices.store.bti.DocumentData document) {
        this.document = document;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApartmentData)) return false;
        ApartmentData other = (ApartmentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PLiveSquare==null && other.getPLiveSquare()==null) || 
             (this.PLiveSquare!=null &&
              this.PLiveSquare.equals(other.getPLiveSquare()))) &&
            ((this.POverallSquare==null && other.getPOverallSquare()==null) || 
             (this.POverallSquare!=null &&
              this.POverallSquare.equals(other.getPOverallSquare()))) &&
            ((this.flatNumber==null && other.getFlatNumber()==null) || 
             (this.flatNumber!=null &&
              this.flatNumber.equals(other.getFlatNumber()))) &&
            ((this.partLetter==null && other.getPartLetter()==null) || 
             (this.partLetter!=null &&
              this.partLetter.equals(other.getPartLetter()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.partYear==null && other.getPartYear()==null) || 
             (this.partYear!=null &&
              this.partYear.equals(other.getPartYear()))) &&
            this.rooms == other.getRooms() &&
            this.premises == other.getPremises() &&
            this.floor == other.getFloor() &&
            ((this.partName==null && other.getPartName()==null) || 
             (this.partName!=null &&
              this.partName.equals(other.getPartName()))) &&
            ((this.partWalls==null && other.getPartWalls()==null) || 
             (this.partWalls!=null &&
              this.partWalls.equals(other.getPartWalls()))) &&
            ((this.partKind==null && other.getPartKind()==null) || 
             (this.partKind!=null &&
              this.partKind.equals(other.getPartKind()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument())));
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
        if (getPLiveSquare() != null) {
            _hashCode += getPLiveSquare().hashCode();
        }
        if (getPOverallSquare() != null) {
            _hashCode += getPOverallSquare().hashCode();
        }
        if (getFlatNumber() != null) {
            _hashCode += getFlatNumber().hashCode();
        }
        if (getPartLetter() != null) {
            _hashCode += getPartLetter().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPartYear() != null) {
            _hashCode += getPartYear().hashCode();
        }
        _hashCode += getRooms();
        _hashCode += getPremises();
        _hashCode += getFloor();
        if (getPartName() != null) {
            _hashCode += getPartName().hashCode();
        }
        if (getPartWalls() != null) {
            _hashCode += getPartWalls().hashCode();
        }
        if (getPartKind() != null) {
            _hashCode += getPartKind().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApartmentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "ApartmentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLiveSquare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "PLiveSquare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POverallSquare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "POverallSquare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "flatNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "partLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "partYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rooms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "rooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premises");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "premises"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "floor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "partName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "HousePart"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partWalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "partWalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "WallMaterial"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "partKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BuildingKind"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DocumentData"));
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
