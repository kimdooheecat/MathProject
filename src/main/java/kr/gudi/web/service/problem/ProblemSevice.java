package kr.gudi.web.service.problem;

import java.util.List;
import java.util.Map;

public interface ProblemSevice {
	
	public Map<String, Object> problem(Map<String, Object> params);
	
	public Map<String, Object> problemanswer(Map<String, Object> paramanswer);
}
