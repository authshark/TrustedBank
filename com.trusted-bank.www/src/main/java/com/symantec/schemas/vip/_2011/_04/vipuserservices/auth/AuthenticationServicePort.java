/**
 * AuthenticationServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices.auth;

public interface AuthenticationServicePort extends java.rmi.Remote {
    public com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserResponseType authenticateUser(com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserRequestType authenticateUserRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserWithPushResponseType authenticateUserWithPush(com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserWithPushRequestType authenticateUserWithPushRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateCredentialsResponseType authenticateCredentials(com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateCredentialsRequestType authenticateCredentialsRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.EvaluateRiskResponseType evaluateRisk(com.symantec.schemas.vip._2011._04.vipuserservices.EvaluateRiskRequestType evaluateRiskRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.CheckOtpResponseType checkOtp(com.symantec.schemas.vip._2011._04.vipuserservices.CheckOtpRequestType checkOtpRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.ConfirmRiskResponseType confirmRisk(com.symantec.schemas.vip._2011._04.vipuserservices.ConfirmRiskRequestType confirmRiskRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.DenyRiskResponseType denyRisk(com.symantec.schemas.vip._2011._04.vipuserservices.DenyRiskRequestType denyRiskRequest) throws java.rmi.RemoteException;
}
