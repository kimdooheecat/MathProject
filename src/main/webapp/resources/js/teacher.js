$(document).ready(function(){
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