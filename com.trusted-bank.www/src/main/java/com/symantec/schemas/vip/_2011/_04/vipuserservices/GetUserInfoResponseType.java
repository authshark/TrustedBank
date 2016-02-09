/**
 * GetUserInfoResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class GetUserInfoResponseType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType  implements java.io.Serializable {
    private java.lang.String userId;

    private java.util.Calendar userCreationTime;

    private com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum userStatus;

    private java.math.BigInteger numBindings;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialBindingDetailType[] credentialBindingDetail;

    private java.lang.Boolean isPinSet;

    private java.lang.Boolean isTempPasswordSet;

    private java.util.Calendar pinExpirationTime;

    public GetUserInfoResponseType() {
    }

    public GetUserInfoResponseType(
           java.lang.String requestId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           java.lang.String userId,
           java.util.Calendar userCreationTime,
           com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum userStatus,
           java.math.BigInteger numBindings,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialBindingDetailType[] credentialBindingDetail,
           java.lang.Boolean isPinSet,
           java.lang.Boolean isTempPasswordSet,
           java.util.Calendar pinExpirationTime) {
        super(
            requestId,
            status,
            statusMessage,
            detail,
            detailMessage);
        this.userId = userId;
        this.userCreationTime = userCreationTime;
        this.userStatus = userStatus;
        this.numBindings = numBindings;
        this.credentialBindingDetail = credentialBindingDetail;
        this.isPinSet = isPinSet;
        this.isTempPasswordSet = isTempPasswordSet;
        this.pinExpirationTime = pinExpirationTime;
    }


    /**
     * Gets the userId value for this GetUserInfoResponseType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this GetUserInfoResponseType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userCreationTime value for this GetUserInfoResponseType.
     * 
     * @return userCreationTime
     */
    public java.util.Calendar getUserCreationTime() {
        return userCreationTime;
    }


    /**
     * Sets the userCreationTime value for this GetUserInfoResponseType.
     * 
     * @param userCreationTime
     */
    public void setUserCreationTime(java.util.Calendar userCreationTime) {
        this.userCreationTime = userCreationTime;
    }


    /**
     * Gets the userStatus value for this GetUserInfoResponseType.
     * 
     * @return userStatus
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum getUserStatus() {
        return userStatus;
    }


    /**
     * Sets the userStatus value for this GetUserInfoResponseType.
     * 
     * @param userStatus
     */
    public void setUserStatus(com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum userStatus) {
        this.userStatus = userStatus;
    }


    /**
     * Gets the numBindings value for this GetUserInfoResponseType.
     * 
     * @return numBindings
     */
    public java.math.BigInteger getNumBindings() {
        return numBindings;
    }


    /**
     * Sets the numBindings value for this GetUserInfoResponseType.
     * 
     * @param numBindings
     */
    public void setNumBindings(java.math.BigInteger numBindings) {
        this.numBindings = numBindings;
    }


    /**
     * Gets the credentialBindingDetail value for this GetUserInfoResponseType.
     * 
     * @return credentialBindingDetail
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialBindingDetailType[] getCredentialBindingDetail() {
        return credentialBindingDetail;
    }


    /**
     * Sets the credentialBindingDetail value for this GetUserInfoResponseType.
     * 
     * @param credentialBindingDetail
     */
    public void setCredentialBindingDetail(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialBindingDetailType[] credentialBindingDetail) {
        this.credentialBindingDetail = credentialBindingDetail;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialBindingDetailType getCredentialBindingDetail(int i) {
        return this.credentialBindingDetail[i];
    }

    public void setCredentialBindingDetail(int i, com.symantec.schemas.vip._2011._04.vipuserservices.CredentialBindingDetailType _value) {
        this.credentialBindingDetail[i] = _value;
    }


    /**
     * Gets the isPinSet value for this GetUserInfoResponseType.
     * 
     * @return isPinSet
     */
    public java.lang.Boolean getIsPinSet() {
        return isPinSet;
    }


    /**
     * Sets the isPinSet value for this GetUserInfoResponseType.
     * 
     * @param isPinSet
     */
    public void setIsPinSet(java.lang.Boolean isPinSet) {
        this.isPinSet = isPinSet;
    }


    /**
     * Gets the isTempPasswordSet value for this GetUserInfoResponseType.
     * 
     * @return isTempPasswordSet
     */
    public java.lang.Boolean getIsTempPasswordSet() {
        return isTempPasswordSet;
    }


    /**
     * Sets the isTempPasswordSet value for this GetUserInfoResponseType.
     * 
     * @param isTempPasswordSet
     */
    public void setIsTempPasswordSet(java.lang.Boolean isTempPasswordSet) {
        this.isTempPasswordSet = isTempPasswordSet;
    }


    /**
     * Gets the pinExpirationTime value for this GetUserInfoResponseType.
     * 
     * @return pinExpirationTime
     */
    public java.util.Calendar getPinExpirationTime() {
        return pinExpirationTime;
    }


    /**
     * Sets the pinExpirationTime value for this GetUserInfoResponseType.
     * 
     * @param pinExpirationTime
     */
    public void setPinExpirationTime(java.util.Calendar pinExpirationTime) {
        this.pinExpirationTime = pinExpirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserInfoResponseType)) return false;
        GetUserInfoResponseType other = (GetUserInfoResponseType) obj;
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
            ((this.userCreationTime==null && other.getUserCreationTime()==null) || 
             (this.userCreationTime!=null &&
              this.userCreationTime.equals(other.getUserCreationTime()))) &&
            ((this.userStatus==null && other.getUserStatus()==null) || 
             (this.userStatus!=null &&
              this.userStatus.equals(other.getUserStatus()))) &&
            ((this.numBindings==null && other.getNumBindings()==null) || 
             (this.numBindings!=null &&
              this.numBindings.equals(other.getNumBindings()))) &&
            ((this.credentialBindingDetail==null && other.getCredentialBindingDetail()==null) || 
             (this.credentialBindingDetail!=null &&
              java.util.Arrays.equals(this.credentialBindingDetail, other.getCredentialBindingDetail()))) &&
            ((this.isPinSet==null && other.getIsPinSet()==null) || 
             (this.isPinSet!=null &&
              this.isPinSet.equals(other.getIsPinSet()))) &&
            ((this.isTempPasswordSet==null && other.getIsTempPasswordSet()==null) || 
             (this.isTempPasswordSet!=null &&
              this.isTempPasswordSet.equals(other.getIsTempPasswordSet()))) &&
            ((this.pinExpirationTime==null && other.getPinExpirationTime()==null) || 
             (this.pinExpirationTime!=null &&
              this.pinExpirationTime.equals(other.getPinExpirationTime())));
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
        if (getUserCreationTime() != null) {
            _hashCode += getUserCreationTime().hashCode();
        }
        if (getUserStatus() != null) {
            _hashCode += getUserStatus().hashCode();
        }
        if (getNumBindings() != null) {
            _hashCode += getNumBindings().hashCode();
        }
        if (getCredentialBindingDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredentialBindingDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredentialBindingDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsPinSet() != null) {
            _hashCode += getIsPinSet().hashCode();
        }
        if (getIsTempPasswordSet() != null) {
            _hashCode += getIsTempPasswordSet().hashCode();
        }
        if (getPinExpirationTime() != null) {
            _hashCode += getPinExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserInfoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCreationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userCreationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserStatusEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numBindings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "numBindings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialBindingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialBindingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialBindingDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPinSet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "isPinSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTempPasswordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "isTempPasswordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinExpirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pinExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
