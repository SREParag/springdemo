package com.sabre.dcn.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sabre.dcn.domain.OrgChart;
import com.sabre.dcn.service.OrgChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orgchart")
public class OrgChartController {
	@Autowired
	private OrgChartService orgChartService;

	
	@GetMapping(path = { "/fetchAutoCompleteName" })
	@ResponseBody
	public List<Map<String, String>> fetchAutoCompleteName(Model model, @RequestParam Map<String, String> reqParam) {
		List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
		if (reqParam.get("name") != "" && reqParam.get("name") != null) {
			
			List<OrgChart> orgChart = this.orgChartService
					.findAllByNameIgnoreCaseContaining(reqParam.get("name").toString());
			Iterator<OrgChart> iterator = null;


			iterator = orgChart.iterator();
			while (iterator.hasNext()) {
				OrgChart record = iterator.next();
				Map<String, String> dataMap = new HashMap<String, String>();
				dataMap.put("id", record.getId().toString());
				dataMap.put("name", record.getName().toString());
				dataMap.put("gid", record.getGid().toString());
				dataList.add(dataMap);
			}
		}

		return dataList;
	}

}
