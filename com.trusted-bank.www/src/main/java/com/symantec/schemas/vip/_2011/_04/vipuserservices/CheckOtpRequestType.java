/**
 * CheckOtpRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class CheckOtpRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext;

    public CheckOtpRequestType() {
    }

    public CheckOtpRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.otpAuthData = otpAuthData;
        this.authContext = authContext;
    }


    /**
     * Gets the userId value for this CheckOtpRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this CheckOtpRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the otpAuthData value for this CheckOtpRequestType.
     * 
     * @return otpAuthData
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType getOtpAuthData() {
        return otpAuthData;
    }


    /**
     * Sets the otpAuthData value for this CheckOtpRequestType.
     * 
     * @param otpAuthData
     */
    public void setOtpAuthData(com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData) {
        this.otpAuthData = otpAuthData;
    }


    /**
     * Gets the authContext value for this CheckOtpRequestType.
     * 
     * @return authContext
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getAuthContext() {
        return authContext;
    }


    /**
     * Sets the authContext value for this CheckOtpRequestType.
     * 
     * @param authContext
     */
    public void setAuthContext(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        this.authContext = authContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckOtpRequestType)) return false;
        CheckOtpRequestType other = (CheckOtpRequestType) obj;
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
            ((this.otpAuthData==null && other.getOtpAuthData()==null) || 
             (this.otpAuthData!=null &&
              this.otpAuthData.equals(other.getOtpAuthData()))) &&
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
        if (getOtpAuthData() != null) {
            _hashCode += getOtpAuthData().hashCode();
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
        new org.apache.axis.description.TypeDesc(CheckOtpRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CheckOtpRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpAuthData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "otpAuthData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "OtpAuthDataType"));
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
