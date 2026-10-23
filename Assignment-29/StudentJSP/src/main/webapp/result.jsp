<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("UTF-8");
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String phone=request.getParameter("phone");
    String password=request.getParameter("password");
    if(name==null||email==null||phone==null||password==null){
        response.sendRedirect("registration.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Result</title>
</head>
<body>
    <h2>Registration Successful!</h2>
    <p>Name: <%= name %></p>
    <p>Email: <%= email %></p>
    <p>Phone Number: <%= phone %></p>
    <p>Password: ********</p>
    <a href="registration.jsp">Back to Registration</a>
</body>
</html>