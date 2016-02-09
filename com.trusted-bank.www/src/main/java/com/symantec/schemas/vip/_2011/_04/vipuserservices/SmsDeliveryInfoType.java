/**
 * SmsDeliveryInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;


/**
 * Contains the branding information.
 */
public class SmsDeliveryInfoType  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private java.lang.String smsFrom;

    private java.lang.String messageTemplate;

    private com.symantec.schemas.vip._2011._04.vipuserservices.GatewayAcctInfoType gatewayAcctInfo;

    public SmsDeliveryInfoType() {
    }

    public SmsDeliveryInfoType(
           java.lang.String phoneNumber,
           java.lang.String smsFrom,
           java.lang.String messageTemplate,
           com.symantec.schemas.vip._2011._04.vipuserservices.GatewayAcctInfoType gatewayAcctInfo) {
           this.phoneNumber = phoneNumber;
           this.smsFrom = smsFrom;
           this.messageTemplate = messageTemplate;
           this.gatewayAcctInfo = gatewayAcctInfo;
    }


    /**
     * Gets the phoneNumber value for this SmsDeliveryInfoType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this SmsDeliveryInfoType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the smsFrom value for this SmsDeliveryInfoType.
     * 
     * @return smsFrom
     */
    public java.lang.String getSmsFrom() {
        return smsFrom;
    }


    /**
     * Sets the smsFrom value for this SmsDeliveryInfoType.
     * 
     * @param smsFrom
     */
    public void setSmsFrom(java.lang.String smsFrom) {
        this.smsFrom = smsFrom;
    }


    /**
     * Gets the messageTemplate value for this SmsDeliveryInfoType.
     * 
     * @return messageTemplate
     */
    public java.lang.String getMessageTemplate() {
        return messageTemplate;
    }


    /**
     * Sets the messageTemplate value for this SmsDeliveryInfoType.
     * 
     * @param messageTemplate
     */
    public void setMessageTemplate(java.lang.String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }


    /**
     * Gets the gatewayAcctInfo value for this SmsDeliveryInfoType.
     * 
     * @return gatewayAcctInfo
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.GatewayAcctInfoType getGatewayAcctInfo() {
        return gatewayAcctInfo;
    }


    /**
     * Sets the gatewayAcctInfo value for this SmsDeliveryInfoType.
     * 
     * @param gatewayAcctInfo
     */
    public void setGatewayAcctInfo(com.symantec.schemas.vip._2011._04.vipuserservices.GatewayAcctInfoType gatewayAcctInfo) {
        this.gatewayAcctInfo = gatewayAcctInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmsDeliveryInfoType)) return false;
        SmsDeliveryInfoType other = (SmsDeliveryInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.smsFrom==null && other.getSmsFrom()==null) || 
             (this.smsFrom!=null &&
              this.smsFrom.equals(other.getSmsFrom()))) &&
            ((this.messageTemplate==null && other.getMessageTemplate()==null) || 
             (this.messageTemplate!=null &&
              this.messageTemplate.equals(other.getMessageTemplate()))) &&
            ((this.gatewayAcctInfo==null && other.getGatewayAcctInfo()==null) || 
             (this.gatewayAcctInfo!=null &&
              this.gatewayAcctInfo.equals(other.getGatewayAcctInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getSmsFrom() != null) {
            _hashCode += getSmsFrom().hashCode();
        }
        if (getMessageTemplate() != null) {
            _hashCode += getMessageTemplate().hashCode();
        }
        if (getGatewayAcctInfo() != null) {
            _hashCode += getGatewayAcctInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmsDeliveryInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SmsDeliveryInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "smsFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "messageTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayAcctInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "gatewayAcctInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GatewayAcctInfoType"));
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
