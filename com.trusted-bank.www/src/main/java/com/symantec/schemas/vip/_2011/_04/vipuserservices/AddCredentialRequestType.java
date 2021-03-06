/**
 * AddCredentialRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;


/**
 * Request for adding a credential under a user.
 */
public class AddCredentialRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDetailType credentialDetail;

    private com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData;

    public AddCredentialRequestType() {
    }

    public AddCredentialRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDetailType credentialDetail,
           com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.credentialDetail = credentialDetail;
        this.otpAuthData = otpAuthData;
    }


    /**
     * Gets the userId value for this AddCredentialRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this AddCredentialRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the credentialDetail value for this AddCredentialRequestType.
     * 
     * @return credentialDetail
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDetailType getCredentialDetail() {
        return credentialDetail;
    }


    /**
     * Sets the credentialDetail value for this AddCredentialRequestType.
     * 
     * @param credentialDetail
     */
    public void setCredentialDetail(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDetailType credentialDetail) {
        this.credentialDetail = credentialDetail;
    }


    /**
     * Gets the otpAuthData value for this AddCredentialRequestType.
     * 
     * @return otpAuthData
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType getOtpAuthData() {
        return otpAuthData;
    }


    /**
     * Sets the otpAuthData value for this AddCredentialRequestType.
     * 
     * @param otpAuthData
     */
    public void setOtpAuthData(com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType otpAuthData) {
        this.otpAuthData = otpAuthData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddCredentialRequestType)) return false;
        AddCredentialRequestType other = (AddCredentialRequestType) obj;
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
            ((this.credentialDetail==null && other.getCredentialDetail()==null) || 
             (this.credentialDetail!=null &&
              this.credentialDetail.equals(other.getCredentialDetail()))) &&
            ((this.otpAuthData==null && other.getOtpAuthData()==null) || 
             (this.otpAuthData!=null &&
              this.otpAuthData.equals(other.getOtpAuthData())));
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
        if (getCredentialDetail() != null) {
            _hashCode += getCredentialDetail().hashCode();
        }
        if (getOtpAuthData() != null) {
            _hashCode += getOtpAuthData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddCredentialRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AddCredentialRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialDetailType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpAuthData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "otpAuthData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "OtpAuthDataType"));
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
