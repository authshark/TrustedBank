/**
 * ValidateMultipleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Request to validate multiple Tokens with one OTP
 */
public class ValidateMultipleType  extends com.verisign.www._2006._08.vipservice.AccountRequestAbstractType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.TokenIdType[] tokenIds;

    private java.lang.String OTP;

    private java.lang.Boolean sendSuccessfulTokenId;

    public ValidateMultipleType() {
    }

    public ValidateMultipleType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           com.verisign.www._2006._08.vipservice.TokenIdType[] tokenIds,
           java.lang.String OTP,
           java.lang.Boolean sendSuccessfulTokenId) {
        super(
            version,
            id,
            authorizerAccountId);
        this.tokenIds = tokenIds;
        this.OTP = OTP;
        this.sendSuccessfulTokenId = sendSuccessfulTokenId;
    }


    /**
     * Gets the tokenIds value for this ValidateMultipleType.
     * 
     * @return tokenIds
     */
    public com.verisign.www._2006._08.vipservice.TokenIdType[] getTokenIds() {
        return tokenIds;
    }


    /**
     * Sets the tokenIds value for this ValidateMultipleType.
     * 
     * @param tokenIds
     */
    public void setTokenIds(com.verisign.www._2006._08.vipservice.TokenIdType[] tokenIds) {
        this.tokenIds = tokenIds;
    }

    public com.verisign.www._2006._08.vipservice.TokenIdType getTokenIds(int i) {
        return this.tokenIds[i];
    }

    public void setTokenIds(int i, com.verisign.www._2006._08.vipservice.TokenIdType _value) {
        this.tokenIds[i] = _value;
    }


    /**
     * Gets the OTP value for this ValidateMultipleType.
     * 
     * @return OTP
     */
    public java.lang.String getOTP() {
        return OTP;
    }


    /**
     * Sets the OTP value for this ValidateMultipleType.
     * 
     * @param OTP
     */
    public void setOTP(java.lang.String OTP) {
        this.OTP = OTP;
    }


    /**
     * Gets the sendSuccessfulTokenId value for this ValidateMultipleType.
     * 
     * @return sendSuccessfulTokenId
     */
    public java.lang.Boolean getSendSuccessfulTokenId() {
        return sendSuccessfulTokenId;
    }


    /**
     * Sets the sendSuccessfulTokenId value for this ValidateMultipleType.
     * 
     * @param sendSuccessfulTokenId
     */
    public void setSendSuccessfulTokenId(java.lang.Boolean sendSuccessfulTokenId) {
        this.sendSuccessfulTokenId = sendSuccessfulTokenId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateMultipleType)) return false;
        ValidateMultipleType other = (ValidateMultipleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokenIds==null && other.getTokenIds()==null) || 
             (this.tokenIds!=null &&
              java.util.Arrays.equals(this.tokenIds, other.getTokenIds()))) &&
            ((this.OTP==null && other.getOTP()==null) || 
             (this.OTP!=null &&
              this.OTP.equals(other.getOTP()))) &&
            ((this.sendSuccessfulTokenId==null && other.getSendSuccessfulTokenId()==null) || 
             (this.sendSuccessfulTokenId!=null &&
              this.sendSuccessfulTokenId.equals(other.getSendSuccessfulTokenId())));
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
        if (getTokenIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokenIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokenIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOTP() != null) {
            _hashCode += getOTP().hashCode();
        }
        if (getSendSuccessfulTokenId() != null) {
            _hashCode += getSendSuccessfulTokenId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateMultipleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultipleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenIdType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "OTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendSuccessfulTokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendSuccessfulTokenId"));
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
