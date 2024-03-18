package com.codegym.minitesttuan3m4.service;

import com.codegym.minitesttuan3m4.DTO.UserDTO;
import com.codegym.minitesttuan3m4.model.User;
import com.codegym.minitesttuan3m4.repo.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = iUserRepository.findByUsername(username);
        UserDTO userDTO = new UserDTO(user);
        return userDTO;
    }
}
