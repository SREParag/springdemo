package com.sabre.dcn.config.auth.domain;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

@Entry(base = "DC=Global,DC=ad,DC=sabre,DC=com", objectClasses = {"person"})
public class Person {
    private @Id
    Name id;
    private @Attribute(name = "cn")
    String fullName;

    public Name getId() {
        return id;
    }

    public void setId(Name id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
