package com.devsuperior.clientes.dto;

public class CustomErrorField {

    private final String fieldName;
    private final String message;

    public CustomErrorField(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
