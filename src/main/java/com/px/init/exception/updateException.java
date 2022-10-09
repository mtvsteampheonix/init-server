package com.px.init.exception;

/**
 * <pre>
 * Class : updateException
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-10 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나 외부 url
 */
public class updateException extends RuntimeException {
    /**
     * Instantiates a new Update exception.
     */
    public updateException() {
        super();
    }

    /**
     * Instantiates a new Update exception.
     *
     * @param s the s
     */
    public updateException(String s) {
    }

    /**
     * Instantiates a new Update exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public updateException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Update exception.
     *
     * @param cause the cause
     */
    public updateException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Update exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    protected updateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
