package br.com.gerenciador.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();


    static{
        Empresa empresa1 = new Empresa("São Paulo Empresas"),
                empresa2 = new Empresa("Rio Empresas");
         lista.add(empresa1);
         lista.add(empresa2);
    }

    public void adiciona(Empresa empresa) {
        lista.add(empresa);

    }
    public void remove(Empresa empresa) {
        lista.remove(empresa);
    }

    public static List<Empresa> getLista() {
        return lista;
    }


    public Empresa buscarEmpresaPorId(Integer id) {

        for (Empresa empresa:lista){
            if (empresa.getId().equals(id)){
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return empresa;
            }
        }
        return null;
    }
}
