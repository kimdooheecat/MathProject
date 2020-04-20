$(document).ready(function(){
	$(".t").click(function(){
		$(".t").removeClass("active");
		$(this).addClass("active");
		$("#join").load( "/view/joinForm" + ($(".t").index(this) + 1));
	});
	
	// 학생 회원 가입
	$("#join1").submit(function(e){
		console.log("join1");
		e.preventDefault();
		var params = {
				s_name:	 	$("#name").val(),
				s_id:		$("#idcheck").val(),
				s_pwd:		$("#password").val(),
				s_gender:	$("#gender").val(),
				s_grade:    $("#grade").val(),
				s_tell:		$("#tel").val()		
		};
		console.log(params);
		$.ajax({
			type :"POST",
			url  : "/join",
			data : params
			}).done(function(d){
			console.log(d);
			if(d){
				alert("회원가입 성공");			
			}else {
				alert("회원가입 실패");			
			}
		});	
	});
	
	// 선생님 회원 가입
	$("#teacherjoin").submit(function(e){
		console.log("teacherjoin");
		e.preventDefault();
		var teacher = {
				t_name: $("#teachername").val(),
				t_id: $("#teacheridcheck").val(),
				t_pwd: $("#teacherpassword").val()	
		};
		console.log(teacher);
		$.ajax({
			type :"POST",
			url  : "/teacher",
			data : teacher
			}).done(function(d){
			console.log(d);
			if(d){
				alert("회원가입 성공");			
			}else {
				alert("회원가입 실패");			
			}
		});	
	});
	
	
	
	
	
});