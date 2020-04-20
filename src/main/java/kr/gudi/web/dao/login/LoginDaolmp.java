package kr.gudi.web.dao.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.gudi.web.bean.UserBean;

@Repository
public class LoginDaolmp implements LoginDao {
	
	@Autowired SqlSession session;

//	@Override
//	public UserBean signup(UserBean ub) {
//		System.out.println("Dao"  + ub);
//		return session.selectOne("join.login",ub);
//	}

	@Override
	public UserBean login(UserBean ub) {
		System.out.println("Dao"  + ub);
		return session.selectOne("join.login",ub);
	}

}
