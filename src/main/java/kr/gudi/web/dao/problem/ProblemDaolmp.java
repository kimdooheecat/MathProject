package kr.gudi.web.dao.problem;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProblemDaolmp implements ProblemDao {
	
	@Autowired SqlSession session;

	@Override
	public Map<String, Object> problemtype(Map<String, Object> params) {
		System.out.println(params);
		Map<String, Object> resultList = session.selectOne("problem.type", params);
		System.out.println(resultList);
		return resultList;
	}

}
