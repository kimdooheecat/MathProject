package kr.gudi.web.service.problem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.web.dao.problem.ProblemDao;
import kr.gudi.web.dao.problemtype.ProblemtypeDao;

@Service
public class ProblemSevicelmp implements ProblemSevice {
	
	@Autowired private ProblemDao problemdao;

	@Override
	public Map<String, Object> problemtype(Map<String, Object> params) {
		Map<String, Object> ResultMap = new HashMap<String, Object>();
	    ResultMap.put("tiele", problemdao.problemtype(params));
//	    System.out.println(ResultMap);
	    return ResultMap;
	}
	
	
	

}
