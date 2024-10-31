import javax.swing.JOptionPane;

public class Questao_16
 {
    public static void main(String[] args) {
        // Ler o primeiro número
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        int numero1 = Integer.parseInt(valor1);
        
        // Ler o segundo número
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero2 = Integer.parseInt(valor2);
        
        // Verificar se os números são iguais ou diferentes
        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes.");
        }
    }
}