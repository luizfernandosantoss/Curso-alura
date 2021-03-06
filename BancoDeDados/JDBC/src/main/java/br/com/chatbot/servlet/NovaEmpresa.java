package br.com.chatbot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.chatbot.entidades.Banco;
import br.com.chatbot.entidades.Empresa;

@WebServlet(urlPatterns = "/novaEmpresa",name = "novaEmpresa")
public class NovaEmpresa extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Empresa empresa = new Empresa(request.getParameter("nome"));
        String DataAbertura = request.getParameter("dataAbertuda");

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse(DataAbertura);
            empresa.setDataAbertura(data);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Banco banco = new Banco();
        banco.adiciona(empresa);
        System.out.println("Empresa "+empresa.getNome()+" Cadastrada com Sucesso");
        request.setAttribute("empresa",empresa.getNome());

        response.sendRedirect("listaEmpresas");
//        //Chamar JSP
//        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa");
//        request.setAttribute("empresa",empresa.getNome());
//        request.setAttribute("dataAbertuda",empresa.getDataAbertura());
//        rd.forward(request,response);


    }

}
