<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${persons }" var="person" varStatus="status">

<a href="/person/${person.id }">${status.index + 1 } ) NAME : ${person.name } , AGE : ${person.age }</a><br/></br>

</c:forEach>

 <hr/>
    <a href="/">Return</a>

</body>
</html>