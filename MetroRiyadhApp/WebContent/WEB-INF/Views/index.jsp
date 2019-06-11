<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/" class="btn btn-lg btn-success">Home</a>
<a href="${pageContext.servletContext.contextPath}/contactUs" class="btn btn-lg btn-success">Contact Us</a>

<h1>Riyadh Metro App</h1>

<h4> post example , type then click submit</h4>
<form action="${pageContext.servletContext.contextPath}/postInfo" method="post">
	<input type="text" name="exampleText">
	<input type="submit" >
</form>

<p>exampleText : ${exampleText}</p>
</body>
</html>