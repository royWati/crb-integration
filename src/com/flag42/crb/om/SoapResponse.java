package com.flag42.crb.om;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;

public class SoapResponse {
	private SOAPMessage soapmessage;
	private SOAPBody soapbody;
	private Dispatch<SOAPMessage> dispatch;
	
	public SOAPMessage getSoapmessage() {
		return soapmessage;
	}
	public void setSoapmessage(SOAPMessage soapmessage) {
		this.soapmessage = soapmessage;
	}
	public SOAPBody getSoapbody() {
		return soapbody;
	}
	public void setSoapbody(SOAPBody soapbody) {
		this.soapbody = soapbody;
	}
	public Dispatch<SOAPMessage> getDispatch() {
		return dispatch;
	}
	public void setDispatch(Dispatch<SOAPMessage> dispatch) {
		this.dispatch = dispatch;
	}		
}
