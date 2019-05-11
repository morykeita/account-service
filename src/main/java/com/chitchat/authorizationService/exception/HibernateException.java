package com.chitchat.authorizationService.exception;

/**
 * @author Mory Keita
 */
public class HibernateException extends RuntimeException {

    public HibernateException() {
    }

    public HibernateException(String message) {
        super(message);
    }

    public HibernateException(String message, Throwable cause) {
        super(message, cause);
    }

    public HibernateException(Throwable cause) {
        super(cause);
    }

    public HibernateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
