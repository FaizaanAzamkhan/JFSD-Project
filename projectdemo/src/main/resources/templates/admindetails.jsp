<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admindetails</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body style="background-color:MediumAquaMarine;">

<center>

<div class="container">
  <form action="/Admin" Method ="post"  enctype="application/x-www-form-urlencoded">
    <div class="mb-3">
      <label for="studentName" class="form-label">Student Name:</label>
      <input type="text" class="form-control" id="studentName" name="studentName" required>
    </div>
    <div class="mb-3">
      <label for="studentId" class="form-label">Student ID:</label>
      <input type="text" class="form-control" id="studentId" name="studentId" required>
    </div>
    <div class="mb-3">
      <label for="counselorName" class="form-label">Counselor Name:</label>
      <input type="text" class="form-control" id="counselorName" name="counselorName" required>
    </div>
    <div class="mb-3">
      <label for="counselingPeriod" class="form-label">Counseling Period:</label>
      <input type="text" class="form-control" id="counselingPeriod" name="counselingPeriod" required>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</center>

</body>
</html>
