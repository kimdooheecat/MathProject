package kr.gudi.web.dao.grade;


import java.util.List;
import java.util.Map;

public interface GradeDao {
   
	 public List<Map<String , Object>> gradelist(Map<String , Object> parmlist);
}
