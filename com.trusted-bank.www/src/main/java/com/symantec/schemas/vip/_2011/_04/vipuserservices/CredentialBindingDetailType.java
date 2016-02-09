/**
 * CredentialBindingDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class CredentialBindingDetailType  implements java.io.Serializable {
    private java.lang.String credentialId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType;

    private java.lang.String credentialStatus;

    private com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType bindingDetail;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] pushAttributes;

    public CredentialBindingDetailType() {
    }

    public CredentialBindingDetailType(
           java.lang.String credentialId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType,
           java.lang.String credentialStatus,
           com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType bindingDetail,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] pushAttributes) {
           this.credentialId = credentialId;
           this.credentialType = credentialType;
           this.credentialStatus = credentialStatus;
           this.bindingDetail = bindingDetail;
           this.pushAttributes = pushAttributes;
    }


    /**
     * Gets the credentialId value for this CredentialBindingDetailType.
     * 
     * @return credentialId
     */
    public java.lang.String getCredentialId() {
        return credentialId;
    }


    /**
     * Sets the credentialId value for this CredentialBindingDetailType.
     * 
     * @param credentialId
     */
    public void setCredentialId(java.lang.String credentialId) {
        this.credentialId = credentialId;
    }


    /**
     * Gets the credentialType value for this CredentialBindingDetailType.
     * 
     * @return credentialType
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum getCredentialType() {
        return credentialType;
    }


    /**
     * Sets the credentialType value for this CredentialBindingDetailType.
     * 
     * @param credentialType
     */
    public void setCredentialType(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
    }


    /**
     * Gets the credentialStatus value for this CredentialBindingDetailType.
     * 
     * @return credentialStatus
     */
    public java.lang.String getCredentialStatus() {
        return credentialStatus;
    }


    /**
     * Sets the credentialStatus value for this CredentialBindingDetailType.
     * 
     * @param credentialStatus
     */
    public void setCredentialStatus(java.lang.String credentialStatus) {
        this.credentialStatus = credentialStatus;
    }


    /**
     * Gets the bindingDetail value for this CredentialBindingDetailType.
     * 
     * @return bindingDetail
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType getBindingDetail() {
        return bindingDetail;
    }


    /**
     * Sets the bindingDetail value for this CredentialBindingDetailType.
     * 
     * @param bindingDetail
     */
    public void setBindingDetail(com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType bindingDetail) {
        this.bindingDetail = bindingDetail;
    }


    /**
     * Gets the pushAttributes value for this CredentialBindingDetailType.
     * 
     * @return pushAttributes
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getPushAttributes() {
        return pushAttributes;
    }


    /**
     * Sets the pushAttributes value for this CredentialBindingDetailType.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CredentialBindingDetailType)) return false;
        CredentialBindingDetailType other = (CredentialBindingDetailType) obj;
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
            ((this.credentialStatus==null && other.getCredentialStatus()==null) || 
             (this.credentialStatus!=null &&
              this.credentialStatus.equals(other.getCredentialStatus()))) &&
            ((this.bindingDetail==null && other.getBindingDetail()==null) || 
             (this.bindingDetail!=null &&
              this.bindingDetail.equals(other.getBindingDetail()))) &&
            ((this.pushAttributes==null && other.getPushAttributes()==null) || 
             (this.pushAttributes!=null &&
              java.util.Arrays.equals(this.pushAttributes, other.getPushAttributes())));
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
        if (getCredentialStatus() != null) {
            _hashCode += getCredentialStatus().hashCode();
        }
        if (getBindingDetail() != null) {
            _hashCode += getBindingDetail().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CredentialBindingDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialBindingDetailType"));
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
        elemField.setFieldName("credentialStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "bindingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BindingDetailType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pushAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType"));
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
