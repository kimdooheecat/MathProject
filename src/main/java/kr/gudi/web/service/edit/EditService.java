package kr.gudi.web.service.edit;

import kr.gudi.web.bean.UserBean;

public interface EditService {
	
	// 회원 정보 가져오기 
	public UserBean  getstudent(UserBean ub);
	
	//회원 정보 수정 
	public int studentedit(UserBean ub);

}
