$(document).ready(function(){ 
	
	// 문제  no값 가져오기 
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
	
	// 선택 유형 데이터 가져오기 
	$.ajax({
		type: "POST",
		url: "/problem",
		data: getParam()
	}).done(function(d) {
		problemCheck();
		var param = d.data.tiele;
		$(".type").text("선택유형 " + " : " +param.ty_grade + " >> " +param.ty_Lgroup + " >> " +param.ty_Mgroup + " >> " +param.ty_level );
		problemView(d.data.image);
	});
	
//	예제 : localStorage 아이템 읽기 	 : var cat = localStorage.getItem('myCat');
//		 localStorage 아이템 삭제    : localStorage.removeItem('myCat');
//	새로고침에도 선택 한 답을 안 지워 주는 작업 
	
	var problemCheck = function(){
		if(localStorage.getItem('problem-index') == null){
			var value = 0;
			localStorage.setItem('problem-index', value);
		}
		if(localStorage.getItem('problem') == null) {
			var result = [0,0,0,0,0,0,0,0,0,0];
			localStorage.setItem('problem', JSON.stringify(result));
		}
		StartEvent();
	}
	
	var problemRemove = function(){
		localStorage.removeItem('problem');
		localStorage.removeItem('problem-index');
	}	

	// 문제 이미지 가져오기
	var problemView = function(data){
		var num = localStorage.getItem('problem-index');
		for(var row in data) {
			var disNone = "";
			if(row != num) {disNone = "disNone";}
			html = `
				<div class="${disNone}">
					<p> ${Number(row) + 1} .</p>
					<div class = "images">
						<img src="/resources/images/${data[row].p_img}" >
					</div>
				</div> 
			`;
			$(".section").append(html);
		}
		
		// 다음 이전 버튼 이벤트 		
		if(num > 0) {
			$("#btn1").attr('disabled', false);
		}
		if(num < 9) {
			$("#btn2").attr('disabled', false);
		}
		$("#btn1").click(function(){	// 이전
			$("#btn2").attr('disabled', false);
			var num = Number(localStorage.getItem('problem-index')) - 1;
			btnEvent(num, "#btn1", 0);
		});
		$("#btn2").click(function(){	// 다음	
			$("#btn1").attr('disabled', false);
			var num = Number(localStorage.getItem('problem-index')) + 1;
			btnEvent(num, "#btn2", 9);
		});
	}
	
	// 종료 버튼 이벤트 
	$("#btn3").click(function(){
		problemRemove();
		location.href = "/problem";
	});
	
	// 제출 버튼 이벤트 
	$("#btn4").click(function(){
		var data = localStorage.getItem('problem');
		console.log(data);
		
		var params = getParam();
		console.log(params);
		
		params.data = data;		
		console.log(params);
		
		$.ajax({
			type: "POST",
			url: "/problemanswer",
			data: params
		}).done(function(d) {
			console.log(d);
			
			if(d == 1) {
				problemRemove();
				location.href = "/grade";
			} else {
				// 오류
			}
		});
		
	});
	
	var btnEvent = function(num, target, end) {
		$(".section > div").addClass("disNone");
		$(".section > div").eq(num).removeClass("disNone");
		localStorage.setItem('problem-index', num);
		
		if(num == end) {
			$(target).attr('disabled', true);
		} else {
			$(target).attr('disabled', false);
		}
	}
	
	// 라디오 보여주기와 선택 할 수 있는 이벤트 
	var radioEvent = function(i){
		var no = "";
		if(i < 10) {
			no = "0" + i;
		} else {
			no = i;
		}
		html = `
		<div class="form-radio-wrap">
            <p class="form-sub-title"> ${no}.</p>
            <span class="form-inline"> 
               <input type="radio" class="input-radio" name="radio${i}" id="radio${i}-1" >
               <label for="radio${i}-1" class="form-radio">1</label>
            </span>
            <span class="form-inline"> 
              	<input type="radio" class="input-radio" name="radio${i}" id="radio${i}-2">
              	<label for="radio${i}-2" class="form-radio">2</label> 
           	</span>
            <span class="form-inline"> 
               <input type="radio" class="input-radio" name="radio${i}" id="radio${i}-3">
               <label for="radio${i}-3" class="form-radio">3</label> 
            </span>
            <span class="form-inline"> 
               <input type="radio" class="input-radio" name="radio${i}" id="radio${i}-4">
               <label for="radio${i}-4" class="form-radio">4</label> 
            </span>
            <span class="form-inline"> 
               <input type="radio" class="input-radio" name="radio${i}" id="radio${i}-5">
               <label for="radio${i}-5" class="form-radio">5</label>
            </span>
        </div>
		`;
		$(".answercheck").append(html);
		
		$("input[name=radio" + i + "]").click(function(){
			var num = Number($("input[name=radio" + i + "]").index(this)) + 1;
			var data = JSON.parse(localStorage.getItem('problem'));
			data[i - 1] = num;
			localStorage.setItem('problem', JSON.stringify(data));
			CountEvent();
		});
		
		CountEvent();
	}
	
	var CountEvent = function(){
		var data = JSON.parse(localStorage.getItem('problem'));
		// 문제 풀이 수 확인
		var count = 0;
		for(var index in data) {
			var v = data[index];
//			console.log(v);
			if(v > 0) {
				count++;
				$("input[name=radio" + (Number(index) + 1) + "]").eq(v - 1).prop('checked', true); 
			}
		}
		$("#CNT").text(count);
	}
	
	
	var StartEvent = function(){
		// 라디오 이벤트 10개 생성
		for(var i = 1; i <= 10; i++){
			radioEvent(i);
		}
	}
	
	var answer = {
			
			
	}  
	
	
	
});