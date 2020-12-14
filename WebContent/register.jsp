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
			<div class="col-md-4 offset-md-4 ">
				<div class="card mt-4">
					<div class="card-header text-center text-white bg-custom">
					     <i class="fa fa-user-circle-o fa-3x" aria-hidden="true"></i>
					     <h4>Registration</h4>
					 </div>
						<div class="card-body">
							<form action="RegisterServlet" method="post">
							    <div class="mb-1">
									<label for="exampleInputEmail1" class="form-label">Enter full name</label>
										<input type="name" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp">
								</div>
								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Enter email address</label> 
										<input type="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp">
								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Enter Password</label>
									<input type="password" class="form-control"
										id="exampleInputPassword1">
								</div>
								<button type="submit" class="btn btn-primary">Registration</button>
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="component/footer.jsp" %>
</body>
</html>