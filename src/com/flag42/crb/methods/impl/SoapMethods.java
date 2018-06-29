package com.flag42.crb.methods.impl;


import java.io.ByteArrayOutputStream;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import com.flag42.crb.om.SoapConstants;
import com.flag42.crb.om.SoapResponse;

public class SoapMethods {
	 
	private SoapConstants soapConstants = new SoapConstants();
	private SoapResponse soapResponse;
	public SoapMethods(){
		soapResponse = GenerateSoapResponse();
	}

	public SoapResponse getSoapResponse() {
		return soapResponse;
	}

	private SoapResponse GenerateSoapResponse(){
		try {
			System.out.println("Generating soap response");
			javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
					new javax.net.ssl.HostnameVerifier(){
						@Override
					    public boolean verify(String hostname,
					            javax.net.ssl.SSLSession sslSession) {
					            return true;
					    }
					});
			
			SoapResponse soapresponse = new SoapResponse();
			QName serviceName = new QName(soapConstants.getNamespaceURI(), soapConstants.getService());
			QName portName = new QName(soapConstants.getNamespaceURI(), soapConstants.getEndpoint());
			//Create a service and add at least one port to it.
			Service service = Service.create(serviceName);
			//System.out.println("Endpoint url to use is " + endpointUrl);
			service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, soapConstants.getEndpointUrl());
			//Create a Dispatch instance from a service.
			Dispatch<SOAPMessage> dispatch = service.createDispatch(portName,SOAPMessage.class, Service.Mode.MESSAGE);
			//Create SOAPMessage request.
			// compose a request message
			MessageFactory mf = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
			// Create a message. 
			SOAPMessage request = mf.createMessage();
			SOAPPart part = request.getSOAPPart();
			// Obtain the SOAPEnvelope and header and body elements.
			SOAPEnvelope env = part.getEnvelope();
			env.addNamespaceDeclaration("ws", soapConstants.getNamespaceURI());
			SOAPHeader header = env.getHeader();
			//header.addHeaderElement(serviceName);
			SOAPBody body = env.getBody();
			
			soapresponse.setSoapmessage(request);
			soapresponse.setSoapbody(body);
			soapresponse.setDispatch(dispatch);
			
			return soapresponse;
		} catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public void PrintXml(SOAPMessage message){
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			message.writeTo(out);
			String strMsg = new String(out.toByteArray());
			System.out.println(strMsg);
			out.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
