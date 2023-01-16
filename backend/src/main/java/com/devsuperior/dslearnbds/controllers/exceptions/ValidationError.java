package com.devsuperior.dslearnbds.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError() {}

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String error) {
        errors.add(new FieldMessage(fieldName, error));
    }
}
