$(document).ready(function(){
	$(".t").click(function(){
		$(".t").removeClass("active");
		$(this).addClass("active");
		$("#join").load( "/view/joinForm" + ($(".t").index(this) + 1));
	});
});