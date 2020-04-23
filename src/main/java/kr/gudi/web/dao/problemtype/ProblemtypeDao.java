package kr.gudi.web.dao.problemtype;

import java.util.List;
import java.util.Map;

public interface ProblemtypeDao {
	
	public List<Map<String, Object>> problemtype1(Map<String, Object> params);
	
	public List<Map<String, Object>> problemtype2(Map<String, Object> params);
	
	public List<Map<String, Object>> problemtype3(Map<String, Object> params);
	
	public List<Map<String, Object>> problemtype4(Map<String, Object> params);

}
