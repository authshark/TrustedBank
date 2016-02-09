/**
 * TemporaryPasswordAttributesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class TemporaryPasswordAttributesType  implements java.io.Serializable {
    private java.util.Calendar expirationTime;

    private java.lang.Boolean oneTimeUseOnly;

    public TemporaryPasswordAttributesType() {
    }

    public TemporaryPasswordAttributesType(
           java.util.Calendar expirationTime,
           java.lang.Boolean oneTimeUseOnly) {
           this.expirationTime = expirationTime;
           this.oneTimeUseOnly = oneTimeUseOnly;
    }


    /**
     * Gets the expirationTime value for this TemporaryPasswordAttributesType.
     * 
     * @return expirationTime
     */
    public java.util.Calendar getExpirationTime() {
        return expirationTime;
    }


    /**
     * Sets the expirationTime value for this TemporaryPasswordAttributesType.
     * 
     * @param expirationTime
     */
    public void setExpirationTime(java.util.Calendar expirationTime) {
        this.expirationTime = expirationTime;
    }


    /**
     * Gets the oneTimeUseOnly value for this TemporaryPasswordAttributesType.
     * 
     * @return oneTimeUseOnly
     */
    public java.lang.Boolean getOneTimeUseOnly() {
        return oneTimeUseOnly;
    }


    /**
     * Sets the oneTimeUseOnly value for this TemporaryPasswordAttributesType.
     * 
     * @param oneTimeUseOnly
     */
    public void setOneTimeUseOnly(java.lang.Boolean oneTimeUseOnly) {
        this.oneTimeUseOnly = oneTimeUseOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemporaryPasswordAttributesType)) return false;
        TemporaryPasswordAttributesType other = (TemporaryPasswordAttributesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expirationTime==null && other.getExpirationTime()==null) || 
             (this.expirationTime!=null &&
              this.expirationTime.equals(other.getExpirationTime()))) &&
            ((this.oneTimeUseOnly==null && other.getOneTimeUseOnly()==null) || 
             (this.oneTimeUseOnly!=null &&
              this.oneTimeUseOnly.equals(other.getOneTimeUseOnly())));
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
        if (getExpirationTime() != null) {
            _hashCode += getExpirationTime().hashCode();
        }
        if (getOneTimeUseOnly() != null) {
            _hashCode += getOneTimeUseOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemporaryPasswordAttributesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "TemporaryPasswordAttributesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "expirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeUseOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "oneTimeUseOnly"));
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
