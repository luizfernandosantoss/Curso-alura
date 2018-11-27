<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html lang="en">


<%@include file="inicio.jsp" %>
<div class="container">
    <div class="jumbotron page-header">
        <p>
            Cadastros
        </p>

        <table id="example" class="table table-striped table-bordered nowrap" style="width:100%">
            <thead>

            <tr>
                <th style="display:none">id</th>
                <th>Pergunta</th>
                <th>Resposta Bot</th>
                <th>Analise Bot</th>
                <th>Data</th>
                <!--<th>Ações</th>-->

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${historicos}" var="historico">
                <tr>
                    <td style="display:none">${historico.id}</td>
                    <td>${historico.perguntaUsuario}</td>
                    <td>${historico.respostaBot}</td>
                    <td>${historico.analiseHistorico}</td>
                    <td> <ftm:formatDate value="${historico.data}" pattern="dd/MM/yyyy"/></td>
                   <!-- <td><a href="/mostraEmpresa?id=${1}">remover</a></td>-->

                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>

    <%@include file="fim.jsp" %>

    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <script src="js/datatables.js"></script>


    </body>
</html>
