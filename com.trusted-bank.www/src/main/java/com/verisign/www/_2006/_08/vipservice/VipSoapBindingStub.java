/**
 * VipSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;

public class VipSoapBindingStub extends org.apache.axis.client.Stub implements com.verisign.www._2006._08.vipservice.VipSoapInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[23];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServerTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetServerTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetServerTimeType"), com.verisign.www._2006._08.vipservice.GetServerTimeType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetServerTimeResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.GetServerTimeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetServerTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ActivateToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ActivateTokenType"), com.verisign.www._2006._08.vipservice.ActivateTokenType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ActivateTokenResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.ActivateTokenResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ActivateTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeactivateToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeactivateToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeactivateTokenType"), com.verisign.www._2006._08.vipservice.DeactivateTokenType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeactivateTokenResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.DeactivateTokenResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeactivateTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnableToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "EnableToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "EnableTokenType"), com.verisign.www._2006._08.vipservice.EnableTokenType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "EnableTokenResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.EnableTokenResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "EnableTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisableToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DisableToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DisableTokenType"), com.verisign.www._2006._08.vipservice.DisableTokenType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DisableTokenResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.DisableTokenResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DisableTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnlockToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UnlockToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UnlockTokenType"), com.verisign.www._2006._08.vipservice.UnlockTokenType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UnlockTokenResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.UnlockTokenResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UnlockTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Validate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateType"), com.verisign.www._2006._08.vipservice.ValidateType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.ValidateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Synchronize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Synchronize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SynchronizeType"), com.verisign.www._2006._08.vipservice.SynchronizeType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SynchronizeResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.SynchronizeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SynchronizeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateMultiple");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultiple"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultipleType"), com.verisign.www._2006._08.vipservice.ValidateMultipleType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultipleResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.ValidateMultipleResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultipleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "CheckOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "CheckOTPType"), com.verisign.www._2006._08.vipservice.CheckOTPType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "CheckOTPResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.CheckOTPResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "CheckOTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetTemporaryPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPasswordType"), com.verisign.www._2006._08.vipservice.SetTemporaryPasswordType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPasswordResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.SetTemporaryPasswordResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetTemporaryPwdExpiration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPwdExpiration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPwdExpirationType"), com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPwdExpirationResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPwdExpirationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTemporaryPwdExpiration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTemporaryPwdExpiration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTemporaryPwdExpirationType"), com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTemporaryPwdExpirationResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTemporaryPwdExpirationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTokenInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTokenInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTokenInformationType"), com.verisign.www._2006._08.vipservice.GetTokenInformationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTokenInformationResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.GetTokenInformationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTokenInformationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAdminCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetAdminCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetAdminCodeType"), com.verisign.www._2006._08.vipservice.GetAdminCodeType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetAdminCodeResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.GetAdminCodeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetAdminCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendOTPType"), com.verisign.www._2006._08.vipservice.SendOTPType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendOTPResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.SendOTPResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendOTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Register");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "Register"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "RegisterType"), com.verisign.www._2006._08.vipservice.RegisterType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "RegisterResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.RegisterResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "RegisterResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendTemporaryPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendTemporaryPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendTemporaryPasswordType"), com.verisign.www._2006._08.vipservice.SendTemporaryPasswordType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendTemporaryPasswordResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.SendTemporaryPasswordResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendTemporaryPasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GenerateTemporaryPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPasswordType"), com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPasswordResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmitTxnVerification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerificationType"), com.verisign.www._2006._08.vipservice.SubmitTxnVerificationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerificationResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.SubmitTxnVerificationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PollTxnVerification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PollTxnVerification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PollTxnVerificationType"), com.verisign.www._2006._08.vipservice.PollTxnVerificationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PollTxnVerificationResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.PollTxnVerificationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PollTxnVerificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliverTxnOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliverTxnOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliverTxnOTPType"), com.verisign.www._2006._08.vipservice.DeliverTxnOTPType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliverTxnOTPResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.DeliverTxnOTPResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliverTxnOTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyTxnOTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VerifyTxnOTP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VerifyTxnOTPType"), com.verisign.www._2006._08.vipservice.VerifyTxnOTPType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VerifyTxnOTPResponseType"));
        oper.setReturnClass(com.verisign.www._2006._08.vipservice.VerifyTxnOTPResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VerifyTxnOTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

    }

    public VipSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public VipSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public VipSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">>NetworkIntelligenceType>TokenState>Reason");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenStateReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">GatewayAcctInfoType>Id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">GatewayAcctInfoType>Password");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", ">NetworkIntelligenceType>TokenState");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.NetworkIntelligenceTypeTokenState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AccountRequestAbstractType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.AccountRequestAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AccountType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ActivateTokenResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ActivateTokenResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ActivateTokenType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ActivateTokenType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AdapterType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.AdapterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "AuthentifyVoiceDeliveryInfoType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.AuthentifyVoiceDeliveryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "CheckOTPResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.CheckOTPResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "CheckOTPType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.CheckOTPType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeactivateTokenResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DeactivateTokenResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeactivateTokenType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DeactivateTokenType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliverTxnOTPResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DeliverTxnOTPResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliverTxnOTPType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DeliverTxnOTPType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DeliveryInfoForVendorType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DeliveryInfoForVendorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DestinationType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DestinationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DisableTokenResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DisableTokenResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "DisableTokenType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.DisableTokenType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "EnableTokenResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.EnableTokenResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "EnableTokenType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.EnableTokenType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GatewayAcctInfoType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GatewayAcctInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPasswordResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GenerateTemporaryPasswordType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetAdminCodeResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetAdminCodeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetAdminCodeType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetAdminCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetServerTimeResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetServerTimeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetServerTimeType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetServerTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTemporaryPwdExpirationResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTemporaryPwdExpirationType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTokenInformationResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetTokenInformationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "GetTokenInformationType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.GetTokenInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "IdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "LanguageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "MessageAbstractType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.MessageAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NameValuePairType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.NameValuePairType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "NetworkIntelligenceType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.NetworkIntelligenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "OTPType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PhoneNumberType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PollTxnVerificationResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.PollTxnVerificationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "PollTxnVerificationType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.PollTxnVerificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ReasonType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ReasonType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "RegisterResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.RegisterResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "RegisterType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.RegisterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "RequestAbstractType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.RequestAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "RequestCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ResponseAbstractType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ResponseAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ResponseWithStatusType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ResponseWithStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendOTPResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SendOTPResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendOTPType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SendOTPType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendTemporaryPasswordResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SendTemporaryPasswordResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SendTemporaryPasswordType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SendTemporaryPasswordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPasswordResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SetTemporaryPasswordResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPasswordType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SetTemporaryPasswordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPwdExpirationResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SetTemporaryPwdExpirationType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SMSDeliveryInfoType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SMSDeliveryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SMSFromType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerificationResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SubmitTxnVerificationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SubmitTxnVerificationType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SubmitTxnVerificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SynchronizeResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SynchronizeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "SynchronizeType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.SynchronizeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TemplateNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TempPwdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenIdType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.TokenIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenInformationType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.TokenInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenRequestType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.TokenRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenStatusType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.TokenStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TokenType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.TokenType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TxnIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "TxnOTPType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UnlockTokenResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.UnlockTokenResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "UnlockTokenType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.UnlockTokenType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultipleResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ValidateMultipleResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateMultipleType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ValidateMultipleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ValidateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "ValidateType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.ValidateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VerifyTxnOTPResponseType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.VerifyTxnOTPResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VerifyTxnOTPType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.VerifyTxnOTPType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VersionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "VoiceDeliveryInfoType");
            cachedSerQNames.add(qName);
            cls = com.verisign.www._2006._08.vipservice.VoiceDeliveryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.verisign.www._2006._08.vipservice.GetServerTimeResponseType getServerTime(com.verisign.www._2006._08.vipservice.GetServerTimeType getServerTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetServerTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getServerTime});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.GetServerTimeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.GetServerTimeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.GetServerTimeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.ActivateTokenResponseType activateToken(com.verisign.www._2006._08.vipservice.ActivateTokenType activateToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActivateToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activateToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.ActivateTokenResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.ActivateTokenResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.ActivateTokenResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.DeactivateTokenResponseType deactivateToken(com.verisign.www._2006._08.vipservice.DeactivateTokenType deactivateToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeactivateToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deactivateToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.DeactivateTokenResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.DeactivateTokenResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.DeactivateTokenResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.EnableTokenResponseType enableToken(com.verisign.www._2006._08.vipservice.EnableTokenType enableToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EnableToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {enableToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.EnableTokenResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.EnableTokenResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.EnableTokenResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.DisableTokenResponseType disableToken(com.verisign.www._2006._08.vipservice.DisableTokenType disableToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DisableToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {disableToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.DisableTokenResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.DisableTokenResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.DisableTokenResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.UnlockTokenResponseType unlockToken(com.verisign.www._2006._08.vipservice.UnlockTokenType unlockToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnlockToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unlockToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.UnlockTokenResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.UnlockTokenResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.UnlockTokenResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.ValidateResponseType validate(com.verisign.www._2006._08.vipservice.ValidateType validate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Validate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.ValidateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.ValidateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.ValidateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.SynchronizeResponseType synchronize(com.verisign.www._2006._08.vipservice.SynchronizeType synchronize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Synchronize"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {synchronize});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.SynchronizeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.SynchronizeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.SynchronizeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.ValidateMultipleResponseType validateMultiple(com.verisign.www._2006._08.vipservice.ValidateMultipleType validateMultiple) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ValidateMultiple"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validateMultiple});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.ValidateMultipleResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.ValidateMultipleResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.ValidateMultipleResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.CheckOTPResponseType checkOTP(com.verisign.www._2006._08.vipservice.CheckOTPType checkOTP) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {checkOTP});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.CheckOTPResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.CheckOTPResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.CheckOTPResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.SetTemporaryPasswordResponseType setTemporaryPassword(com.verisign.www._2006._08.vipservice.SetTemporaryPasswordType setTemporaryPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetTemporaryPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setTemporaryPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.SetTemporaryPasswordResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.SetTemporaryPasswordResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.SetTemporaryPasswordResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationResponseType setTemporaryPwdExpiration(com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationType setTemporaryPwdExpiration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetTemporaryPwdExpiration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setTemporaryPwdExpiration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationResponseType getTemporaryPwdExpiration(com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationType getTemporaryPwdExpiration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTemporaryPwdExpiration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTemporaryPwdExpiration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.GetTokenInformationResponseType getTokenInformation(com.verisign.www._2006._08.vipservice.GetTokenInformationType getTokenInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTokenInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTokenInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.GetTokenInformationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.GetTokenInformationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.GetTokenInformationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.GetAdminCodeResponseType getAdminCode(com.verisign.www._2006._08.vipservice.GetAdminCodeType getAdminCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAdminCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAdminCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.GetAdminCodeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.GetAdminCodeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.GetAdminCodeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.SendOTPResponseType sendOTP(com.verisign.www._2006._08.vipservice.SendOTPType sendOTP) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SendOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendOTP});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.SendOTPResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.SendOTPResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.SendOTPResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.RegisterResponseType register(com.verisign.www._2006._08.vipservice.RegisterType register) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Register"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {register});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.RegisterResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.RegisterResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.RegisterResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.SendTemporaryPasswordResponseType sendTemporaryPassword(com.verisign.www._2006._08.vipservice.SendTemporaryPasswordType sendTemporaryPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SendTemporaryPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendTemporaryPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.SendTemporaryPasswordResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.SendTemporaryPasswordResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.SendTemporaryPasswordResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordResponseType generateTemporaryPassword(com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordType generateTemporaryPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GenerateTemporaryPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {generateTemporaryPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.SubmitTxnVerificationResponseType submitTxnVerification(com.verisign.www._2006._08.vipservice.SubmitTxnVerificationType submitTxnVerification) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubmitTxnVerification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {submitTxnVerification});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.SubmitTxnVerificationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.SubmitTxnVerificationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.SubmitTxnVerificationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.PollTxnVerificationResponseType pollTxnVerification(com.verisign.www._2006._08.vipservice.PollTxnVerificationType pollTxnVerification) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PollTxnVerification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pollTxnVerification});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.PollTxnVerificationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.PollTxnVerificationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.PollTxnVerificationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.DeliverTxnOTPResponseType deliverTxnOTP(com.verisign.www._2006._08.vipservice.DeliverTxnOTPType deliverTxnOTP) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeliverTxnOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deliverTxnOTP});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.DeliverTxnOTPResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.DeliverTxnOTPResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.DeliverTxnOTPResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.verisign.www._2006._08.vipservice.VerifyTxnOTPResponseType verifyTxnOTP(com.verisign.www._2006._08.vipservice.VerifyTxnOTPType verifyTxnOTP) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VerifyTxnOTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {verifyTxnOTP});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.verisign.www._2006._08.vipservice.VerifyTxnOTPResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.verisign.www._2006._08.vipservice.VerifyTxnOTPResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.verisign.www._2006._08.vipservice.VerifyTxnOTPResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
