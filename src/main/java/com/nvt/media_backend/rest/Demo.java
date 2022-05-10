package com.nvt.media_backend.rest;

import com.nvt.media_backend.domain.Role;
import com.nvt.media_backend.domain.User;
import com.nvt.media_backend.domain.obj.MailSender;
import com.nvt.media_backend.dto.UserDto;
import com.nvt.media_backend.repository.RoleUserRepository;
import com.nvt.media_backend.repository.RoleRepository;
import com.nvt.media_backend.repository.UserRepository;
import com.nvt.media_backend.service.EmailUtil;
import com.nvt.media_backend.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.List;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class Demo {

    private final UserRepository usersRepository;
    private final RoleRepository rolesRepository;
    private final RoleUserRepository roleUserRepository;
    private final UserMapper userMapper;
    private final EmailUtil emailUtil;


    @GetMapping()
    public UserDto getALl(){
        System.out.println(usersRepository.findByUserName("admin"));

        return userMapper.userToUserDto(usersRepository.findByUserName("admin"));
    }
    @GetMapping("/a")
    public void sendmail() throws MessagingException {
        MailSender sender = new MailSender();
        emailUtil.sendAttachmentEmail();
    }

}
