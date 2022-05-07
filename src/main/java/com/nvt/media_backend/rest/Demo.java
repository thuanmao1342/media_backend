package com.nvt.media_backend.rest;

import com.nvt.media_backend.domain.Role;
import com.nvt.media_backend.domain.User;
import com.nvt.media_backend.repository.RoleUserRepository;
import com.nvt.media_backend.repository.RoleRepository;
import com.nvt.media_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class Demo {

    private final UserRepository usersRepository;
    private final RoleRepository rolesRepository;
    private final RoleUserRepository roleUserRepository;


    @GetMapping()
    public User getALl(){
        System.out.println(usersRepository.findByUserName("admin"));
        return usersRepository.findByUserName("admin");
    }

}
