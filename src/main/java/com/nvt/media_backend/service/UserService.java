package com.nvt.media_backend.service;

import com.nvt.media_backend.domain.Role;
import com.nvt.media_backend.domain.User;

import java.util.List;

public interface UserService {

    User updateUser(User user);

    User getInfo(String username);

    List<Role> roles(String username);
}
