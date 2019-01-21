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
    <form action="/produtos" method="POST">
        <div>
            <label>Titulo</label>
            <input type="text" name="titulo">
        </div>
        <div>
            <label>Descrição</label>
            <textarea rows="10" cols="20" name="descricao">
            </textarea>
        </div>
        <div>
            <label>Páginas</label>
            <input type="number" name="paginas">
        </div>
       <c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
           <div>
               <label>${tipoPreco}</label>
               <input type="text" name="precos[${status.index}].valor">
               <input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}">
           </div>
       </c:forEach>
        <button type="submit">Cadastrar</button>
    </form>
</body>
</html>
