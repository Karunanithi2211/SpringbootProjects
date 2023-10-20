<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
</head>
<body>
    <h1>Add Detils</h1>
    <form action="addAlien">
        Id: <input type="text" name="aid" id=""><br>
        Name: <input type="text" name="aname" id=""><br>
        Subject: <input type="text" name="tech" id=""><br>
        <input type="submit"><br>
    </form>
    <h1>Search for availability</h1>
    <form action="getAlien">
        <input type="text" name="aid" id=""><br>
        <input type="submit"><br>
    </form>
</body>
</html>