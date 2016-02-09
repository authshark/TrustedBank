/**
 * PushDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class PushDetailType  implements java.io.Serializable {
    private java.lang.String pushCredentialId;

    private boolean pushSent;

    public PushDetailType() {
    }

    public PushDetailType(
           java.lang.String pushCredentialId,
           boolean pushSent) {
           this.pushCredentialId = pushCredentialId;
           this.pushSent = pushSent;
    }


    /**
     * Gets the pushCredentialId value for this PushDetailType.
     * 
     * @return pushCredentialId
     */
    public java.lang.String getPushCredentialId() {
        return pushCredentialId;
    }


    /**
     * Sets the pushCredentialId value for this PushDetailType.
     * 
     * @param pushCredentialId
     */
    public void setPushCredentialId(java.lang.String pushCredentialId) {
        this.pushCredentialId = pushCredentialId;
    }


    /**
     * Gets the pushSent value for this PushDetailType.
     * 
     * @return pushSent
     */
    public boolean isPushSent() {
        return pushSent;
    }


    /**
     * Sets the pushSent value for this PushDetailType.
     * 
     * @param pushSent
     */
    public void setPushSent(boolean pushSent) {
        this.pushSent = pushSent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PushDetailType)) return false;
        PushDetailType other = (PushDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pushCredentialId==null && other.getPushCredentialId()==null) || 
             (this.pushCredentialId!=null &&
              this.pushCredentialId.equals(other.getPushCredentialId()))) &&
            this.pushSent == other.isPushSent();
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
        if (getPushCredentialId() != null) {
            _hashCode += getPushCredentialId().hashCode();
        }
        _hashCode += (isPushSent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PushDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushCredentialId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pushCredentialId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushSent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pushSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
