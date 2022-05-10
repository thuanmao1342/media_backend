package com.nvt.media_backend.service;

import com.nvt.media_backend.domain.obj.MailSender;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
@RequiredArgsConstructor
public class EmailUtil {

    private final JavaMailSender mailSender;

    public boolean sendSimpleEmail(MailSender sender){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(sender.getTo());
        message.setSubject(sender.getSubject());
        message.setText(sender.getText());

        this.mailSender.send(message);
        return true;
    }

    public String sendAttachmentEmail() throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();

        boolean multipart = true;

        MimeMessageHelper helper = new MimeMessageHelper(message, multipart);

        helper.setTo("thuanmao1342@gmail.com");
        helper.setSubject("Test email with attachments");

        helper.setText("Hello, Im testing email with attachments!");

        String path1 = "src/main/resources/assets/test.txt";

        FileSystemResource file1 = new FileSystemResource(new File(path1));
        helper.addAttachment("TxtFile.txt", file1);


        mailSender.send(message);

        return "Email Sent!";
    }
}
