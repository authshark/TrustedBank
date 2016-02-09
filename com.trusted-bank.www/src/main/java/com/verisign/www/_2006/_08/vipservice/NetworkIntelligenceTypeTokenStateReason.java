/**
 * NetworkIntelligenceTypeTokenStateReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;

public class NetworkIntelligenceTypeTokenStateReason  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private int _value;

    private com.verisign.www._2006._08.vipservice.ReasonType type;  // attribute

    public NetworkIntelligenceTypeTokenStateReason() {
    }

    // Simple Types must have a String constructor
    public NetworkIntelligenceTypeTokenStateReason(int _value) {
        this._value = _value;
    }
    public NetworkIntelligenceTypeTokenStateReason(java.lang.String _value) {
        this._value = new Integer(_value).intValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Integer(_value).toString();
    }


    /**
     * Gets the _value value for this NetworkIntelligenceTypeTokenStateReason.
     * 
     * @return _value
     */
    public int get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this NetworkIntelligenceTypeTokenStateReason.
     * 
     * @param _value
     */
    public void set_value(int _value) {
        this._value = _value;
    }


    /**
     * Gets the type value for this NetworkIntelligenceTypeTokenStateReason.
     * 
     * @return type
     */
    public com.verisign.www._2006._08.vipservice.ReasonType getType() {
        return type;
    }


    /**
     * Sets the type value for this NetworkIntelligenceTypeTokenStateReason.
     * 
     * @param type
     */
    public void setType(com.verisign.www._2006._08.vipservice.ReasonType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkIntelligenceTypeTokenStateReason)) return false;
        NetworkIntelligenceTypeTokenStateReason other = (NetworkIntelligenceTypeTokenStateReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        _hashCode += get_value();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkIntelligenceTypeTokenStateReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">>NetworkIntelligenceType>TokenState>Reason"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ReasonType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
