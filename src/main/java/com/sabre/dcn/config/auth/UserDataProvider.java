package com.sabre.dcn.config.auth;

import com.sabre.dcn.config.auth.domain.User;

public interface UserDataProvider {
    User getData(String userId);
}
