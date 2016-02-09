/**
 * ResponseWithStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Generic Status response for the UA Web Service.
 *            		    Status Response messages also contains a status indicating
 * success or cause of failure.
 */
public class ResponseWithStatusType  extends com.verisign.www._2006._08.vipservice.ResponseAbstractType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.StatusType status;

    public ResponseWithStatusType() {
    }

    public ResponseWithStatusType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status) {
        super(
            version,
            requestId);
        this.status = status;
    }


    /**
     * Gets the status value for this ResponseWithStatusType.
     * 
     * @return status
     */
    public com.verisign.www._2006._08.vipservice.StatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResponseWithStatusType.
     * 
     * @param status
     */
    public void setStatus(com.verisign.www._2006._08.vipservice.StatusType status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseWithStatusType)) return false;
        ResponseWithStatusType other = (ResponseWithStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseWithStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ResponseWithStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "StatusType"));
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
