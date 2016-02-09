/**
 * GetTokenInformationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Response to a request to get token information
 */
public class GetTokenInformationResponseType  extends com.verisign.www._2006._08.vipservice.ResponseWithStatusType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.TokenInformationType tokenInformation;

    private com.verisign.www._2006._08.vipservice.NetworkIntelligenceType networkIntelligence;

    public GetTokenInformationResponseType() {
    }

    public GetTokenInformationResponseType(
           java.lang.String version,
           java.lang.String requestId,
           com.verisign.www._2006._08.vipservice.StatusType status,
           com.verisign.www._2006._08.vipservice.TokenInformationType tokenInformation,
           com.verisign.www._2006._08.vipservice.NetworkIntelligenceType networkIntelligence) {
        super(
            version,
            requestId,
            status);
        this.tokenInformation = tokenInformation;
        this.networkIntelligence = networkIntelligence;
    }


    /**
     * Gets the tokenInformation value for this GetTokenInformationResponseType.
     * 
     * @return tokenInformation
     */
    public com.verisign.www._2006._08.vipservice.TokenInformationType getTokenInformation() {
        return tokenInformation;
    }


    /**
     * Sets the tokenInformation value for this GetTokenInformationResponseType.
     * 
     * @param tokenInformation
     */
    public void setTokenInformation(com.verisign.www._2006._08.vipservice.TokenInformationType tokenInformation) {
        this.tokenInformation = tokenInformation;
    }


    /**
     * Gets the networkIntelligence value for this GetTokenInformationResponseType.
     * 
     * @return networkIntelligence
     */
    public com.verisign.www._2006._08.vipservice.NetworkIntelligenceType getNetworkIntelligence() {
        return networkIntelligence;
    }


    /**
     * Sets the networkIntelligence value for this GetTokenInformationResponseType.
     * 
     * @param networkIntelligence
     */
    public void setNetworkIntelligence(com.verisign.www._2006._08.vipservice.NetworkIntelligenceType networkIntelligence) {
        this.networkIntelligence = networkIntelligence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTokenInformationResponseType)) return false;
        GetTokenInformationResponseType other = (GetTokenInformationResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokenInformation==null && other.getTokenInformation()==null) || 
             (this.tokenInformation!=null &&
              this.tokenInformation.equals(other.getTokenInformation()))) &&
            ((this.networkIntelligence==null && other.getNetworkIntelligence()==null) || 
             (this.networkIntelligence!=null &&
              this.networkIntelligence.equals(other.getNetworkIntelligence())));
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
        if (getTokenInformation() != null) {
            _hashCode += getTokenInformation().hashCode();
        }
        if (getNetworkIntelligence() != null) {
            _hashCode += getNetworkIntelligence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTokenInformationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTokenInformationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenInformationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkIntelligence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NetworkIntelligence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NetworkIntelligenceType"));
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
