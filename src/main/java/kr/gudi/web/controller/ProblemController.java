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

import kr.gudi.web.service.problem.ProblemSevice;

@Controller
public class ProblemController {
	
	@Autowired private ProblemSevice problemsevice;
	
	@RequestMapping (value = "/problem" , method=RequestMethod.POST ) 
	public @ResponseBody Map<String, Object> problemtype1(@RequestParam("ty_no") String ty_no) {
		System.out.println(ty_no);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ty_no", ty_no);
		Map<String, Object> resultList = problemsevice.problemtype(params);
		System.out.println(resultList);
		return resultList;
	}
	

}
