import javax.swing.JOptionPane;

public class Questao_6
 {
    public static void main(String[] args) {
        while (true) {
            String entrada = JOptionPane.showInputDialog("Digite um número (-999 para sair):");
            double numero = Double.parseDouble(entrada);

            if (numero == -999) {
                break; // Encerra o loop se o número for -999
            }

            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "A raiz quadrada não é definida para números negativos.");
            } else {
                double raizQuadrada = Math.sqrt(numero);
                double inverso = 1.0 / numero;

                String mensagem = String.format("Número: %.2f\nRaiz Quadrada: %.2f\nInverso: %.2f", numero, raizQuadrada, inverso);
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
    }
}