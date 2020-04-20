package kr.gudi.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.gudi.web.bean.UserBean;
import kr.gudi.web.service.edit.EditService;

@Controller
public class EditController {

	@Autowired private EditService editService;
	
	
	// 회원 목록 가져오기 	
	@PostMapping("/getstudent")
	public @ResponseBody UserBean getData(HttpServletRequest req, HttpSession session) {
		UserBean ub = new UserBean();
		System.out.println("111");
			Object user = session.getAttribute("User");
			if(user != null) {
				ub = (UserBean) user;
				System.out.println(ub);
				return editService.getstudent(ub);
			}	
		return null;
	}
	
	
	// 회원 정보 수정 
	@RequestMapping(value = "/studentedit" , method = RequestMethod.PATCH)
	private @ResponseBody int studentedit(@RequestBody UserBean ub ,HttpSession session ){
//		System.out.println("editCON : " + ub );
//		return editService.studentedit(ub);
		Object obj = editService.studentedit(ub);
		if(obj != null) {
			int state = editService.studentedit(ub);
			if(state > 0) {
//				session.setAttribute("User", editService.getstudent(ub));
				return 1;
			} else {
				return -1;
			}			
		}else
		return -1;
	}
}