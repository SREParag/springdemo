package com.sabre.dcn.config.auth;

import com.sabre.dcn.config.auth.domain.Role;
import com.sabre.dcn.config.auth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class GenericRoleResolverImpl implements RoleResolver {
    @Autowired
    private UserDataProvider userDataProvider;

    @Override
    public Set<Role> getRole(String userId) {
        Set<Role> newRoles = new HashSet<>();
        User user = userDataProvider.getData(userId);
        if (user != null) {
            try {
                return user.getRoles();
            } catch (IllegalArgumentException ex) {
                return newRoles;
            }
        }
        return newRoles;
    }
}
