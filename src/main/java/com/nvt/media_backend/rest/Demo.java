package com.nvt.media_backend.rest;

import com.nvt.media_backend.domain.RoleUser;
import com.nvt.media_backend.domain.Roles;
import com.nvt.media_backend.domain.Users;
import com.nvt.media_backend.repository.RoleUserRepository;
import com.nvt.media_backend.repository.RolesRepository;
import com.nvt.media_backend.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class Demo {

    private final UsersRepository usersRepository;
    private final RolesRepository rolesRepository;
    private final RoleUserRepository roleUserRepository;


    @GetMapping()
    public List<RoleUser> getALl(){
        return roleUserRepository.findAll();
    }

}
