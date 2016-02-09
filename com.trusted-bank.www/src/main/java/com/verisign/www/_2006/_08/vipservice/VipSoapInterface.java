/**
 * VipSoapInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;

public interface VipSoapInterface extends java.rmi.Remote {
    public com.verisign.www._2006._08.vipservice.GetServerTimeResponseType getServerTime(com.verisign.www._2006._08.vipservice.GetServerTimeType getServerTime) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.ActivateTokenResponseType activateToken(com.verisign.www._2006._08.vipservice.ActivateTokenType activateToken) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.DeactivateTokenResponseType deactivateToken(com.verisign.www._2006._08.vipservice.DeactivateTokenType deactivateToken) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.EnableTokenResponseType enableToken(com.verisign.www._2006._08.vipservice.EnableTokenType enableToken) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.DisableTokenResponseType disableToken(com.verisign.www._2006._08.vipservice.DisableTokenType disableToken) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.UnlockTokenResponseType unlockToken(com.verisign.www._2006._08.vipservice.UnlockTokenType unlockToken) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.ValidateResponseType validate(com.verisign.www._2006._08.vipservice.ValidateType validate) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.SynchronizeResponseType synchronize(com.verisign.www._2006._08.vipservice.SynchronizeType synchronize) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.ValidateMultipleResponseType validateMultiple(com.verisign.www._2006._08.vipservice.ValidateMultipleType validateMultiple) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.CheckOTPResponseType checkOTP(com.verisign.www._2006._08.vipservice.CheckOTPType checkOTP) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.SetTemporaryPasswordResponseType setTemporaryPassword(com.verisign.www._2006._08.vipservice.SetTemporaryPasswordType setTemporaryPassword) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationResponseType setTemporaryPwdExpiration(com.verisign.www._2006._08.vipservice.SetTemporaryPwdExpirationType setTemporaryPwdExpiration) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationResponseType getTemporaryPwdExpiration(com.verisign.www._2006._08.vipservice.GetTemporaryPwdExpirationType getTemporaryPwdExpiration) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.GetTokenInformationResponseType getTokenInformation(com.verisign.www._2006._08.vipservice.GetTokenInformationType getTokenInformation) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.GetAdminCodeResponseType getAdminCode(com.verisign.www._2006._08.vipservice.GetAdminCodeType getAdminCode) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.SendOTPResponseType sendOTP(com.verisign.www._2006._08.vipservice.SendOTPType sendOTP) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.RegisterResponseType register(com.verisign.www._2006._08.vipservice.RegisterType register) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.SendTemporaryPasswordResponseType sendTemporaryPassword(com.verisign.www._2006._08.vipservice.SendTemporaryPasswordType sendTemporaryPassword) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordResponseType generateTemporaryPassword(com.verisign.www._2006._08.vipservice.GenerateTemporaryPasswordType generateTemporaryPassword) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.SubmitTxnVerificationResponseType submitTxnVerification(com.verisign.www._2006._08.vipservice.SubmitTxnVerificationType submitTxnVerification) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.PollTxnVerificationResponseType pollTxnVerification(com.verisign.www._2006._08.vipservice.PollTxnVerificationType pollTxnVerification) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.DeliverTxnOTPResponseType deliverTxnOTP(com.verisign.www._2006._08.vipservice.DeliverTxnOTPType deliverTxnOTP) throws java.rmi.RemoteException;
    public com.verisign.www._2006._08.vipservice.VerifyTxnOTPResponseType verifyTxnOTP(com.verisign.www._2006._08.vipservice.VerifyTxnOTPType verifyTxnOTP) throws java.rmi.RemoteException;
}
