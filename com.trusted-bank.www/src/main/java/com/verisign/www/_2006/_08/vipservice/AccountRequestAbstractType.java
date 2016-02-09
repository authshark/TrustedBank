/**
 * AccountRequestAbstractType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Abstract class for all request messages that are supported by the
 * UA Web Service. Id is a pseudo-random number used for request-response
 * matching.
 */
public abstract class AccountRequestAbstractType  extends com.verisign.www._2006._08.vipservice.RequestAbstractType  implements java.io.Serializable {
    private java.lang.String authorizerAccountId;

    public AccountRequestAbstractType() {
    }

    public AccountRequestAbstractType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId) {
        super(
            version,
            id);
        this.authorizerAccountId = authorizerAccountId;
    }


    /**
     * Gets the authorizerAccountId value for this AccountRequestAbstractType.
     * 
     * @return authorizerAccountId
     */
    public java.lang.String getAuthorizerAccountId() {
        return authorizerAccountId;
    }


    /**
     * Sets the authorizerAccountId value for this AccountRequestAbstractType.
     * 
     * @param authorizerAccountId
     */
    public void setAuthorizerAccountId(java.lang.String authorizerAccountId) {
        this.authorizerAccountId = authorizerAccountId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountRequestAbstractType)) return false;
        AccountRequestAbstractType other = (AccountRequestAbstractType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorizerAccountId==null && other.getAuthorizerAccountId()==null) || 
             (this.authorizerAccountId!=null &&
              this.authorizerAccountId.equals(other.getAuthorizerAccountId())));
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
        if (getAuthorizerAccountId() != null) {
            _hashCode += getAuthorizerAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountRequestAbstractType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AccountRequestAbstractType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizerAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AuthorizerAccountId"));
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
