package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConnection {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Tenta abrir a conexão
            connection = new ConnectionFactory().getConnection();
            System.out.println("Conexão aberta com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao tentar conectar: " + e.getMessage());
        } finally {
            // Tenta fechar a conexão de forma segura
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexão fechada com sucesso!");
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar conexão: " + e.getMessage());
                }
            }
        }
    }
}