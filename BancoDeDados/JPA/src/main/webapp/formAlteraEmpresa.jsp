
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Formulario</title>
</head>
<body>

        <form action="/editarEmpresa" method="POST">
            <input type="hidden" value="${empresa.id}" name="id">
            Nome: <input type="text" value="${empresa.nome}" name="nome">
            Data de abertuda: <input type="text" value="<ftm:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" name="dataAbertura">
            <input type="submit" value="Alterar">
        </form>
</body>
</html>


