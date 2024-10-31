import javax.swing.JOptionPane;

public class Questao_14
 {
    public static void main(String[] args) {
        int contadorPrimos = 0;

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):"));

            // Verifica se o número é não positivo
            if (numero <= 0) {
                break; // Encerra o loop
            }

            // Verifica se o número é primo
            if (isPrimo(numero)) {
                contadorPrimos++;
            }
        }

        // Exibe a quantidade de números primos
        JOptionPane.showMessageDialog(null, "Quantidade de números primos digitados: " + contadorPrimos);
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