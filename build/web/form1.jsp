<%-- 
    Document   : form1
    Created on : Nov 28, 2016, 3:41:14 PM
    Author     : Abel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <p>FORM.JSP</p>
        
        <p>NOMBRE: <c:out value="${nombre1}"/> PAIS: <c:out value="${pais1}"/></p>
        <p>NOMBRE: <c:out value="${nombre2}"/> PAIS: <c:out value="${pais2}"/></p>
        <p>NOMBRE: <c:out value="${nombre3}"/> PAIS: <c:out value="${pais3}"/></p>
        
    </body>
</html>
