/**
 * AuthenticationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices.auth;

public class AuthenticationServiceLocator extends org.apache.axis.client.Service implements com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationService {

    public AuthenticationServiceLocator() {
    }


    public AuthenticationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AuthenticationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AuthenticationServicePort
    private java.lang.String AuthenticationServicePort_address = "https://userservices-auth.vip.symantec.com/vipuserservices/AuthenticationService_1_4";

    public java.lang.String getAuthenticationServicePortAddress() {
        return AuthenticationServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AuthenticationServicePortWSDDServiceName = "AuthenticationServicePort";

    public java.lang.String getAuthenticationServicePortWSDDServiceName() {
        return AuthenticationServicePortWSDDServiceName;
    }

    public void setAuthenticationServicePortWSDDServiceName(java.lang.String name) {
        AuthenticationServicePortWSDDServiceName = name;
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServicePort getAuthenticationServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AuthenticationServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAuthenticationServicePort(endpoint);
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServicePort getAuthenticationServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServiceSoapBindingStub _stub = new com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAuthenticationServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAuthenticationServicePortEndpointAddress(java.lang.String address) {
        AuthenticationServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServicePort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServiceSoapBindingStub _stub = new com.symantec.schemas.vip._2011._04.vipuserservices.auth.AuthenticationServiceSoapBindingStub(new java.net.URL(AuthenticationServicePort_address), this);
                _stub.setPortName(getAuthenticationServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AuthenticationServicePort".equals(inputPortName)) {
            return getAuthenticationServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices/auth", "AuthenticationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices/auth", "AuthenticationServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AuthenticationServicePort".equals(portName)) {
            setAuthenticationServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
