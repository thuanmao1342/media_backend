package com.nvt.media_backend.domain.obj;

import lombok.Data;

import java.util.List;

@Data
public class MailSender {
    static final String textHtml="text/html";

    String to;
    String subject;
    String text;
    List<String> files;
    List<String> bcc;
    List<String> tcc;
}
