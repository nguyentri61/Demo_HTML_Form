<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset=UTF-8">
    <title>Show Information</title>
    <link rel="stylesheet" href="styles/main.css"/>
</head>
<body>
    <div class="container">
        <h1>My CV</h1>

        <h2>Your information:</h2>

        <label>First Name:</label>
        <span>${user.firstName}</span><br>

        <label>Last Name:</label>
        <span>${user.lastName}</span><br>

        <label>Email:</label>
        <span>${user.email}</span><br>

        <label>Date of Birth:</label>
        <span> ${user.date} </span><br>

        <h2>What year are you in college?</h2>
        <span> ${user.hearFrom} </span><br>

        <h2>What position are you applying for?</h2>
        <span> ${user.confirm} </span><br><br>

        <label style="font-weight: normal; width: auto"> Choose contact method: </label>
        <span> ${user.contact} </span><br>
    
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </div>
</body>
</html>