<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais - Casa do Código</title></head>
<body>
    <form:form action="/produtos" method="POST"
               commandName= "produto">
        <div>
            <label>Titulo</label>
            <input type="text" name="titulo"/>
            <form:errors path="titulo"/>

        </div>
        <div>
            <label>Descrição</label>
            <textarea rows="10" cols="20" name="descricao"></textarea>
            <form:errors path="descricao"/>
        </div>
        <div>
            <label>Páginas</label>
            <input type="number" name="paginas"/>
            <form:errors path="paginas"/>
        </div>
        <c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
           <div>
               <label>${tipoPreco}</label>
               <input type="text" name="precos[${status.index}].valor"/>
               <input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}"/>
           </div>
       </c:forEach>
        <button type="submit">Cadastrar</button>
    </form:form>
</body>
</html>
