$(document).ready(function(){
	// 회원 목록 가져오기
	var params = {};
	var getParams = function(){
		var q = location.search;
		q = q.substring(1, q.length);
		var arr = q.split("&");
		for(var i = 0; i < arr.length; i++) {
			  if(arr[i] == "") {
				  break;
			  }
		      var data = arr[i].split("=");
		      var key = data[0];
		      var value = data[1];
		      console.log(key, value);
		      params[key] = value;
		}
		getDate();
	}
	
	var getDate = function() {
		$.ajax({
			type: "post",
			url: "/getstudent",
			data : params
		}).done(function(d){
			console.log(d);
			
				$("#no").val(d.s_no);
				$("#name").val(d.s_name);
				$("#idcheck").val(d.s_id);
				$("#password").val(d.s_pwd);
				$("#gender").val(d.s_gender);
				$("#grade").val(d.s_grade);
				$("#tel").val(d.s_tell);
			
		});
	}
	
	getParams();
	
	// 학생 회원 정보 수정
	$("#edit").submit(function(e){
		console.log("edit");
		e.preventDefault();
		var edit = {
			s_no:		$("#no").val(),
			s_name:		$("#name").val(),	
			s_id:		$("#idcheck").val(),	
			s_pwd:		$("#password").val(),
			s_gender:	$("#gender").val(),
			s_grade:    $("#grade").val(),
			s_tell:		$("#tel").val()
		};		
		if($("#password").val() != "") {
			edit.password = $("#password").val();
		}
		$.ajax({
			type : "PATCH",
			url  : "/studentedit",
			data : JSON.stringify(edit),
			contentType: 'application/json; charset=UTF-8'
			}).done(function(d){
			console.log(d);
			if(d){
				alert("회원 정보 수정");			
			}else {
				alert("회원 정보 실패");			
			}
		});	
		
	});
	

	
	
	
	
});