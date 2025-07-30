<%-- 
    Document   : scope
    Created on : Jul 30, 2025, 3:49:42 PM
    Author     : 20113
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Scope Demo</title>
</head>
<body>
<h2>Demo Scope</h2>
<p>Request Scope: ${requestScope.requestData}</p>
<p>Session Scope: ${sessionScope.sessionData}</p>
<p>Application Scope: ${applicationScope.appData}</p>
<p>App Name từ Listener: ${applicationScope.appName}</p>
<a href="index.jsp">Quay lại</a>
</body>
</html>
