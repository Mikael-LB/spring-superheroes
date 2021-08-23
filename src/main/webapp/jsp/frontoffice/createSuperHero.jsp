<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Créer un Super Héros</title>
</head>
<body>
	<%@include file="navmenu/mainMenu.jsp"%>
	<h1>Nouveau super héros</h1>
	<form:form action="/superheros/create" method="post"
		modelAttribute="superheroForm">
		<p>
			<form:label path="nickname">Surnom du super héros</form:label>
			<form:input type="text" path="nickname" />
		</p>
		<p>
			<form:label path="superpower">Super pouvoir</form:label>
			<form:select path="superpower" items="${superPowerList}" 
			itemValue="id" itemLabel="name">
			</form:select>
		</p>
		<p>
			<form:label path="firstname">Prénom du super héros</form:label>
			<form:input type="text" path="firstname" />
		</p>
		<p>
			<form:label path="lastname">Nom du super héros</form:label>
			<form:input type="text" path="lastname" />
		</p>
		<p>
			<form:label path="dateOfBirth">Date de naissance</form:label>
			<form:input type="date" path="dateOfBirth" />
		</p>
		<p>
			<form:label path="category">Category</form:label>
			<form:select path="category">
				<c:forEach var="cat" items="${ categoryList }">
					<form:option value="${cat.id}">${cat.name }</form:option>
				</c:forEach>
			</form:select>
		</p>
		<form:button>Enregistrer</form:button>
	</form:form>
</body>
</html>