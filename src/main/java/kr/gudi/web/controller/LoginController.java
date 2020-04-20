package kr.gudi.web.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.gudi.web.bean.UserBean;
import kr.gudi.web.service.login.LoginService;

@Controller
public class LoginController {
	
	@Autowired private LoginService loginService;
	
	@RequestMapping (value = "/login", method = RequestMethod.POST)
	public @ResponseBody boolean login(UserBean ub, HttpSession session) {
		UserBean userBean = loginService.login(ub);
		session.setAttribute("User", userBean); 
		System.out.println("LoginController" + userBean);
		
		if(userBean == null) {
			return false;
			
		}
		return true;
	}
		
//	@RequestMapping (value = "/login", method = RequestMethod.POST)
//	public @ResponseBody UserBean login(UserBean ub, HttpSession session) {
//		System.out.println("LoginController" + ub);
//		return loginService.login(ub);
//	}
//	
}
