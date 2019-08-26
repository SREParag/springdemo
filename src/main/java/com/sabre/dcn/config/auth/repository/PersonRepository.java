package com.sabre.dcn.config.auth.repository;

import com.sabre.dcn.config.auth.domain.Person;
import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends LdapRepository<Person> {
}
