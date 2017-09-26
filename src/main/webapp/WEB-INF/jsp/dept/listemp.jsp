<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
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
<h2>JSP 부서 리스트 With Emp !</h2>
${depts}
<hr>
<ol>
	<c:forEach var="dept" items="${depts}">
	<li>
		<h3>${dept.deptno}, ${dept.dname}, ${dept.loc}</h3>
		<table class="table table-bordered animated bounce">
			<tr>
				<th>empno</th>
				<th>ename</th>
				<th>gender</th>
				<th>gender2</th>				
				<th>job</th>
				<th>mgr.name</th>
				<th>mgr.name2</th>
				<th>hiredate</th>
				<th>hiredate2</th>
				<th>sal</th>
				<th>sal2</th>
				<th>comm</th>
			</tr>
			<c:forEach var="emp" items="${dept.emps}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.gender}</td>
				<td>
				<c:choose>
					<c:when test="${emp.gender=='M'}">남자</c:when>
					<c:when test="${emp.gender=='F'}">여자</c:when>
				</c:choose>
				</td>
				<td>${emp.job}</td>
				<td>${emp.mgr.ename != null ? emp.mgr.ename : 'NoNo'}</td>
				<c:if test="${emp.mgr==null}">
					<td class="btn btn-info animated zoomInUp">NoNo</td>
				</c:if>
				<c:if test="${emp.mgr!=null}">
					<td class="btn btn-primary">${emp.mgr.ename}</td>
				</c:if>
				<td>${emp.hiredate}</td>
				<td><fmt:formatDate value="${emp.hiredate}" pattern="yyyy MM dd"/></td>
				<td>${emp.sal}</td>
				<td><fmt:formatNumber value="${emp.sal}" pattern="#,###.0#"/></td>
				<td>${emp.comm}</td>
			</tr>
			</c:forEach>
		</table>
	</li>
	</c:forEach>
</ol>
${depts[0].emps}<br>
<%-- ${depts[1].emps}<br> --%>
<%-- ${depts[2].emps}<br> --%>
<%-- ${depts[3].emps}<br> --%>










</body>
</html>







