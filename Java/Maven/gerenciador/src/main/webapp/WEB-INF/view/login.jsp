
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/entrada" var="linkServletNovaEMpresa"/>
<html>
<head>
    <title>Formulario</title>
</head>
<body>
<form action="${linkServletNovaEMpresa}" method="POST">
    <h4>${msg}</h4>
    Login: <input type="text" name="login">
    Senha: <input type="password" name="senha">
    <input type="hidden" name="acao" value="Login">
    <input type="submit" value="Entrar">
</form>
</body>
</html>
