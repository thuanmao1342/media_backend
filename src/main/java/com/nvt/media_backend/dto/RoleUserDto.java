package com.nvt.media_backend.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleUserDto implements Serializable {
    private final Long id;
    private final Long roleId;
    private final Long userId;
    private final Long status;
}
