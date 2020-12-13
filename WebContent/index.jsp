<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <style type="text/css">
        .back-img{
	background:url("img/images.jpeg");
	background-repeat:no-repeat;
	background-size:cover;
	width: 100%;
	height: 80vh;
	
}
    </style>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <%@ include file="component/component.jsp" %>
  </head>
  <body>
    <%@ include file="component/navbar.jsp" %>
    <div class="container-fluid back-img">
       <div class="text-center">
			<h1 class="btn-light">Film, serie TV e tanto altro</h1>

		</div>
    </div>
    
    <%@ include file="component/footer.jsp" %>
  </body>
</html>