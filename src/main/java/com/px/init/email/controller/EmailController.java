package com.px.init.email.controller;

import com.px.init.email.model.dto.EmailDTO;
import com.px.init.email.model.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * <pre>
 * Class : EmailController
 * Comment : 이메일 전송을 위한 컨트롤러
 * History
 * 2022-10-08 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나 외부 url
 */
@Controller
public class EmailController {

    private static final Logger log = LoggerFactory.getLogger(EmailController.class);

    private final EmailService emailService;

    /**
     * Instantiates a new Email controller.
     *
     * @param emailService the email service
     */
    @Autowired
    public EmailController(EmailService emailService) {

        this.emailService = emailService;
    }

    /**
     * Send email.
     *
     * @param emailDTO the email dto
     */
    public boolean sendEmail(EmailDTO emailDTO) {
        log.info("[EmailController] sendEmail START ======================");
        try {
            emailService.sendVerifyEmail(emailDTO);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
