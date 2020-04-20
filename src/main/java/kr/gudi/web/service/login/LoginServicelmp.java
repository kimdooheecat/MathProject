package kr.gudi.web.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gudi.web.bean.UserBean;
import kr.gudi.web.dao.login.LoginDao;

@Service
public class LoginServicelmp implements LoginService {
	
	@Autowired private LoginDao logindao;

	@Override
	public UserBean login(UserBean ub) {
		//System.out.println("service"  + ub);
		return logindao.login(ub);
	}

}
