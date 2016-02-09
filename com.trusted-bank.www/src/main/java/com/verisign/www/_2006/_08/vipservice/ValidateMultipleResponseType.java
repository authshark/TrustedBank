/**
 * ValidateMultipleResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Response to a request to validate an OTP for multiple Tokens.
 */
public class ValidateMultipleResponseType  extends com.verisign.www._2006._08.vipservice.ResponseWithStatusType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.TokenIdType successfulTokenId;

    public ValidateMultipleResponseType() {
    }

    public ValidateMultipleResponseType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status,
           com.verisign.www._2006._08.vipservice.TokenIdType successfulTokenId) {
        super(
            version,
            requestId,
            status);
        this.successfulTokenId = successfulTokenId;
    }


    /**
     * Gets the successfulTokenId value for this ValidateMultipleResponseType.
     * 
     * @return successfulTokenId
     */
    public com.verisign.www._2006._08.vipservice.TokenIdType getSuccessfulTokenId() {
        return successfulTokenId;
    }


    /**
     * Sets the successfulTokenId value for this ValidateMultipleResponseType.
     * 
     * @param successfulTokenId
     */
    public void setSuccessfulTokenId(com.verisign.www._2006._08.vipservice.TokenIdType successfulTokenId) {
        this.successfulTokenId = successfulTokenId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateMultipleResponseType)) return false;
        ValidateMultipleResponseType other = (ValidateMultipleResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.successfulTokenId==null && other.getSuccessfulTokenId()==null) || 
             (this.successfulTokenId!=null &&
              this.successfulTokenId.equals(other.getSuccessfulTokenId())));
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
        if (getSuccessfulTokenId() != null) {
            _hashCode += getSuccessfulTokenId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateMultipleResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultipleResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successfulTokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SuccessfulTokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenIdType"));
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
