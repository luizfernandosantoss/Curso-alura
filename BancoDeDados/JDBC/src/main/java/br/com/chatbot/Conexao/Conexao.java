package br.com.jpa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:52774/financas?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Conectado com sucesso!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }


}

