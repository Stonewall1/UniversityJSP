<%--
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Teacher Registration</title>
</head>
<body>
<s:form action="/teacher/registration" method="post" modelAttribute="newTeacher">
    <s:input path="name" placeholder="Input name"/>
    <br>
    <s:errors path="name" cssStyle="color: red"/>
    <br>
    <s:input path="surname" placeholder="Input surname"/>
    <br>
    <s:errors path="surname" cssStyle="color: red"/>
    <br>
    <s:input path="password" type="password" placeholder="Input password"/>
    <br>
    <s:errors path="password" cssStyle="color: red"/>
    <br>
    <s:button>Register</s:button>
</s:form>
<a href="/" class="btn btn-primary">Back</a>
<p style="color: red">${message}</p>
</body>
</html>
