<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<style>
.style1 {
 
  padding: 100px;
  background: url(https://static.vecteezy.com/system/resources/previews/000/543/765/original/white-abstract-background-vector-gray-abstract-modern-design-background-for-report-and-project-presentation-template-vector-illustration-graphic-dot-and-circular-shape-product-advertising-present.jpg);
  background-repeat: no-repeat;
  background-size: 1650px 1950px;
}
</style>

</head>
<body >
<div class=style1>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />

   <h1><b style="color:blue;">Welcome!!!</b></h1><br>
   <h2><B style="color:green;" > PLACEMENT MANAGEMENT </b></h1><BR>
   
   <b style="color:black">PLACEMENT DETAILS</b> &nbsp;&nbsp;&nbsp;<a th:href="@{'/placementindex'}"><input type="submit" class="btn btn-info" value="Open" /></a><br><br><br>
   <b style="color:black">COLLEGE DETAILS</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a th:href="@{'/collegeindex'}"><input type="submit" class="btn btn-info" value="Open" /></a><br><br><br>
   <b style="color:black">STUDENT DETAILS</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a th:href="@{'/studentindex'}"><input type="submit" class="btn btn-info" value="Open" /></a><br><br><br>
   
   <form th:action="@{/logout}" method="post">
        <input type="submit"  value="Logout" /class="btn btn-info">
    </form>
    </div>
</body>
</html>
