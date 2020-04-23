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

import kr.gudi.web.service.problemtype.ProblemtypeService;

@Controller
public class ProblemtypeController {
	
	@Autowired private ProblemtypeService problemtypeservice;
	
	@RequestMapping (value = "/problemtype1" , method=RequestMethod.POST ) 
	public @ResponseBody List<Map<String, Object>> problemtype1(@RequestParam("ty_grade") String ty_grade) {
		System.out.println(ty_grade);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ty_grade", ty_grade);
		List<Map<String, Object>> resultList = problemtypeservice.problemtype1(params);
		System.out.println(resultList);
		return resultList;
	}
	
	@RequestMapping (value = "/problemtype2" , method=RequestMethod.POST ) 
	public @ResponseBody List<Map<String, Object>> problemtype2(@RequestParam("ty_Lgroup") String ty_Lgroup) {
		System.out.println(ty_Lgroup);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ty_Lgroup", ty_Lgroup);
		List<Map<String, Object>> resultList = problemtypeservice.problemtype2(params);
		System.out.println(resultList);
		return resultList;
	}
	
	@RequestMapping (value = "/problemtype3" , method=RequestMethod.POST ) 
	public @ResponseBody List<Map<String, Object>> problemtype3(@RequestParam("ty_Mgroup") String ty_Mgroup) {
		System.out.println(ty_Mgroup);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ty_Mgroup", ty_Mgroup);
		List<Map<String, Object>> resultList = problemtypeservice.problemtype3(params);
		System.out.println(resultList);
		return resultList;
	}
	
	
	

}
