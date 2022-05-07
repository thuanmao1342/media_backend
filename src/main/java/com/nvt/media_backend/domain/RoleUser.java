package com.nvt.media_backend.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "role_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne @JoinColumn(name = "role_id")
    Role role;

    @ManyToOne @JoinColumn(name = "user_id")
    User user;

    @Column(name = "status")
    private Long status;

}
