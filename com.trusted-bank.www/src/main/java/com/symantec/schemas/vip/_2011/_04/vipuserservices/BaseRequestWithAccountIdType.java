/**
 * BaseRequestWithAccountIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;


/**
 * Acts as the base type for all the requests that are sent on behalf
 * of another account ID. In such cases,
 * 			the sender will either be a super admin or a parent of the onBehalfOfAccountId.
 */
public abstract class BaseRequestWithAccountIdType  extends com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestType  implements java.io.Serializable {
    private java.lang.String onBehalfOfAccountId;

    public BaseRequestWithAccountIdType() {
    }

    public BaseRequestWithAccountIdType(
           java.lang.String requestId,
           java.lang.String onBehalfOfAccountId) {
        super(
            requestId);
        this.onBehalfOfAccountId = onBehalfOfAccountId;
    }


    /**
     * Gets the onBehalfOfAccountId value for this BaseRequestWithAccountIdType.
     * 
     * @return onBehalfOfAccountId
     */
    public java.lang.String getOnBehalfOfAccountId() {
        return onBehalfOfAccountId;
    }


    /**
     * Sets the onBehalfOfAccountId value for this BaseRequestWithAccountIdType.
     * 
     * @param onBehalfOfAccountId
     */
    public void setOnBehalfOfAccountId(java.lang.String onBehalfOfAccountId) {
        this.onBehalfOfAccountId = onBehalfOfAccountId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseRequestWithAccountIdType)) return false;
        BaseRequestWithAccountIdType other = (BaseRequestWithAccountIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.onBehalfOfAccountId==null && other.getOnBehalfOfAccountId()==null) || 
             (this.onBehalfOfAccountId!=null &&
              this.onBehalfOfAccountId.equals(other.getOnBehalfOfAccountId())));
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
        if (getOnBehalfOfAccountId() != null) {
            _hashCode += getOnBehalfOfAccountId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseRequestWithAccountIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BaseRequestWithAccountIdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onBehalfOfAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "onBehalfOfAccountId"));
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
