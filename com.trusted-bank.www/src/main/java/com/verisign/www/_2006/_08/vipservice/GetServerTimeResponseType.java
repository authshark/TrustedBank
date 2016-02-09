/**
 * GetServerTimeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Response to get server time.
 */
public class GetServerTimeResponseType  extends com.verisign.www._2006._08.vipservice.ResponseWithStatusType  implements java.io.Serializable {
    private java.util.Calendar timestamp;

    private java.lang.String UTCTimestamp;

    public GetServerTimeResponseType() {
    }

    public GetServerTimeResponseType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status,
           java.util.Calendar timestamp,
           java.lang.String UTCTimestamp) {
        super(
            version,
            requestId,
            status);
        this.timestamp = timestamp;
        this.UTCTimestamp = UTCTimestamp;
    }


    /**
     * Gets the timestamp value for this GetServerTimeResponseType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this GetServerTimeResponseType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the UTCTimestamp value for this GetServerTimeResponseType.
     * 
     * @return UTCTimestamp
     */
    public java.lang.String getUTCTimestamp() {
        return UTCTimestamp;
    }


    /**
     * Sets the UTCTimestamp value for this GetServerTimeResponseType.
     * 
     * @param UTCTimestamp
     */
    public void setUTCTimestamp(java.lang.String UTCTimestamp) {
        this.UTCTimestamp = UTCTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServerTimeResponseType)) return false;
        GetServerTimeResponseType other = (GetServerTimeResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.UTCTimestamp==null && other.getUTCTimestamp()==null) || 
             (this.UTCTimestamp!=null &&
              this.UTCTimestamp.equals(other.getUTCTimestamp())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getUTCTimestamp() != null) {
            _hashCode += getUTCTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetServerTimeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetServerTimeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UTCTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UTCTimestamp"));
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
