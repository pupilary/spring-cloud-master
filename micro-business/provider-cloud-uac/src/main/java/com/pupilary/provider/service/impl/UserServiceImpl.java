package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.RoleMapper;
import com.pupilary.provider.mapper.UserMapper;
import com.pupilary.provider.model.domain.Role;
import com.pupilary.provider.model.domain.User;
import com.pupilary.provider.model.dto.UserDetailsDto;
import com.pupilary.provider.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author takesi
 * @date 2021-05-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.queryUserByUsername(username);

        if (user != null) {
            UserDetailsDto userDetailsDto = new UserDetailsDto();
            BeanUtils.copyProperties(user, userDetailsDto);
            List<Role> roleList = roleMapper.queryRoleByUserId(user.getId());
            userDetailsDto.setRoles(roleList);
            return userDetailsDto;
        }
        return null;
    }
}
