package com.msousa.movietrack.common.exception;

import org.springframework.http.HttpStatus;

public enum BusinessCode {
    INTERNAL_SERVER_ERROR("DXL000", HttpStatus.INTERNAL_SERVER_ERROR),
    AUTHENTICATION_ERROR("DXL001", HttpStatus.UNAUTHORIZED),
    AUTHORIZATION_ERROR("DXL002", HttpStatus.FORBIDDEN),
    TIMEOUT("DXL003", HttpStatus.REQUEST_TIMEOUT),
    BACKEND_UNAVAILABLE("DXL004", HttpStatus.BAD_GATEWAY),
    BACKEND_TIMEOUT("DXL005", HttpStatus.GATEWAY_TIMEOUT),
    INVALID_BACKEND_RESPONSE("DXL006", HttpStatus.BAD_GATEWAY),
    INVALID_BACKEND_STATUS("DXL007", HttpStatus.BAD_GATEWAY),
    NOT_FOUND("DXL008", HttpStatus.NOT_FOUND),
    PARAMETER_VALIDATION_ERROR("DXL009", HttpStatus.BAD_REQUEST),
    RESPONSE_VALIDATION_ERROR("DXL010", HttpStatus.INTERNAL_SERVER_ERROR),
    CONFLICT("DXL011", HttpStatus.CONFLICT),
    BUSINESS_ERROR("DXL012", HttpStatus.INTERNAL_SERVER_ERROR),
    DISABLED_ACCOUNT_ERROR("DXL013", HttpStatus.UNAUTHORIZED);

    private final String error;
    private final HttpStatus httpStatus;

    BusinessCode(String error, HttpStatus httpStatus) {
        this.error = error;
        this.httpStatus = httpStatus;
    }

    public String getError() {
        return this.error;
    }

    public int getStatus() {
        return this.httpStatus.value();
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public boolean isInternalServerError() {
        return this == INTERNAL_SERVER_ERROR;
    }

    public boolean isUnauthorized() {
        return this == AUTHENTICATION_ERROR;
    }

    public boolean isForbidden() {
        return this == AUTHORIZATION_ERROR;
    }

    public boolean isTimeout() {
        return this == TIMEOUT;
    }

    public boolean isBackendUnavailable() {
        return this == BACKEND_UNAVAILABLE;
    }

    public boolean isBackendTimeout() {
        return this == BACKEND_TIMEOUT;
    }

    public boolean isInvalidBackendResponse() {
        return this == INVALID_BACKEND_RESPONSE;
    }

    public boolean isInvalidBackendStatus() {
        return this == INVALID_BACKEND_RESPONSE;
    }

    public boolean isNotFound() {
        return this == NOT_FOUND;
    }

    public boolean isParameterValidationError() {
        return this == PARAMETER_VALIDATION_ERROR;
    }

    public boolean isResponseValidationError() {
        return this == RESPONSE_VALIDATION_ERROR;
    }

    public static BusinessCode from(int value) {
        HttpStatus httpStatus = HttpStatus.valueOf(value);

        if (httpStatus == INTERNAL_SERVER_ERROR.httpStatus) {
            return INTERNAL_SERVER_ERROR;
        } else if (httpStatus == AUTHENTICATION_ERROR.httpStatus) {
            return AUTHENTICATION_ERROR;
        } else if (httpStatus == AUTHORIZATION_ERROR.httpStatus) {
            return AUTHORIZATION_ERROR;
        } else if (httpStatus == TIMEOUT.httpStatus) {
            return TIMEOUT;
        } else if (httpStatus == BACKEND_UNAVAILABLE.httpStatus) {
            return BACKEND_UNAVAILABLE;
        } else if (httpStatus == BACKEND_TIMEOUT.httpStatus) {
            return BACKEND_TIMEOUT;
        } else if (httpStatus == INVALID_BACKEND_RESPONSE.httpStatus) {
            return INVALID_BACKEND_RESPONSE;
        } else if (httpStatus == INVALID_BACKEND_STATUS.httpStatus) {
            return INVALID_BACKEND_STATUS;
        } else if (httpStatus == NOT_FOUND.httpStatus) {
            return NOT_FOUND;
        } else if (httpStatus == PARAMETER_VALIDATION_ERROR.httpStatus) {
            return PARAMETER_VALIDATION_ERROR;
        } else if (httpStatus == RESPONSE_VALIDATION_ERROR.httpStatus) {
            return RESPONSE_VALIDATION_ERROR;
        } else {
            return httpStatus == CONFLICT.httpStatus ? CONFLICT : BUSINESS_ERROR;
        }
    }
}