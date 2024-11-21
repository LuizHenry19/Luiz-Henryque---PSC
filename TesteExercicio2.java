import javax.swing.*;
import java.util.ArrayList;

public class TesteExercicio2 {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        boolean sair = false;

        while (!sair) {
            String menu = "1. Adicionar Caixa\n" +
                          "2. Remover Caixa\n" +
                          "3. Procurar Caixa\n" +
                          "4. Mudar Caixa\n" +
                          "5. Listar Caixas Pesadas\n" +
                          "6. Sair";

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    
                    String corredor = JOptionPane.showInputDialog("Informe o corredor da caixa:");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição da caixa:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da caixa:"));
                    String dono = JOptionPane.showInputDialog("Informe o nome do dono da caixa:");
                    Caixa caixa = new Caixa(corredor, posicao, peso, dono);
                    deposito.adicionarCaixa(caixa);
                    JOptionPane.showMessageDialog(null, "Caixa adicionada com sucesso!");
                    break;

                case 2:
                    
                    String donoRemover = JOptionPane.showInputDialog("Informe o nome do dono para remover a caixa:");
                    if (deposito.removerCaixa(donoRemover)) {
                        JOptionPane.showMessageDialog(null, "Caixa removida com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;

                case 3:
                    
                    String donoProcurar = JOptionPane.showInputDialog("Informe o nome do dono para procurar a caixa:");
                    int posicaoCaixa = deposito.procurarCaixa(donoProcurar);
                    if (posicaoCaixa != -1) {
                        Caixa caixaEncontrada = deposito.getCaixa(posicaoCaixa);  // Usando o método getCaixa
                        JOptionPane.showMessageDialog(null, "Caixa encontrada! Corredor: " + caixaEncontrada.getCorredor() +
                                ", Posição: " + caixaEncontrada.getPosicao() +
                                ", Peso: " + caixaEncontrada.getPeso() +
                                ", Dono: " + caixaEncontrada.getDono());
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;

                case 4:
                    
                    String donoMudar = JOptionPane.showInputDialog("Informe o nome do dono para mudar a caixa:");
                    String novoCorredor = JOptionPane.showInputDialog("Informe o novo corredor:");
                    int novaPosicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a nova posição:"));
                    if (deposito.mudarCaixa(donoMudar, novoCorredor, novaPosicao)) {
                        JOptionPane.showMessageDialog(null, "Caixa alterada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;

                case 5:
                    
                    double pesoMinimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso mínimo para as caixas:"));
                    ArrayList<Caixa> pesadas = deposito.listarCaixasPesadas(pesoMinimo);
                    if (!pesadas.isEmpty()) {
                        StringBuilder sb = new StringBuilder("Caixas mais pesadas que " + pesoMinimo + "kg:\n");
                        for (Caixa c : pesadas) {
                            sb.append("Dono: ").append(c.getDono()).append(", Peso: ").append(c.getPeso()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada com esse peso.");
                    }
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
