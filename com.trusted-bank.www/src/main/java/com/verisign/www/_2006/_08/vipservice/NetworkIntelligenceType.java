/**
 * NetworkIntelligenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Contains the network intelligence information for a specific token.
 */
public class NetworkIntelligenceType  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort numberOfParties;

    private com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenState[] tokenState;

    private org.apache.axis.types.UnsignedShort globalFailureCount;

    public NetworkIntelligenceType() {
    }

    public NetworkIntelligenceType(
           org.apache.axis.types.UnsignedShort numberOfParties,
           com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenState[] tokenState,
           org.apache.axis.types.UnsignedShort globalFailureCount) {
           this.numberOfParties = numberOfParties;
           this.tokenState = tokenState;
           this.globalFailureCount = globalFailureCount;
    }


    /**
     * Gets the numberOfParties value for this NetworkIntelligenceType.
     * 
     * @return numberOfParties
     */
    public org.apache.axis.types.UnsignedShort getNumberOfParties() {
        return numberOfParties;
    }


    /**
     * Sets the numberOfParties value for this NetworkIntelligenceType.
     * 
     * @param numberOfParties
     */
    public void setNumberOfParties(org.apache.axis.types.UnsignedShort numberOfParties) {
        this.numberOfParties = numberOfParties;
    }


    /**
     * Gets the tokenState value for this NetworkIntelligenceType.
     * 
     * @return tokenState
     */
    public com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenState[] getTokenState() {
        return tokenState;
    }


    /**
     * Sets the tokenState value for this NetworkIntelligenceType.
     * 
     * @param tokenState
     */
    public void setTokenState(com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenState[] tokenState) {
        this.tokenState = tokenState;
    }

    public com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenState getTokenState(int i) {
        return this.tokenState[i];
    }

    public void setTokenState(int i, com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenState _value) {
        this.tokenState[i] = _value;
    }


    /**
     * Gets the globalFailureCount value for this NetworkIntelligenceType.
     * 
     * @return globalFailureCount
     */
    public org.apache.axis.types.UnsignedShort getGlobalFailureCount() {
        return globalFailureCount;
    }


    /**
     * Sets the globalFailureCount value for this NetworkIntelligenceType.
     * 
     * @param globalFailureCount
     */
    public void setGlobalFailureCount(org.apache.axis.types.UnsignedShort globalFailureCount) {
        this.globalFailureCount = globalFailureCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkIntelligenceType)) return false;
        NetworkIntelligenceType other = (NetworkIntelligenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numberOfParties==null && other.getNumberOfParties()==null) || 
             (this.numberOfParties!=null &&
              this.numberOfParties.equals(other.getNumberOfParties()))) &&
            ((this.tokenState==null && other.getTokenState()==null) || 
             (this.tokenState!=null &&
              java.util.Arrays.equals(this.tokenState, other.getTokenState()))) &&
            ((this.globalFailureCount==null && other.getGlobalFailureCount()==null) || 
             (this.globalFailureCount!=null &&
              this.globalFailureCount.equals(other.getGlobalFailureCount())));
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
        if (getNumberOfParties() != null) {
            _hashCode += getNumberOfParties().hashCode();
        }
        if (getTokenState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokenState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokenState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobalFailureCount() != null) {
            _hashCode += getGlobalFailureCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkIntelligenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NetworkIntelligenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfParties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NumberOfParties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">NetworkIntelligenceType>TokenState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalFailureCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GlobalFailureCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
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
