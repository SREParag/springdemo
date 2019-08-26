package com.sabre.dcn.config.auth.ldap;

import com.sabre.dcn.config.auth.*;
import com.sabre.dcn.config.auth.domain.Person;
import com.sabre.dcn.config.auth.domain.Role;
import com.sabre.dcn.config.auth.domain.User;
import com.sabre.dcn.config.auth.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class LdapBasedAuthenticationProvider implements UsernamePasswordAuthenticationProvider {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ThreadLocalAuthenticationSource authenticationSource;

    @Autowired
    private RoleResolver roleResolver;

    @Autowired
    private UserDataProvider userDataProvider;

    @Override
    public User authenticate(String username, String password) {
        try {
            authenticationSource.setAuthenticationData(username, password);
            Person p = personRepository.findOne(new QueryBuilder().withSgId(username).build()).orElse(null);
            Set<Role> role = roleResolver.getRole(username);
            return new User()
                    .withSgid(username)
                    .withRoles(role);

        } catch (org.springframework.ldap.AuthenticationException ex) {
            throw new AuthServiceException("Authentication failed.");
        } finally {
            authenticationSource.clean();
        }
    }
}
