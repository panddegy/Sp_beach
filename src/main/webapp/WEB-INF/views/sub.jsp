<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="/WEB-INF/views/include/include-head.jspf" %>
</head>
<body>
		
		<c:forEach var="beach" items="${BLIST}">
		<fieldset>
			<legend>${beach.b_name}</legend>
			<p>${beach.b_explain}</p>
			<p>${beach.b_addr}</p>
			<p>${beach.b_tel}</p>
			<p>${beach.b_homepage}</p>
		</fieldset>
		</c:forEach>
		
</body>
</html>