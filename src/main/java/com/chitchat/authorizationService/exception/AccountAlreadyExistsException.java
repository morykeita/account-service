package com.chitchat.authorizationService.exception;

/**
 * @author Mory Keita
 */
public final class AccountAlreadyExistsException extends RuntimeException {

    public AccountAlreadyExistsException() {
    }

    public AccountAlreadyExistsException(String message) {
        super(message);
    }

    public AccountAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public AccountAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
