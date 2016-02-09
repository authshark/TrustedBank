/**
 * GenerateTemporaryPasswordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Request to generate a new temporary password for a Token.
 */
public class GenerateTemporaryPasswordType  extends com.verisign.www._2006._08.vipservice.TokenRequestType  implements java.io.Serializable {
    private java.util.Calendar expirationDate;

    private java.lang.Boolean oneTimeUseOnly;

    public GenerateTemporaryPasswordType() {
    }

    public GenerateTemporaryPasswordType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           com.verisign.www._2006._08.vipservice.TokenIdType tokenId,
           java.util.Calendar expirationDate,
           java.lang.Boolean oneTimeUseOnly) {
        super(
            version,
            id,
            authorizerAccountId,
            tokenId);
        this.expirationDate = expirationDate;
        this.oneTimeUseOnly = oneTimeUseOnly;
    }


    /**
     * Gets the expirationDate value for this GenerateTemporaryPasswordType.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this GenerateTemporaryPasswordType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the oneTimeUseOnly value for this GenerateTemporaryPasswordType.
     * 
     * @return oneTimeUseOnly
     */
    public java.lang.Boolean getOneTimeUseOnly() {
        return oneTimeUseOnly;
    }


    /**
     * Sets the oneTimeUseOnly value for this GenerateTemporaryPasswordType.
     * 
     * @param oneTimeUseOnly
     */
    public void setOneTimeUseOnly(java.lang.Boolean oneTimeUseOnly) {
        this.oneTimeUseOnly = oneTimeUseOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateTemporaryPasswordType)) return false;
        GenerateTemporaryPasswordType other = (GenerateTemporaryPasswordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
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
        int _hashCode = super.hashCode();
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getOneTimeUseOnly() != null) {
            _hashCode += getOneTimeUseOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateTemporaryPasswordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPasswordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeUseOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "OneTimeUseOnly"));
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
