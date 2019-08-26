package com.sabre.dcn.service;

import com.sabre.dcn.domain.CustomConfiguration;
import com.sabre.dcn.repository.CustomConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomConfigurationService {
	
	@Autowired
	private CustomConfigurationRepository customConfigurationRepository;

	public CustomConfiguration getConfigurationByKey(String configKey) {
		return this.customConfigurationRepository.findByConfigKey(configKey);
	}

}
