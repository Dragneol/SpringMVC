<%-- 
    Document   : login
    Created on : Aug 24, 2018, 10:22:49 AM
    Author     : DuongPTHSE62871
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <div align="center">
            <spring:form method="POST" modelAttribute="loginForm" commandName="loginUser">
                <table border="1">

                    <tr>
                        <td><spring:label path="username">Username</spring:label></td>
                        <td><spring:input path="username" name="username" id="username"/></td>
                    </tr>

                    <tr>
                        <td><spring:label path="password">Password</spring:label></td>
                        <td><spring:input path="password" name="password" id="password"/></td>
                    </tr>

                </table>
                <spring:button name="login" id="login">Login</spring:button>
            </spring:form>
        </div>
    </body>
</html>
