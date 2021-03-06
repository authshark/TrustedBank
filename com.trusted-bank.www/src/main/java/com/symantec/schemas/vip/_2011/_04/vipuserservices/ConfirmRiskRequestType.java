/**
 * ConfirmRiskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class ConfirmRiskRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String eventId;

    private java.lang.String verifyMethod;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs;

    public ConfirmRiskRequestType() {
    }

    public ConfirmRiskRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           java.lang.String eventId,
           java.lang.String verifyMethod,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.eventId = eventId;
        this.verifyMethod = verifyMethod;
        this.keyValuePairs = keyValuePairs;
    }


    /**
     * Gets the userId value for this ConfirmRiskRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ConfirmRiskRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the eventId value for this ConfirmRiskRequestType.
     * 
     * @return eventId
     */
    public java.lang.String getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this ConfirmRiskRequestType.
     * 
     * @param eventId
     */
    public void setEventId(java.lang.String eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the verifyMethod value for this ConfirmRiskRequestType.
     * 
     * @return verifyMethod
     */
    public java.lang.String getVerifyMethod() {
        return verifyMethod;
    }


    /**
     * Sets the verifyMethod value for this ConfirmRiskRequestType.
     * 
     * @param verifyMethod
     */
    public void setVerifyMethod(java.lang.String verifyMethod) {
        this.verifyMethod = verifyMethod;
    }


    /**
     * Gets the keyValuePairs value for this ConfirmRiskRequestType.
     * 
     * @return keyValuePairs
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getKeyValuePairs() {
        return keyValuePairs;
    }


    /**
     * Sets the keyValuePairs value for this ConfirmRiskRequestType.
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
        if (!(obj instanceof ConfirmRiskRequestType)) return false;
        ConfirmRiskRequestType other = (ConfirmRiskRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.verifyMethod==null && other.getVerifyMethod()==null) || 
             (this.verifyMethod!=null &&
              this.verifyMethod.equals(other.getVerifyMethod()))) &&
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getVerifyMethod() != null) {
            _hashCode += getVerifyMethod().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(ConfirmRiskRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ConfirmRiskRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "EventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "VerifyMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
