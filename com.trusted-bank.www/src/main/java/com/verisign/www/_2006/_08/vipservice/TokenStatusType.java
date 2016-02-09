/**
 * TokenStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;

public class TokenStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TokenStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NEW = "NEW";
    public static final java.lang.String _ENABLED = "ENABLED";
    public static final java.lang.String _DISABLED = "DISABLED";
    public static final java.lang.String _LOCKED = "LOCKED";
    public static final java.lang.String _INACTIVE = "INACTIVE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TokenStatusType NEW = new TokenStatusType(_NEW);
    public static final TokenStatusType ENABLED = new TokenStatusType(_ENABLED);
    public static final TokenStatusType DISABLED = new TokenStatusType(_DISABLED);
    public static final TokenStatusType LOCKED = new TokenStatusType(_LOCKED);
    public static final TokenStatusType INACTIVE = new TokenStatusType(_INACTIVE);
    public static final TokenStatusType UNKNOWN = new TokenStatusType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TokenStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TokenStatusType enumeration = (TokenStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TokenStatusType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
