<%-- 
    Document   : nameView
    Created on : Aug 24, 2018, 11:30:37 PM
    Author     : DuongPTHSE62871
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Spring</title>
    </head>
    <body>
        <spring:nestedPath path="name">
            <form action="" method="POST">
                Name :
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}" />
                </spring:bind>
                <input type="submit" value="OK" />
            </form>
        </spring:nestedPath>
    </body>
</html>
