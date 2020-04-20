package kr.gudi.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.gudi.web.bean.TBean;
import kr.gudi.web.bean.UserBean;
import kr.gudi.web.service.join.JoinService;

@Controller
public class JoinController {
	
	@Autowired private JoinService joinService;
	
	@RequestMapping(value ="/join", method = RequestMethod.POST)
	public @ResponseBody int join(UserBean ub) throws Exception {
		//System.out.println("con:" + ub);
		return joinService.join(ub);
	}
	
	@RequestMapping(value ="/teacher", method = RequestMethod.POST)
	public @ResponseBody int teacherjoin(TBean tb) throws Exception {
		System.out.println("con:" + tb);
		return joinService.teacherjoin(tb);
	}

}
