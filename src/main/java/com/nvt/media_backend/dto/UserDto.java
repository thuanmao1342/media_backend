package com.nvt.media_backend.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDto implements Serializable {
    private final Long id;
    private final String userName;
    private final Long status;
    private final String fullName;
    private final String email;
    private final Long gender;
    private final String dateOfBirth;
    private final String description;
    private final Date lastChangePassword;
    private final Date createDate;
    private final Date loginFallDate;
    private final Long loginFallCount;
    private final String phone;
}
