/**
 * SendOtpRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class SendOtpRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private java.lang.String userId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType smsDeliveryInfo;

    private com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType voiceDeliveryInfo;

    public SendOtpRequestType() {
    }

    public SendOtpRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           java.lang.String userId,
           com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType smsDeliveryInfo,
           com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType voiceDeliveryInfo) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.userId = userId;
        this.smsDeliveryInfo = smsDeliveryInfo;
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }


    /**
     * Gets the userId value for this SendOtpRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SendOtpRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the smsDeliveryInfo value for this SendOtpRequestType.
     * 
     * @return smsDeliveryInfo
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType getSmsDeliveryInfo() {
        return smsDeliveryInfo;
    }


    /**
     * Sets the smsDeliveryInfo value for this SendOtpRequestType.
     * 
     * @param smsDeliveryInfo
     */
    public void setSmsDeliveryInfo(com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType smsDeliveryInfo) {
        this.smsDeliveryInfo = smsDeliveryInfo;
    }


    /**
     * Gets the voiceDeliveryInfo value for this SendOtpRequestType.
     * 
     * @return voiceDeliveryInfo
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType getVoiceDeliveryInfo() {
        return voiceDeliveryInfo;
    }


    /**
     * Sets the voiceDeliveryInfo value for this SendOtpRequestType.
     * 
     * @param voiceDeliveryInfo
     */
    public void setVoiceDeliveryInfo(com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType voiceDeliveryInfo) {
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendOtpRequestType)) return false;
        SendOtpRequestType other = (SendOtpRequestType) obj;
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
            ((this.smsDeliveryInfo==null && other.getSmsDeliveryInfo()==null) || 
             (this.smsDeliveryInfo!=null &&
              this.smsDeliveryInfo.equals(other.getSmsDeliveryInfo()))) &&
            ((this.voiceDeliveryInfo==null && other.getVoiceDeliveryInfo()==null) || 
             (this.voiceDeliveryInfo!=null &&
              this.voiceDeliveryInfo.equals(other.getVoiceDeliveryInfo())));
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
        if (getSmsDeliveryInfo() != null) {
            _hashCode += getSmsDeliveryInfo().hashCode();
        }
        if (getVoiceDeliveryInfo() != null) {
            _hashCode += getVoiceDeliveryInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendOtpRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SendOtpRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsDeliveryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "smsDeliveryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SmsDeliveryInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceDeliveryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "voiceDeliveryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "VoiceDeliveryInfoType"));
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
