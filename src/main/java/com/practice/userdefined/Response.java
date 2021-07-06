package com.practice.userdefined;

public class Response {

	int statusCode;
	String responseBody;
	String responseType;
	
	public Response(String responseBody,int statusCode,String responseType) {
		this.statusCode=statusCode;
		this.responseBody=responseBody;
		this.responseType=responseType;
	}
	
	public String getResponseBody() {
        return this.responseBody;
    }
    
    public int getStatusCode() {
    	return this.statusCode;
    }
    
    public String getResponseType() {
        return this.responseType;
    }
    
    @Override
    public String toString(){
    	return "body:"+responseBody+" status code:"+statusCode+" responseType:"+responseType;
    }
}
