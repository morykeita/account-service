package com.chitchat.authorizationService.exception;

/**
 * @author Mory Keita
 */
public class UsernameAlreadyExist extends RuntimeException {
    public UsernameAlreadyExist() {
    }

    public UsernameAlreadyExist(String message) {
        super(message);
    }

    public UsernameAlreadyExist(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameAlreadyExist(Throwable cause) {
        super(cause);
    }

    public UsernameAlreadyExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
