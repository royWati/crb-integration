package com.flag42.crb.om;

public class GetCreditScoreResponse {
	private String score ;
	private String grade ;
	private String responseCode;
	
	
	public String getscore() {
		return score;
	}
	public void setscore (String score ) {
		this.score = score ;
	}
	public String getgrade () {
		return grade;
	}
	public void setgrade(String grade  ) {
		this.grade = grade ;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
}
