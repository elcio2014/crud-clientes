package com.devsuperior.clientes.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CustomError {

    private final Instant timestamp;
    private final Integer status;
    private final String error;
    private final String path;

    private final List<CustomErrorField> errorFields = new ArrayList<>();

    public CustomError(Instant timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getPath() {
        return path;
    }

    public String getError() {
        return error;
    }

    public List<CustomErrorField> getErrorFields() {
        return errorFields;
    }

    public void addFieldError(String fieldName, String message) {
        errorFields.add(new CustomErrorField(fieldName, message));
    }

}
