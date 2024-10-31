import javax.swing.JOptionPane;

public class Questao_12
 {
    public static void main(String[] args) {
        int idade;
        int totalMenor21 = 0;
        int totalMaior50 = 0;

        while (true) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (0 a 120, ou um número fora da faixa para sair):"));

            // Verifica se a idade está fora da faixa
            if (idade < 0 || idade > 120) {
                break; // Encerra o loop
            }

            // Contagem das idades
            if (idade < 21) {
                totalMenor21++;
            } else if (idade > 50) {
                totalMaior50++;
            }
        }

        // Exibe os resultados
        String mensagem = "Total de pessoas com menos de 21 anos: " + totalMenor21 + "\n" +
                          "Total de pessoas com mais de 50 anos: " + totalMaior50;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}