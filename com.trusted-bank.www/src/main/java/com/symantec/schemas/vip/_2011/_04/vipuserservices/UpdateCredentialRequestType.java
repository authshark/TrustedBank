/**
 * UpdateCredentialRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;


/**
 * To update credential's friendly name.
 */
public class UpdateCredentialRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String credentialId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType;

    private java.lang.String friendlyName;

    public UpdateCredentialRequestType() {
    }

    public UpdateCredentialRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           java.lang.String credentialId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType,
           java.lang.String friendlyName) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.credentialId = credentialId;
        this.credentialType = credentialType;
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the userId value for this UpdateCredentialRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UpdateCredentialRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the credentialId value for this UpdateCredentialRequestType.
     * 
     * @return credentialId
     */
    public java.lang.String getCredentialId() {
        return credentialId;
    }


    /**
     * Sets the credentialId value for this UpdateCredentialRequestType.
     * 
     * @param credentialId
     */
    public void setCredentialId(java.lang.String credentialId) {
        this.credentialId = credentialId;
    }


    /**
     * Gets the credentialType value for this UpdateCredentialRequestType.
     * 
     * @return credentialType
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum getCredentialType() {
        return credentialType;
    }


    /**
     * Sets the credentialType value for this UpdateCredentialRequestType.
     * 
     * @param credentialType
     */
    public void setCredentialType(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
    }


    /**
     * Gets the friendlyName value for this UpdateCredentialRequestType.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this UpdateCredentialRequestType.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCredentialRequestType)) return false;
        UpdateCredentialRequestType other = (UpdateCredentialRequestType) obj;
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
            ((this.credentialId==null && other.getCredentialId()==null) || 
             (this.credentialId!=null &&
              this.credentialId.equals(other.getCredentialId()))) &&
            ((this.credentialType==null && other.getCredentialType()==null) || 
             (this.credentialType!=null &&
              this.credentialType.equals(other.getCredentialType()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName())));
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
        if (getCredentialId() != null) {
            _hashCode += getCredentialId().hashCode();
        }
        if (getCredentialType() != null) {
            _hashCode += getCredentialType().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCredentialRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UpdateCredentialRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "friendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
