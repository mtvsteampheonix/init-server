package com.px.init.email.model.service;

import com.px.init.email.model.dto.EmailDTO;

/**
 * <pre>
 * Class : EmailService
 * Comment : 이메일 전송 서비스 인터페이스
 * History
 * 2022-10-07 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 */
public interface EmailService {
    /**
     * Send verify email.
     *
     * @param emailDTO the email dto
     */
    void sendVerifyEmail(EmailDTO emailDTO) throws Exception;
}
