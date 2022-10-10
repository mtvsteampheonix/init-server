package com.px.init.exception;

/**
 * <pre>
 * Class : EmailException
 * Comment : 이메일 관련 익셉션
 * History
 * 2022-10-08 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
public class EmailException extends RuntimeException {
    public EmailException() {
        super();
    }

    public EmailException(String message) {
        super(message);
    }

    public EmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailException(Throwable cause) {
        super(cause);
    }

}

