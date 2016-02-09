/**
 * GetUserInfoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class GetUserInfoRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.Boolean iaInfo;

    private java.lang.Boolean includePushAttributes;

    public GetUserInfoRequestType() {
    }

    public GetUserInfoRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           java.lang.Boolean iaInfo,
           java.lang.Boolean includePushAttributes) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.iaInfo = iaInfo;
        this.includePushAttributes = includePushAttributes;
    }


    /**
     * Gets the userId value for this GetUserInfoRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this GetUserInfoRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the iaInfo value for this GetUserInfoRequestType.
     * 
     * @return iaInfo
     */
    public java.lang.Boolean getIaInfo() {
        return iaInfo;
    }


    /**
     * Sets the iaInfo value for this GetUserInfoRequestType.
     * 
     * @param iaInfo
     */
    public void setIaInfo(java.lang.Boolean iaInfo) {
        this.iaInfo = iaInfo;
    }


    /**
     * Gets the includePushAttributes value for this GetUserInfoRequestType.
     * 
     * @return includePushAttributes
     */
    public java.lang.Boolean getIncludePushAttributes() {
        return includePushAttributes;
    }


    /**
     * Sets the includePushAttributes value for this GetUserInfoRequestType.
     * 
     * @param includePushAttributes
     */
    public void setIncludePushAttributes(java.lang.Boolean includePushAttributes) {
        this.includePushAttributes = includePushAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserInfoRequestType)) return false;
        GetUserInfoRequestType other = (GetUserInfoRequestType) obj;
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
            ((this.iaInfo==null && other.getIaInfo()==null) || 
             (this.iaInfo!=null &&
              this.iaInfo.equals(other.getIaInfo()))) &&
            ((this.includePushAttributes==null && other.getIncludePushAttributes()==null) || 
             (this.includePushAttributes!=null &&
              this.includePushAttributes.equals(other.getIncludePushAttributes())));
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
        if (getIaInfo() != null) {
            _hashCode += getIaInfo().hashCode();
        }
        if (getIncludePushAttributes() != null) {
            _hashCode += getIncludePushAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserInfoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iaInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "iaInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includePushAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "includePushAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
