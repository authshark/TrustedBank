/**
 * TokenInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;


/**
 * Contains the information about a token.
 */
public class TokenInformationType  implements java.io.Serializable {
    private com.verisign.www._2006._08.vipservice.TokenIdType tokenId;

    private java.lang.String tokenKind;

    private com.verisign.www._2006._08.vipservice.AdapterType adapter;

    private com.verisign.www._2006._08.vipservice.TokenStatusType tokenStatus;

    private java.util.Calendar expirationDate;

    private java.util.Calendar tempPasswordExpirationDate;

    private java.lang.Boolean tempPasswordOneTimeUse;

    private java.util.Calendar lastUpdate;

    private java.math.BigInteger serverOTPExpires;

    private java.lang.String tokenGroupId;

    private java.lang.Boolean owner;

    private com.verisign.www._2006._08.vipservice.ReasonType reportedReason;

    public TokenInformationType() {
    }

    public TokenInformationType(
           com.verisign.www._2006._08.vipservice.TokenIdType tokenId,
           java.lang.String tokenKind,
           com.verisign.www._2006._08.vipservice.AdapterType adapter,
           com.verisign.www._2006._08.vipservice.TokenStatusType tokenStatus,
           java.util.Calendar expirationDate,
           java.util.Calendar tempPasswordExpirationDate,
           java.lang.Boolean tempPasswordOneTimeUse,
           java.util.Calendar lastUpdate,
           java.math.BigInteger serverOTPExpires,
           java.lang.String tokenGroupId,
           java.lang.Boolean owner,
           com.verisign.www._2006._08.vipservice.ReasonType reportedReason) {
           this.tokenId = tokenId;
           this.tokenKind = tokenKind;
           this.adapter = adapter;
           this.tokenStatus = tokenStatus;
           this.expirationDate = expirationDate;
           this.tempPasswordExpirationDate = tempPasswordExpirationDate;
           this.tempPasswordOneTimeUse = tempPasswordOneTimeUse;
           this.lastUpdate = lastUpdate;
           this.serverOTPExpires = serverOTPExpires;
           this.tokenGroupId = tokenGroupId;
           this.owner = owner;
           this.reportedReason = reportedReason;
    }


    /**
     * Gets the tokenId value for this TokenInformationType.
     * 
     * @return tokenId
     */
    public com.verisign.www._2006._08.vipservice.TokenIdType getTokenId() {
        return tokenId;
    }


    /**
     * Sets the tokenId value for this TokenInformationType.
     * 
     * @param tokenId
     */
    public void setTokenId(com.verisign.www._2006._08.vipservice.TokenIdType tokenId) {
        this.tokenId = tokenId;
    }


    /**
     * Gets the tokenKind value for this TokenInformationType.
     * 
     * @return tokenKind
     */
    public java.lang.String getTokenKind() {
        return tokenKind;
    }


    /**
     * Sets the tokenKind value for this TokenInformationType.
     * 
     * @param tokenKind
     */
    public void setTokenKind(java.lang.String tokenKind) {
        this.tokenKind = tokenKind;
    }


    /**
     * Gets the adapter value for this TokenInformationType.
     * 
     * @return adapter
     */
    public com.verisign.www._2006._08.vipservice.AdapterType getAdapter() {
        return adapter;
    }


    /**
     * Sets the adapter value for this TokenInformationType.
     * 
     * @param adapter
     */
    public void setAdapter(com.verisign.www._2006._08.vipservice.AdapterType adapter) {
        this.adapter = adapter;
    }


    /**
     * Gets the tokenStatus value for this TokenInformationType.
     * 
     * @return tokenStatus
     */
    public com.verisign.www._2006._08.vipservice.TokenStatusType getTokenStatus() {
        return tokenStatus;
    }


    /**
     * Sets the tokenStatus value for this TokenInformationType.
     * 
     * @param tokenStatus
     */
    public void setTokenStatus(com.verisign.www._2006._08.vipservice.TokenStatusType tokenStatus) {
        this.tokenStatus = tokenStatus;
    }


    /**
     * Gets the expirationDate value for this TokenInformationType.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this TokenInformationType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the tempPasswordExpirationDate value for this TokenInformationType.
     * 
     * @return tempPasswordExpirationDate
     */
    public java.util.Calendar getTempPasswordExpirationDate() {
        return tempPasswordExpirationDate;
    }


    /**
     * Sets the tempPasswordExpirationDate value for this TokenInformationType.
     * 
     * @param tempPasswordExpirationDate
     */
    public void setTempPasswordExpirationDate(java.util.Calendar tempPasswordExpirationDate) {
        this.tempPasswordExpirationDate = tempPasswordExpirationDate;
    }


    /**
     * Gets the tempPasswordOneTimeUse value for this TokenInformationType.
     * 
     * @return tempPasswordOneTimeUse
     */
    public java.lang.Boolean getTempPasswordOneTimeUse() {
        return tempPasswordOneTimeUse;
    }


