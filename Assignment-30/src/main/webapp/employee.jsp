<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
String url="jdbc:mysql://localhost:3306/employee_db";
String dbUser="root";
String dbPass="root@12345";
String message="";
if("POST".equalsIgnoreCase(request.getMethod())){
    String action=request.getParameter("action");
    try(Connection con=DriverManager.getConnection(url,dbUser,dbPass)){
        if("add".equals(action)){
            PreparedStatement ps=con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
            ps.setInt(1,Integer.parseInt(request.getParameter("id")));
            ps.setString(2,request.getParameter("name"));
            ps.setString(3,request.getParameter("department"));
            ps.setDouble(4,Double.parseDouble(request.getParameter("salary")));
            ps.executeUpdate();
            message="Employee added successfully.";
        }else if("update".equals(action)){
            PreparedStatement ps=con.prepareStatement("UPDATE employee SET name=?,department=?,salary=? WHERE emp_id=?");
            ps.setString(1,request.getParameter("name"));
            ps.setString(2,request.getParameter("department"));
            ps.setDouble(3,Double.parseDouble(request.getParameter("salary")));
            ps.setInt(4,Integer.parseInt(request.getParameter("id")));
            message=ps.executeUpdate()>0?"Employee updated successfully.":"Employee not found.";
        }else if("delete".equals(action)){
            PreparedStatement ps=con.prepareStatement("DELETE FROM employee WHERE emp_id=?");
            ps.setInt(1,Integer.parseInt(request.getParameter("id")));
            message=ps.executeUpdate()>0?"Employee deleted successfully.":"Employee not found.";
        }
    }catch(Exception e){
        message="Error: "+e.getMessage();
    }
}
%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Management System</title>
</head>
<body>
<h2>Employee Management System</h2>
<p><%=message%></p>
<form method="post">
Employee ID: <input type="number" name="id" required><br><br>
Name: <input type="text" name="name" required><br><br>
Department: <input type="text" name="department" required><br><br>
Salary: <input type="number" step="0.01" name="salary" required><br><br>
<button name="action" value="add">Add Employee</button>
<button name="action" value="update">Update Employee</button>
<button name="action" value="delete">Delete Employee</button>
</form>
<h3>Employee Records</h3>
<table border="1" cellpadding="8">
<tr><th>ID</th><th>Name</th><th>Department</th><th>Salary</th></tr>
<%
try(Connection con=DriverManager.getConnection(url,dbUser,dbPass);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM employee")){
    while(rs.next()){
%>
<tr>
<td><%=rs.getInt("emp_id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getString("department")%></td>
<td><%=rs.getDouble("salary")%></td>
</tr>
<%
    }
}catch(Exception e){
    out.println("<tr><td colspan='4'>Database Error: "+e.getMessage()+"</td></tr>");
}
%>
</table>
</body>
</html>