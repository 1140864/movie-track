package com.msousa.movietrack.common.exception;

import java.util.Date;

public class ExceptionResponse {
    private Date timestamp;
    private String traceId;
    private BusinessCode statusCode;
    private String errorCode;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String traceId, BusinessCode statusCode, String errorCode, String message, String details) {
        this.timestamp = timestamp;
        this.traceId = traceId;
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.message = message;
        this.details = details;
    }

    public ExceptionResponse(Date timestamp, String traceId, String message, String details) {
        this.timestamp = timestamp;
        this.traceId = traceId;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public BusinessCode getStatusCode() {
        return statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
