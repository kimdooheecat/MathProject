$(document).ready(function(){
	var op=	{
//			contentType:'application/json; charset=UTF-8'
			};
	
	$("#authForm").submit(function(e){
		 
	      e.preventDefault();
	      console.log("로그인");
	      var login = {
	    	  s_id :  $("#loginId").val(),
	    	  s_pwd:  $("#loginPw").val()
	      };
	      op.url = "/login";
	      op.type = "POST";
	      op.data = login;
	      $.ajax(op).done(function(d){
	         if(d) {
	        	alert("login성공")
	        	location.href = "/main";
	         } else {
	            alert("login실패");
	            location.href = "/login";
	         }
	      });
	   });
	
	
});