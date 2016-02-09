/**
 * AuthenticateCredentialsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class AuthenticateCredentialsRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDefinitionType[] credentials;

    private java.lang.Boolean activate;

    private com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData;

    private com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType pushAuthData;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext;

    public AuthenticateCredentialsRequestType() {
    }

    public AuthenticateCredentialsRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDefinitionType[] credentials,
           java.lang.Boolean activate,
           com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData,
           com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType pushAuthData,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.credentials = credentials;
        this.activate = activate;
        this.otpAuthData = otpAuthData;
        this.pushAuthData = pushAuthData;
        this.authContext = authContext;
    }


    /**
     * Gets the credentials value for this AuthenticateCredentialsRequestType.
     * 
     * @return credentials
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDefinitionType[] getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this AuthenticateCredentialsRequestType.
     * 
     * @param credentials
     */
    public void setCredentials(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDefinitionType[] credentials) {
        this.credentials = credentials;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDefinitionType getCredentials(int i) {
        return this.credentials[i];
    }

    public void setCredentials(int i, com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDefinitionType _value) {
        this.credentials[i] = _value;
    }


    /**
     * Gets the activate value for this AuthenticateCredentialsRequestType.
     * 
     * @return activate
     */
    public java.lang.Boolean getActivate() {
        return activate;
    }


    /**
     * Sets the activate value for this AuthenticateCredentialsRequestType.
     * 
     * @param activate
     */
    public void setActivate(java.lang.Boolean activate) {
        this.activate = activate;
    }


    /**
     * Gets the otpAuthData value for this AuthenticateCredentialsRequestType.
     * 
     * @return otpAuthData
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType getOtpAuthData() {
        return otpAuthData;
    }


    /**
     * Sets the otpAuthData value for this AuthenticateCredentialsRequestType.
     * 
     * @param otpAuthData
     */
    public void setOtpAuthData(com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData) {
        this.otpAuthData = otpAuthData;
    }


    /**
     * Gets the pushAuthData value for this AuthenticateCredentialsRequestType.
     * 
     * @return pushAuthData
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType getPushAuthData() {
        return pushAuthData;
    }


    /**
     * Sets the pushAuthData value for this AuthenticateCredentialsRequestType.
     * 
     * @param pushAuthData
     */
    public void setPushAuthData(com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType pushAuthData) {
        this.pushAuthData = pushAuthData;
    }


    /**
     * Gets the authContext value for this AuthenticateCredentialsRequestType.
     * 
     * @return authContext
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getAuthContext() {
        return authContext;
    }


    /**
     * Sets the authContext value for this AuthenticateCredentialsRequestType.
     * 
     * @param authContext
     */
    public void setAuthContext(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        this.authContext = authContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticateCredentialsRequestType)) return false;
        AuthenticateCredentialsRequestType other = (AuthenticateCredentialsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              java.util.Arrays.equals(this.credentials, other.getCredentials()))) &&
            ((this.activate==null && other.getActivate()==null) || 
             (this.activate!=null &&
              this.activate.equals(other.getActivate()))) &&
            ((this.otpAuthData==null && other.getOtpAuthData()==null) || 
             (this.otpAuthData!=null &&
              this.otpAuthData.equals(other.getOtpAuthData()))) &&
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
        if (getCredentials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredentials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredentials(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActivate() != null) {
            _hashCode += getActivate().hashCode();
        }
        if (getOtpAuthData() != null) {
            _hashCode += getOtpAuthData().hashCode();
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
        new org.apache.axis.description.TypeDesc(AuthenticateCredentialsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateCredentialsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialDefinitionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "activate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpAuthData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "otpAuthData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "OtpAuthDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushAuthData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pushAuthData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushAuthDataType"));
        elemField.setMinOccurs(0);
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
