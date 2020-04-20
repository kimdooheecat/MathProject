package kr.gudi.web.service.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.web.bean.TBean;
import kr.gudi.web.bean.UserBean;
import kr.gudi.web.dao.join.JoinDao;

@Service
public class JoinServicelmp implements JoinService {
	
	@Autowired JoinDao joinDao;

	// 학생 회원 등록
	@Override
	public int join(UserBean ub) {
		
		return joinDao.join(ub);
	}
	
	//선생님 회원등록
	@Override
	public int teacherjoin(TBean tb) {
		System.out.println( "Ser :" + tb);
		return joinDao.teacherjoin(tb);
	}
	

	
}
