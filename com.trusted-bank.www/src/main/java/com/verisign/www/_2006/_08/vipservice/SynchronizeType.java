/**
 * SynchronizeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Request to sync a Token. Includes the token ID and two consecutive
 * OTPs.
 */
public class SynchronizeType  extends com.verisign.www._2006._08.vipservice.TokenRequestType  implements java.io.Serializable {
    private java.lang.String OTP1;

    private java.lang.String OTP2;

    public SynchronizeType() {
    }

    public SynchronizeType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           com.verisign.www._2006._08.vipservice.TokenIdType tokenId,
           java.lang.String OTP1,
           java.lang.String OTP2) {
        super(
            version,
            id,
            authorizerAccountId,
            tokenId);
        this.OTP1 = OTP1;
        this.OTP2 = OTP2;
    }


    /**
     * Gets the OTP1 value for this SynchronizeType.
     * 
     * @return OTP1
     */
    public java.lang.String getOTP1() {
        return OTP1;
    }


    /**
     * Sets the OTP1 value for this SynchronizeType.
     * 
     * @param OTP1
     */
    public void setOTP1(java.lang.String OTP1) {
        this.OTP1 = OTP1;
    }


    /**
     * Gets the OTP2 value for this SynchronizeType.
     * 
     * @return OTP2
     */
    public java.lang.String getOTP2() {
        return OTP2;
    }


    /**
     * Sets the OTP2 value for this SynchronizeType.
     * 
     * @param OTP2
     */
    public void setOTP2(java.lang.String OTP2) {
        this.OTP2 = OTP2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SynchronizeType)) return false;
        SynchronizeType other = (SynchronizeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.OTP1==null && other.getOTP1()==null) || 
             (this.OTP1!=null &&
              this.OTP1.equals(other.getOTP1()))) &&
            ((this.OTP2==null && other.getOTP2()==null) || 
             (this.OTP2!=null &&
              this.OTP2.equals(other.getOTP2())));
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
        if (getOTP1() != null) {
            _hashCode += getOTP1().hashCode();
        }
        if (getOTP2() != null) {
            _hashCode += getOTP2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynchronizeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SynchronizeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTP1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "OTP1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTP2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "OTP2"));
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
