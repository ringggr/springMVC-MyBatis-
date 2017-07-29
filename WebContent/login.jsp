<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.form.js"></script>
<script>
	function subForm() {
		var username = $("#username").val();
		var password = $("#password").val();
		
		if (!username){
			alert("用户名不能为空");
			return false;
		}
		if (!password){
			alert("密码不能为空");
			return false;
		}
		
		
		$("#loginForm").submit();
	}
	
	
	
	
</script>
</head>
<body>
	<div>
		<form action = "${pageContext.request.contextPath }/user/login.do" method = "post" id = "loginForm">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type = "text" name = "username" id = "username"/></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type = "password" name = "password" id = "password"/></td>
				</tr>
				<tr>
					<td><input type = "button" value = "提交" onclick = "subForm();"/></td>
					<td><input type = "button" value = "注册" onclick="location='register.jsp'"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>