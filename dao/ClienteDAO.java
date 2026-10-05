package dao;

import factory.ConnectionFactory;
import modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente) {
        // Ajustado para 'client' conforme sua tabela do MySQL
        String sql = "INSERT INTO client(cli_nome) VALUES(?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.execute();
            stmt.close();
            System.out.println("Cliente salvo no MySQL com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro no banco: " + e.getMessage());
        }
    }
}
