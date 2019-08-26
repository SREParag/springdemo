package com.sabre.dcn.config.auth.ldap;


import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.SearchScope;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

public class QueryBuilder {

    private String sgId;

    public QueryBuilder withSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public LdapQuery build() {
        return query()
                .searchScope(SearchScope.SUBTREE)
                .where("sAMAccountName").is(sgId);
    }
}
