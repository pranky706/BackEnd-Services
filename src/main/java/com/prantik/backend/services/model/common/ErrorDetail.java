package com.prantik.backend.services.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorDetail {
	
	@JsonProperty("message")
	private String message;
	@JsonProperty("layer")
	private String layer;
	@JsonProperty("stackTrace")
	private String stackTrace;
	
	public String getMessage() {
		return this.message;
	}
	
	public String getLayer() {
		return this.layer;
	}
	
	public String getStackTrace() {
		return this.stackTrace;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setLayer(String layer) {
		this.layer = layer;
	}
	
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("message",message)
				.add("layer",layer)
				.add("stackTrace",stackTrace)
				.toString();
	}
	
	

}
