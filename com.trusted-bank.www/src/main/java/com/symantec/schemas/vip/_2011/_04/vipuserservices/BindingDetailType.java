/**
 * BindingDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class BindingDetailType  implements java.io.Serializable {
    private com.symantec.schemas.vip._2011._04.vipuserservices.BindStatusEnum bindStatus;

    private java.lang.String friendlyName;

    private java.util.Calendar lastBindTime;

    private java.util.Calendar lastAuthnTime;

    private java.lang.String lastAuthnId;

    public BindingDetailType() {
    }

    public BindingDetailType(
           com.symantec.schemas.vip._2011._04.vipuserservices.BindStatusEnum bindStatus,
           java.lang.String friendlyName,
           java.util.Calendar lastBindTime,
           java.util.Calendar lastAuthnTime,
           java.lang.String lastAuthnId) {
           this.bindStatus = bindStatus;
           this.friendlyName = friendlyName;
           this.lastBindTime = lastBindTime;
           this.lastAuthnTime = lastAuthnTime;
           this.lastAuthnId = lastAuthnId;
    }


    /**
     * Gets the bindStatus value for this BindingDetailType.
     * 
     * @return bindStatus
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.BindStatusEnum getBindStatus() {
        return bindStatus;
    }


    /**
     * Sets the bindStatus value for this BindingDetailType.
     * 
     * @param bindStatus
     */
    public void setBindStatus(com.symantec.schemas.vip._2011._04.vipuserservices.BindStatusEnum bindStatus) {
        this.bindStatus = bindStatus;
    }


    /**
     * Gets the friendlyName value for this BindingDetailType.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this BindingDetailType.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the lastBindTime value for this BindingDetailType.
     * 
     * @return lastBindTime
     */
    public java.util.Calendar getLastBindTime() {
        return lastBindTime;
    }


    /**
     * Sets the lastBindTime value for this BindingDetailType.
     * 
     * @param lastBindTime
     */
    public void setLastBindTime(java.util.Calendar lastBindTime) {
        this.lastBindTime = lastBindTime;
    }


    /**
     * Gets the lastAuthnTime value for this BindingDetailType.
     * 
     * @return lastAuthnTime
     */
    public java.util.Calendar getLastAuthnTime() {
        return lastAuthnTime;
    }


    /**
     * Sets the lastAuthnTime value for this BindingDetailType.
     * 
     * @param lastAuthnTime
     */
    public void setLastAuthnTime(java.util.Calendar lastAuthnTime) {
        this.lastAuthnTime = lastAuthnTime;
    }


    /**
     * Gets the lastAuthnId value for this BindingDetailType.
     * 
     * @return lastAuthnId
     */
    public java.lang.String getLastAuthnId() {
        return lastAuthnId;
    }


    /**
     * Sets the lastAuthnId value for this BindingDetailType.
     * 
     * @param lastAuthnId
     */
    public void setLastAuthnId(java.lang.String lastAuthnId) {
        this.lastAuthnId = lastAuthnId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BindingDetailType)) return false;
        BindingDetailType other = (BindingDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bindStatus==null && other.getBindStatus()==null) || 
             (this.bindStatus!=null &&
              this.bindStatus.equals(other.getBindStatus()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            ((this.lastBindTime==null && other.getLastBindTime()==null) || 
             (this.lastBindTime!=null &&
              this.lastBindTime.equals(other.getLastBindTime()))) &&
            ((this.lastAuthnTime==null && other.getLastAuthnTime()==null) || 
             (this.lastAuthnTime!=null &&
              this.lastAuthnTime.equals(other.getLastAuthnTime()))) &&
            ((this.lastAuthnId==null && other.getLastAuthnId()==null) || 
             (this.lastAuthnId!=null &&
              this.lastAuthnId.equals(other.getLastAuthnId())));
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
        if (getBindStatus() != null) {
            _hashCode += getBindStatus().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        if (getLastBindTime() != null) {
            _hashCode += getLastBindTime().hashCode();
        }
        if (getLastAuthnTime() != null) {
            _hashCode += getLastAuthnTime().hashCode();
        }
        if (getLastAuthnId() != null) {
            _hashCode += getLastAuthnId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BindingDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BindingDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "bindStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BindStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "friendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBindTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "lastBindTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAuthnTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "lastAuthnTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAuthnId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "lastAuthnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
