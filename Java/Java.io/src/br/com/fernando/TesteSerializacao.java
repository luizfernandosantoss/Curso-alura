package br.com.fernando;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

       // String nome = "Luiz Fernando";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

//        Cliente cliente = new Cliente();
//        cliente.setNome("Luiz Fernando Santos");
//        cliente.setCpf("458.003.728-61");
//        cliente.setProfissao("458.003.728-61");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
    }
}
