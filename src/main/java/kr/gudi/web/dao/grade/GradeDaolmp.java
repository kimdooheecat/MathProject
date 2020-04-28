package kr.gudi.web.dao.grade;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GradeDaolmp implements GradeDao {
	
	@Autowired SqlSession session;

	@Override
	public List<Map<String, Object>> gradelist(Map<String, Object> parmlist) {
		 List<Map<String, Object>> resulList = session.selectOne("problem.gradeList", parmlist);
		return resulList;
	}

}
