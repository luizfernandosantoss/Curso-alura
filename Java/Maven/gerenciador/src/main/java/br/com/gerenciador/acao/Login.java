package br.com.gerenciador.acao;

import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class Login extends HttpServlet implements Acao{

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acesso = request.getParameter("acesso");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String msg = null;
        Banco banco = new Banco();
        Usuario usuarioLogado = banco.existeUsuario(login,senha);

        if (acesso==null){
            msg = "usuario invalido";
            request.setAttribute("msg",msg);
        }

        if (usuarioLogado!=null){
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuarioLogado",usuarioLogado);
            return "redirect:entrada?acao=ListaEmpresas";
        }

        return "forward:login.jsp";

    }
}
