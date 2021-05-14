package com.pupilary.provider.model.dto;

import com.pupilary.provider.model.domain.Role;
import com.pupilary.provider.model.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author takesi
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDetailsDto extends User implements UserDetails {

    private static final long serialVersionUID = 5217470920709575176L;

    private List<Role> roles;
    private Set<String> permissions;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new HashSet<>();

        if (!CollectionUtils.isEmpty(roles)) {
            roles.forEach(i -> collection.add(new SimpleGrantedAuthority(i.getCode())));
        }
        return collection;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return super.getStatus();
    }
}