    /**
     * Sets the tempPasswordOneTimeUse value for this TokenInformationType.
     * 
     * @param tempPasswordOneTimeUse
     */
    public void setTempPasswordOneTimeUse(java.lang.Boolean tempPasswordOneTimeUse) {
        this.tempPasswordOneTimeUse = tempPasswordOneTimeUse;
    }


    /**
     * Gets the lastUpdate value for this TokenInformationType.
     * 
     * @return lastUpdate
     */
    public java.util.Calendar getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this TokenInformationType.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(java.util.Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the serverOTPExpires value for this TokenInformationType.
     * 
     * @return serverOTPExpires
     */
    public java.math.BigInteger getServerOTPExpires() {
        return serverOTPExpires;
    }


    /**
     * Sets the serverOTPExpires value for this TokenInformationType.
     * 
     * @param serverOTPExpires
     */
    public void setServerOTPExpires(java.math.BigInteger serverOTPExpires) {
        this.serverOTPExpires = serverOTPExpires;
    }


    /**
     * Gets the tokenGroupId value for this TokenInformationType.
     * 
     * @return tokenGroupId
     */
    public java.lang.String getTokenGroupId() {
        return tokenGroupId;
    }


    /**
     * Sets the tokenGroupId value for this TokenInformationType.
     * 
     * @param tokenGroupId
     */
    public void setTokenGroupId(java.lang.String tokenGroupId) {
        this.tokenGroupId = tokenGroupId;
    }


    /**
     * Gets the owner value for this TokenInformationType.
     * 
     * @return owner
     */
    public java.lang.Boolean getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this TokenInformationType.
     * 
     * @param owner
     */
    public void setOwner(java.lang.Boolean owner) {
        this.owner = owner;
    }


    /**
     * Gets the reportedReason value for this TokenInformationType.
     * 
     * @return reportedReason
     */
    public com.verisign.www._2006._08.vipservice.ReasonType getReportedReason() {
        return reportedReason;
    }


    /**
     * Sets the reportedReason value for this TokenInformationType.
     * 
     * @param reportedReason
     */
    public void setReportedReason(com.verisign.www._2006._08.vipservice.ReasonType reportedReason) {
        this.reportedReason = reportedReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenInformationType)) return false;
        TokenInformationType other = (TokenInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tokenId==null && other.getTokenId()==null) || 
             (this.tokenId!=null &&
              this.tokenId.equals(other.getTokenId()))) &&
            ((this.tokenKind==null && other.getTokenKind()==null) || 
             (this.tokenKind!=null &&
              this.tokenKind.equals(other.getTokenKind()))) &&
            ((this.adapter==null && other.getAdapter()==null) || 
             (this.adapter!=null &&
              this.adapter.equals(other.getAdapter()))) &&
            ((this.tokenStatus==null && other.getTokenStatus()==null) || 
             (this.tokenStatus!=null &&
              this.tokenStatus.equals(other.getTokenStatus()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.tempPasswordExpirationDate==null && other.getTempPasswordExpirationDate()==null) || 
             (this.tempPasswordExpirationDate!=null &&
              this.tempPasswordExpirationDate.equals(other.getTempPasswordExpirationDate()))) &&
            ((this.tempPasswordOneTimeUse==null && other.getTempPasswordOneTimeUse()==null) || 
             (this.tempPasswordOneTimeUse!=null &&
              this.tempPasswordOneTimeUse.equals(other.getTempPasswordOneTimeUse()))) &&
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            ((this.serverOTPExpires==null && other.getServerOTPExpires()==null) || 
             (this.serverOTPExpires!=null &&
              this.serverOTPExpires.equals(other.getServerOTPExpires()))) &&
            ((this.tokenGroupId==null && other.getTokenGroupId()==null) || 
             (this.tokenGroupId!=null &&
              this.tokenGroupId.equals(other.getTokenGroupId()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.reportedReason==null && other.getReportedReason()==null) || 
             (this.reportedReason!=null &&
              this.reportedReason.equals(other.getReportedReason())));
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
        if (getTokenId() != null) {
            _hashCode += getTokenId().hashCode();
        }
        if (getTokenKind() != null) {
            _hashCode += getTokenKind().hashCode();
        }
        if (getAdapter() != null) {
            _hashCode += getAdapter().hashCode();
        }
        if (getTokenStatus() != null) {
            _hashCode += getTokenStatus().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getTempPasswordExpirationDate() != null) {
            _hashCode += getTempPasswordExpirationDate().hashCode();
        }
        if (getTempPasswordOneTimeUse() != null) {
            _hashCode += getTempPasswordOneTimeUse().hashCode();
        }
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        if (getServerOTPExpires() != null) {
            _hashCode += getServerOTPExpires().hashCode();
        }
        if (getTokenGroupId() != null) {
            _hashCode += getTokenGroupId().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getReportedReason() != null) {
            _hashCode += getReportedReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenIdType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenKind");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Adapter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AdapterType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempPasswordExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TempPasswordExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempPasswordOneTimeUse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TempPasswordOneTimeUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "LastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverOTPExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ServerOTPExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ReportedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ReasonType"));
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
