<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
   <%@ include file="component/component.jsp" %>
</head>
<body>
   <%@ include file="component/navbar.jsp" %>
	<div class="container-fluid  div-color">
		<div class="row">
			<div class="col-md-5 offset-md-4 ">
				<div class="card mt-1">
					<div class="card-header text-center text-white bg-custom">
					     <i class="fa fa-user-circle-o fa-3x" aria-hidden="true"></i>
					     <h5>Registration</h5>
					 </div>
						<div class="card-body">
							<form class="form-horizontal" action="RegisterServlet" method="post">
							    <div class="mb-0">
									<label for="exampleInputName" class="col-form-label-sm-3">Name</label>
										<input type="text" name="name" class="form-control"
										id="exampleInputName" aria-describedby="emailHelp">
								</div>
								<div class="mb-0">
									<label for="exampleInputCognome" class="col-form-label-sm-3">Cognome</label>
										<input type="text" name="cognome" class="form-control"
										id="exampleInputCognome" aria-describedby="cognomeHelp">
								</div>
								<div class="mb-0">
									<label for="exampleInputEmailAddress" class="col-form-label-sm-3">Email address</label> 
										<input type="text" name="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp">
								</div>
								<div class="mb-0">
									<label for="exampleInputUsername" class="col-form-label-sm-3">Username</label> 
										<input type="text" name="username" class="form-control"
										id="exampleInputUsername" aria-describedby="usernameHelp">
								</div>
								<div class="mb-0">
									<label for="exampleInputPassword" class="col-form-label-sm-3">Password</label>
									<input type="password"name="password" class="form-control"
										id="exampleInputPassword">
								</div>
								<button type="submit" class="btn btn-primary">Register</button>
							</form>
					  </div>	
				</div>
			</div>
		</div>
	</div>
	<%@ include file="component/footer.jsp" %>
</body>
</html>