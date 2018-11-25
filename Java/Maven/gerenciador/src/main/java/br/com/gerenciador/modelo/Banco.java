package br.com.gerenciador.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> listaEmpresas = new ArrayList<>();



    private static List<Usuario>  listaUsuario = new ArrayList<>();


    static{
        Empresa empresa1 = new Empresa("São Paulo Empresas"),
                empresa2 = new Empresa("Rio Empresas");
         listaEmpresas.add(empresa1);
         listaEmpresas.add(empresa2);

        Usuario usuario1 = new Usuario("luiz","luiz"),
                usuario2 = new Usuario("fernando","fernando");
        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);
    }



    public void adiciona(Empresa empresa) {
        listaEmpresas.add(empresa);

    }
    public void adiciona(Usuario usuario) {
        listaUsuario.add(usuario);

    }
    public void remove(Empresa empresa) {
        listaEmpresas.remove(empresa);
    }


    public static List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    public static List<Usuario> getListaUsuario() {
        return listaUsuario;
    }


    public Empresa buscarEmpresaPorId(Integer id) {

        for (Empresa empresa: listaEmpresas){
            if (empresa.getId().equals(id)){
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return empresa;
            }
        }
        return null;
    }

    public Usuario existeUsuario(String login,String senha ) {

        for (Usuario usuario:listaUsuario) {
            if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
                return usuario;
            }
        }
        return null;
    }
}
