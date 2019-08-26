package com.sabre.dcn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class CustomConfiguration {
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "custom_configuration_seq")
		@SequenceGenerator(name="custom_configuration_seq", sequenceName = "custom_configuration_seq")
		private Integer id;

		private String configKey;

		private String configValue;

		private String description;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getConfigKey() {
			return configKey;
		}

		public void setConfigKey(String configKey) {
			this.configKey = configKey;
		}

		public String getConfigValue() {
			return configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		
		


}
