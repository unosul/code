<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String username=request.getParameter("username");
String password=request.getParameter("password");
if(username.equals("张三")&&password.equals("123456")){
	request.setAttribute("mess", "登录成功");
	request.getRequestDispatcher("user.jsp").forward(request, response);
}
else{
	request.setAttribute("mess", "登录失败");
	request.getRequestDispatcher("login.jsp").forward(request, response);
}
%>

</body>
</html>