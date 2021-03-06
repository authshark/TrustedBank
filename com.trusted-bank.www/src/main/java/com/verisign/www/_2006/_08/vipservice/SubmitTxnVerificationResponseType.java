/**
 * SubmitTxnVerificationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Response to a SubmitTxnVerification request. Gives the status along
 * with a tracking number,
 * 				that the client can use to poll.
 */
public class SubmitTxnVerificationResponseType  extends com.verisign.www._2006._08.vipservice.ResponseWithStatusType  implements java.io.Serializable {
    private java.lang.String txnId;

    private java.lang.String txnOTP;

    public SubmitTxnVerificationResponseType() {
    }

    public SubmitTxnVerificationResponseType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status,
           java.lang.String txnId,
           java.lang.String txnOTP) {
        super(
            version,
            requestId,
            status);
        this.txnId = txnId;
        this.txnOTP = txnOTP;
    }


    /**
     * Gets the txnId value for this SubmitTxnVerificationResponseType.
     * 
     * @return txnId
     */
    public java.lang.String getTxnId() {
        return txnId;
    }


    /**
     * Sets the txnId value for this SubmitTxnVerificationResponseType.
     * 
     * @param txnId
     */
    public void setTxnId(java.lang.String txnId) {
        this.txnId = txnId;
    }


    /**
     * Gets the txnOTP value for this SubmitTxnVerificationResponseType.
     * 
     * @return txnOTP
     */
    public java.lang.String getTxnOTP() {
        return txnOTP;
    }


    /**
     * Sets the txnOTP value for this SubmitTxnVerificationResponseType.
     * 
     * @param txnOTP
     */
    public void setTxnOTP(java.lang.String txnOTP) {
        this.txnOTP = txnOTP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitTxnVerificationResponseType)) return false;
        SubmitTxnVerificationResponseType other = (SubmitTxnVerificationResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.txnId==null && other.getTxnId()==null) || 
             (this.txnId!=null &&
              this.txnId.equals(other.getTxnId()))) &&
            ((this.txnOTP==null && other.getTxnOTP()==null) || 
             (this.txnOTP!=null &&
              this.txnOTP.equals(other.getTxnOTP())));
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
        if (getTxnId() != null) {
            _hashCode += getTxnId().hashCode();
        }
        if (getTxnOTP() != null) {
            _hashCode += getTxnOTP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitTxnVerificationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerificationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TxnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txnOTP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TxnOTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
