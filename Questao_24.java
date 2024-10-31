import javax.swing.JOptionPane;

public class Questao_24
 {
    public static void main(String[] args) {
        // Inicializar variáveis para armazenar o maior e o menor número
        double maior = Double.NEGATIVE_INFINITY; // Inicia com o menor valor possível
        double menor = Double.POSITIVE_INFINITY; // Inicia com o maior valor possível

        // Ler cinco números
        for (int i = 1; i <= 5; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + i + "° número:");
            double numero = Double.parseDouble(input);
            
            // Atualizar maior e menor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibir os resultados
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
    }
}