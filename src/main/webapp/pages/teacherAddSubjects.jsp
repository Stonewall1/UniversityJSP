<%--
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Teacher add subjects</title>
</head>
<body>
<h2>Available subjects : </h2>
<c:forEach var="subject" items="${allSubjects}">
    <p>${subject.id}.${subject.subjectName}</p>
</c:forEach>
<br>
<h2>Select subject(s) to teach :</h2>
<form action="/teacher/addSubjects" method="post">
    <input type="text" name="subjectName" placeholder="SubjectName">
    <button>Add</button>
</form>
<a href="/teacher/teacherPage">Back</a>
</body>
</html>
