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
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4 offset-md-4 ">
				<div class="card">
					<div class="card-header text-center text-white bg-custom">
					     <i class="fa fa-user-circle-o" aria-hidden="true"></i>
					     <h4>Registrazione</h4>
					 </div>
						<div class="card-body">
							<form>
								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Email
										address</label> <input type="email" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp">
									<div id="emailHelp" class="form-text">We'll never share
										your email with anyone else.</div>
								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Password</label>
									<input type="password" class="form-control"
										id="exampleInputPassword1">
								</div>
								<div class="mb-3 form-check">
									<input type="checkbox" class="form-check-input"
										id="exampleCheck1"> <label class="form-check-label"
										for="exampleCheck1">Check me out</label>
								</div>
								<button type="submit" class="btn btn-primary">Submit</button>
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>