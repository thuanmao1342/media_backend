package com.nvt.media_backend.service.mapper;

import com.nvt.media_backend.domain.Role;
import com.nvt.media_backend.dto.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface RoleMapper {
    @Mapping(target = "id", ignore = true)
    RoleDto roleToRoleDto(Role role);
}
