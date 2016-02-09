/**
 * NetworkIntelligenceTypeTokenState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;

public class NetworkIntelligenceTypeTokenState  implements java.io.Serializable {
    private int total;

    private com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenStateReason[] reason;

    private com.verisign.www._2006._08.vipservice.TokenStatusType type;  // attribute

    public NetworkIntelligenceTypeTokenState() {
    }

    public NetworkIntelligenceTypeTokenState(
           int total,
           com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenStateReason[] reason,
           com.verisign.www._2006._08.vipservice.TokenStatusType type) {
           this.total = total;
           this.reason = reason;
           this.type = type;
    }


    /**
     * Gets the total value for this NetworkIntelligenceTypeTokenState.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this NetworkIntelligenceTypeTokenState.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the reason value for this NetworkIntelligenceTypeTokenState.
     * 
     * @return reason
     */
    public com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenStateReason[] getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this NetworkIntelligenceTypeTokenState.
     * 
     * @param reason
     */
    public void setReason(com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenStateReason[] reason) {
        this.reason = reason;
    }

    public com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenStateReason getReason(int i) {
        return this.reason[i];
    }

    public void setReason(int i, com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenStateReason _value) {
        this.reason[i] = _value;
    }


    /**
     * Gets the type value for this NetworkIntelligenceTypeTokenState.
     * 
     * @return type
     */
    public com.verisign.www._2006._08.vipservice.TokenStatusType getType() {
        return type;
    }


    /**
     * Sets the type value for this NetworkIntelligenceTypeTokenState.
     * 
     * @param type
     */
    public void setType(com.verisign.www._2006._08.vipservice.TokenStatusType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkIntelligenceTypeTokenState)) return false;
        NetworkIntelligenceTypeTokenState other = (NetworkIntelligenceTypeTokenState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.total == other.getTotal() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              java.util.Arrays.equals(this.reason, other.getReason()))) &&
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
        _hashCode += getTotal();
        if (getReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkIntelligenceTypeTokenState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">NetworkIntelligenceType>TokenState"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenStatusType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">>NetworkIntelligenceType>TokenState>Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
