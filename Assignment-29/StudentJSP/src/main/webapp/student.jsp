<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Student Information Form</h2>
    <form method="post">
        Student ID: <input type="text" name="id" required><br><br>
        Name: <input type="text" name="name" required><br><br>
        Course: <input type="text" name="course" required><br><br>
        Marks: <input type="number" name="marks" min="0" max="100" required><br><br>
        <input type="submit" value="Submit">
    </form>
    <%
        if("POST".equalsIgnoreCase(request.getMethod())){
            String id=request.getParameter("id");
            String name=request.getParameter("name");
            String course=request.getParameter("course");
            String marks=request.getParameter("marks");
    %>
    <h2>Student Details</h2>
    Student ID: <%= id %><br>
    Name: <%= name %><br>
    Course: <%= course %><br>
    Marks: <%= marks %><br>
    <%
        }
    %>
</body>
</html>