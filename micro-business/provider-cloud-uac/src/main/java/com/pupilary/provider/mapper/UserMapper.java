package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author takesi
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * queryUserByUsername
     *
     * @param username username
     * @return User
     */
    User queryUserByUsername(@Param("username") String username);

}
