import javax.swing.*;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes banco = new BancoDeClientes();
        boolean sair = false;

        while (!sair) {
            String menu = "1. Inserir Cliente\n" +
                          "2. Remover Cliente\n" +
                          "3. Alterar Cliente\n" +
                          "4. Listar Cliente\n" +
                          "5. Listar Todos os Clientes\n" +
                          "6. Sair";

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    
                    String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
                    String fone = JOptionPane.showInputDialog("Informe o telefone do cliente:");
                    int idInserir = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente:"));
                    Cliente cliente = new Cliente(nome, fone, idInserir);
                    banco.inserirCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
                    break;

                case 2:
                    
                    int idRemover = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente para remover:"));
                    if (banco.removerCliente(idRemover)) {
                        JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    }
                    break;

                case 3:
                    
                    int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente para alterar:"));
                    String novoNome = JOptionPane.showInputDialog("Informe o novo nome do cliente:");
                    String novoFone = JOptionPane.showInputDialog("Informe o novo telefone do cliente:");
                    if (banco.alterarCliente(idAlterar, novoNome, novoFone)) {
                        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    }
                    break;

                case 4:
                    
                    int idListar = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente para listar:"));
                    Cliente clienteEncontrado = banco.listarCliente(idListar);
                    if (clienteEncontrado != null) {
                        JOptionPane.showMessageDialog(null, clienteEncontrado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    }
                    break;

                case 5:
                    
                    banco.listarTodosClientes();
                    break;

                case 6:
                    
                    sair = true;
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}