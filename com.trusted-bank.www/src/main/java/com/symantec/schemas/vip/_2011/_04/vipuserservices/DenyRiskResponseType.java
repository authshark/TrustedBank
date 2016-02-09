/**
 * DenyRiskResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class DenyRiskResponseType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType  implements java.io.Serializable {
    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs;

    public DenyRiskResponseType() {
    }

    public DenyRiskResponseType(
           java.lang.String requestId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs) {
        super(
            requestId,
            status,
            statusMessage,
            detail,
            detailMessage);
        this.keyValuePairs = keyValuePairs;
    }


    /**
     * Gets the keyValuePairs value for this DenyRiskResponseType.
     * 
     * @return keyValuePairs
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getKeyValuePairs() {
        return keyValuePairs;
    }


    /**
     * Sets the keyValuePairs value for this DenyRiskResponseType.
     * 
     * @param keyValuePairs
     */
    public void setKeyValuePairs(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType getKeyValuePairs(int i) {
        return this.keyValuePairs[i];
    }

    public void setKeyValuePairs(int i, com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType _value) {
        this.keyValuePairs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DenyRiskResponseType)) return false;
        DenyRiskResponseType other = (DenyRiskResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keyValuePairs==null && other.getKeyValuePairs()==null) || 
             (this.keyValuePairs!=null &&
              java.util.Arrays.equals(this.keyValuePairs, other.getKeyValuePairs())));
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
        if (getKeyValuePairs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyValuePairs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyValuePairs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DenyRiskResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "DenyRiskResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyValuePairs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType"));
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
