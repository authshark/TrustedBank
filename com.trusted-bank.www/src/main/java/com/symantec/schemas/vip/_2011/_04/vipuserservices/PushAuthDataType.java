/**
 * PushAuthDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class PushAuthDataType  extends com.symantec.schemas.vip._2011._04.vipuserservices.AbstractAuthDataType  implements java.io.Serializable {
    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] displayParameters;

    private com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] requestParameters;

    public PushAuthDataType() {
    }

    public PushAuthDataType(
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] displayParameters,
           com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] requestParameters) {
        this.displayParameters = displayParameters;
        this.requestParameters = requestParameters;
    }


    /**
     * Gets the displayParameters value for this PushAuthDataType.
     * 
     * @return displayParameters
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getDisplayParameters() {
        return displayParameters;
    }


    /**
     * Sets the displayParameters value for this PushAuthDataType.
     * 
     * @param displayParameters
     */
    public void setDisplayParameters(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] displayParameters) {
        this.displayParameters = displayParameters;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType getDisplayParameters(int i) {
        return this.displayParameters[i];
    }

    public void setDisplayParameters(int i, com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType _value) {
        this.displayParameters[i] = _value;
    }


    /**
     * Gets the requestParameters value for this PushAuthDataType.
     * 
     * @return requestParameters
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] getRequestParameters() {
        return requestParameters;
    }


    /**
     * Sets the requestParameters value for this PushAuthDataType.
     * 
     * @param requestParameters
     */
    public void setRequestParameters(com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[] requestParameters) {
        this.requestParameters = requestParameters;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType getRequestParameters(int i) {
        return this.requestParameters[i];
    }

    public void setRequestParameters(int i, com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType _value) {
        this.requestParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PushAuthDataType)) return false;
        PushAuthDataType other = (PushAuthDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayParameters==null && other.getDisplayParameters()==null) || 
             (this.displayParameters!=null &&
              java.util.Arrays.equals(this.displayParameters, other.getDisplayParameters()))) &&
            ((this.requestParameters==null && other.getRequestParameters()==null) || 
             (this.requestParameters!=null &&
              java.util.Arrays.equals(this.requestParameters, other.getRequestParameters())));
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
        if (getDisplayParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestParameters(), i);
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
        new org.apache.axis.description.TypeDesc(PushAuthDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushAuthDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "displayParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "requestParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType"));
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
