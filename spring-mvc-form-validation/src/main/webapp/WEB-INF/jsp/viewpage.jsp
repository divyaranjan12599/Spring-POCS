<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="helloagain" modelAttribute="emp">  
Username: <form:input path="name" placeholder="Enter name..." />
		<form:errors path="name" cssClass="error" />
		<br>
		<br>  
Password(*): <form:password path="pass" placeholder="aA1 pattern..." />
		<form:errors path="pass" cssClass="error" />
		<br>
		<br>
		Age: <form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>
