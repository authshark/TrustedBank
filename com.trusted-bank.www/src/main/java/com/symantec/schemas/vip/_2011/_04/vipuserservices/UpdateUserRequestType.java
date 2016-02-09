/**
 * UpdateUserRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;


/**
 * This request object can be used to rename the user.
 */
public class UpdateUserRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String newUserId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum newUserStatus;

    private java.lang.String oldPin;

    private java.lang.String newPin;

    private java.lang.Boolean forcePinChange;

    public UpdateUserRequestType() {
    }

    public UpdateUserRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           java.lang.String newUserId,
           com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum newUserStatus,
           java.lang.String oldPin,
           java.lang.String newPin,
           java.lang.Boolean forcePinChange) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.newUserId = newUserId;
        this.newUserStatus = newUserStatus;
        this.oldPin = oldPin;
        this.newPin = newPin;
        this.forcePinChange = forcePinChange;
    }


    /**
     * Gets the userId value for this UpdateUserRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UpdateUserRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the newUserId value for this UpdateUserRequestType.
     * 
     * @return newUserId
     */
    public java.lang.String getNewUserId() {
        return newUserId;
    }


    /**
     * Sets the newUserId value for this UpdateUserRequestType.
     * 
     * @param newUserId
     */
    public void setNewUserId(java.lang.String newUserId) {
        this.newUserId = newUserId;
    }


    /**
     * Gets the newUserStatus value for this UpdateUserRequestType.
     * 
     * @return newUserStatus
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum getNewUserStatus() {
        return newUserStatus;
    }


    /**
     * Sets the newUserStatus value for this UpdateUserRequestType.
     * 
     * @param newUserStatus
     */
    public void setNewUserStatus(com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum newUserStatus) {
        this.newUserStatus = newUserStatus;
    }


    /**
     * Gets the oldPin value for this UpdateUserRequestType.
     * 
     * @return oldPin
     */
    public java.lang.String getOldPin() {
        return oldPin;
    }


    /**
     * Sets the oldPin value for this UpdateUserRequestType.
     * 
     * @param oldPin
     */
    public void setOldPin(java.lang.String oldPin) {
        this.oldPin = oldPin;
    }


    /**
     * Gets the newPin value for this UpdateUserRequestType.
     * 
     * @return newPin
     */
    public java.lang.String getNewPin() {
        return newPin;
    }


    /**
     * Sets the newPin value for this UpdateUserRequestType.
     * 
     * @param newPin
     */
    public void setNewPin(java.lang.String newPin) {
        this.newPin = newPin;
    }


    /**
     * Gets the forcePinChange value for this UpdateUserRequestType.
     * 
     * @return forcePinChange
     */
    public java.lang.Boolean getForcePinChange() {
        return forcePinChange;
    }


    /**
     * Sets the forcePinChange value for this UpdateUserRequestType.
     * 
     * @param forcePinChange
     */
    public void setForcePinChange(java.lang.Boolean forcePinChange) {
        this.forcePinChange = forcePinChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserRequestType)) return false;
        UpdateUserRequestType other = (UpdateUserRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.newUserId==null && other.getNewUserId()==null) || 
             (this.newUserId!=null &&
              this.newUserId.equals(other.getNewUserId()))) &&
            ((this.newUserStatus==null && other.getNewUserStatus()==null) || 
             (this.newUserStatus!=null &&
              this.newUserStatus.equals(other.getNewUserStatus()))) &&
            ((this.oldPin==null && other.getOldPin()==null) || 
             (this.oldPin!=null &&
              this.oldPin.equals(other.getOldPin()))) &&
            ((this.newPin==null && other.getNewPin()==null) || 
             (this.newPin!=null &&
              this.newPin.equals(other.getNewPin()))) &&
            ((this.forcePinChange==null && other.getForcePinChange()==null) || 
             (this.forcePinChange!=null &&
              this.forcePinChange.equals(other.getForcePinChange())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getNewUserId() != null) {
            _hashCode += getNewUserId().hashCode();
        }
        if (getNewUserStatus() != null) {
            _hashCode += getNewUserStatus().hashCode();
        }
        if (getOldPin() != null) {
            _hashCode += getOldPin().hashCode();
        }
        if (getNewPin() != null) {
            _hashCode += getNewPin().hashCode();
        }
        if (getForcePinChange() != null) {
            _hashCode += getForcePinChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateUserRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UpdateUserRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "newUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUserStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "newUserStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserStatusEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "oldPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "newPin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcePinChange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "forcePinChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
