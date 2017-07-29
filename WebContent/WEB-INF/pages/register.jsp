<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="core" %>
<%@ taglib prefix="fmt" uri="fmt" %>
<%@ taglib prefix="fn" uri="fn" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.form.js"></script>

<script type="text/javascript">
	function subForm() {
		var username = $("#username").val();
		var password = $("#password").val();
		var password2 = $("#password2").val();
		
		if (!username){
			alert("用户名不能为空");
			return false;
		}
		if (!password){
			alert("密码不能为空");
			return false;
		}
		if (password2 != password){
			alert("密码不一致");
			return false;
		}
		
		$("#registerForm").submit();
	}
	
	
	
	/* function ajaxFormSub(){
		var option = {
			type:'POST',
			url:'${pageContext.request.contextPath }/'+'user/registerAjax.do',
			data:{},
			dataType:'text',//还有json和html类 通常用json和text
			success:function(data){
				var jsonObj = $.parseJSON(data);
				alert(jsonObj.username + "----------------" + jsonObj.result);
			}
		};
		var username = $("#username").val();
		var password = $("#password").val();
		var password2 = $("#password2").val();
		
		if (!username){
			alert("用户名不能为空");
			return false;
		}
		if (!password){
			alert("密码不能为空");
			return false;
		}
		if (password2 != password){
			alert("密码不一致");
			return false;
		}
		$("#registerForm").ajaxSubmit(option);
	} */
	
	
	
	
	function resetForm(){
		var username = $("#username").val("");
		var password = $("#password").val("");
		var password2 = $("#password2").val("");
	}
</script>

</head>
<body>
	<form action = "${pageContext.request.contextPath }/user/register.do" method = "post" id = "registerForm">
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
				<td>确认密码：</td>
				<td><input type = "password" id = "password2"/></td>
			</tr>
			<tr>
				<td><input type = "button" value = "提交" onclick = "subForm();"/></td>
				<td><input type = "button" value = "重置" onclick = "resetForm();"/></td>
			</tr>
		</table>
	</form>
</body>
</html>