<%@page contentType="text/html;charset = UTF-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title></title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
		.carousel-inner img{
			width: 100%;
			height: 100%;
		}
	</style>
</head>
<body>
<!--Navbar-->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Doctor 360</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#" data-toggle="modal" data-target=".reg">Registration</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#" data-toggle="modal" data-target=".pdf">Generate PDF</a>
      </li> 
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
<!--Navbar End-->
<section class="bg-primary mb-5">
	<article class="text-center py-5">
		<h1 class="display-3 text-white ">${msg}</h1>
		<h3 class="display-3 text-white ">Welcome to our Clinic</h3>
		<p class=" text-white">Please do register first</p>
	</article>	
</section>
<!--popup reg-->
<div class="modal fade reg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header" style="background-color: #99ff66;">
        <h5 class="modal-title" id="exampleModalLabel">Register here</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       <form action="register">
            <div class="form-group">
              <label>Name:</label> <input type="text" name="name"
                class="form-control text" placeholder="Enter Name here"
                required>
            </div>
            <div class="form-group">
              <label>Age:</label> <input type="text" name="age"
                class="form-control text" placeholder="Enter Age here" required>
            </div>
            <div class="form-group">
              <label>DOB:</label> <input type="date" name="dob"
                class="form-control text" 
                required>
            </div>
            <div class="form-group">
              <label>Blood Group:</label>  
			  <select class="form-control text" name=bloodGroup> 
            <option value="A+">A+</option> 
            <option value="A-">A-</option> 
			<option value="B+">B+</option> 
            <option value="B-">B-</option> 
			<option value="O+">O+</option> 
            <option value="O-">O-</option>
			<option value="AB+">AB+</option> 
            <option value="AB-">AB-</option> 
			</select> 
            </div>
			<div class="form-group">
              <label>Mobile Number:</label> <input type="text" name="mobile"
                class="form-control text" placeholder="Enter MobileNumber here"
                required>
			</div>
            <div class="form-group">
              <label>Email:</label> <input type="email" name="email"
                class="form-control text" placeholder="Enter email here" required>
            </div>
            <div class="form-group">
              <label>Appointment Date:</label> <input type="date" name="appointDate"
                class="form-control text" 
                required>
            </div>
            <label>Address:</label>
            <div class="form-group">
              <textarea class="form-control" rows="6"
                placeholder="Enter Address here" name="address" required></textarea>
            </div>

            <input type="submit" class="btn btn-success" value="Register">

        </form>
      </div>
    </div>
  </div>
</div>
<!--popup reg end-->

<div class="modal fade pdf" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header" style="background-color: #99ff66;">
        <h5 class="modal-title" id="exampleModalLabel">Generate PDF</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       <form action="pdf">
            <div class="form-group">
              <label>Mobile No:</label> <input type="text" name="mobile"
                class="form-control text" placeholder="Enter Mobile no here" required>
            </div>
            <input type="submit" class="btn btn-success" value="Download">
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
