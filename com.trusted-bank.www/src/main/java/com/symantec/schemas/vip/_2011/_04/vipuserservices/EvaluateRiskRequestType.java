/**
 * EvaluateRiskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class EvaluateRiskRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String ip;

    private java.lang.String userAgent;

    private java.lang.String IAAuthData;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs;

    public EvaluateRiskRequestType() {
    }

    public EvaluateRiskRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           java.lang.String ip,
           java.lang.String userAgent,
           java.lang.String IAAuthData,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.ip = ip;
        this.userAgent = userAgent;
        this.IAAuthData = IAAuthData;
        this.keyValuePairs = keyValuePairs;
    }


    /**
     * Gets the userId value for this EvaluateRiskRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this EvaluateRiskRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the ip value for this EvaluateRiskRequestType.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this EvaluateRiskRequestType.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the userAgent value for this EvaluateRiskRequestType.
     * 
     * @return userAgent
     */
    public java.lang.String getUserAgent() {
        return userAgent;
    }


    /**
     * Sets the userAgent value for this EvaluateRiskRequestType.
     * 
     * @param userAgent
     */
    public void setUserAgent(java.lang.String userAgent) {
        this.userAgent = userAgent;
    }


    /**
     * Gets the IAAuthData value for this EvaluateRiskRequestType.
     * 
     * @return IAAuthData
     */
    public java.lang.String getIAAuthData() {
        return IAAuthData;
    }


    /**
     * Sets the IAAuthData value for this EvaluateRiskRequestType.
     * 
     * @param IAAuthData
     */
    public void setIAAuthData(java.lang.String IAAuthData) {
        this.IAAuthData = IAAuthData;
    }


    /**
     * Gets the keyValuePairs value for this EvaluateRiskRequestType.
     * 
     * @return keyValuePairs
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getKeyValuePairs() {
        return keyValuePairs;
    }


    /**
     * Sets the keyValuePairs value for this EvaluateRiskRequestType.
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
        if (!(obj instanceof EvaluateRiskRequestType)) return false;
        EvaluateRiskRequestType other = (EvaluateRiskRequestType) obj;
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
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.userAgent==null && other.getUserAgent()==null) || 
             (this.userAgent!=null &&
              this.userAgent.equals(other.getUserAgent()))) &&
            ((this.IAAuthData==null && other.getIAAuthData()==null) || 
             (this.IAAuthData!=null &&
              this.IAAuthData.equals(other.getIAAuthData()))) &&
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getUserAgent() != null) {
            _hashCode += getUserAgent().hashCode();
        }
        if (getIAAuthData() != null) {
            _hashCode += getIAAuthData().hashCode();
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
        new org.apache.axis.description.TypeDesc(EvaluateRiskRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "EvaluateRiskRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "Ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IAAuthData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "IAAuthData"));
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
