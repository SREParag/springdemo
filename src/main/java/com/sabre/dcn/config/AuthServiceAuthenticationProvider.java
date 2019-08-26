package com.sabre.dcn.config;

import com.sabre.dcn.config.auth.AuthServiceException;
import com.sabre.dcn.config.auth.domain.User;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import com.sabre.dcn.config.auth.UsernamePasswordAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.security.core.userdetails.UserDetails;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Component
public class AuthServiceAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UsernamePasswordAuthenticationProvider usernamePasswordAuthenticationProvider;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (authentication.getPrincipal() != null && authentication.getPrincipal() instanceof UserDetails) {
            return authentication;
        } else if (isNotEmpty(authentication.getName()) && authentication.getCredentials() != null
                && isNotEmpty(authentication.getCredentials().toString())) {
            try {
                String userName = authentication.getName();
                String password = authentication.getCredentials().toString();
                User user = usernamePasswordAuthenticationProvider.authenticate(userName, password);
                    return new UsernamePasswordAuthenticationToken
                        (user, user.getRoles());
            } catch (AuthServiceException e) {
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
