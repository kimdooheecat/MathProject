package kr.gudi.web.dao.edit;

import kr.gudi.web.bean.UserBean;

public interface EditDao {
	
	//회원 목록 가져오기 
	public UserBean getstudent(UserBean ub);
	
	// 회원정보 수정
	public int studentedit(UserBean ub);

}
