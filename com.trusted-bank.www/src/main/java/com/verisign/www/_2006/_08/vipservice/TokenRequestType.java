/**
 * TokenRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * class for all request messages that have token id
 */
public abstract class TokenRequestType  extends com.verisign.www._2006._08.vipservice.AccountRequestAbstractType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.TokenIdType tokenId;

    public TokenRequestType() {
    }

    public TokenRequestType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           com.verisign.www._2006._08.vipservice.TokenIdType tokenId) {
        super(
            version,
            id,
            authorizerAccountId);
        this.tokenId = tokenId;
    }


    /**
     * Gets the tokenId value for this TokenRequestType.
     * 
     * @return tokenId
     */
    public com.verisign.www._2006._08.vipservice.TokenIdType getTokenId() {
        return tokenId;
    }


    /**
     * Sets the tokenId value for this TokenRequestType.
     * 
     * @param tokenId
     */
    public void setTokenId(com.verisign.www._2006._08.vipservice.TokenIdType tokenId) {
        this.tokenId = tokenId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenRequestType)) return false;
        TokenRequestType other = (TokenRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokenId==null && other.getTokenId()==null) || 
             (this.tokenId!=null &&
              this.tokenId.equals(other.getTokenId())));
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
        if (getTokenId() != null) {
            _hashCode += getTokenId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenIdType"));
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
