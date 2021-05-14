package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author takesi
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * queryRoleByUserId
     *
     * @param userId userId
     * @return list
     */
    List<Role> queryRoleByUserId(@Param("userId") Long userId);
}
