package com.pupilary.provider.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pupilary.provider.mapper.OauthClientDetailsMapper;
import com.pupilary.provider.model.domain.OauthClientDetails;
import com.pupilary.provider.service.ClientDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author takesi
 */
@Service
public class ClientDetailServiceImpl implements ClientDetailService {

    private static final Logger logger = LoggerFactory.getLogger(ClientDetailService.class);

    @Autowired
    private OauthClientDetailsMapper oauthClientDetailsMapper;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        OauthClientDetails result = oauthClientDetailsMapper.queryClientDetailsFromClientId(clientId);
        BaseClientDetails details = new BaseClientDetails(result.getClientId(), result.getResourceIds(), result.getScope(),
                result.getAuthorizedGrantTypes(), result.getAuthorities(), result.getWebServerRedirectUri());
        details.setClientSecret(result.getClientSecret());
        details.setAccessTokenValiditySeconds(result.getAccessTokenValidity());
        details.setRefreshTokenValiditySeconds(result.getRefreshTokenValidity());
        String json = result.getAdditionalInformation();

        if (json != null) {
            final ObjectMapper mapper = new ObjectMapper();
            try {
                @SuppressWarnings("unchecked")
                Map<String, Object> additionalInformation = mapper.readValue(json, Map.class);
                details.setAdditionalInformation(additionalInformation);
            } catch (Exception e) {
                logger.warn("Could not decode JSON for additional information: " + details, e);
            }
        }
        String scopes = result.getScope();

        if (scopes != null) {
            details.setAutoApproveScopes(StringUtils.commaDelimitedListToSet(scopes));
        }
        return details;
    }
}
