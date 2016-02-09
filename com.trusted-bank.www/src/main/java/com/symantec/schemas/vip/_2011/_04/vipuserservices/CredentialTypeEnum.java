/**
 * CredentialTypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class CredentialTypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CredentialTypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STANDARD_OTP = "STANDARD_OTP";
    public static final java.lang.String _SMS_OTP = "SMS_OTP";
    public static final java.lang.String _VOICE_OTP = "VOICE_OTP";
    public static final java.lang.String _SERVICE_OTP = "SERVICE_OTP";
    public static final java.lang.String _CERTIFICATE = "CERTIFICATE";
    public static final java.lang.String _IA = "IA";
    public static final CredentialTypeEnum STANDARD_OTP = new CredentialTypeEnum(_STANDARD_OTP);
    public static final CredentialTypeEnum SMS_OTP = new CredentialTypeEnum(_SMS_OTP);
    public static final CredentialTypeEnum VOICE_OTP = new CredentialTypeEnum(_VOICE_OTP);
    public static final CredentialTypeEnum SERVICE_OTP = new CredentialTypeEnum(_SERVICE_OTP);
    public static final CredentialTypeEnum CERTIFICATE = new CredentialTypeEnum(_CERTIFICATE);
    public static final CredentialTypeEnum IA = new CredentialTypeEnum(_IA);
    public java.lang.String getValue() { return _value_;}
    public static CredentialTypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CredentialTypeEnum enumeration = (CredentialTypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CredentialTypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CredentialTypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialTypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
