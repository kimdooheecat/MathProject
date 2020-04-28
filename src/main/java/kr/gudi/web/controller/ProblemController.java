package kr.gudi.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.gudi.web.bean.StudentanswerBean;
import kr.gudi.web.bean.UserBean;
import kr.gudi.web.dao.problem.ProblemDao;
import kr.gudi.web.service.problem.ProblemSevice;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class ProblemController {
	
	@Autowired private ProblemSevice problemsevice;
	
	@RequestMapping (value = "/problem" , method=RequestMethod.POST ) 
	public @ResponseBody Map<String, Object> problem(@RequestParam("ty_no") String ty_no) {
//		System.out.println(ty_no);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ty_no", ty_no);
		Map<String, Object> result = problemsevice.problem(params);
		resultMap.put("data", result);
		return resultMap;
	}
	
//	@RequestMapping (value = "/problemanswer" , method=RequestMethod.POST )
//	public @ResponseBody Map<String, Object> problemanswer(@RequestParam("ty_no") String ty_no){		
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("ty_no" , ty_no);
//		Map<String, Object> resultList = problemsevice.problem(params);
//		return resultList; 
//	}

	@Autowired private ProblemDao pd;
	
	@RequestMapping (value = "/problemanswer" , method=RequestMethod.POST )
	public @ResponseBody int studentanswer(@RequestParam("ty_no") String ty_no, @RequestParam("data") String data, HttpSession session) {
		System.out.println(ty_no);
		System.out.println(data);
		
		Object obj = session.getAttribute("User");
		if(obj != null) {
			UserBean ub = (UserBean) obj;
			int s_no = ub.getS_no();		
			
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("ty_no", 100);  // *** 문제 등록이 되었을 경우 > 100 >> ty_no 교체 처리 할것
			List<Map<String, Object>> pl = pd.problemimage(params);
			
			int state = 0;
			
			JSONArray ja = JSONArray.fromObject(data);
			System.out.println(ja);
			for(int i = 0; i < ja.size(); i++) {
				int p_no =  Integer.parseInt(pl.get(i).get("p_no").toString());
				String a_s_answer = ja.getString(i);
				System.out.println("p_no : " + p_no);
				System.out.println("s_no : " + s_no);
				System.out.println("a_s_answer : " + a_s_answer);
				
				StudentanswerBean sb = new StudentanswerBean();   
				sb.setP_no(p_no);
				sb.setS_no(s_no);
				sb.setA_s_answer(a_s_answer);
				
				state += problemsevice.studentanswer(sb);
			}
			
			System.out.println(state);
			
			if(state == 10) {
				return 1;
			}
			
		}
		
		return -1;
	}
	
	
	
	
	

}
