import javax.swing.JOptionPane;

public class Questao_9
 {
    public static void main(String[] args) {
        StringBuilder numeros = new StringBuilder("Números de 1 a 100:\n");
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            numeros.append(i).append("\n"); // Adiciona o número à String
            soma += i; // Acumula a soma
        }

        // Exibe os números e a soma em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, numeros.toString() + "Soma: " + soma);
    }
}