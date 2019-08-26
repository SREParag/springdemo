package com.sabre.dcn.repository;

import com.sabre.dcn.domain.CustomConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomConfigurationRepository extends  JpaRepository<CustomConfiguration, Integer>{
	CustomConfiguration findByConfigKey(String configKey);

}
