<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Empresa Criada</title>
</head>
<body>

    <c:if test="${not empty empresa}">
        Empresa ${empresa} Com data de Abertura <fmt:formatDate value="${dataAbertuda}"/> Cadastrada Com Sucesso
    </c:if>

    <c:if test="${empty empresa}">
        Nenuma empresa Cadastrada
    </c:if>

</body>
</html>
