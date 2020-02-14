<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"          

            href="${pageContext.request.contextPath}/resources/css/simple-test.css">

   <!-- <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script> -->
</head>
<body>

<div class="jumbotron text-center" style="margin-bottom:0">
  <h1>Hello Spring of World</h1>
  <p>Username: ${message}</p> 
</div>

<br/><br/>


</body>
</html>