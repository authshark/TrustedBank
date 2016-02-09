/**
 * GetCredentialInfoResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class GetCredentialInfoResponseType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType  implements java.io.Serializable {
    private java.lang.String credentialId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType;

    private java.lang.String credentialStatus;

    private java.math.BigInteger numBindings;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] pushAttributes;

    private com.symantec.schemas.vip._2011._04.vipuserservices.UserBindingDetailType[] userBindingDetail;

    public GetCredentialInfoResponseType() {
    }

    public GetCredentialInfoResponseType(
           java.lang.String requestId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           java.lang.String credentialId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType,
           java.lang.String credentialStatus,
           java.math.BigInteger numBindings,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] pushAttributes,
           com.symantec.schemas.vip._2011._04.vipuserservices.UserBindingDetailType[] userBindingDetail) {
        super(
            requestId,
            status,
            statusMessage,
            detail,
            detailMessage);
        this.credentialId = credentialId;
        this.credentialType = credentialType;
        this.credentialStatus = credentialStatus;
        this.numBindings = numBindings;
        this.pushAttributes = pushAttributes;
        this.userBindingDetail = userBindingDetail;
    }


    /**
     * Gets the credentialId value for this GetCredentialInfoResponseType.
     * 
     * @return credentialId
     */
    public java.lang.String getCredentialId() {
        return credentialId;
    }


    /**
     * Sets the credentialId value for this GetCredentialInfoResponseType.
     * 
     * @param credentialId
     */
    public void setCredentialId(java.lang.String credentialId) {
        this.credentialId = credentialId;
    }


    /**
     * Gets the credentialType value for this GetCredentialInfoResponseType.
     * 
     * @return credentialType
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum getCredentialType() {
        return credentialType;
    }


    /**
     * Sets the credentialType value for this GetCredentialInfoResponseType.
     * 
     * @param credentialType
     */
    public void setCredentialType(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
    }


    /**
     * Gets the credentialStatus value for this GetCredentialInfoResponseType.
     * 
     * @return credentialStatus
     */
    public java.lang.String getCredentialStatus() {
        return credentialStatus;
    }


    /**
     * Sets the credentialStatus value for this GetCredentialInfoResponseType.
     * 
     * @param credentialStatus
     */
    public void setCredentialStatus(java.lang.String credentialStatus) {
        this.credentialStatus = credentialStatus;
    }


    /**
     * Gets the numBindings value for this GetCredentialInfoResponseType.
     * 
     * @return numBindings
     */
    public java.math.BigInteger getNumBindings() {
        return numBindings;
    }


    /**
     * Sets the numBindings value for this GetCredentialInfoResponseType.
     * 
     * @param numBindings
     */
    public void setNumBindings(java.math.BigInteger numBindings) {
        this.numBindings = numBindings;
    }


    /**
     * Gets the pushAttributes value for this GetCredentialInfoResponseType.
     * 
     * @return pushAttributes
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getPushAttributes() {
        return pushAttributes;
    }


    /**
     * Sets the pushAttributes value for this GetCredentialInfoResponseType.
     * 
     * @param pushAttributes
     */
    public void setPushAttributes(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] pushAttributes) {
        this.pushAttributes = pushAttributes;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType getPushAttributes(int i) {
        return this.pushAttributes[i];
    }

    public void setPushAttributes(int i, com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType _value) {
        this.pushAttributes[i] = _value;
    }


    /**
     * Gets the userBindingDetail value for this GetCredentialInfoResponseType.
     * 
     * @return userBindingDetail
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.UserBindingDetailType[] getUserBindingDetail() {
        return userBindingDetail;
    }


    /**
     * Sets the userBindingDetail value for this GetCredentialInfoResponseType.
     * 
     * @param userBindingDetail
     */
    public void setUserBindingDetail(com.symantec.schemas.vip._2011._04.vipuserservices.UserBindingDetailType[] userBindingDetail) {
        this.userBindingDetail = userBindingDetail;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.UserBindingDetailType getUserBindingDetail(int i) {
        return this.userBindingDetail[i];
    }

    public void setUserBindingDetail(int i, com.symantec.schemas.vip._2011._04.vipuserservices.UserBindingDetailType _value) {
        this.userBindingDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCredentialInfoResponseType)) return false;
        GetCredentialInfoResponseType other = (GetCredentialInfoResponseType) obj;
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
            ((this.credentialStatus==null && other.getCredentialStatus()==null) || 
             (this.credentialStatus!=null &&
              this.credentialStatus.equals(other.getCredentialStatus()))) &&
            ((this.numBindings==null && other.getNumBindings()==null) || 
             (this.numBindings!=null &&
              this.numBindings.equals(other.getNumBindings()))) &&
            ((this.pushAttributes==null && other.getPushAttributes()==null) || 
             (this.pushAttributes!=null &&
              java.util.Arrays.equals(this.pushAttributes, other.getPushAttributes()))) &&
            ((this.userBindingDetail==null && other.getUserBindingDetail()==null) || 
             (this.userBindingDetail!=null &&
              java.util.Arrays.equals(this.userBindingDetail, other.getUserBindingDetail())));
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
        if (getCredentialStatus() != null) {
            _hashCode += getCredentialStatus().hashCode();
        }
        if (getNumBindings() != null) {
            _hashCode += getNumBindings().hashCode();
        }
        if (getPushAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPushAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPushAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserBindingDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserBindingDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserBindingDetail(), i);
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
        new org.apache.axis.description.TypeDesc(GetCredentialInfoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetCredentialInfoResponseType"));
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
        elemField.setFieldName("credentialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pushAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pushAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userBindingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userBindingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserBindingDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
