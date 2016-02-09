/**
 * OtpAuthDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class OtpAuthDataType  extends com.symantec.schemas.vip._2011._04.vipuserservices.AbstractAuthDataType  implements java.io.Serializable {
    private java.lang.String otp;

    private java.lang.String otp2;

    public OtpAuthDataType() {
    }

    public OtpAuthDataType(
           java.lang.String otp,
           java.lang.String otp2) {
        this.otp = otp;
        this.otp2 = otp2;
    }


    /**
     * Gets the otp value for this OtpAuthDataType.
     * 
     * @return otp
     */
    public java.lang.String getOtp() {
        return otp;
    }


    /**
     * Sets the otp value for this OtpAuthDataType.
     * 
     * @param otp
     */
    public void setOtp(java.lang.String otp) {
        this.otp = otp;
    }


    /**
     * Gets the otp2 value for this OtpAuthDataType.
     * 
     * @return otp2
     */
    public java.lang.String getOtp2() {
        return otp2;
    }


    /**
     * Sets the otp2 value for this OtpAuthDataType.
     * 
     * @param otp2
     */
    public void setOtp2(java.lang.String otp2) {
        this.otp2 = otp2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtpAuthDataType)) return false;
        OtpAuthDataType other = (OtpAuthDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.otp==null && other.getOtp()==null) || 
             (this.otp!=null &&
              this.otp.equals(other.getOtp()))) &&
            ((this.otp2==null && other.getOtp2()==null) || 
             (this.otp2!=null &&
              this.otp2.equals(other.getOtp2())));
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
        if (getOtp() != null) {
            _hashCode += getOtp().hashCode();
        }
        if (getOtp2() != null) {
            _hashCode += getOtp2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtpAuthDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "OtpAuthDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "otp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otp2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "otp2"));
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
