<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Minimal JSP Page</title>
</head>
<body>
<form action="add">
    <lable for="t1">Id</lable>
    <input type="text" id="t1" name="sid">
    <lable for="t2">Name</lable>
    <input type="text" id="t2" name="name">
    <lable for="t3">Age</lable>
    <input type="text" id="t3" name="age">
    <input type="submit"> <br>

</form>

<form action="search">
    <label for="e1">Search</label>
    <input type="text" id="e1" name="sid">
    <input type="submit">
</form>


</body>
</html>
