<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    
<html>
<script src="../js/jquery.1.11.3.min.js">
alert(window.location.href);

</script>
<script type="text/javascript">
$(document).ready(function(){	
$("#login").click(function(){
	
	
	$.get("/system/user/login", 
			function(data){
		    debugger
		
		alert("Data Loaded: " +data);
		
		});

	
	
	
	
});

});
</script>

<script type="text/javascript">

	



function a()
{
	var a=$("#login");
	alert(a.html());
	alert("aaa");


	}
</script>










<body>
<h2>欢迎来到测试注册系统</h2>
<center>
<button id="login"> 登录</button>
<button id="zhuce">注册</button>
</center>


</body>
</html>
