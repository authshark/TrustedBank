/**
 * ValidateResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Response to a request to validate an OTP.
 */
public class ValidateResponseType  extends com.verisign.www._2006._08.vipservice.ResponseWithStatusType  implements java.io.Serializable {
    private java.lang.Boolean networkAlert;

    public ValidateResponseType() {
    }

    public ValidateResponseType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status,
           java.lang.Boolean networkAlert) {
        super(
            version,
            requestId,
            status);
        this.networkAlert = networkAlert;
    }


    /**
     * Gets the networkAlert value for this ValidateResponseType.
     * 
     * @return networkAlert
     */
    public java.lang.Boolean getNetworkAlert() {
        return networkAlert;
    }


    /**
     * Sets the networkAlert value for this ValidateResponseType.
     * 
     * @param networkAlert
     */
    public void setNetworkAlert(java.lang.Boolean networkAlert) {
        this.networkAlert = networkAlert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateResponseType)) return false;
        ValidateResponseType other = (ValidateResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkAlert==null && other.getNetworkAlert()==null) || 
             (this.networkAlert!=null &&
              this.networkAlert.equals(other.getNetworkAlert())));
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
        if (getNetworkAlert() != null) {
            _hashCode += getNetworkAlert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NetworkAlert"));
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
