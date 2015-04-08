/**
 * BuildingFullData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.bti;

public class BuildingFullData  implements java.io.Serializable {
    private int BId;

    private BuildingKind BKind;

    private String BYear;

    private Address address;

    private ApartmentData[] apartments;

    private String block;

    private String cadNumber;

    private DocumentData document;

    private int flats;

    private String gkzBlock;

    private String landNumber;

    private String livingSquare;

    private String overallSquare;

    private String storeys;

    private WallMaterial walls;

    public BuildingFullData() {
    }

    public BuildingFullData(
           int BId,
           BuildingKind BKind,
           String BYear,
           Address address,
           ApartmentData[] apartments,
           String block,
           String cadNumber,
           DocumentData document,
           int flats,
           String gkzBlock,
           String landNumber,
           String livingSquare,
           String overallSquare,
           String storeys,
           WallMaterial walls) {
           this.BId = BId;
           this.BKind = BKind;
           this.BYear = BYear;
           this.address = address;
           this.apartments = apartments;
           this.block = block;
           this.cadNumber = cadNumber;
           this.document = document;
           this.flats = flats;
           this.gkzBlock = gkzBlock;
           this.landNumber = landNumber;
           this.livingSquare = livingSquare;
           this.overallSquare = overallSquare;
           this.storeys = storeys;
           this.walls = walls;
    }


    /**
     * Gets the BId value for this BuildingFullData.
     * 
     * @return BId
     */
    public int getBId() {
        return BId;
    }


    /**
     * Sets the BId value for this BuildingFullData.
     * 
     * @param BId
     */
    public void setBId(int BId) {
        this.BId = BId;
    }


    /**
     * Gets the BKind value for this BuildingFullData.
     * 
     * @return BKind
     */
    public BuildingKind getBKind() {
        return BKind;
    }


    /**
     * Sets the BKind value for this BuildingFullData.
     * 
     * @param BKind
     */
    public void setBKind(BuildingKind BKind) {
        this.BKind = BKind;
    }


    /**
     * Gets the BYear value for this BuildingFullData.
     * 
     * @return BYear
     */
    public String getBYear() {
        return BYear;
    }


    /**
     * Sets the BYear value for this BuildingFullData.
     * 
     * @param BYear
     */
    public void setBYear(String BYear) {
        this.BYear = BYear;
    }


    /**
     * Gets the address value for this BuildingFullData.
     * 
     * @return address
     */
    public Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this BuildingFullData.
     * 
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * Gets the apartments value for this BuildingFullData.
     * 
     * @return apartments
     */
    public ApartmentData[] getApartments() {
        return apartments;
    }


    /**
     * Sets the apartments value for this BuildingFullData.
     * 
     * @param apartments
     */
    public void setApartments(ApartmentData[] apartments) {
        this.apartments = apartments;
    }


    /**
     * Gets the block value for this BuildingFullData.
     * 
     * @return block
     */
    public String getBlock() {
        return block;
    }


    /**
     * Sets the block value for this BuildingFullData.
     * 
     * @param block
     */
    public void setBlock(String block) {
        this.block = block;
    }


    /**
     * Gets the cadNumber value for this BuildingFullData.
     * 
     * @return cadNumber
     */
    public String getCadNumber() {
        return cadNumber;
    }


    /**
     * Sets the cadNumber value for this BuildingFullData.
     * 
     * @param cadNumber
     */
    public void setCadNumber(String cadNumber) {
        this.cadNumber = cadNumber;
    }


    /**
     * Gets the document value for this BuildingFullData.
     * 
     * @return document
     */
    public DocumentData getDocument() {
        return document;
    }


    /**
     * Sets the document value for this BuildingFullData.
     * 
     * @param document
     */
    public void setDocument(DocumentData document) {
        this.document = document;
    }


    /**
     * Gets the flats value for this BuildingFullData.
     * 
     * @return flats
     */
    public int getFlats() {
        return flats;
    }


    /**
     * Sets the flats value for this BuildingFullData.
     * 
     * @param flats
     */
    public void setFlats(int flats) {
        this.flats = flats;
    }


    /**
     * Gets the gkzBlock value for this BuildingFullData.
     * 
     * @return gkzBlock
     */
    public String getGkzBlock() {
        return gkzBlock;
    }


    /**
     * Sets the gkzBlock value for this BuildingFullData.
     * 
     * @param gkzBlock
     */
    public void setGkzBlock(String gkzBlock) {
        this.gkzBlock = gkzBlock;
    }


    /**
     * Gets the landNumber value for this BuildingFullData.
     * 
     * @return landNumber
     */
    public String getLandNumber() {
        return landNumber;
    }


    /**
     * Sets the landNumber value for this BuildingFullData.
     * 
     * @param landNumber
     */
    public void setLandNumber(String landNumber) {
        this.landNumber = landNumber;
    }


    /**
     * Gets the livingSquare value for this BuildingFullData.
     * 
     * @return livingSquare
     */
    public String getLivingSquare() {
        return livingSquare;
    }


    /**
     * Sets the livingSquare value for this BuildingFullData.
     * 
     * @param livingSquare
     */
    public void setLivingSquare(String livingSquare) {
        this.livingSquare = livingSquare;
    }


    /**
     * Gets the overallSquare value for this BuildingFullData.
     * 
     * @return overallSquare
     */
    public String getOverallSquare() {
        return overallSquare;
    }


    /**
     * Sets the overallSquare value for this BuildingFullData.
     * 
     * @param overallSquare
     */
    public void setOverallSquare(String overallSquare) {
        this.overallSquare = overallSquare;
    }


    /**
     * Gets the storeys value for this BuildingFullData.
     * 
     * @return storeys
     */
    public String getStoreys() {
        return storeys;
    }


    /**
     * Sets the storeys value for this BuildingFullData.
     * 
     * @param storeys
     */
    public void setStoreys(String storeys) {
        this.storeys = storeys;
    }


    /**
     * Gets the walls value for this BuildingFullData.
     * 
     * @return walls
     */
    public WallMaterial getWalls() {
        return walls;
    }


    /**
     * Sets the walls value for this BuildingFullData.
     * 
     * @param walls
     */
    public void setWalls(WallMaterial walls) {
        this.walls = walls;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BuildingFullData)) return false;
        BuildingFullData other = (BuildingFullData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.BId == other.getBId() &&
            ((this.BKind==null && other.getBKind()==null) || 
             (this.BKind!=null &&
              this.BKind.equals(other.getBKind()))) &&
            ((this.BYear==null && other.getBYear()==null) || 
             (this.BYear!=null &&
              this.BYear.equals(other.getBYear()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.apartments==null && other.getApartments()==null) || 
             (this.apartments!=null &&
              java.util.Arrays.equals(this.apartments, other.getApartments()))) &&
            ((this.block==null && other.getBlock()==null) || 
             (this.block!=null &&
              this.block.equals(other.getBlock()))) &&
            ((this.cadNumber==null && other.getCadNumber()==null) || 
             (this.cadNumber!=null &&
              this.cadNumber.equals(other.getCadNumber()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            this.flats == other.getFlats() &&
            ((this.gkzBlock==null && other.getGkzBlock()==null) || 
             (this.gkzBlock!=null &&
              this.gkzBlock.equals(other.getGkzBlock()))) &&
            ((this.landNumber==null && other.getLandNumber()==null) || 
             (this.landNumber!=null &&
              this.landNumber.equals(other.getLandNumber()))) &&
            ((this.livingSquare==null && other.getLivingSquare()==null) || 
             (this.livingSquare!=null &&
              this.livingSquare.equals(other.getLivingSquare()))) &&
            ((this.overallSquare==null && other.getOverallSquare()==null) || 
             (this.overallSquare!=null &&
              this.overallSquare.equals(other.getOverallSquare()))) &&
            ((this.storeys==null && other.getStoreys()==null) || 
             (this.storeys!=null &&
              this.storeys.equals(other.getStoreys()))) &&
            ((this.walls==null && other.getWalls()==null) || 
             (this.walls!=null &&
              this.walls.equals(other.getWalls())));
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
        _hashCode += getBId();
        if (getBKind() != null) {
            _hashCode += getBKind().hashCode();
        }
        if (getBYear() != null) {
            _hashCode += getBYear().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getApartments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApartments());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getApartments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBlock() != null) {
            _hashCode += getBlock().hashCode();
        }
        if (getCadNumber() != null) {
            _hashCode += getCadNumber().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        _hashCode += getFlats();
        if (getGkzBlock() != null) {
            _hashCode += getGkzBlock().hashCode();
        }
        if (getLandNumber() != null) {
            _hashCode += getLandNumber().hashCode();
        }
        if (getLivingSquare() != null) {
            _hashCode += getLivingSquare().hashCode();
        }
        if (getOverallSquare() != null) {
            _hashCode += getOverallSquare().hashCode();
        }
        if (getStoreys() != null) {
            _hashCode += getStoreys().hashCode();
        }
        if (getWalls() != null) {
            _hashCode += getWalls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuildingFullData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BuildingFullData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BuildingKind"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "BYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apartments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "apartments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "ApartmentData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://bti.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("block");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cadNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "cadNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "DocumentData"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "flats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gkzBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "gkzBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "landNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livingSquare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "livingSquare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallSquare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "overallSquare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "storeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "walls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.bti.webservices.lof.kz", "WallMaterial"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
