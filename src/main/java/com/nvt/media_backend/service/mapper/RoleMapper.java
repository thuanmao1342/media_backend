package com.nvt.media_backend.service.mapper;

import com.nvt.media_backend.domain.Role;
import com.nvt.media_backend.dto.RoleDto;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {
    RoleDto roleToRoeDto(Role role);
}
