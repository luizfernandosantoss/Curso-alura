
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/entrada" var="linkServletNovaEMpresa"/>
<html>
<head>
    <title>Formulario</title>
</head>
<body>
    <c:import url="WEB-INF/view/logout-parcial.jsp" />
        <form action="${linkServletNovaEMpresa}" method="POST">
            Nome: <input type="text" name="nome">
            Data de abertuda: <input type="text" name="dataAbertuda">
            <input type="hidden" name="acao" value="NovaEmpresa">
            <input type="submit" value="Cadastrar">
        </form>
</body>
</html>
