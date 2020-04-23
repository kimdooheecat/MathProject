package kr.gudi.web.service.problemtype;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.web.dao.problemtype.ProblemtypeDao;

@Service
public class ProblemtypeServicelmp implements ProblemtypeService {
	
	@Autowired private ProblemtypeDao problemtypedao;

	@Override
	public List<Map<String, Object>> problemtype1(Map<String, Object> params) {
		return problemtypedao.problemtype1(params);
	}

	@Override
	public List<Map<String, Object>> problemtype2(Map<String, Object> params) {
		return problemtypedao.problemtype2(params);
	}

	@Override
	public List<Map<String, Object>> problemtype3(Map<String, Object> params) {
		return problemtypedao.problemtype3(params);
	}

	@Override
	public List<Map<String, Object>> problemtype4(Map<String, Object> params) {
		return problemtypedao.problemtype4(params);
	}



}
