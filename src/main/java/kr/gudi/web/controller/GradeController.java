package kr.gudi.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.gudi.web.service.grade.GradeService;

@Controller
public class GradeController {
	
	@Autowired private GradeService gradeservice;
	
	@RequestMapping(value = "/grdaelist" , method=RequestMethod.POST)
	public @ResponseBody List<Map<String, Object>> grdaelist(@RequestParam("ty_no") String ty_no) {
		System.out.println(ty_no);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ty_no", ty_no);
		List<Map<String, Object>> resultList = gradeservice.gradelist(params);
		System.out.println(resultList);
		return resultList;
	}
}
