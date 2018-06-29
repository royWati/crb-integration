package com.flag42.crb.om;

public class GetCreditStatusResponse {
	private String category;
	private String subscriberShortCode ;
	private String balanceAmount;

public String getcategory() {
	return category;
}
public void setcategory(String category) {
	this.category = category;
}
public String getsubscriberShortCode() {
	return subscriberShortCode;
}
public void setsubscriberShortCode(String subscriberShortCode) {
	this.subscriberShortCode = subscriberShortCode;
}

public String getbalanceAmount () {
	return balanceAmount ;
}
public void setbalanceAmount (String balanceAmount ) {
	this.balanceAmount  = balanceAmount ;
}
}