<%@ page import="br.com.gerenciador.entidades.Empresa" %>
<%@ page import="br.com.gerenciador.entidades.Banco" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Empresa Criada</title>
</head>
<body>

    Todas Empresa Cadastrada

    <%
        List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
        for (Empresa empresa : empresas){

    %>


    <table>
        <tr>
            <th>Nome</th>
        </tr>
        <tr>
            <td><%=empresa%></td>
        </tr>
    </table>

    <%
        }
    %>



</body>
</html>
