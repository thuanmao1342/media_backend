package com.nvt.media_backend.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RoleDto implements Serializable {
    private final Long id;
    private final String RoleCode;
    private final String RoleName;
    private final String description;
    private final Long status;
    private final Date createDate;
}
