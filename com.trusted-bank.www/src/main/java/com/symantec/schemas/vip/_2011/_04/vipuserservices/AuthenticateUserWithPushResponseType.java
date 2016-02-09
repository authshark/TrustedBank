/**
 * AuthenticateUserWithPushResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class AuthenticateUserWithPushResponseType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.Boolean isPinExpired;

    private java.util.Calendar pinExpirationTime;

    private com.symantec.schemas.vip._2011._04.vipuserservices.PushDetailType pushDetail;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext;

    public AuthenticateUserWithPushResponseType() {
    }

    public AuthenticateUserWithPushResponseType(
           java.lang.String requestId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           java.lang.String transactionId,
           java.lang.Boolean isPinExpired,
           java.util.Calendar pinExpirationTime,
           com.symantec.schemas.vip._2011._04.vipuserservices.PushDetailType pushDetail,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        super(
            requestId,
            status,
            statusMessage,
            detail,
            detailMessage);
        this.transactionId = transactionId;
        this.isPinExpired = isPinExpired;
        this.pinExpirationTime = pinExpirationTime;
        this.pushDetail = pushDetail;
        this.authContext = authContext;
    }


    /**
     * Gets the transactionId value for this AuthenticateUserWithPushResponseType.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AuthenticateUserWithPushResponseType.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the isPinExpired value for this AuthenticateUserWithPushResponseType.
     * 
     * @return isPinExpired
     */
    public java.lang.Boolean getIsPinExpired() {
        return isPinExpired;
    }


    /**
     * Sets the isPinExpired value for this AuthenticateUserWithPushResponseType.
     * 
     * @param isPinExpired
     */
    public void setIsPinExpired(java.lang.Boolean isPinExpired) {
        this.isPinExpired = isPinExpired;
    }


    /**
     * Gets the pinExpirationTime value for this AuthenticateUserWithPushResponseType.
     * 
     * @return pinExpirationTime
     */
    public java.util.Calendar getPinExpirationTime() {
        return pinExpirationTime;
    }


    /**
     * Sets the pinExpirationTime value for this AuthenticateUserWithPushResponseType.
     * 
     * @param pinExpirationTime
     */
    public void setPinExpirationTime(java.util.Calendar pinExpirationTime) {
        this.pinExpirationTime = pinExpirationTime;
    }


    /**
     * Gets the pushDetail value for this AuthenticateUserWithPushResponseType.
     * 
     * @return pushDetail
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.PushDetailType getPushDetail() {
        return pushDetail;
    }


    /**
     * Sets the pushDetail value for this AuthenticateUserWithPushResponseType.
     * 
     * @param pushDetail
     */
    public void setPushDetail(com.symantec.schemas.vip._2011._04.vipuserservices.PushDetailType pushDetail) {
        this.pushDetail = pushDetail;
    }


    /**
     * Gets the authContext value for this AuthenticateUserWithPushResponseType.
     * 
     * @return authContext
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getAuthContext() {
        return authContext;
    }


    /**
     * Sets the authContext value for this AuthenticateUserWithPushResponseType.
     * 
     * @param authContext
     */
    public void setAuthContext(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        this.authContext = authContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticateUserWithPushResponseType)) return false;
        AuthenticateUserWithPushResponseType other = (AuthenticateUserWithPushResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.isPinExpired==null && other.getIsPinExpired()==null) || 
             (this.isPinExpired!=null &&
              this.isPinExpired.equals(other.getIsPinExpired()))) &&
            ((this.pinExpirationTime==null && other.getPinExpirationTime()==null) || 
             (this.pinExpirationTime!=null &&
              this.pinExpirationTime.equals(other.getPinExpirationTime()))) &&
            ((this.pushDetail==null && other.getPushDetail()==null) || 
             (this.pushDetail!=null &&
              this.pushDetail.equals(other.getPushDetail()))) &&
            ((this.authContext==null && other.getAuthContext()==null) || 
             (this.authContext!=null &&
              java.util.Arrays.equals(this.authContext, other.getAuthContext())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getIsPinExpired() != null) {
            _hashCode += getIsPinExpired().hashCode();
        }
        if (getPinExpirationTime() != null) {
            _hashCode += getPinExpirationTime().hashCode();
        }
        if (getPushDetail() != null) {
            _hashCode += getPushDetail().hashCode();
        }
        if (getAuthContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticateUserWithPushResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateUserWithPushResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPinExpired");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "isPinExpired"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pushDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushDetailType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authContext");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "authContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "params"));
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
