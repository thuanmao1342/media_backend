package com.nvt.media_backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "role_code")
    private String RoleCode;

    @Column(name = "role_name")
    private String RoleName;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Long status;

    @Column(name = "create_date")
    private Date createDate;

    @JsonIgnore
    @OneToMany(mappedBy = "role")
    List<RoleUser> roleUserEntityList;
}
