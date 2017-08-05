<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Student Admission Form for Engineering Courses</h2>

	<form action="/spring-mvc-01/submitAdmissionForm.html" method="post">
		<p>
			<input type="text" name="name" />
		</p>
		<p>
			<input type="text" name="hobby" />
		</p>
		
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>