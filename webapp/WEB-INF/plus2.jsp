<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Add += 2</title>
</head>
<body>
	<div class="container" style="margin-top:100px">
		<h1><span class="shadow p-3 mb-5 bg-white rounded text-success " > This page will add two to your count</span></h1>
 		<h2 style="margin-top:100px"><span class="shadow p-3 mb-5 bg-white rounded text-success " > You have visited <a href="/"><c:out value="${www }"/></a> <c:out value="${count }"/> times. <a href="/add2">Add 2 More to your Count</a></span></h2>
  		<h2 style="margin-top:100px"><span class="shadow p-3 mb-5 bg-white rounded text-success " > <a href="/">Test another Visit</a></span></h2>
  		<h2 style="margin-top:100px"><span class="shadow p-3 mb-5 bg-white rounded text-success " > <a href="/clear" class="text-danger">Reset Your count</a></span></h2>
 	</div>
</body>
</html>