package com.px.init.exception;


public class DuplicateMemberEmailException extends RuntimeException {
    public DuplicateMemberEmailException(){super();}

    public DuplicateMemberEmailException(String message) {
        super(message);
    }

    public DuplicateMemberEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateMemberEmailException(Throwable cause) {
        super(cause);
    }

    public DuplicateMemberEmailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
