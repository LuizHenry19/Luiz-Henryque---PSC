import javax.swing.JOptionPane;

public class Questao_15
 {
    public static void main(String[] args) {
        int numero;
        int maior = Integer.MIN_VALUE; // Inicializa como o menor valor possível

        while (true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (-9999 para sair):"));

            if (numero == -9999) {
                break; // Encerra o loop se o número for -9999
            }

            // Verifica se o número atual é maior que o maior encontrado até agora
            if (numero > maior) {
                maior = numero; // Atualiza o maior
            }
        }

        // Exibe o maior número encontrado
        if (maior != Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
        }
    }
}