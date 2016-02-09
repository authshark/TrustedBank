/**
 * SubmitTxnVerificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Message to send voice or SMS transaction verification request.
 * 				For SMS messages the requests can only be submitted, not polled.
 * 				For voice messages the request can be submitted and optionally
 * polled for success/failure.
 */
public class SubmitTxnVerificationType  extends com.verisign.www._2006._08.vipservice.AccountRequestAbstractType  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private java.lang.String txnOTP;

    private java.lang.String language;

    private java.lang.String voiceTemplateName;

    private com.verisign.www._2006._08.vipservice.NameValuePairType[] namedParam;

    public SubmitTxnVerificationType() {
    }

    public SubmitTxnVerificationType(
           java.lang.String version,
           java.lang.String id,
           java.lang.String authorizerAccountId,
           java.lang.String phoneNumber,
           java.lang.String txnOTP,
           java.lang.String language,
           java.lang.String voiceTemplateName,
           com.verisign.www._2006._08.vipservice.NameValuePairType[] namedParam) {
        super(
            version,
            id,
            authorizerAccountId);
        this.phoneNumber = phoneNumber;
        this.txnOTP = txnOTP;
        this.language = language;
        this.voiceTemplateName = voiceTemplateName;
        this.namedParam = namedParam;
    }


    /**
     * Gets the phoneNumber value for this SubmitTxnVerificationType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this SubmitTxnVerificationType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the txnOTP value for this SubmitTxnVerificationType.
     * 
     * @return txnOTP
     */
    public java.lang.String getTxnOTP() {
        return txnOTP;
    }


    /**
     * Sets the txnOTP value for this SubmitTxnVerificationType.
     * 
     * @param txnOTP
     */
    public void setTxnOTP(java.lang.String txnOTP) {
        this.txnOTP = txnOTP;
    }


    /**
     * Gets the language value for this SubmitTxnVerificationType.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this SubmitTxnVerificationType.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the voiceTemplateName value for this SubmitTxnVerificationType.
     * 
     * @return voiceTemplateName
     */
    public java.lang.String getVoiceTemplateName() {
        return voiceTemplateName;
    }


    /**
     * Sets the voiceTemplateName value for this SubmitTxnVerificationType.
     * 
     * @param voiceTemplateName
     */
    public void setVoiceTemplateName(java.lang.String voiceTemplateName) {
        this.voiceTemplateName = voiceTemplateName;
    }


    /**
     * Gets the namedParam value for this SubmitTxnVerificationType.
     * 
     * @return namedParam
     */
    public com.verisign.www._2006._08.vipservice.NameValuePairType[] getNamedParam() {
        return namedParam;
    }


    /**
     * Sets the namedParam value for this SubmitTxnVerificationType.
     * 
     * @param namedParam
     */
    public void setNamedParam(com.verisign.www._2006._08.vipservice.NameValuePairType[] namedParam) {
        this.namedParam = namedParam;
    }

    public com.verisign.www._2006._08.vipservice.NameValuePairType getNamedParam(int i) {
        return this.namedParam[i];
    }

    public void setNamedParam(int i, com.verisign.www._2006._08.vipservice.NameValuePairType _value) {
        this.namedParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitTxnVerificationType)) return false;
        SubmitTxnVerificationType other = (SubmitTxnVerificationType) obj;
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
            ((this.txnOTP==null && other.getTxnOTP()==null) || 
             (this.txnOTP!=null &&
              this.txnOTP.equals(other.getTxnOTP()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.voiceTemplateName==null && other.getVoiceTemplateName()==null) || 
             (this.voiceTemplateName!=null &&
              this.voiceTemplateName.equals(other.getVoiceTemplateName()))) &&
            ((this.namedParam==null && other.getNamedParam()==null) || 
             (this.namedParam!=null &&
              java.util.Arrays.equals(this.namedParam, other.getNamedParam())));
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
        if (getTxnOTP() != null) {
            _hashCode += getTxnOTP().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getVoiceTemplateName() != null) {
            _hashCode += getVoiceTemplateName().hashCode();
        }
        if (getNamedParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamedParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamedParam(), i);
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
        new org.apache.axis.description.TypeDesc(SubmitTxnVerificationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerificationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txnOTP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TxnOTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VoiceTemplateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NamedParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NameValuePairType"));
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
