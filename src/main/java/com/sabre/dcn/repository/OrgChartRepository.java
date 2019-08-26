package com.sabre.dcn.repository;

import java.util.List;

import com.sabre.dcn.domain.OrgChart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgChartRepository extends JpaRepository<OrgChart, Integer>{
	OrgChart findByGidIgnoreCaseContaining(String gid);
	
	List<OrgChart> findAllByMgidIgnoreCaseContaining(String mgid);
	
	OrgChart findByName(String name);
	

	List<OrgChart> findAllByNameIgnoreCaseContaining(String name);
}
