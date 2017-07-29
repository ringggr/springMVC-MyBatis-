<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.form.js"></script>
</head>
<body>
	<div style="width:100%; height:100%">
		<div style="height: 20%;">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div style="height: 80%;">
			<span style="display:block; float:left; width:30%;" >
				<jsp:include page="leftMune.jsp"></jsp:include>
			</span>
			<span style="display:block; float:left; width:70%;">
				<jsp:include page="content.jsp"></jsp:include>
			</span>
		</div>
	</div>
</body>
</html>