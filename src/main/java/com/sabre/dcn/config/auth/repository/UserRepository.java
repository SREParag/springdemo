package com.sabre.dcn.config.auth.repository;
import com.sabre.dcn.config.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findBySgid(String sgid);
}