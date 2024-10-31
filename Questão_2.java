import javax.swing.JOptionPane;

public class Questão_2

{
    public static void main(String[] args) {
        // Lê os dois valores inteiros usando JOptionPane
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converte as entradas para inteiros
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        // Efetua a adição
        int soma = numero1 + numero2;

        // Verifica se a soma é menor ou igual a 20
        if (soma <= 20) {
            soma -= 5; // Subtrai 5 da soma
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O resultado é: " + soma);
    }
}