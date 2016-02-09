/**
 * AuthenticateUserWithPushRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class AuthenticateUserWithPushRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String pin;

    private com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType pushAuthData;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext;

    public AuthenticateUserWithPushRequestType() {
    }

    public AuthenticateUserWithPushRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           java.lang.String pin,
           com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType pushAuthData,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.pin = pin;
        this.pushAuthData = pushAuthData;
        this.authContext = authContext;
    }


    /**
     * Gets the userId value for this AuthenticateUserWithPushRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this AuthenticateUserWithPushRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the pin value for this AuthenticateUserWithPushRequestType.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this AuthenticateUserWithPushRequestType.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the pushAuthData value for this AuthenticateUserWithPushRequestType.
     * 
     * @return pushAuthData
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType getPushAuthData() {
        return pushAuthData;
    }


    /**
     * Sets the pushAuthData value for this AuthenticateUserWithPushRequestType.
     * 
     * @param pushAuthData
     */
    public void setPushAuthData(com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType pushAuthData) {
        this.pushAuthData = pushAuthData;
    }


    /**
     * Gets the authContext value for this AuthenticateUserWithPushRequestType.
     * 
     * @return authContext
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getAuthContext() {
        return authContext;
    }


    /**
     * Sets the authContext value for this AuthenticateUserWithPushRequestType.
     * 
     * @param authContext
     */
    public void setAuthContext(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        this.authContext = authContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticateUserWithPushRequestType)) return false;
        AuthenticateUserWithPushRequestType other = (AuthenticateUserWithPushRequestType) obj;
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
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.pushAuthData==null && other.getPushAuthData()==null) || 
             (this.pushAuthData!=null &&
              this.pushAuthData.equals(other.getPushAuthData()))) &&
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getPushAuthData() != null) {
            _hashCode += getPushAuthData().hashCode();
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
        new org.apache.axis.description.TypeDesc(AuthenticateUserWithPushRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateUserWithPushRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushAuthData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pushAuthData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushAuthDataType"));
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
