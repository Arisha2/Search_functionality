<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
	<c:forEach var="searchMovie" items="${search}">
<table>
	<tr>
		<th >Movie name</th>
		<th >Duration</th>
		<th >Image</th>
		<th >Cast names</th>
		<th >Language</th>
	</tr>
		<tr>

			<td>${searchMovie.name}</td>
			<td>${searchMovie.duration}</td>
			<td><img src="${searchMovie.image}"/></td>
			<td>${searchMovie.cast_names}</td>
			<td>${searchMovie.language}</td>
		</tr>
		</table>
	</c:forEach>
	
</div>
</body>
</html>