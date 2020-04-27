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
	public Map<String, Object> problem(Map<String, Object> params) {
		System.out.println(params);
		Map<String, Object> resultList = session.selectOne("problem.type", params);
		System.out.println(resultList);
		return resultList;
	}

	@Override
	public List<Map<String, Object>> problemimage(Map<String, Object> paramimage) {
		System.out.println(paramimage);
		List<Map<String, Object>> imageList = session.selectList("problem.image" , paramimage );
		System.out.println("imageDAO:" +  imageList.size());
		return imageList;
	}

	@Override
	public Map<String, Object> problemanswer(Map<String, Object> paramanswer) {
		Map<String, Object> resultanswer = session.selectOne("problem.answer", paramanswer);
		return null;
	}
	
	

}
