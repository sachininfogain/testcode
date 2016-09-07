<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addDetails">
<table>
<tr><th colspan="2">Add User Flow</th></tr>
<tr>
	<td> Name</td><td><input type="text" name="name"></td>
	
</tr>
<tr>
	<td> Email Id</td><td><input type="text" name="email"></td>
	
</tr>
<tr>
	<td> Password</td><td><input type="password" name="password"></td>
	
</tr>
<tr>
	<td> NameSpace</td><td><input type="text" name="namespace"></td>
	
</tr>

<tr>
	<td> Topic</td><td><textarea name="topic"></textarea></td>
	
</tr>
<tr>
	<td> Contact Mobile</td><td><input type="text" name="mobile"></td>
	
</tr>
<tr>
	<td> IsDeleted</td><td><select name="isdeleted"><option>yes</option><option>No</option></select></td>
	
</tr>
<tr>
	<td colspan="2"> <input type="submit"/></td>
	
</tr>
</table>
</form>

</body>
</html>