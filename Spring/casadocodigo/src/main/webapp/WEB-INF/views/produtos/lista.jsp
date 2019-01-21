<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fernando
  Date: 18/01/2019
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais - Casa do Código</title></head>
<body>
    <div>${sucesso}</div>
    <h1>Lista de Produtos</h1>

    <table>
        <tr>
            <td>Titulo</td>
            <td>Descrição</td>
            <td>Páginas</td>
        </tr>
            <c:forEach items="${produtos}" var="produto">
                <tr>
                    <td>${produto.titulo}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.paginas}</td>
                </tr>
            </c:forEach>

    </table>
</body>
</html>
