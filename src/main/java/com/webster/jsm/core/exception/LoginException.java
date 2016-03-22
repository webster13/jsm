package com.webster.jsm.core.exception;

/**
 * todo
 * Created by Webster on 16/3/13.
 */
public class LoginException extends RuntimeException {
    private static final long serialVersionUID = 1395368421014995233L;

    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginException(Throwable cause) {
        super(cause);
    }

    public LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
