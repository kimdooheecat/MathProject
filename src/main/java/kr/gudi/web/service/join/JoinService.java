package kr.gudi.web.service.join;

import kr.gudi.web.bean.TBean;
import kr.gudi.web.bean.UserBean;

public interface JoinService {
	
	public int join(UserBean ub);
	
	public int teacherjoin(TBean tb);
}
