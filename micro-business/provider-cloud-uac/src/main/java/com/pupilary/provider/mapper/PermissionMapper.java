package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.auth.server.model.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

    /**
     * queryPermissionByRoleIds
     *
     * @param roleIds roleIds
     * @return Set<Permission>
     */
    Set<Permission> queryPermissionByRoleIds(@Param("roleIds") List<Long> roleIds);

}
