package com.pupilary.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.provider.model.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author takesi
 * @date 2021-05-01
 */
public interface UserService extends IService<User>, UserDetailsService {

}
