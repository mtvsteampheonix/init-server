package com.px.init.exception;

/**
 * <pre>
 * Class : SignupException
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-09 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
public class SignupException extends RuntimeException {
    public SignupException() {
        super();
    }

    public SignupException(String message) {
        super(message);
    }

    public SignupException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignupException(Throwable cause) {
        super(cause);
    }

    protected SignupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
