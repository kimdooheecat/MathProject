package kr.gudi.web.dao.edit;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.gudi.web.bean.UserBean;

@Repository
public class EditDaolmp implements EditDao {
	
	@Autowired
	SqlSession session;

	// 회원 목록 가져오기
	@Override
	public UserBean getstudent(UserBean ub) {
		return session.selectOne("join.getstudent" , ub);
	}
	
	// 회원 정보 수정 
	@Override
	public int studentedit(UserBean ub) {
		System.out.println("editDAO : " + ub );
		return session.update("join.studentedit" , ub);
	}

	

}
