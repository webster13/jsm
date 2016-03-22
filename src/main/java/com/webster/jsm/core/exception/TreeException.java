package com.webster.jsm.core.exception;

/**
 * todo
 * Created by Webster on 16/3/13.
 */
public class TreeException extends RuntimeException {
    private static final long serialVersionUID = 7321669026863190920L;

    public TreeException() {
    }

    public TreeException(String message) {
        super(message);
    }

    public TreeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TreeException(Throwable cause) {
        super(cause);
    }

    public TreeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
