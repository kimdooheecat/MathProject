package kr.gudi.web.service.grade;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.web.dao.grade.GradeDao;

@Service
public class GradeServicelmp implements GradeService {

	@Autowired private GradeDao gradedao; 
	 
	@Override
	public List<Map<String, Object>> gradelist(Map<String, Object> parmlist) {
		
		return gradedao.gradelist(parmlist);
	}

}
