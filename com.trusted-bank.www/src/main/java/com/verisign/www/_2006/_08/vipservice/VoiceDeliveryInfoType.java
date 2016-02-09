/**
 * VoiceDeliveryInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Contains the elements for voice type
 */
public class VoiceDeliveryInfoType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.DeliveryInfoForVendorType deliveryInfoForVendor;

    public VoiceDeliveryInfoType() {
    }

    public VoiceDeliveryInfoType(
           com.verisign.www._2006._08.vipservice.DeliveryInfoForVendorType deliveryInfoForVendor) {
           this.deliveryInfoForVendor = deliveryInfoForVendor;
    }


    /**
     * Gets the deliveryInfoForVendor value for this VoiceDeliveryInfoType.
     * 
     * @return deliveryInfoForVendor
     */
    public com.verisign.www._2006._08.vipservice.DeliveryInfoForVendorType getDeliveryInfoForVendor() {
        return deliveryInfoForVendor;
    }


    /**
     * Sets the deliveryInfoForVendor value for this VoiceDeliveryInfoType.
     * 
     * @param deliveryInfoForVendor
     */
    public void setDeliveryInfoForVendor(com.verisign.www._2006._08.vipservice.DeliveryInfoForVendorType deliveryInfoForVendor) {
        this.deliveryInfoForVendor = deliveryInfoForVendor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoiceDeliveryInfoType)) return false;
        VoiceDeliveryInfoType other = (VoiceDeliveryInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryInfoForVendor==null && other.getDeliveryInfoForVendor()==null) || 
             (this.deliveryInfoForVendor!=null &&
              this.deliveryInfoForVendor.equals(other.getDeliveryInfoForVendor())));
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
        if (getDeliveryInfoForVendor() != null) {
            _hashCode += getDeliveryInfoForVendor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoiceDeliveryInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VoiceDeliveryInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInfoForVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliveryInfoForVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliveryInfoForVendorType"));
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
