package kr.gudi.web.dao.join;

import kr.gudi.web.bean.TBean;
import kr.gudi.web.bean.UserBean;

public interface JoinDao {
	
	public int join(UserBean ub);
	
	public int teacherjoin(TBean tb);

}
