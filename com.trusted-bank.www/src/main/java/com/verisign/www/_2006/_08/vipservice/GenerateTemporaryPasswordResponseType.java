/**
 * GenerateTemporaryPasswordResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Response to generate a temporary password for a Token.
 */
public class GenerateTemporaryPasswordResponseType  extends com.verisign.www._2006._08.vipservice.ResponseWithStatusType  implements java.io.Serializable {
    private java.lang.String temporaryPassword;

    public GenerateTemporaryPasswordResponseType() {
    }

    public GenerateTemporaryPasswordResponseType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status,
           java.lang.String temporaryPassword) {
        super(
            version,
            requestId,
            status);
        this.temporaryPassword = temporaryPassword;
    }


    /**
     * Gets the temporaryPassword value for this GenerateTemporaryPasswordResponseType.
     * 
     * @return temporaryPassword
     */
    public java.lang.String getTemporaryPassword() {
        return temporaryPassword;
    }


    /**
     * Sets the temporaryPassword value for this GenerateTemporaryPasswordResponseType.
     * 
     * @param temporaryPassword
     */
    public void setTemporaryPassword(java.lang.String temporaryPassword) {
        this.temporaryPassword = temporaryPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateTemporaryPasswordResponseType)) return false;
        GenerateTemporaryPasswordResponseType other = (GenerateTemporaryPasswordResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.temporaryPassword==null && other.getTemporaryPassword()==null) || 
             (this.temporaryPassword!=null &&
              this.temporaryPassword.equals(other.getTemporaryPassword())));
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
        if (getTemporaryPassword() != null) {
            _hashCode += getTemporaryPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateTemporaryPasswordResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPasswordResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TemporaryPassword"));
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
