import javax.swing.JOptionPane;

public class Questao_13
 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        if (isPrimo(numero)) {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false; // Números menores ou iguais a 1 não são primos
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Se for divisível por i, não é primo
            }
        }
        return true; // É primo se não encontrou divisores
    }
}