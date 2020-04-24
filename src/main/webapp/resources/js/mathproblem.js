$(document).ready(function(){ 
	
	var getParam = function(){
		var q = document.location.search;
		var params = q.substring(1, q.length);
		var paramArr = params.split("&");
		var param = paramArr[0].split("=");
		var p = {}; 
		p[param[0]] = param[1];
		return p;
	}
	console.log(getParam());
	
	$.ajax({
		type: "POST",
		url: "/problem",
		data: getParam()
	}).done(function(d) {
		console.log(d);
		var param = d.tiele;
		console.log(param.ty_level);
		$(".type").text("선택유형 " + " : " +param.ty_grade + " >> " +param.ty_Lgroup + " >> " +param.ty_Mgroup + " >> " +param.ty_level );
		
		
	});
	
	
	
	
});