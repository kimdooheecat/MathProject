$(document).ready(function(){
		
	$("#deps1 li").click(function(e){
		var params =  {
			ty_grade : $(this).text().trim()					
		};
		console.log(params);
		$.ajax({
			type : "POST" ,
			url : "/problemtype1",
			data : params
		}).done(deps2Event);
	});
	
	var deps2Event = function(d){
		$("#deps2").empty();
		for(var row in d){
			html = `<li> ${d[row].ty_Lgroup}</li>`;
			$("#deps2").append(html);	
		}
		$("#deps2 li").click(function(e){
			console.log("#deps2 li");
			var params =  {
					ty_Lgroup : $(this).text().trim()					
			};
			console.log(params);
			
			$.ajax({
				type : "POST" ,
				url : "/problemtype2",
				data : params
			}).done(deps3Event);
		});
	}
	
	var deps3Event = function(d){
		$("#deps3").empty();
		for(var row in d){
			html = `<li> ${d[row].ty_Mgroup}</li>`;
			$("#deps3").append(html);	
		}
		$("#deps3 li").click(function(e){
			console.log("#deps3 li");
			var params =  {
					ty_Mgroup : $(this).text().trim()					
			};
			console.log(params);
			$.ajax({
				type : "POST" ,
				url : "/problemtype3",
				data : params
			}).done(deps4Event);
		});
	}	
	
	var deps4Event = function(d){
		console.log(d);
		$("#deps4").empty();
		for(var row in d){
			html = `<li data-ty-no="${d[row].ty_no}"> ${d[row].ty_level}</li>`;
			$("#deps4").append(html);	
		}
		$("#deps4 li").click(function(e){
			console.log("#deps4 li");
			var params =  {
					ty_level : $(this).text().trim(),
					ty_no : $(this).attr("data-ty-no")
			};
			console.log(params);
			
			// 문제 화면 이동  problem_type의 번호로 
		});
	}
	
});
	