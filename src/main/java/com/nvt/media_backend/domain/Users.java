package com.nvt.media_backend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private Long status;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private Long gender;

    @Column(name = "dob")
    private String dateOfBirth;

    @Column(name = "description")
    private String description;

    @Column(name = "last_change_password")
    private Date lastChangePassword;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "login_fall_date")
    private Date loginFallDate;

    @Column(name = "login_fall_count")
    private Long loginFallCount;

    @Column(name = "phone")
    private String phone;
}
