package com.pupilary.provider.service.impl;

import com.pupilary.provider.service.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 * @date 2021-05-01
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return User.withUsername("admin")
                .password(BCrypt.hashpw("123456", BCrypt.gensalt()))
                .authorities("res1")
                .build();
    }
}
