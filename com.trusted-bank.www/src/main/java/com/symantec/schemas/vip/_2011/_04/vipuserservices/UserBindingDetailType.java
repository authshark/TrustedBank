/**
 * UserBindingDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices;

public class UserBindingDetailType  implements java.io.Serializable {
    private java.lang.String userId;

    private com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum userStatus;

    private com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType bindingDetail;

    public UserBindingDetailType() {
    }

    public UserBindingDetailType(
           java.lang.String userId,
           com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum userStatus,
           com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType bindingDetail) {
           this.userId = userId;
           this.userStatus = userStatus;
           this.bindingDetail = bindingDetail;
    }


    /**
     * Gets the userId value for this UserBindingDetailType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserBindingDetailType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userStatus value for this UserBindingDetailType.
     * 
     * @return userStatus
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum getUserStatus() {
        return userStatus;
    }


    /**
     * Sets the userStatus value for this UserBindingDetailType.
     * 
     * @param userStatus
     */
    public void setUserStatus(com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum userStatus) {
        this.userStatus = userStatus;
    }


    /**
     * Gets the bindingDetail value for this UserBindingDetailType.
     * 
     * @return bindingDetail
     */
    public com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType getBindingDetail() {
        return bindingDetail;
    }


    /**
     * Sets the bindingDetail value for this UserBindingDetailType.
     * 
     * @param bindingDetail
     */
    public void setBindingDetail(com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType bindingDetail) {
        this.bindingDetail = bindingDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserBindingDetailType)) return false;
        UserBindingDetailType other = (UserBindingDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userStatus==null && other.getUserStatus()==null) || 
             (this.userStatus!=null &&
              this.userStatus.equals(other.getUserStatus()))) &&
            ((this.bindingDetail==null && other.getBindingDetail()==null) || 
             (this.bindingDetail!=null &&
              this.bindingDetail.equals(other.getBindingDetail())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserStatus() != null) {
            _hashCode += getUserStatus().hashCode();
        }
        if (getBindingDetail() != null) {
            _hashCode += getBindingDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserBindingDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserBindingDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "userStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "bindingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BindingDetailType"));
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
