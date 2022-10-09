package com.px.init.email.model.service;

import com.px.init.email.model.dto.EmailDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

/**
 * <pre>
 * Class : EmailServiceImpl
 * Comment : 이메일 전송 서비스 구현체
 * History
 * 2022-10-07 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see EmailService
 */

@Service
public class EmailServiceImpl implements EmailService {
    private static final Logger log = LoggerFactory.getLogger(EmailServiceImpl.class);
    private JavaMailSender javaMailSender;

    @Autowired
    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Value("${spring.mail.username}")
    private String fromAddress;

    @Override
    public void sendVerifyEmail(EmailDTO emailDTO) throws UnsupportedEncodingException, MessagingException {
        log.info("[EmailServiceImpl] START =============");
//        SimpleMailMessage message = new SimpleMailMessage();
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
        helper.setFrom(new InternetAddress(fromAddress, "INIT"));
        helper.setSubject(emailDTO.getTitle());
        helper.setTo(emailDTO.getAddress());
        helper.setText(emailDTO.getMessage(), true);
        log.info("[EmailServiceImpl] message {}", mimeMessage);
        javaMailSender.send(mimeMessage);
    }
}
