package kr.gudi.web.service.edit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.web.bean.UserBean;
import kr.gudi.web.dao.edit.EditDao;

@Service
public class EditServicelmp implements EditService {

	@Autowired EditDao editDao;
	
	// 회원 정보 가져오기 
	@Override
	public UserBean getstudent(UserBean ub) {
		return editDao.getstudent(ub);
	}
	
	@Override
	public int studentedit(UserBean ub) {
		System.out.println("editSER : " + ub);
		return editDao.studentedit(ub);
	}





	

}
