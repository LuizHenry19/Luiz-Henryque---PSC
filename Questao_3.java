import javax.swing.JOptionPane;

public class Questao_3
 {
    public static void main(String[] args) {
        double soma = 0;
        int contador = 0;
        int quantosNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos números positivos você vai digitar?"));

        for (int i = 0; i < quantosNumeros; i++) {
            String entrada = JOptionPane.showInputDialog("Digite um número positivo:");
            try {
                double numero = Double.parseDouble(entrada);
                if (numero > 0) {
                    soma += numero;
                    contador++;
                }
            } catch (NumberFormatException e) {
                // Ignorar entradas inválidas
                JOptionPane.showMessageDialog(null, "Entrada inválida. Número não contado.");
            }
        }

        String mensagem = (contador > 0) ? "A média é: " + (soma / contador) : "Nenhum número positivo foi digitado.";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}