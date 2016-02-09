/**
 * SendOTPType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * XML to send OTP via SMS for given token
 */
public class SendOTPType  extends com.verisign.www._2006._08.vipservice.TokenRequestType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo;

    private com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo;

    public SendOTPType() {
    }

    public SendOTPType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           com.verisign.www._2006._08.vipservice.TokenIdType tokenId,
           com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo,
           com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo) {
        super(
            version,
            id,
            authorizerAccountId,
            tokenId);
        this.SMSDeliveryInfo = SMSDeliveryInfo;
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }


    /**
     * Gets the SMSDeliveryInfo value for this SendOTPType.
     * 
     * @return SMSDeliveryInfo
     */
    public com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType getSMSDeliveryInfo() {
        return SMSDeliveryInfo;
    }


    /**
     * Sets the SMSDeliveryInfo value for this SendOTPType.
     * 
     * @param SMSDeliveryInfo
     */
    public void setSMSDeliveryInfo(com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo) {
        this.SMSDeliveryInfo = SMSDeliveryInfo;
    }


    /**
     * Gets the voiceDeliveryInfo value for this SendOTPType.
     * 
     * @return voiceDeliveryInfo
     */
    public com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType getVoiceDeliveryInfo() {
        return voiceDeliveryInfo;
    }


    /**
     * Sets the voiceDeliveryInfo value for this SendOTPType.
     * 
     * @param voiceDeliveryInfo
     */
    public void setVoiceDeliveryInfo(com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo) {
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendOTPType)) return false;
        SendOTPType other = (SendOTPType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SMSDeliveryInfo==null && other.getSMSDeliveryInfo()==null) || 
             (this.SMSDeliveryInfo!=null &&
              this.SMSDeliveryInfo.equals(other.getSMSDeliveryInfo()))) &&
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
        if (getSMSDeliveryInfo() != null) {
            _hashCode += getSMSDeliveryInfo().hashCode();
        }
        if (getVoiceDeliveryInfo() != null) {
            _hashCode += getVoiceDeliveryInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendOTPType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendOTPType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSDeliveryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SMSDeliveryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SMSDeliveryInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceDeliveryInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VoiceDeliveryInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VoiceDeliveryInfoType"));
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
