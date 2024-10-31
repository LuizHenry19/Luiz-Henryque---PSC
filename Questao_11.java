import javax.swing.JOptionPane;

public class Questao_11
 {
    public static void main(String[] args) {
        int codigo;
        double consumo;
        int tipo;
        double custo;
        
        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;
        double somaConsumoTipo1 = 0;
        double somaConsumoTipo2 = 0;
        int contadorTipo1 = 0;
        int contadorTipo2 = 0;

        while (true) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair):"));
            if (codigo == 0) {
                break; // Encerra o loop se o código for 0
            }

            consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial):"));

            // Cálculo do custo
            switch (tipo) {
                case 1:
                    custo = consumo * 0.3;
                    totalResidencial += custo;
                    somaConsumoTipo1 += consumo;
                    contadorTipo1++;
                    break;
                case 2:
                    custo = consumo * 0.5;
                    totalComercial += custo;
                    somaConsumoTipo2 += consumo;
                    contadorTipo2++;
                    break;
                case 3:
                    custo = consumo * 0.7;
                    totalIndustrial += custo;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de consumidor inválido!");
                    continue;
            }

            // Exibe o custo para o consumidor atual
            JOptionPane.showMessageDialog(null, "Custo total para o consumidor " + codigo + ": R$ " + custo);
        }

        // Cálculo e impressão dos totais
        double totalGeral = totalResidencial + totalComercial + totalIndustrial;
        String mensagem = "Total de consumo:\n" +
                          "Residencial: R$ " + totalResidencial + "\n" +
                          "Comercial: R$ " + totalComercial + "\n" +
                          "Industrial: R$ " + totalIndustrial + "\n" +
                          "Custo total: R$ " + totalGeral + "\n";

        // Cálculo da média de consumo dos tipos 1 e 2
        double mediaTipo1E2 = (contadorTipo1 + contadorTipo2 > 0) ? (somaConsumoTipo1 + somaConsumoTipo2) / (contadorTipo1 + contadorTipo2) : 0;

        mensagem += "Média de consumo dos tipos 1 e 2: " + mediaTipo1E2 + " kWh";

        // Exibe os resultados finais
        JOptionPane.showMessageDialog(null, mensagem);
    }
}