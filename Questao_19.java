import javax.swing.JOptionPane;

public class Questao_19
 {
    public static void main(String[] args) {
        // Ler o primeiro número
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double numero1 = Double.parseDouble(valor1);
        
        // Ler o segundo número
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double numero2 = Double.parseDouble(valor2);
        
        // Verificar e imprimir em ordem decrescente
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + numero1 + ", " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Números em ordem decrescente: " + numero2 + ", " + numero1);
        }
    }
}