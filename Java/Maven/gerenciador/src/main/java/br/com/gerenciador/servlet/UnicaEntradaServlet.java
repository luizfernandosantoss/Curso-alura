package br.com.gerenciador.servlet;

import br.com.gerenciador.acao.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/entrada",name = "UnicaEntradaServlet")
public class UnicaEntradaServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramAcao = request.getParameter("acao");
        String nomeDaClasse = "br.com.gerenciador.acao."+paramAcao;
        String nome = null;

        try{
            Class classe = Class.forName(nomeDaClasse);
            Acao acao = (Acao) classe.newInstance();
            nome = acao.executa(request,response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        String[] tipoeEndereco = nome.split(":");
        if (tipoeEndereco[0].equals("forward")){
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoeEndereco[1]);
            rd.forward(request,response);
        }else {
            response.sendRedirect(tipoeEndereco[1]);
        }

//
//        if(paramAcao.equals("listaEmpresa")){
//            ListaEmpresas acao = new ListaEmpresas();
//            acao.executa(request,response);
//        }
//        else if(paramAcao.equals("mostraEmpresa")){
//            MostraEmpresa acao = new MostraEmpresa();
//            acao.executa(request,response);
//        }
//        else if(paramAcao.equals("removerEmpresa")){
//            RemoverEmpresa acao = new RemoverEmpresa();
//            acao.executa(request,response);
//        }
//        else if(paramAcao.equals("novaEmpresa")){
//            NovaEmpresa acao = new NovaEmpresa();
//            acao.executa(request,response);
//        }
//        else if(paramAcao.equals("editarEmpresa")){
//            EditarEmpresa acao = new EditarEmpresa();
//            acao.executa(request,response);
//        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
