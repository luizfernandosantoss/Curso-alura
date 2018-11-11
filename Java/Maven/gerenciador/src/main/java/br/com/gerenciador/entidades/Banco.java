package br.com.gerenciador.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();


    static void cadastroEmpresas(){
        Empresa empresa1 = new Empresa(), empresa2 = new Empresa();
        empresa1.setNome("São Paulo Empresas");
        empresa2.setNome("Rio Empresas");
        Banco banco = new Banco();
        banco.adiciona(empresa1);
        banco.adiciona(empresa2);
    }

    public void adiciona(Empresa empresa) {
        lista.add(empresa);

    }

    public static List<Empresa> getLista() {
        return lista;
    }
}
