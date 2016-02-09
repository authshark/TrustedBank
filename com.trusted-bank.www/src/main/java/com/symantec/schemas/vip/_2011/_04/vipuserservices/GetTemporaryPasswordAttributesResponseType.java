/**
 * GetTemporaryPasswordAttributesResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class GetTemporaryPasswordAttributesResponseType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType  implements java.io.Serializable {
    private com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType tempPwdAttributes;

    public GetTemporaryPasswordAttributesResponseType() {
    }

    public GetTemporaryPasswordAttributesResponseType(
           java.lang.String requestId,
           byte[] status,
           java.lang.String statusMessage,
           byte[] detail,
           java.lang.String detailMessage,
           com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType tempPwdAttributes) {
        super(
            requestId,
            status,
            statusMessage,
            detail,
            detailMessage);
        this.tempPwdAttributes = tempPwdAttributes;
    }


    /**
     * Gets the tempPwdAttributes value for this GetTemporaryPasswordAttributesResponseType.
     * 
     * @return tempPwdAttributes
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType getTempPwdAttributes() {
        return tempPwdAttributes;
    }


    /**
     * Sets the tempPwdAttributes value for this GetTemporaryPasswordAttributesResponseType.
     * 
     * @param tempPwdAttributes
     */
    public void setTempPwdAttributes(com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType tempPwdAttributes) {
        this.tempPwdAttributes = tempPwdAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTemporaryPasswordAttributesResponseType)) return false;
        GetTemporaryPasswordAttributesResponseType other = (GetTemporaryPasswordAttributesResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tempPwdAttributes==null && other.getTempPwdAttributes()==null) || 
             (this.tempPwdAttributes!=null &&
              this.tempPwdAttributes.equals(other.getTempPwdAttributes())));
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
        if (getTempPwdAttributes() != null) {
            _hashCode += getTempPwdAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTemporaryPasswordAttributesResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetTemporaryPasswordAttributesResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempPwdAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "tempPwdAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "TemporaryPasswordAttributesType"));
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
