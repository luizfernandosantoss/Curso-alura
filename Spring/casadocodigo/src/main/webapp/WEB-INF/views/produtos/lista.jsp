<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <td>
                        <a href="/produtos/detalhes/${produto.id}">${produto.titulo}</a>
                    </td>
                    <td>${produto.descricao}</td>
                    <td>${produto.paginas}</td>
                </tr>
            </c:forEach>

    </table>
</body>
</html>
