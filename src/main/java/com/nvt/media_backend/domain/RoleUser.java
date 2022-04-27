package com.nvt.media_backend.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "role_user")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "status")
    private Long status;

}
