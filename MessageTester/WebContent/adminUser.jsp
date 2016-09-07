<%@page import="java.util.ArrayList"%>
<%@page import="com.sachin.messagetester.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<User> usersList = (ArrayList<User>)request.getAttribute("usersList");
%>
Hello Admin!
<a href="addUser.jsp">Add User</a>
<table border="1">
	<tr>
		<th>SNo.</th><th>User Info</th> <th>Password</th><th>UserType</th><th>Assigned Products</th> <th>Child Users</th><th>IsDeleted</th><th>Edit OMS User</th><th>Assigned User Roles</th><th>Assigned Product to User</th>	
		
	</tr>
	<%		int i=0;
			for(User user :  usersList)
			{
				String name = user.getName();
				String userName = user.getUserName();
				String email = user.getEmail();
				String isDeleted = user.getIsdeleted();
				String contact = user.getContact();
				String mobile = user.getMobile();
				String namespace = user.getNamespace();
				String topic = user.getTopic();
				String type = user.getType();
				String password = user.getPassword();
				%>
				<tr>
				
					<td><%=++i%></td>
					<td>Login Id : <%=userName%> , <br>
						Email Id : <%=email%>, <br>
						Contact Email : <%=email%>, <br>
						Contact Name : <%=name%>, <br>
						Agent code: 
					
					</td>
					
					<td><%=password%></td>
					<td><%=type%></td>
					<td><%=topic%></td>
					<td>-</td>
					<td><%=isDeleted%></td>
					<td><a href="#">Edit User</a></td>
					<td><a href="#">Assigned User Roles</a></td>
					<td>-</td>
				</tr>
				<%
				
			}
		%>
</table>
</body>
</html>