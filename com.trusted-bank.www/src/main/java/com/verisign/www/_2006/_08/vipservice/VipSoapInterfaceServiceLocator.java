/**
 * VipSoapInterfaceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.verisign.www._2006._08.vipservice;

public class VipSoapInterfaceServiceLocator extends org.apache.axis.client.Service implements com.verisign.www._2006._08.vipservice.VipSoapInterfaceService {

    public VipSoapInterfaceServiceLocator() {
    }


    public VipSoapInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VipSoapInterfaceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for vipServiceAPI
    private java.lang.String vipServiceAPI_address = "https://vipservices-auth.verisign.com/prov/soap";

    public java.lang.String getvipServiceAPIAddress() {
        return vipServiceAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String vipServiceAPIWSDDServiceName = "vipServiceAPI";

    public java.lang.String getvipServiceAPIWSDDServiceName() {
        return vipServiceAPIWSDDServiceName;
    }

    public void setvipServiceAPIWSDDServiceName(java.lang.String name) {
        vipServiceAPIWSDDServiceName = name;
    }

    public com.verisign.www._2006._08.vipservice.VipSoapInterface getvipServiceAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(vipServiceAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getvipServiceAPI(endpoint);
    }

    public com.verisign.www._2006._08.vipservice.VipSoapInterface getvipServiceAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.verisign.www._2006._08.vipservice.VipSoapBindingStub _stub = new com.verisign.www._2006._08.vipservice.VipSoapBindingStub(portAddress, this);
            _stub.setPortName(getvipServiceAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setvipServiceAPIEndpointAddress(java.lang.String address) {
        vipServiceAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.verisign.www._2006._08.vipservice.VipSoapInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.verisign.www._2006._08.vipservice.VipSoapBindingStub _stub = new com.verisign.www._2006._08.vipservice.VipSoapBindingStub(new java.net.URL(vipServiceAPI_address), this);
                _stub.setPortName(getvipServiceAPIWSDDServiceName());
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
        if ("vipServiceAPI".equals(inputPortName)) {
            return getvipServiceAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "vipSoapInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.verisign.com/2006/08/vipservice", "vipServiceAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("vipServiceAPI".equals(portName)) {
            setvipServiceAPIEndpointAddress(address);
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
