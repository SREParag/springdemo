package com.sabre.dcn.config.auth;

import com.sabre.dcn.config.auth.domain.User;

public interface UsernamePasswordAuthenticationProvider {
    User authenticate(String username, String password);
}
