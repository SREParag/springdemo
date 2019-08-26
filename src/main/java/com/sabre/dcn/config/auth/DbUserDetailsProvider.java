package com.sabre.dcn.config.auth;

import com.sabre.dcn.config.auth.domain.User;
import com.sabre.dcn.config.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbUserDetailsProvider implements UserDataProvider
{
    @Autowired
    private UserRepository usersRepository;

    @Override
    public User getData(String userId)
    {
        User user = usersRepository.findBySgid(userId);
        if (user != null) {
            return new User().withId(user.getId()).withSgid(userId).withRoles(user.getRoles());
        }
        return  null;
        /*throw new AuthServiceException("No user found with id: " + userId);*/
    }
}
