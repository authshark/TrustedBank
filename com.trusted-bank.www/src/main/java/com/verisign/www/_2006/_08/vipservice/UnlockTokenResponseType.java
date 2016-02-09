/**
 * UnlockTokenResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Response to unlock a Token.
 */
public class UnlockTokenResponseType  extends com.verisign.www._2006._08.vipservice.ResponseWithStatusType  implements java.io.Serializable {
    private java.lang.Boolean sameInitialState;

    public UnlockTokenResponseType() {
    }

    public UnlockTokenResponseType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status,
           java.lang.Boolean sameInitialState) {
        super(
            version,
            requestId,
            status);
        this.sameInitialState = sameInitialState;
    }


    /**
     * Gets the sameInitialState value for this UnlockTokenResponseType.
     * 
     * @return sameInitialState
     */
    public java.lang.Boolean getSameInitialState() {
        return sameInitialState;
    }


    /**
     * Sets the sameInitialState value for this UnlockTokenResponseType.
     * 
     * @param sameInitialState
     */
    public void setSameInitialState(java.lang.Boolean sameInitialState) {
        this.sameInitialState = sameInitialState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnlockTokenResponseType)) return false;
        UnlockTokenResponseType other = (UnlockTokenResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sameInitialState==null && other.getSameInitialState()==null) || 
             (this.sameInitialState!=null &&
              this.sameInitialState.equals(other.getSameInitialState())));
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
        if (getSameInitialState() != null) {
            _hashCode += getSameInitialState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnlockTokenResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UnlockTokenResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameInitialState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SameInitialState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
