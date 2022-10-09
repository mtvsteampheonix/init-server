package com.px.init.exception;

/**
 * <pre>
 * Class : patchException
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-10 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나 외부 url
 */
public class patchException extends RuntimeException {
    /**
     * Instantiates a new Patch exception.
     */
    public patchException() {
        super();
    }

    /**
     * Instantiates a new Patch exception.
     *
     * @param s the s
     */
    public patchException(String s) {
    }

    /**
     * Instantiates a new Patch exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public patchException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Patch exception.
     *
     * @param cause the cause
     */
    public patchException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Patch exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    protected patchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
