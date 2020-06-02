package com.prantik.backend.services.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldError {

	@JsonProperty("fieldName")
	private String fieldName;
	@JsonProperty("message")
	private String message;
	
	public String getMessage() {
		return this.message;
	}
	
	public String getFieldName() {
		return this.fieldName;
	}

	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	

	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("fieldName",fieldName)
				.add("message",message)
				.toString();
	}
	
}
