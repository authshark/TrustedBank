/**
 * SetTemporaryPasswordAttributesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class SetTemporaryPasswordAttributesRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType temporaryPasswordAttributes;

    public SetTemporaryPasswordAttributesRequestType() {
    }

    public SetTemporaryPasswordAttributesRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType temporaryPasswordAttributes) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.temporaryPasswordAttributes = temporaryPasswordAttributes;
    }


    /**
     * Gets the userId value for this SetTemporaryPasswordAttributesRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SetTemporaryPasswordAttributesRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the temporaryPasswordAttributes value for this SetTemporaryPasswordAttributesRequestType.
     * 
     * @return temporaryPasswordAttributes
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType getTemporaryPasswordAttributes() {
        return temporaryPasswordAttributes;
    }


    /**
     * Sets the temporaryPasswordAttributes value for this SetTemporaryPasswordAttributesRequestType.
     * 
     * @param temporaryPasswordAttributes
     */
    public void setTemporaryPasswordAttributes(com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType temporaryPasswordAttributes) {
        this.temporaryPasswordAttributes = temporaryPasswordAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetTemporaryPasswordAttributesRequestType)) return false;
        SetTemporaryPasswordAttributesRequestType other = (SetTemporaryPasswordAttributesRequestType) obj;
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
            ((this.temporaryPasswordAttributes==null && other.getTemporaryPasswordAttributes()==null) || 
             (this.temporaryPasswordAttributes!=null &&
              this.temporaryPasswordAttributes.equals(other.getTemporaryPasswordAttributes())));
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
        if (getTemporaryPasswordAttributes() != null) {
            _hashCode += getTemporaryPasswordAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetTemporaryPasswordAttributesRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SetTemporaryPasswordAttributesRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryPasswordAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "temporaryPasswordAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "TemporaryPasswordAttributesType"));
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
