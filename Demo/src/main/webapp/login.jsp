<%-- 
    Document   : login
    Created on : Jul 30, 2025, 3:49:32 PM
    Author     : 20113
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
<h2>Đăng nhập</h2>
<form action="login" method="post">
    Username: <input type="text" name="username" /><br/>
    Password: <input type="password" name="password" /><br/>
    <button type="submit">Login</button>
</form>
<p style="color:red;"><%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %></p>
</body>
</html>
