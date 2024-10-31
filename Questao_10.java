import javax.swing.JOptionPane;

public class Questao_10
 {
    public static void main(String[] args) {
        while (true) {
            String entrada = JOptionPane.showInputDialog("Digite um número (-999 para sair):");
            int numero = Integer.parseInt(entrada);

            if (numero == -999) {
                break; // Encerra o loop se o número for -999
            }

            JOptionPane.showMessageDialog(null, "Divisores de " + numero + ": " + encontrarDivisores(numero));
        }
    }

    public static String encontrarDivisores(int n) {
        StringBuilder divisores = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores.append(i).append(" "); // Adiciona o divisor à string
            }
        }
        
        return divisores.toString();
    }
}