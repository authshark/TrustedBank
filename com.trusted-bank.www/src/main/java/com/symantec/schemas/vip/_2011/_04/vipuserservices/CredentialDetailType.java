/**
 * CredentialDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class CredentialDetailType  implements java.io.Serializable {
    private java.lang.String credentialId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType;

    private java.lang.String friendlyName;

    public CredentialDetailType() {
    }

    public CredentialDetailType(
           java.lang.String credentialId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType,
           java.lang.String friendlyName) {
           this.credentialId = credentialId;
           this.credentialType = credentialType;
           this.friendlyName = friendlyName;
    }


    /**
     * Gets the credentialId value for this CredentialDetailType.
     * 
     * @return credentialId
     */
    public java.lang.String getCredentialId() {
        return credentialId;
    }


    /**
     * Sets the credentialId value for this CredentialDetailType.
     * 
     * @param credentialId
     */
    public void setCredentialId(java.lang.String credentialId) {
        this.credentialId = credentialId;
    }


    /**
     * Gets the credentialType value for this CredentialDetailType.
     * 
     * @return credentialType
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum getCredentialType() {
        return credentialType;
    }


    /**
     * Sets the credentialType value for this CredentialDetailType.
     * 
     * @param credentialType
     */
    public void setCredentialType(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
    }


    /**
     * Gets the friendlyName value for this CredentialDetailType.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this CredentialDetailType.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredentialDetailType)) return false;
        CredentialDetailType other = (CredentialDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        int _hashCode = 1;
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
        new org.apache.axis.description.TypeDesc(CredentialDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
