package kr.gudi.web.service.problem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.web.bean.StudentanswerBean;
import kr.gudi.web.dao.problem.ProblemDao;
import kr.gudi.web.dao.problemtype.ProblemtypeDao;

@Service
public class ProblemSevicelmp implements ProblemSevice {
	
	@Autowired private ProblemDao problemdao;

	@Override
	public Map<String, Object> problem(Map<String, Object> params) {
		Map<String, Object> ResultMap = new HashMap<String, Object>();
	    ResultMap.put("tiele", problemdao.problem(params));
	    
	    params.put("ty_no", 100);
	    ResultMap.put("image", problemdao.problemimage(params));
//	    System.out.println(ResultMap);
	    return ResultMap;
	}
	
//	@Override
//	public Map<String, Object> problemanswer(Map<String, Object> paramanswer) {
//		Map<String, Object> ResultMap = new HashMap<String, Object>();
//		ResultMap.put("answer", problemdao.problemanswer(paramanswer));
//		return ResultMap;
//	}

	@Override
	public int studentanswer(StudentanswerBean sab) {
		return problemdao.studentanswer(sab);
	}


	

}
