package com.flag42.crb.om;

public class SoapConstants {
	 private String endpointUrl = "https://secure3.transunionafrica.com/crbws/mobile/ke?wsdl";
	 private String endpoint = "ControllerKenyaImplPort";
	 private String namespaceURI = "http://ws.crbws.transunion.ke.co/";
	 private String service = "ControllerKenyaImplService";
	public String getEndpointUrl() {
		return endpointUrl;
	}
	public void setEndpointUrl(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String getNamespaceURI() {
		return namespaceURI;
	}
	public void setNamespaceURI(String namespaceURI) {
		this.namespaceURI = namespaceURI;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
}
