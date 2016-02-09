/**
 * CheckOtpResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class CheckOtpResponseType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType  implements java.io.Serializable {
    private java.lang.String credentialId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType;

    private java.lang.String authnId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext;

    public CheckOtpResponseType() {
    }

    public CheckOtpResponseType(
           java.lang.String requestId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           java.lang.String credentialId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType,
           java.lang.String authnId,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        super(
            requestId,
            status,
            statusMessage,
            detail,
            detailMessage);
        this.credentialId = credentialId;
        this.credentialType = credentialType;
        this.authnId = authnId;
        this.authContext = authContext;
    }


    /**
     * Gets the credentialId value for this CheckOtpResponseType.
     * 
     * @return credentialId
     */
    public java.lang.String getCredentialId() {
        return credentialId;
    }


    /**
     * Sets the credentialId value for this CheckOtpResponseType.
     * 
     * @param credentialId
     */
    public void setCredentialId(java.lang.String credentialId) {
        this.credentialId = credentialId;
    }


    /**
     * Gets the credentialType value for this CheckOtpResponseType.
     * 
     * @return credentialType
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum getCredentialType() {
        return credentialType;
    }


    /**
     * Sets the credentialType value for this CheckOtpResponseType.
     * 
     * @param credentialType
     */
    public void setCredentialType(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
    }


    /**
     * Gets the authnId value for this CheckOtpResponseType.
     * 
     * @return authnId
     */
    public java.lang.String getAuthnId() {
        return authnId;
    }


    /**
     * Sets the authnId value for this CheckOtpResponseType.
     * 
     * @param authnId
     */
    public void setAuthnId(java.lang.String authnId) {
        this.authnId = authnId;
    }


    /**
     * Gets the authContext value for this CheckOtpResponseType.
     * 
     * @return authContext
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getAuthContext() {
        return authContext;
    }


    /**
     * Sets the authContext value for this CheckOtpResponseType.
     * 
     * @param authContext
     */
    public void setAuthContext(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] authContext) {
        this.authContext = authContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckOtpResponseType)) return false;
        CheckOtpResponseType other = (CheckOtpResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.credentialId==null && other.getCredentialId()==null) || 
             (this.credentialId!=null &&
              this.credentialId.equals(other.getCredentialId()))) &&
            ((this.credentialType==null && other.getCredentialType()==null) || 
             (this.credentialType!=null &&
              this.credentialType.equals(other.getCredentialType()))) &&
            ((this.authnId==null && other.getAuthnId()==null) || 
             (this.authnId!=null &&
              this.authnId.equals(other.getAuthnId()))) &&
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
        if (getCredentialId() != null) {
            _hashCode += getCredentialId().hashCode();
        }
        if (getCredentialType() != null) {
            _hashCode += getCredentialType().hashCode();
        }
        if (getAuthnId() != null) {
            _hashCode += getAuthnId().hashCode();
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
        new org.apache.axis.description.TypeDesc(CheckOtpResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CheckOtpResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "authnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
