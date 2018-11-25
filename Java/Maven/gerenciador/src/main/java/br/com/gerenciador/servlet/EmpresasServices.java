package br.com.gerenciador.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

@WebServlet("/empresas")
public class EmpresasServices extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empresa> empresas = Banco.getListaEmpresas();
        XStream xStream = new XStream();
        xStream.alias("empresa",Empresa.class);
        String xml = xStream.toXML(empresas);

        response.setContentType("application/json");
        response.getWriter().println(xml);


//        Gson gson = new Gson();
//        String json = gson.toJson(empresas);
//
//        response.setContentType("application/json");
//        response.getWriter().println(json);


    }

}
