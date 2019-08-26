package com.sabre.dcn.config.auth.ldap;

import org.springframework.ldap.core.AuthenticationSource;
import org.springframework.stereotype.Component;

@Component
public class ThreadLocalAuthenticationSource implements AuthenticationSource {
    private ThreadLocal<String> sgId = new ThreadLocal<>();

    private ThreadLocal<String> pass = new ThreadLocal<>();

    private static final String domain = "GLOBAL\\";

    public void setAuthenticationData(String sgId, String pass) {
        this.sgId.set(sgId);
        this.pass.set(pass);
    }

    public void clean() {
        sgId.remove();
        pass.remove();
    }

    @Override
    public String getPrincipal() {
        return domain + sgId.get();
    }

    @Override
    public String getCredentials() {
        return pass.get();
    }
}
