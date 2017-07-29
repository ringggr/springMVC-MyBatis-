<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script type="text/javascript">
	function changeMenu(type) {
		if (type == 1) {
			$("#ul1").slideDown();
			$("#ul2").slideUp();
		}
		else {
			$("#ul2").slideDown();
			$("#ul1").slideUp();
		}
	}
	function changeContent(url) {
		$("#fr1").attr("src", url);
	}
</script>


</head>
<body>
<div>
	<div id = "m1" onclick="changeMenu(1);">一级菜单(一)</div>
	<ul id="ul1" style="display: none">
		<li onclick="changeContent('register.jsp')">注册</li>
		<li>二级(一)</li>
	</ul>
</div>
<div>
	<div id = "m2" onclick="changeMenu(2);">一级菜单(二)</div>
	<ul id="ul2" style="display: none">
		<li>二级(二)</li>
		<li>二级(二)</li>
	</ul>
</div>


</body>
</html>