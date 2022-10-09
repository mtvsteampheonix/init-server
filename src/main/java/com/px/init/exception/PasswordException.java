package com.px.init.exception;

/**
 * <pre>
 * Class : PasswordException
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-10 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나 외부 url
 */
public class PasswordException extends RuntimeException {
    /**
     * Instantiates a new Password exception.
     */
    public PasswordException() {
        super();
    }

    /**
     * Instantiates a new Password exception.
     *
     * @param message the message
     */
    public PasswordException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Password exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public PasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Password exception.
     *
     * @param cause the cause
     */
    public PasswordException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Password exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    protected PasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
