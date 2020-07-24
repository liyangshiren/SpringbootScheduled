package com.li.scheduled;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ScheduledApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        /**
         * 测试简单发送
         */
        SimpleMailMessage simpleMessage = new SimpleMailMessage();
        simpleMessage.setSubject("SpringBoot简单发送的主题");
        simpleMessage.setText("SpringBoot简单发送的内容");
        simpleMessage.setFrom("372902817@qq.com");
        simpleMessage.setTo("372902817@qq.com");

        mailSender.send(simpleMessage);
    }

    @Test
    void test02() throws MessagingException {
        /**
         * 测试复杂发送
         */
        MimeMessage mimeMailMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMailMessage,true);
        // 邮件设置
        helper.setSubject("复杂邮件主题");
        helper.setText("<b style='color:blue'>蓝色的内容</b>",true);
        helper.addAttachment("1.jpg", new File("/Users/li/Pictures/我的图片/github.png"));

        helper.setFrom("372902817@qq.com");
        helper.setTo("372902817@qq.com");

        mailSender.send(mimeMailMessage);
    }

}
