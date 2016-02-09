/**
 * AdapterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;

public class AdapterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdapterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OATH_EVENT_BASIC = "OATH_EVENT_BASIC";
    public static final java.lang.String _OATH_EVENT_ADVANCED_1 = "OATH_EVENT_ADVANCED_1";
    public static final java.lang.String _OATH_EVENT_ADVANCED_2 = "OATH_EVENT_ADVANCED_2";
    public static final java.lang.String _VASCO_TIME = "VASCO_TIME";
    public static final java.lang.String _SERVER_OTP = "SERVER_OTP";
    public static final java.lang.String _OATH_TIME = "OATH_TIME";
    public static final java.lang.String _SMS_OTP = "SMS_OTP";
    public static final java.lang.String _VOICE_OTP = "VOICE_OTP";
    public static final java.lang.String _SECURID = "SECURID";
    public static final AdapterType OATH_EVENT_BASIC = new AdapterType(_OATH_EVENT_BASIC);
    public static final AdapterType OATH_EVENT_ADVANCED_1 = new AdapterType(_OATH_EVENT_ADVANCED_1);
    public static final AdapterType OATH_EVENT_ADVANCED_2 = new AdapterType(_OATH_EVENT_ADVANCED_2);
    public static final AdapterType VASCO_TIME = new AdapterType(_VASCO_TIME);
    public static final AdapterType SERVER_OTP = new AdapterType(_SERVER_OTP);
    public static final AdapterType OATH_TIME = new AdapterType(_OATH_TIME);
    public static final AdapterType SMS_OTP = new AdapterType(_SMS_OTP);
    public static final AdapterType VOICE_OTP = new AdapterType(_VOICE_OTP);
    public static final AdapterType SECURID = new AdapterType(_SECURID);
    public java.lang.String getValue() { return _value_;}
    public static AdapterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdapterType enumeration = (AdapterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdapterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdapterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AdapterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
