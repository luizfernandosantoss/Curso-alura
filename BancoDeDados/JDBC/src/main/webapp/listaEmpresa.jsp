<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Java Standar Taglib</title>
</head>
<body>
    Todas Empresa Cadastrada
    <a href="form.jsp">Cadastrar Empresa</a>
    <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li>
                    ${empresa.id}  ${empresa.nome} <ftm:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yy"/>
                    <a href="/removerEmpresa?id=${empresa.id}">remover</a>
                    <a href="/mostraEmpresa?id=${empresa.id}">editar</a>
            </li>

        </c:forEach>
    </ul>

</body>
</html>
