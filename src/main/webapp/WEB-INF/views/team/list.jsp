<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

<table class="table" border="1">
    <thead>
    <th>Team</th>
    <th>Group</th>
    <th>Points</th>
    <th>Options</th>
    </thead>
    <tbody>
    <c:forEach items="${teams}" var="team">
        <tr>
            <td><c:out value="${team.name}"/></td>
            <td><c:out value="${team.groupName}"/></td>
            <td><c:out value="${team.points}"/></td>
            <td>
                <a href="/admin/books/${team.id}" class="btn btn-success">details</a>
                <a href="/admin/books/edit/${team.id}" class="btn btn-warning">edit</a>
                <a href="/admin/books/delete/${team.id}" class="btn btn-danger">delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
