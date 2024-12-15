package com.dp.dto;

import java.util.List;

public class APIResponse<T> {

	 
	private T res;
    private String status;
    private Integer statusCode;
    private String message;
    
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getRes() {
		return res;
	}

	public void setRes(T res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "{"
		        + "\"res\":" + (res != null ? "" + res.toString() + "" : "null") + ","
		        + "\"status\":" + (status != null ? "\"" + status + "\"" : "null") + ","
		        + "\"statusCode\":" + (statusCode != null ? statusCode : "null") + ","
		        + "\"message\":" + (message != null ? "\"" + message + "\"" : "null")
		        + "}";
	}
	
	

}
