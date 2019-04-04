<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form method="POST"
          action="" modelAttribute="person">
          
          <table>
          		
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="age">Age</form:label></td>
                    <td><form:input type="number" path="age"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="UPDATE"/></td>
                    <td><a href="/delete/${person.id }">DELETE</a></td>
                </tr>
            </table>
          
    </form:form>
    
    <hr/>
    <a href="/getAll">Return</a>


</body>
</html>