package com.nvt.media_backend.service.mapper;

import com.nvt.media_backend.domain.User;
import com.nvt.media_backend.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    void mapDTO(@MappingTarget User target, UserDto source);
    UserDto userToUserDto(User user);
}
