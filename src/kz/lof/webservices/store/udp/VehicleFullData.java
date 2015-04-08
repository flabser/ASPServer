/**
 * VehicleFullData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kz.lof.webservices.store.udp;

public class VehicleFullData  implements java.io.Serializable {
    private kz.lof.webservices.store.udp.CheckupData[] checkups;

    private kz.lof.webservices.store.udp.TaxData[] taxes;

    private kz.lof.webservices.store.udp.TrustData[] trusts;

    private java.lang.String grnz;

    private java.lang.String srts;

    private java.lang.String model;

    private java.lang.String prevGrnz;

    private java.lang.String prevSrts;

    private java.lang.String bodyNo;

    private java.lang.String chassisNo;

    private java.lang.String engineNo;

    private java.lang.String volume;

    private java.lang.String hp;

    private java.lang.String load;

    private java.lang.String weight;

    private java.lang.String seats;

    private java.lang.String comments;

    private java.lang.String year;

    private long countTs;

    private short status;

    private java.util.Calendar regDate;

    private java.util.Calendar regEndDate;

    private kz.lof.webservices.store.udp.Color color;

    private kz.lof.webservices.store.udp.HumanShortData owner;

    public VehicleFullData() {
    }

    public VehicleFullData(
           kz.lof.webservices.store.udp.CheckupData[] checkups,
           kz.lof.webservices.store.udp.TaxData[] taxes,
           kz.lof.webservices.store.udp.TrustData[] trusts,
           java.lang.String grnz,
           java.lang.String srts,
           java.lang.String model,
           java.lang.String prevGrnz,
           java.lang.String prevSrts,
           java.lang.String bodyNo,
           java.lang.String chassisNo,
           java.lang.String engineNo,
           java.lang.String volume,
           java.lang.String hp,
           java.lang.String load,
           java.lang.String weight,
           java.lang.String seats,
           java.lang.String comments,
           java.lang.String year,
           long countTs,
           short status,
           java.util.Calendar regDate,
           java.util.Calendar regEndDate,
           kz.lof.webservices.store.udp.Color color,
           kz.lof.webservices.store.udp.HumanShortData owner) {
           this.checkups = checkups;
           this.taxes = taxes;
           this.trusts = trusts;
           this.grnz = grnz;
           this.srts = srts;
           this.model = model;
           this.prevGrnz = prevGrnz;
           this.prevSrts = prevSrts;
           this.bodyNo = bodyNo;
           this.chassisNo = chassisNo;
           this.engineNo = engineNo;
           this.volume = volume;
           this.hp = hp;
           this.load = load;
           this.weight = weight;
           this.seats = seats;
           this.comments = comments;
           this.year = year;
           this.countTs = countTs;
           this.status = status;
           this.regDate = regDate;
           this.regEndDate = regEndDate;
           this.color = color;
           this.owner = owner;
    }


    /**
     * Gets the checkups value for this VehicleFullData.
     * 
     * @return checkups
     */
    public kz.lof.webservices.store.udp.CheckupData[] getCheckups() {
        return checkups;
    }


    /**
     * Sets the checkups value for this VehicleFullData.
     * 
     * @param checkups
     */
    public void setCheckups(kz.lof.webservices.store.udp.CheckupData[] checkups) {
        this.checkups = checkups;
    }


    /**
     * Gets the taxes value for this VehicleFullData.
     * 
     * @return taxes
     */
    public kz.lof.webservices.store.udp.TaxData[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this VehicleFullData.
     * 
     * @param taxes
     */
    public void setTaxes(kz.lof.webservices.store.udp.TaxData[] taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the trusts value for this VehicleFullData.
     * 
     * @return trusts
     */
    public kz.lof.webservices.store.udp.TrustData[] getTrusts() {
        return trusts;
    }


    /**
     * Sets the trusts value for this VehicleFullData.
     * 
     * @param trusts
     */
    public void setTrusts(kz.lof.webservices.store.udp.TrustData[] trusts) {
        this.trusts = trusts;
    }


    /**
     * Gets the grnz value for this VehicleFullData.
     * 
     * @return grnz
     */
    public java.lang.String getGrnz() {
        return grnz;
    }


    /**
     * Sets the grnz value for this VehicleFullData.
     * 
     * @param grnz
     */
    public void setGrnz(java.lang.String grnz) {
        this.grnz = grnz;
    }


    /**
     * Gets the srts value for this VehicleFullData.
     * 
     * @return srts
     */
    public java.lang.String getSrts() {
        return srts;
    }


    /**
     * Sets the srts value for this VehicleFullData.
     * 
     * @param srts
     */
    public void setSrts(java.lang.String srts) {
        this.srts = srts;
    }


    /**
     * Gets the model value for this VehicleFullData.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this VehicleFullData.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the prevGrnz value for this VehicleFullData.
     * 
     * @return prevGrnz
     */
    public java.lang.String getPrevGrnz() {
        return prevGrnz;
    }


    /**
     * Sets the prevGrnz value for this VehicleFullData.
     * 
     * @param prevGrnz
     */
    public void setPrevGrnz(java.lang.String prevGrnz) {
        this.prevGrnz = prevGrnz;
    }


    /**
     * Gets the prevSrts value for this VehicleFullData.
     * 
     * @return prevSrts
     */
    public java.lang.String getPrevSrts() {
        return prevSrts;
    }


    /**
     * Sets the prevSrts value for this VehicleFullData.
     * 
     * @param prevSrts
     */
    public void setPrevSrts(java.lang.String prevSrts) {
        this.prevSrts = prevSrts;
    }


    /**
     * Gets the bodyNo value for this VehicleFullData.
     * 
     * @return bodyNo
     */
    public java.lang.String getBodyNo() {
        return bodyNo;
    }


    /**
     * Sets the bodyNo value for this VehicleFullData.
     * 
     * @param bodyNo
     */
    public void setBodyNo(java.lang.String bodyNo) {
        this.bodyNo = bodyNo;
    }


    /**
     * Gets the chassisNo value for this VehicleFullData.
     * 
     * @return chassisNo
     */
    public java.lang.String getChassisNo() {
        return chassisNo;
    }


    /**
     * Sets the chassisNo value for this VehicleFullData.
     * 
     * @param chassisNo
     */
    public void setChassisNo(java.lang.String chassisNo) {
        this.chassisNo = chassisNo;
    }


    /**
     * Gets the engineNo value for this VehicleFullData.
     * 
     * @return engineNo
     */
    public java.lang.String getEngineNo() {
        return engineNo;
    }


    /**
     * Sets the engineNo value for this VehicleFullData.
     * 
     * @param engineNo
     */
    public void setEngineNo(java.lang.String engineNo) {
        this.engineNo = engineNo;
    }


    /**
     * Gets the volume value for this VehicleFullData.
     * 
     * @return volume
     */
    public java.lang.String getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this VehicleFullData.
     * 
     * @param volume
     */
    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }


    /**
     * Gets the hp value for this VehicleFullData.
     * 
     * @return hp
     */
    public java.lang.String getHp() {
        return hp;
    }


    /**
     * Sets the hp value for this VehicleFullData.
     * 
     * @param hp
     */
    public void setHp(java.lang.String hp) {
        this.hp = hp;
    }


    /**
     * Gets the load value for this VehicleFullData.
     * 
     * @return load
     */
    public java.lang.String getLoad() {
        return load;
    }


    /**
     * Sets the load value for this VehicleFullData.
     * 
     * @param load
     */
    public void setLoad(java.lang.String load) {
        this.load = load;
    }


    /**
     * Gets the weight value for this VehicleFullData.
     * 
     * @return weight
     */
    public java.lang.String getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this VehicleFullData.
     * 
     * @param weight
     */
    public void setWeight(java.lang.String weight) {
        this.weight = weight;
    }


    /**
     * Gets the seats value for this VehicleFullData.
     * 
     * @return seats
     */
    public java.lang.String getSeats() {
        return seats;
    }


    /**
     * Sets the seats value for this VehicleFullData.
     * 
     * @param seats
     */
    public void setSeats(java.lang.String seats) {
        this.seats = seats;
    }


    /**
     * Gets the comments value for this VehicleFullData.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this VehicleFullData.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the year value for this VehicleFullData.
     * 
     * @return year
     */
    public java.lang.String getYear() {
        return year;
    }


    /**
     * Sets the year value for this VehicleFullData.
     * 
     * @param year
     */
    public void setYear(java.lang.String year) {
        this.year = year;
    }


    /**
     * Gets the countTs value for this VehicleFullData.
     * 
     * @return countTs
     */
    public long getCountTs() {
        return countTs;
    }


    /**
     * Sets the countTs value for this VehicleFullData.
     * 
     * @param countTs
     */
    public void setCountTs(long countTs) {
        this.countTs = countTs;
    }


    /**
     * Gets the status value for this VehicleFullData.
     * 
     * @return status
     */
    public short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this VehicleFullData.
     * 
     * @param status
     */
    public void setStatus(short status) {
        this.status = status;
    }


    /**
     * Gets the regDate value for this VehicleFullData.
     * 
     * @return regDate
     */
    public java.util.Calendar getRegDate() {
        return regDate;
    }


    /**
     * Sets the regDate value for this VehicleFullData.
     * 
     * @param regDate
     */
    public void setRegDate(java.util.Calendar regDate) {
        this.regDate = regDate;
    }


    /**
     * Gets the regEndDate value for this VehicleFullData.
     * 
     * @return regEndDate
     */
    public java.util.Calendar getRegEndDate() {
        return regEndDate;
    }


    /**
     * Sets the regEndDate value for this VehicleFullData.
     * 
     * @param regEndDate
     */
    public void setRegEndDate(java.util.Calendar regEndDate) {
        this.regEndDate = regEndDate;
    }


    /**
     * Gets the color value for this VehicleFullData.
     * 
     * @return color
     */
    public kz.lof.webservices.store.udp.Color getColor() {
        return color;
    }


    /**
     * Sets the color value for this VehicleFullData.
     * 
     * @param color
     */
    public void setColor(kz.lof.webservices.store.udp.Color color) {
        this.color = color;
    }


    /**
     * Gets the owner value for this VehicleFullData.
     * 
     * @return owner
     */
    public kz.lof.webservices.store.udp.HumanShortData getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this VehicleFullData.
     * 
     * @param owner
     */
    public void setOwner(kz.lof.webservices.store.udp.HumanShortData owner) {
        this.owner = owner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleFullData)) return false;
        VehicleFullData other = (VehicleFullData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkups==null && other.getCheckups()==null) || 
             (this.checkups!=null &&
              java.util.Arrays.equals(this.checkups, other.getCheckups()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.trusts==null && other.getTrusts()==null) || 
             (this.trusts!=null &&
              java.util.Arrays.equals(this.trusts, other.getTrusts()))) &&
            ((this.grnz==null && other.getGrnz()==null) || 
             (this.grnz!=null &&
              this.grnz.equals(other.getGrnz()))) &&
            ((this.srts==null && other.getSrts()==null) || 
             (this.srts!=null &&
              this.srts.equals(other.getSrts()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.prevGrnz==null && other.getPrevGrnz()==null) || 
             (this.prevGrnz!=null &&
              this.prevGrnz.equals(other.getPrevGrnz()))) &&
            ((this.prevSrts==null && other.getPrevSrts()==null) || 
             (this.prevSrts!=null &&
              this.prevSrts.equals(other.getPrevSrts()))) &&
            ((this.bodyNo==null && other.getBodyNo()==null) || 
             (this.bodyNo!=null &&
              this.bodyNo.equals(other.getBodyNo()))) &&
            ((this.chassisNo==null && other.getChassisNo()==null) || 
             (this.chassisNo!=null &&
              this.chassisNo.equals(other.getChassisNo()))) &&
            ((this.engineNo==null && other.getEngineNo()==null) || 
             (this.engineNo!=null &&
              this.engineNo.equals(other.getEngineNo()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.hp==null && other.getHp()==null) || 
             (this.hp!=null &&
              this.hp.equals(other.getHp()))) &&
            ((this.load==null && other.getLoad()==null) || 
             (this.load!=null &&
              this.load.equals(other.getLoad()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.seats==null && other.getSeats()==null) || 
             (this.seats!=null &&
              this.seats.equals(other.getSeats()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            this.countTs == other.getCountTs() &&
            this.status == other.getStatus() &&
            ((this.regDate==null && other.getRegDate()==null) || 
             (this.regDate!=null &&
              this.regDate.equals(other.getRegDate()))) &&
            ((this.regEndDate==null && other.getRegEndDate()==null) || 
             (this.regEndDate!=null &&
              this.regEndDate.equals(other.getRegEndDate()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner())));
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
        if (getCheckups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCheckups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCheckups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrusts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrusts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrusts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrnz() != null) {
            _hashCode += getGrnz().hashCode();
        }
        if (getSrts() != null) {
            _hashCode += getSrts().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getPrevGrnz() != null) {
            _hashCode += getPrevGrnz().hashCode();
        }
        if (getPrevSrts() != null) {
            _hashCode += getPrevSrts().hashCode();
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
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getHp() != null) {
            _hashCode += getHp().hashCode();
        }
        if (getLoad() != null) {
            _hashCode += getLoad().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getSeats() != null) {
            _hashCode += getSeats().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        _hashCode += new Long(getCountTs()).hashCode();
        _hashCode += getStatus();
        if (getRegDate() != null) {
            _hashCode += getRegDate().hashCode();
        }
        if (getRegEndDate() != null) {
            _hashCode += getRegEndDate().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleFullData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "VehicleFullData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "checkups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "CheckupData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TaxData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trusts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "trusts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "TrustData"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://udp.webservices.lof.kz", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grnz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "grnz"));
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
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevGrnz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "prevGrnz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevSrts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "prevSrts"));
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
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "hp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("load");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "load"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "comments"));
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
        elemField.setFieldName("countTs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "countTs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://store.udp.webservices.lof.kz", "HumanShortData"));
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
