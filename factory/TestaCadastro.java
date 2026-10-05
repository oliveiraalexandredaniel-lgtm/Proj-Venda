package factory;

import dao.ClienteDAO;
import modelo.Cliente;

public class TestaCadastro {
    public static void main(String[] args) {
        try {
            // 1. Criamos um cliente fictício na memória
            Cliente novoCliente = new Cliente();
            novoCliente.setNome("Lucas Silva");

            // 2. Chamamos o DAO para salvar no banco
            ClienteDAO dao = new ClienteDAO();
            dao.adiciona(novoCliente);
            
        } catch (Exception e) {
            System.out.println("Falha no teste: " + e.getMessage());
        }
    }
}
