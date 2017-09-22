<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sitemesh" tagdir="/WEB-INF/tags/sitemesh" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><sitemesh:write property="title"/></title>
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.css">
<script type="text/javascript" src="/webjars/chartjs/2.6.0/Chart.bundle.js"></script>
<sitemesh:write property="head"/>
</head>
<body>
<h1>Decorator default.jsp START</h1>
<hr>
<sitemesh:write property="body"/>
<hr>
<h1>Decorator default.jsp END</h1>

</body>
</html>