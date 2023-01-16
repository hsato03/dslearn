package com.devsuperior.dslearnbds.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String error;

    public FieldMessage() {}

    public FieldMessage(String fieldName, String error) {
        this.fieldName = fieldName;
        this.error = error;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
