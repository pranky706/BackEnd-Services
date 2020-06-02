package com.prantik.backend.services.web.controller;

import com.prantik.backend.services.model.common.FieldError;

import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;


public class BindingResultErrorCollector {
	private static final Logger LOGGER = LoggerFactory.getLogger(BindingResultErrorCollector.class);
	
	public List<FieldError> getFieldErrors(BindingResult bindingResult){
		List<FieldError> fieldErrors = new ArrayList<>();
		FieldError fieldError = new FieldError();
		bindingResult.getGlobalErrors().forEach((field) -> {
			fieldError.setFieldName(field.getCode());
			fieldError.setMessage(field.getDefaultMessage());
			fieldErrors.add(fieldError);
		});
		return fieldErrors;
	}

}
