<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%@ page buffer="16kb" %> 
<% String name =request.getParameter("uname");
out.print("Hello  " +name);
%><br/>
<%! String str=" VeneelaNagabandi"; %>  
<%= "User Name:"+str%><br/>
Today is: <%= new java.util.Date() %>  
</body>
</html>