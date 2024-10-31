import javax.swing.JOptionPane;

public class Questão_3 
{
    public static void main(String[] args) {
        // Entrar com um número
        String input = JOptionPane.showInputDialog("Digite um número:");
        
        // Converter para double
        double numero = Double.parseDouble(input);
        
        // Verificar se o número é positivo ou negativo
        if (numero >= 0) {
            // Calcular a raiz quadrada
            double raizQuadrada = Math.sqrt(numero);
            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é " + raizQuadrada);
        } else {
            // Calcular o quadrado
            double quadrado = numero * numero;
            JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é " + quadrado);
        }
    }
}
