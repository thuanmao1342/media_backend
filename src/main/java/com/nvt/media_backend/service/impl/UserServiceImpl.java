package com.nvt.media_backend.service.impl;

import com.nvt.media_backend.domain.Role;
import com.nvt.media_backend.domain.User;
import com.nvt.media_backend.repository.RoleRepository;
import com.nvt.media_backend.repository.UserRepository;
import com.nvt.media_backend.service.UserService;
import com.nvt.media_backend.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    private final UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        if (user == null){
            log.error("User not found in the database");
            throw new UsernameNotFoundException("User not found in the database");
        }else {
            log.info("User found in the database");
            List<Role> roles = roleRepository.Authentications(username);
            for (Role role : roles) {
                authorities.add(new SimpleGrantedAuthority(role.getRoleCode()));
            }
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorities);
    }

    @Override
    public User updateUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return user;
    }

    @Override
    public User getInfo(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public List<Role> roles(String username) {
        return roleRepository.Authentications(username);
    }
}
