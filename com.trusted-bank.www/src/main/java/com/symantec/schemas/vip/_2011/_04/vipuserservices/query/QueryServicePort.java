/**
 * QueryServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices.query;

public interface QueryServicePort extends java.rmi.Remote {
    public com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeResponseType getServerTime(com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeRequestType getServerTimeRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoResponseType getUserInfo(com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoRequestType getUserInfoRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoResponseType getCredentialInfo(com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoRequestType getCredentialInfoRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesResponseType getTemporaryPasswordAttributes(com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesRequestType getTemporaryPasswordAttributesRequest) throws java.rmi.RemoteException;
    public com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusResponseType pollPushStatus(com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusRequestType pollPushStatusRequest) throws java.rmi.RemoteException;
}
