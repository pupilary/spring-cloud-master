package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.RoleMapper;
import com.pupilary.provider.model.domain.Role;
import com.pupilary.provider.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
