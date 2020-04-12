$(function(){
      var className =""  //변수를 선언한다.
        
       $('.f_q_link').on({    //버튼을
 
           click: function(){  //클릭했을때 
 
                className=$(this).parent().next().attr('class').slice(-2); 
                //보여줄 li의 class이름을 뒤에서 두자리(on)를 변수에 담는다.
 
               if(className=='on'){  //만약 클래스명이 'on'이면
 
                   $(this).parent().next().removeClass('on'); //class'on' 삭제
 
                  $(this).prev().children().eq(3).children()
                  .css({transform:'rotate(0deg)',transition:'all 0.4s',color:'#000'});
                   //화살표 아이콘의 원래 css로 돌리기
               }
               else if(className!='on'){  //만약 클래스명이 'on'이 아니면
 
                   $(this).parent().next().addClass('on');  //class'on' 추가
 
                  $(this).prev().children().eq(3).children()
                 .css({transform:'rotate(180deg)',transition:'all 0.4s',color:'#7070ea'});  
                  // 화살표 아이콘 css 수정
               }
                
            }
           
        });
        
    });

