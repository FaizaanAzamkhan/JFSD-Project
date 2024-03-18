<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body style="background-color:LightYellow;">
<div class="container">
    <h1>Student Details For Academic Year 2023-2024</h1>
    
    <form action="/Counsellor" Method ="post"  enctype="application/x-www-form-urlencoded">
        <div class="mb-3">
            <label for="studentName" class="form-label">Student Name</label>
            <input type="text" class="form-control" id="studentName" name="studentName" required>
        </div>
        <div class="mb-3">
            <label for="studentId" class="form-label">Student ID</label>
            <input type="text" class="form-control" id="studentId" name="studentId" required>
        </div>
        <div class="mb-3">
            <label for="branch" class="form-label">Branch</label>
            <input type="text" class="form-control" id="branch" name="branch" required>
        </div>
        <div class="mb-3">
            <label for="cgpa" class="form-label">CGPA</label>
            <input type="text" class="form-control" id="cgpa" name="cgpa" required>
        </div>
        <div class="mb-3">
            <label for="backlogs" class="form-label">Backlogs</label>
            <input type="text" class="form-control" id="backlogs" name="backlogs" required>
        </div>
        <div class="mb-3">
            <label for="feedback" class="form-label">Feedback</label>
            <input type="text" class="form-control" id="feedback" name="feedback" required>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
