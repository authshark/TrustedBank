/**
 * SendTemporaryPasswordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * XML to send temporary password to phone number
 */
public class SendTemporaryPasswordType  extends com.verisign.www._2006._08.vipservice.TokenRequestType  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private com.verisign.www._2006._08.vipservice.DestinationType destination;

    private com.verisign.www._2006._08.vipservice.GatewayAcctInfoType gatewayAcctInfo;

    private java.util.Calendar expirationDate;

    private com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo;

    private com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo;

    public SendTemporaryPasswordType() {
    }

    public SendTemporaryPasswordType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           com.verisign.www._2006._08.vipservice.TokenIdType tokenId,
           java.lang.String phoneNumber,
           com.verisign.www._2006._08.vipservice.DestinationType destination,
           com.verisign.www._2006._08.vipservice.GatewayAcctInfoType gatewayAcctInfo,
           java.util.Calendar expirationDate,
           com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo,
           com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo) {
        super(
            version,
            id,
            authorizerAccountId,
            tokenId);
        this.phoneNumber = phoneNumber;
        this.destination = destination;
        this.gatewayAcctInfo = gatewayAcctInfo;
        this.expirationDate = expirationDate;
        this.SMSDeliveryInfo = SMSDeliveryInfo;
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }


    /**
     * Gets the phoneNumber value for this SendTemporaryPasswordType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this SendTemporaryPasswordType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the destination value for this SendTemporaryPasswordType.
     * 
     * @return destination
     */
    public com.verisign.www._2006._08.vipservice.DestinationType getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this SendTemporaryPasswordType.
     * 
     * @param destination
     */
    public void setDestination(com.verisign.www._2006._08.vipservice.DestinationType destination) {
        this.destination = destination;
    }


    /**
     * Gets the gatewayAcctInfo value for this SendTemporaryPasswordType.
     * 
     * @return gatewayAcctInfo
     */
    public com.verisign.www._2006._08.vipservice.GatewayAcctInfoType getGatewayAcctInfo() {
        return gatewayAcctInfo;
    }


    /**
     * Sets the gatewayAcctInfo value for this SendTemporaryPasswordType.
     * 
     * @param gatewayAcctInfo
     */
    public void setGatewayAcctInfo(com.verisign.www._2006._08.vipservice.GatewayAcctInfoType gatewayAcctInfo) {
        this.gatewayAcctInfo = gatewayAcctInfo;
    }


    /**
     * Gets the expirationDate value for this SendTemporaryPasswordType.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this SendTemporaryPasswordType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the SMSDeliveryInfo value for this SendTemporaryPasswordType.
     * 
     * @return SMSDeliveryInfo
     */
    public com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType getSMSDeliveryInfo() {
        return SMSDeliveryInfo;
    }


    /**
     * Sets the SMSDeliveryInfo value for this SendTemporaryPasswordType.
     * 
     * @param SMSDeliveryInfo
     */
    public void setSMSDeliveryInfo(com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType SMSDeliveryInfo) {
        this.SMSDeliveryInfo = SMSDeliveryInfo;
    }


    /**
     * Gets the voiceDeliveryInfo value for this SendTemporaryPasswordType.
     * 
     * @return voiceDeliveryInfo
     */
    public com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType getVoiceDeliveryInfo() {
        return voiceDeliveryInfo;
    }


    /**
     * Sets the voiceDeliveryInfo value for this SendTemporaryPasswordType.
     * 
     * @param voiceDeliveryInfo
     */
    public void setVoiceDeliveryInfo(com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType voiceDeliveryInfo) {
        this.voiceDeliveryInfo = voiceDeliveryInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendTemporaryPasswordType)) return false;
        SendTemporaryPasswordType other = (SendTemporaryPasswordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.gatewayAcctInfo==null && other.getGatewayAcctInfo()==null) || 
             (this.gatewayAcctInfo!=null &&
              this.gatewayAcctInfo.equals(other.getGatewayAcctInfo()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getGatewayAcctInfo() != null) {
            _hashCode += getGatewayAcctInfo().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(SendTemporaryPasswordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendTemporaryPasswordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DestinationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayAcctInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GatewayAcctInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GatewayAcctInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
