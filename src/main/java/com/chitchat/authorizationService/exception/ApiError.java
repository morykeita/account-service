package com.chitchat.authorizationService.exception;

/**
 * @author Mory Keita
 */
public class ApiError {
    int code;
    String message;
    String cause;

    public ApiError() {
    }

    public ApiError(int code, String message, String cause) {
        this.code = code;
        this.message = message;
        this.cause = cause;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
