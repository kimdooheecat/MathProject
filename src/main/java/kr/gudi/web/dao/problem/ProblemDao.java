package kr.gudi.web.dao.problem;

import java.util.List;
import java.util.Map;

public interface ProblemDao {
	
	public Map<String, Object> problem(Map<String, Object> params);
	
	public List<Map<String, Object>> problemimage(Map<String, Object> paramimage);
	
	public Map<String, Object> problemanswer(Map<String, Object> paramanswer);

}
