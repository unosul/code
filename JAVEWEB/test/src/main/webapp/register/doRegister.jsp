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
String sex=request.getParameter("sex");
String Hobbies="";
String[] hobbies=request.getParameterValues("hobby");
if(hobbies!=null && hobbies.length>0){
	for(String hobby:hobbies){
		Hobbies+=hobby+"&nbsp;";
	}
}
String edu=request.getParameter("edu");
%>
用户名：<%=username %><br/>
密码:<%=password %><br/>
性别：<%=sex %><br/>
爱好：<%=Hobbies %><br/>
学历：<%=edu %>
</body>
</html>