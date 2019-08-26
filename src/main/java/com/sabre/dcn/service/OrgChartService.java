package com.sabre.dcn.service;

import java.util.List;

import com.sabre.dcn.domain.OrgChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabre.dcn.repository.OrgChartRepository;

@Service
public class OrgChartService {
	
	@Autowired
	private OrgChartRepository orgChartRepository;
	
	public OrgChart getUserByGid(String gid) {
		return this.orgChartRepository.findByGidIgnoreCaseContaining(gid);
	}
	
	public OrgChart getUserByName(String name) {
		return this.orgChartRepository.findByName(name);
	}
	
	public List<OrgChart> getAllOrgChart() {
		return this.orgChartRepository.findAll();
	}

	public List<OrgChart> findAllByNameIgnoreCaseContaining(String name) {
		return this.orgChartRepository.findAllByNameIgnoreCaseContaining(name);
	}
	
	public List<OrgChart> findAllByMgidIgnoreCaseContaining(String mgid) {
		return this.orgChartRepository.findAllByMgidIgnoreCaseContaining(mgid);
	}

}
