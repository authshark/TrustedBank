/**
 * EvaluateRiskResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class EvaluateRiskResponseType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType  implements java.io.Serializable {
    private java.lang.Boolean risky;

    private java.math.BigInteger riskScore;

    private java.math.BigInteger riskThreshold;

    private java.lang.String riskReason;

    private java.lang.String policyVersion;

    private java.lang.String eventId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs;

    public EvaluateRiskResponseType() {
    }

    public EvaluateRiskResponseType(
           java.lang.String requestId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           java.lang.Boolean risky,
           java.math.BigInteger riskScore,
           java.math.BigInteger riskThreshold,
           java.lang.String riskReason,
           java.lang.String policyVersion,
           java.lang.String eventId,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] keyValuePairs) {
        super(
            requestId,
            status,
            statusMessage,
            detail,
            detailMessage);
        this.risky = risky;
        this.riskScore = riskScore;
        this.riskThreshold = riskThreshold;
        this.riskReason = riskReason;
        this.policyVersion = policyVersion;
        this.eventId = eventId;
        this.keyValuePairs = keyValuePairs;
    }


    /**
     * Gets the risky value for this EvaluateRiskResponseType.
     * 
     * @return risky
     */
    public java.lang.Boolean getRisky() {
        return risky;
    }


    /**
     * Sets the risky value for this EvaluateRiskResponseType.
     * 
     * @param risky
     */
    public void setRisky(java.lang.Boolean risky) {
        this.risky = risky;
    }


    /**
     * Gets the riskScore value for this EvaluateRiskResponseType.
     * 
     * @return riskScore
     */
    public java.math.BigInteger getRiskScore() {
        return riskScore;
    }


    /**
     * Sets the riskScore value for this EvaluateRiskResponseType.
     * 
     * @param riskScore
     */
    public void setRiskScore(java.math.BigInteger riskScore) {
        this.riskScore = riskScore;
    }


    /**
     * Gets the riskThreshold value for this EvaluateRiskResponseType.
     * 
     * @return riskThreshold
     */
    public java.math.BigInteger getRiskThreshold() {
        return riskThreshold;
    }


    /**
     * Sets the riskThreshold value for this EvaluateRiskResponseType.
     * 
     * @param riskThreshold
     */
    public void setRiskThreshold(java.math.BigInteger riskThreshold) {
        this.riskThreshold = riskThreshold;
    }


    /**
     * Gets the riskReason value for this EvaluateRiskResponseType.
     * 
     * @return riskReason
     */
    public java.lang.String getRiskReason() {
        return riskReason;
    }


    /**
     * Sets the riskReason value for this EvaluateRiskResponseType.
     * 
     * @param riskReason
     */
    public void setRiskReason(java.lang.String riskReason) {
        this.riskReason = riskReason;
    }


    /**
     * Gets the policyVersion value for this EvaluateRiskResponseType.
     * 
     * @return policyVersion
     */
    public java.lang.String getPolicyVersion() {
        return policyVersion;
    }


    /**
     * Sets the policyVersion value for this EvaluateRiskResponseType.
     * 
     * @param policyVersion
     */
    public void setPolicyVersion(java.lang.String policyVersion) {
        this.policyVersion = policyVersion;
    }


    /**
     * Gets the eventId value for this EvaluateRiskResponseType.
     * 
     * @return eventId
     */
    public java.lang.String getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this EvaluateRiskResponseType.
     * 
     * @param eventId
     */
    public void setEventId(java.lang.String eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the keyValuePairs value for this EvaluateRiskResponseType.
     * 
     * @return keyValuePairs
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getKeyValuePairs() {
        return keyValuePairs;
    }


    /**
     * Sets the keyValuePairs value for this EvaluateRiskResponseType.
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
        if (!(obj instanceof EvaluateRiskResponseType)) return false;
        EvaluateRiskResponseType other = (EvaluateRiskResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.risky==null && other.getRisky()==null) || 
             (this.risky!=null &&
              this.risky.equals(other.getRisky()))) &&
            ((this.riskScore==null && other.getRiskScore()==null) || 
             (this.riskScore!=null &&
              this.riskScore.equals(other.getRiskScore()))) &&
            ((this.riskThreshold==null && other.getRiskThreshold()==null) || 
             (this.riskThreshold!=null &&
              this.riskThreshold.equals(other.getRiskThreshold()))) &&
            ((this.riskReason==null && other.getRiskReason()==null) || 
             (this.riskReason!=null &&
              this.riskReason.equals(other.getRiskReason()))) &&
            ((this.policyVersion==null && other.getPolicyVersion()==null) || 
             (this.policyVersion!=null &&
              this.policyVersion.equals(other.getPolicyVersion()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
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
        if (getRisky() != null) {
            _hashCode += getRisky().hashCode();
        }
        if (getRiskScore() != null) {
            _hashCode += getRiskScore().hashCode();
        }
        if (getRiskThreshold() != null) {
            _hashCode += getRiskThreshold().hashCode();
        }
        if (getRiskReason() != null) {
            _hashCode += getRiskReason().hashCode();
        }
        if (getPolicyVersion() != null) {
            _hashCode += getPolicyVersion().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
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
        new org.apache.axis.description.TypeDesc(EvaluateRiskResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "EvaluateRiskResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("risky");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "Risky"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RiskScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RiskThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RiskReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PolicyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "EventId"));
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
