/**
 * DeliverTxnOTPType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Set or Generate a Pin and deliver to the phone number through SMS
 * or Voice as specified.
 */
public class DeliverTxnOTPType  extends com.verisign.www._2006._08.vipservice.AccountRequestAbstractType  implements java.io.Serializable {
    private java.lang.String txnOTP;

    private com.verisign.www._2006._08.vipservice.DestinationType destination;

    private com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo;

    private com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo;

    public DeliverTxnOTPType() {
    }

    public DeliverTxnOTPType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           java.lang.String txnOTP,
           com.verisign.www._2006._08.vipservice.DestinationType destination,
           com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo,
           com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo) {
        super(
            version,
            id,
            authorizerAccountId);
        this.txnOTP = txnOTP;
        this.destination = destination;
        this.SMSDeliveryInfo = SMSDeliveryInfo;
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }


    /**
     * Gets the txnOTP value for this DeliverTxnOTPType.
     * 
     * @return txnOTP
     */
    public java.lang.String getTxnOTP() {
        return txnOTP;
    }


    /**
     * Sets the txnOTP value for this DeliverTxnOTPType.
     * 
     * @param txnOTP
     */
    public void setTxnOTP(java.lang.String txnOTP) {
        this.txnOTP = txnOTP;
    }


    /**
     * Gets the destination value for this DeliverTxnOTPType.
     * 
     * @return destination
     */
    public com.verisign.www._2006._08.vipservice.DestinationType getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this DeliverTxnOTPType.
     * 
     * @param destination
     */
    public void setDestination(com.verisign.www._2006._08.vipservice.DestinationType destination) {
        this.destination = destination;
    }


    /**
     * Gets the SMSDeliveryInfo value for this DeliverTxnOTPType.
     * 
     * @return SMSDeliveryInfo
     */
    public com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType getSMSDeliveryInfo() {
        return SMSDeliveryInfo;
    }


    /**
     * Sets the SMSDeliveryInfo value for this DeliverTxnOTPType.
     * 
     * @param SMSDeliveryInfo
     */
    public void setSMSDeliveryInfo(com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo) {
        this.SMSDeliveryInfo = SMSDeliveryInfo;
    }


    /**
     * Gets the voiceDeliveryInfo value for this DeliverTxnOTPType.
     * 
     * @return voiceDeliveryInfo
     */
    public com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType getVoiceDeliveryInfo() {
        return voiceDeliveryInfo;
    }


    /**
     * Sets the voiceDeliveryInfo value for this DeliverTxnOTPType.
     * 
     * @param voiceDeliveryInfo
     */
    public void setVoiceDeliveryInfo(com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo) {
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliverTxnOTPType)) return false;
        DeliverTxnOTPType other = (DeliverTxnOTPType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.txnOTP==null && other.getTxnOTP()==null) || 
             (this.txnOTP!=null &&
              this.txnOTP.equals(other.getTxnOTP()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
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
        if (getTxnOTP() != null) {
            _hashCode += getTxnOTP().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(DeliverTxnOTPType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliverTxnOTPType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txnOTP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TxnOTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DestinationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
