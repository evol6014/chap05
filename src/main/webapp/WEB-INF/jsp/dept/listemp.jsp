<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listemp.jsp</title>
<c:if test="${true}">
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.css">
</c:if>
<c:if test="${false}">
<link rel="stylesheet" href="../css/bootstrap.css" data-th-remove="all">
<link rel="stylesheet" href="../css/animate.css" data-th-remove="all">
</c:if>
</head>
<body>
<h1>Dept List With Emp</h1>
${depts}
<hr>
<ol>
	<c:forEach var="dept" items="${depts}">
	<li>
		<h2>${dept.deptno}, ${dept.dname},  ${dept.loc}</h2>
		<table class="table table-bordered animated bounce">
			<c:forEach var="emp" items="${dept.emps}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.gender}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr.ename}</td>
			</tr>
			</c:forEach>
		</table>
	</li>
	</c:forEach>
</ol>

</body>
</html>




