package com.chitchat.authorizationService.exception;

/**
 * @author Mory Keita
 */
public final class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String message) {
        super(message);
    }

    public AccountNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountNotFoundException(Throwable cause) {
        super(cause);
    }

    public AccountNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
