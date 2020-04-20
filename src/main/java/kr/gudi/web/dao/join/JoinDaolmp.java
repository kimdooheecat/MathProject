package kr.gudi.web.dao.join;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.gudi.web.bean.TBean;
import kr.gudi.web.bean.UserBean;

@Repository
public class JoinDaolmp implements JoinDao {
	
	@Autowired
	SqlSession session;

	@Override
	public int join(UserBean ub) {
		//System.out.println("joindao : " + ub);
		return session.insert("join.join" , ub);
	}

	@Override
	public int teacherjoin(TBean tb) {
		System.out.println("joindao : " + tb);
		return session.insert("join.teacherjoin" , tb);
	}

}
