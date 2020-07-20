package com.msousa.movietrack.common.exception;

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 9101534910378848436L;
    private final BusinessCode statusCode;
    private final String errorCode;

    protected BaseException(BusinessCode statusCode, String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }

    protected BaseException(ExceptionResponse exception, Throwable cause) {
        this(exception.getStatusCode(), exception.getErrorCode(), exception.getMessage(), cause);
    }

    public BaseException(BusinessCode businessCode, String message, Throwable cause) {
        this(businessCode, businessCode.getError(), message, cause);
    }

    public BaseException(BusinessCode statusCode, String message) {
        this(statusCode, message, null);
    }

    public BusinessCode getStatusCode() {
        return this.statusCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}