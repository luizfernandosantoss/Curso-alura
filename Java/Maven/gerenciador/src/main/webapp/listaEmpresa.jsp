<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Java Standar Taglib</title>
</head>
<body>

    <c:if test="${not empty empresa}">
        Empresa ${empresa} Com data de Abertura <fmt:formatDate value="${dataAbertuda}"/> Cadastrada Com Sucesso
    </c:if>

    <c:if test="${empty empresa}">
        Nenuma empresa Cadastrada
    </c:if>


    Todas Empresa Cadastrada

    <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li>${empresa.nome} <ftm:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yy"/></li>

        </c:forEach>
    </ul>

</body>
</html>
