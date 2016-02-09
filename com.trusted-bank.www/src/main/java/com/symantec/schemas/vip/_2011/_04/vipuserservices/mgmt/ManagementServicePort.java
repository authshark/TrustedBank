/**
 * ManagementServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices.mgmt;

public interface ManagementServicePort extends java.rmi.Remote {
    public com.symantec.schemas.vip._2011._04.vipuserservices.CreateUserResponseType createUser(com.symantec.schemas.vip._2011._04.vipuserservices.CreateUserRequestType createUserRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.UpdateUserResponseType updateUser(com.symantec.schemas.vip._2011._04.vipuserservices.UpdateUserRequestType updateUserRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.DeleteUserResponseType deleteUser(com.symantec.schemas.vip._2011._04.vipuserservices.DeleteUserRequestType deleteUserRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.ClearUserPinResponseType clearUserPin(com.symantec.schemas.vip._2011._04.vipuserservices.ClearUserPinRequestType clearUserPinRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.AddCredentialResponseType addCredential(com.symantec.schemas.vip._2011._04.vipuserservices.AddCredentialRequestType addCredentialRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.UpdateCredentialResponseType updateCredential(com.symantec.schemas.vip._2011._04.vipuserservices.UpdateCredentialRequestType updateCredentialRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.RemoveCredentialResponseType removeCredential(com.symantec.schemas.vip._2011._04.vipuserservices.RemoveCredentialRequestType removeCredentialRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordResponseType setTemporaryPassword(com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordRequestType setTemporaryPasswordRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.ClearTemporaryPasswordResponseType clearTemporaryPassword(com.symantec.schemas.vip._2011._04.vipuserservices.ClearTemporaryPasswordRequestType clearTemporaryPasswordRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordAttributesResponseType setTemporaryPasswordAttributes(com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordAttributesRequestType setTemporaryPasswordAttributesRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.SendOtpResponseType sendOtp(com.symantec.schemas.vip._2011._04.vipuserservices.SendOtpRequestType sendOtpRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.RegisterResponseType register(com.symantec.schemas.vip._2011._04.vipuserservices.RegisterRequestType registerRequest) throws java.rmi.RemoteException;
}
