package com.sabre.dcn.config.auth.ldap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;
import org.springframework.ldap.core.ContextSource;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

@Configuration
@EnableLdapRepositories(basePackages = "com.sabre.reportr.config.auth")
public class LdapConfiguration {

    @Bean
    public ContextSource ldapContextSource() {
        LdapContextSource source = new LdapContextSource();
        source.setUrls(new String[]{"ldap://global.ad.sabre.com:389"});
        source.setBase("DC=Global,DC=ad,DC=sabre,DC=com");
        source.setAuthenticationSource(authenticationSource());
        return source;
    }

    @Bean
    public LdapTemplate ldapTemplate() {
        LdapTemplate template = new LdapTemplate(ldapContextSource());
        template.setIgnorePartialResultException(true);
        return template;
    }

    @Bean
    public ThreadLocalAuthenticationSource authenticationSource() {
        return new ThreadLocalAuthenticationSource();
    }
}
