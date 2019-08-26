package com.sabre.dcn.config.auth;

import com.sabre.dcn.config.auth.domain.Role;

import java.util.*;

public interface RoleResolver {
    Set<Role> getRole(String userId);
}
