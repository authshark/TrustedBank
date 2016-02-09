/**
 * QueryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.symantec.schemas.vip._2011._04.vipuserservices.query;

public class QueryServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.symantec.schemas.vip._2011._04.vipuserservices.query.QueryServicePort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetServerTimeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetServerTimeRequestType"), com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetServerTimeResponseType"));
        oper.setReturnClass(com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetServerTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoRequestType"), com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoResponseType"));
        oper.setReturnClass(com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCredentialInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetCredentialInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetCredentialInfoRequestType"), com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetCredentialInfoResponseType"));
        oper.setReturnClass(com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetCredentialInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTemporaryPasswordAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetTemporaryPasswordAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetTemporaryPasswordAttributesRequestType"), com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetTemporaryPasswordAttributesResponseType"));
        oper.setReturnClass(com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetTemporaryPasswordAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pollPushStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PollPushStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PollPushStatusRequestType"), com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PollPushStatusResponseType"));
        oper.setReturnClass(com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PollPushStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public QueryServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public QueryServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public QueryServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", ">GatewayAcctInfoType>Id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", ">GatewayAcctInfoType>Password");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AbstractAuthDataType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AbstractAuthDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AddCredentialRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AddCredentialRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AddCredentialResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AddCredentialResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthContext");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType");
            qName2 = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "params");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateCredentialsRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateCredentialsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateCredentialsResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateCredentialsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateUserWithPushRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserWithPushRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthenticateUserWithPushResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.AuthenticateUserWithPushResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "AuthnIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BaseRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BaseRequestWithAccountIdType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.BaseRequestWithAccountIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BaseResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.BaseResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BindingDetailType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.BindingDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "BindStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.BindStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CheckOtpRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CheckOtpRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CheckOtpResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CheckOtpResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ClearTemporaryPasswordRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.ClearTemporaryPasswordRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ClearTemporaryPasswordResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.ClearTemporaryPasswordResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ClearUserPinRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.ClearUserPinRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ClearUserPinResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.ClearUserPinResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ConfirmRiskRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.ConfirmRiskRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ConfirmRiskResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.ConfirmRiskResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CreateUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CreateUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CreateUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CreateUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialBindingDetailType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CredentialBindingDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialDefinitionType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDefinitionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialDetailType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CredentialDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialStatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "CredentialTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.CredentialTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "DeleteUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.DeleteUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "DeleteUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.DeleteUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "DenyRiskRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.DenyRiskRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "DenyRiskResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.DenyRiskResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "EvaluateRiskRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.EvaluateRiskRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "EvaluateRiskResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.EvaluateRiskResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "EventIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "FriendlyNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GatewayAcctInfoType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GatewayAcctInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetCredentialInfoRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetCredentialInfoResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetServerTimeRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetServerTimeResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetTemporaryPasswordAttributesRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetTemporaryPasswordAttributesResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "GetUserInfoResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "IAAuthDataType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "IpAddressType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "KeyValuePairType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.KeyValuePairType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "OtpAuthDataType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.OtpAuthDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "OtpType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PhoneNumberType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PinType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PollPushStatusRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PollPushStatusResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushAuthDataType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.PushAuthDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushDetailType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.PushDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushTransactionIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "PushTransactionStatusType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.PushTransactionStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RegisterRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.RegisterRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RegisterResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.RegisterResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RemoveCredentialRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.RemoveCredentialRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RemoveCredentialResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.RemoveCredentialResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RequestIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "RiskScoreType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SendOtpRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.SendOtpRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SendOtpResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.SendOtpResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ServiceOtpDeliveryInfoType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.ServiceOtpDeliveryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SetTemporaryPasswordAttributesRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordAttributesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SetTemporaryPasswordAttributesResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordAttributesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SetTemporaryPasswordRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SetTemporaryPasswordResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.SetTemporaryPasswordResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SmsDeliveryInfoType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.SmsDeliveryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SmsFromType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "SmsMessageTemplateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "TemporaryPasswordAttributesType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.TemporaryPasswordAttributesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "TemporaryPasswordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UpdateCredentialRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.UpdateCredentialRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UpdateCredentialResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.UpdateCredentialResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UpdateUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.UpdateUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UpdateUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.UpdateUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserAgentType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserBindingDetailType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.UserBindingDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "UserStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.UserStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "ValueType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "VerifyMethodType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://schemas.symantec.com/vip/2011/04/vipuserservices", "VoiceDeliveryInfoType");
            cachedSerQNames.add(qName);
            cls = com.symantec.schemas.vip._2011._04.vipuserservices.VoiceDeliveryInfoType.class;
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

    public com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeResponseType getServerTime(com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeRequestType getServerTimeRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getServerTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getServerTimeRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.symantec.schemas.vip._2011._04.vipuserservices.GetServerTimeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoResponseType getUserInfo(com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoRequestType getUserInfoRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUserInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.symantec.schemas.vip._2011._04.vipuserservices.GetUserInfoResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoResponseType getCredentialInfo(com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoRequestType getCredentialInfoRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getCredentialInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCredentialInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.symantec.schemas.vip._2011._04.vipuserservices.GetCredentialInfoResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesResponseType getTemporaryPasswordAttributes(com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesRequestType getTemporaryPasswordAttributesRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getTemporaryPasswordAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTemporaryPasswordAttributesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.symantec.schemas.vip._2011._04.vipuserservices.GetTemporaryPasswordAttributesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusResponseType pollPushStatus(com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusRequestType pollPushStatusRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "pollPushStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pollPushStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.symantec.schemas.vip._2011._04.vipuserservices.PollPushStatusResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
