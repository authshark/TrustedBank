/**
 * PushTransactionStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class PushTransactionStatusType  implements java.io.Serializable {
    private java.lang.String transactionId;

    private byte[] status;

    private java.lang.String statusMessage;

    private byte[] detail;

    private java.lang.String detailMessage;

    private java.util.Calendar authnTime;

    private java.lang.String credentialId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType;

    private java.lang.Boolean isPinExpired;

    private java.util.Calendar pinExpirationTime;

    public PushTransactionStatusType() {
    }

    public PushTransactionStatusType(
           java.lang.String transactionId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           java.util.Calendar authnTime,
           java.lang.String credentialId,
           com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType,
           java.lang.Boolean isPinExpired,
           java.util.Calendar pinExpirationTime) {
           this.transactionId = transactionId;
           this.status = status;
           this.statusMessage = statusMessage;
           this.detail = detail;
           this.detailMessage = detailMessage;
           this.authnTime = authnTime;
           this.credentialId = credentialId;
           this.credentialType = credentialType;
           this.isPinExpired = isPinExpired;
           this.pinExpirationTime = pinExpirationTime;
    }


    /**
     * Gets the transactionId value for this PushTransactionStatusType.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PushTransactionStatusType.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the status value for this PushTransactionStatusType.
     * 
     * @return status
     */
    public byte[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PushTransactionStatusType.
     * 
     * @param status
     */
    public void setStatus(byte[] status) {
        this.status = status;
    }


    /**
     * Gets the statusMessage value for this PushTransactionStatusType.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this PushTransactionStatusType.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the detail value for this PushTransactionStatusType.
     * 
     * @return detail
     */
    public byte[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this PushTransactionStatusType.
     * 
     * @param detail
     */
    public void setDetail(byte[] detail) {
        this.detail = detail;
    }


    /**
     * Gets the detailMessage value for this PushTransactionStatusType.
     * 
     * @return detailMessage
     */
    public java.lang.String getDetailMessage() {
        return detailMessage;
    }


    /**
     * Sets the detailMessage value for this PushTransactionStatusType.
     * 
     * @param detailMessage
     */
    public void setDetailMessage(java.lang.String detailMessage) {
        this.detailMessage = detailMessage;
    }


    /**
     * Gets the authnTime value for this PushTransactionStatusType.
     * 
     * @return authnTime
     */
    public java.util.Calendar getAuthnTime() {
        return authnTime;
    }


    /**
     * Sets the authnTime value for this PushTransactionStatusType.
     * 
     * @param authnTime
     */
    public void setAuthnTime(java.util.Calendar authnTime) {
        this.authnTime = authnTime;
    }


    /**
     * Gets the credentialId value for this PushTransactionStatusType.
     * 
     * @return credentialId
     */
    public java.lang.String getCredentialId() {
        return credentialId;
    }


    /**
     * Sets the credentialId value for this PushTransactionStatusType.
     * 
     * @param credentialId
     */
    public void setCredentialId(java.lang.String credentialId) {
        this.credentialId = credentialId;
    }


    /**
     * Gets the credentialType value for this PushTransactionStatusType.
     * 
     * @return credentialType
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum getCredentialType() {
        return credentialType;
    }


    /**
     * Sets the credentialType value for this PushTransactionStatusType.
     * 
     * @param credentialType
     */
    public void setCredentialType(com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum credentialType) {
        this.credentialType = credentialType;
    }


    /**
     * Gets the isPinExpired value for this PushTransactionStatusType.
     * 
     * @return isPinExpired
     */
    public java.lang.Boolean getIsPinExpired() {
        return isPinExpired;
    }


    /**
     * Sets the isPinExpired value for this PushTransactionStatusType.
     * 
     * @param isPinExpired
     */
    public void setIsPinExpired(java.lang.Boolean isPinExpired) {
        this.isPinExpired = isPinExpired;
    }


    /**
     * Gets the pinExpirationTime value for this PushTransactionStatusType.
     * 
     * @return pinExpirationTime
     */
    public java.util.Calendar getPinExpirationTime() {
        return pinExpirationTime;
    }


    /**
     * Sets the pinExpirationTime value for this PushTransactionStatusType.
     * 
     * @param pinExpirationTime
     */
    public void setPinExpirationTime(java.util.Calendar pinExpirationTime) {
        this.pinExpirationTime = pinExpirationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PushTransactionStatusType)) return false;
        PushTransactionStatusType other = (PushTransactionStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.detailMessage==null && other.getDetailMessage()==null) || 
             (this.detailMessage!=null &&
              this.detailMessage.equals(other.getDetailMessage()))) &&
            ((this.authnTime==null && other.getAuthnTime()==null) || 
             (this.authnTime!=null &&
              this.authnTime.equals(other.getAuthnTime()))) &&
            ((this.credentialId==null && other.getCredentialId()==null) || 
             (this.credentialId!=null &&
              this.credentialId.equals(other.getCredentialId()))) &&
            ((this.credentialType==null && other.getCredentialType()==null) || 
             (this.credentialType!=null &&
              this.credentialType.equals(other.getCredentialType()))) &&
            ((this.isPinExpired==null && other.getIsPinExpired()==null) || 
             (this.isPinExpired!=null &&
              this.isPinExpired.equals(other.getIsPinExpired()))) &&
            ((this.pinExpirationTime==null && other.getPinExpirationTime()==null) || 
             (this.pinExpirationTime!=null &&
              this.pinExpirationTime.equals(other.getPinExpirationTime())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        if (getDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailMessage() != null) {
            _hashCode += getDetailMessage().hashCode();
        }
        if (getAuthnTime() != null) {
            _hashCode += getAuthnTime().hashCode();
        }
        if (getCredentialId() != null) {
            _hashCode += getCredentialId().hashCode();
        }
        if (getCredentialType() != null) {
            _hashCode += getCredentialType().hashCode();
        }
        if (getIsPinExpired() != null) {
            _hashCode += getIsPinExpired().hashCode();
        }
        if (getPinExpirationTime() != null) {
            _hashCode += getPinExpirationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PushTransactionStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushTransactionStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "statusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "detailMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "authnTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "credentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPinExpired");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "isPinExpired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinExpirationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "pinExpirationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
