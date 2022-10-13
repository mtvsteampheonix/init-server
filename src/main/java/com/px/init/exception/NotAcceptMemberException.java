package com.px.init.exception;

/**
 * <pre>
 * Class : NotAcceptMemberException
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-12 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
public class NotAcceptMemberException extends RuntimeException {
    public NotAcceptMemberException(String s) {
    }

    public NotAcceptMemberException() {
        super();
    }

    public NotAcceptMemberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAcceptMemberException(Throwable cause) {
        super(cause);
    }

    protected NotAcceptMemberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
