package kr.gudi.web.dao.problemtype;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProblemtypeDaolmp implements ProblemtypeDao {
	
	@Autowired SqlSession session;

	@Override
	public List<Map<String, Object>> problemtype1(Map<String, Object> params) {
		System.out.println(params);
		List<Map<String, Object>> resultList = session.selectList("problem.typeLgroup", params);
		System.out.println(resultList);
		return resultList;
	}

	@Override
	public List<Map<String, Object>> problemtype2(Map<String, Object> params) {
		System.out.println(params);
		List<Map<String, Object>> resultList = session.selectList("problem.typeMgroup", params);
		System.out.println(resultList);
		return resultList;
	}

	@Override
	public List<Map<String, Object>> problemtype3(Map<String, Object> params) {
		System.out.println(params);
		List<Map<String, Object>> resultList = session.selectList("problem.typeLevel", params);
		System.out.println(resultList);
		return resultList;
	}
	
	@Override
	public List<Map<String, Object>> problemtype4(Map<String, Object> params) {
		System.out.println(params);
		List<Map<String, Object>> resultList = session.selectList("problem.typeLevel", params);
		System.out.println(resultList);
		return resultList;
	}



}
