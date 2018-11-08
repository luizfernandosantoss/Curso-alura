package br.com.gerenciador.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    public void adiciona(Empresa empresa) {
        lista.add(empresa);

    }

    public static List<Empresa> getLista() {
        return lista;
    }
}
