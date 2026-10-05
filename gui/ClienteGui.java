package gui;

import javax.swing.JOptionPane;
import dao.ClienteDAO;
import modelo.Cliente;

public class ClienteGui {
    public static void main(String[] args) {
        // 1. Abre uma caixinha na tela perguntando o nome
        String nomeDigitado = JOptionPane.showInputDialog("Digite o nome do cliente:");

        // Valida se o usuário não deixou em branco ou cancelou
        if (nomeDigitado != null && !nomeDigitado.trim().isEmpty()) {
            try {
                // 2. Cria o objeto cliente com o nome digitado
                Cliente cliente = new Cliente();
                cliente.setNome(nomeDigitado);

                // 3. Envia para o DAO salvar no MySQL
                ClienteDAO dao = new ClienteDAO();
                dao.adiciona(cliente);

                // 4. Mostra mensagem de sucesso na tela
                JOptionPane.showMessageDialog(null, "Cliente " + nomeDigitado + " cadastrado com sucesso!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado ou nome inválido.");
        }
    }
}

