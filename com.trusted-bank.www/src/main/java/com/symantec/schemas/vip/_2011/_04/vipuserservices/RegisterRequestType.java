/**
 * RegisterRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class RegisterRequestType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType  implements java.io.Serializable {
    private com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType smsDeliveryInfo;

    private com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType voiceDeliveryInfo;

    private com.symantec.schemas.vip._2011._04.vipuserservices.ServiceOtpDeliveryInfoType serviceOtpDeliveryInfo;

    public RegisterRequestType() {
    }

    public RegisterRequestType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId,
           com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType smsDeliveryInfo,
           com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType voiceDeliveryInfo,
           com.symantec.schemas.vip._2011._04.vipuserservices.ServiceOtpDeliveryInfoType serviceOtpDeliveryInfo) {
        super(
            requestId,
            onBehalfOfAccountId);
        this.smsDeliveryInfo = smsDeliveryInfo;
        this.voiceDeliveryInfo = voiceDeliveryInfo;
        this.serviceOtpDeliveryInfo = serviceOtpDeliveryInfo;
    }


    /**
     * Gets the smsDeliveryInfo value for this RegisterRequestType.
     * 
     * @return smsDeliveryInfo
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType getSmsDeliveryInfo() {
        return smsDeliveryInfo;
    }


    /**
     * Sets the smsDeliveryInfo value for this RegisterRequestType.
     * 
     * @param smsDeliveryInfo
     */
    public void setSmsDeliveryInfo(com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType smsDeliveryInfo) {
        this.smsDeliveryInfo = smsDeliveryInfo;
    }


    /**
     * Gets the voiceDeliveryInfo value for this RegisterRequestType.
     * 
     * @return voiceDeliveryInfo
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType getVoiceDeliveryInfo() {
        return voiceDeliveryInfo;
    }


    /**
     * Sets the voiceDeliveryInfo value for this RegisterRequestType.
     * 
     * @param voiceDeliveryInfo
     */
    public void setVoiceDeliveryInfo(com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType voiceDeliveryInfo) {
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }


    /**
     * Gets the serviceOtpDeliveryInfo value for this RegisterRequestType.
     * 
     * @return serviceOtpDeliveryInfo
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.ServiceOtpDeliveryInfoType getServiceOtpDeliveryInfo() {
        return serviceOtpDeliveryInfo;
    }


    /**
     * Sets the serviceOtpDeliveryInfo value for this RegisterRequestType.
     * 
     * @param serviceOtpDeliveryInfo
     */
    public void setServiceOtpDeliveryInfo(com.symantec.schemas.vip._2011._04.vipuserservices.ServiceOtpDeliveryInfoType serviceOtpDeliveryInfo) {
        this.serviceOtpDeliveryInfo = serviceOtpDeliveryInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterRequestType)) return false;
        RegisterRequestType other = (RegisterRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smsDeliveryInfo==null && other.getSmsDeliveryInfo()==null) || 
             (this.smsDeliveryInfo!=null &&
              this.smsDeliveryInfo.equals(other.getSmsDeliveryInfo()))) &&
            ((this.voiceDeliveryInfo==null && other.getVoiceDeliveryInfo()==null) || 
             (this.voiceDeliveryInfo!=null &&
              this.voiceDeliveryInfo.equals(other.getVoiceDeliveryInfo()))) &&
            ((this.serviceOtpDeliveryInfo==null && other.getServiceOtpDeliveryInfo()==null) || 
             (this.serviceOtpDeliveryInfo!=null &&
              this.serviceOtpDeliveryInfo.equals(other.getServiceOtpDeliveryInfo())));
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
        if (getSmsDeliveryInfo() != null) {
            _hashCode += getSmsDeliveryInfo().hashCode();
        }
        if (getVoiceDeliveryInfo() != null) {
            _hashCode += getVoiceDeliveryInfo().hashCode();
        }
        if (getServiceOtpDeliveryInfo() != null) {
            _hashCode += getServiceOtpDeliveryInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RegisterRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOtpDeliveryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "serviceOtpDeliveryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ServiceOtpDeliveryInfoType"));
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
