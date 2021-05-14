package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.OauthClientDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author takesi
 */
@Mapper
public interface OauthClientDetailsMapper extends BaseMapper<OauthClientDetails> {

    /**
     * queryClientDetailsFromClientId
     *
     * @param clientId clientId
     * @return ClientDetails
     */
    OauthClientDetails queryClientDetailsFromClientId(@Param("clientId") String clientId);

}