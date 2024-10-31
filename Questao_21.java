import javax.swing.JOptionPane;

public class Questao_21
 {
    public static void main(String[] args) {
        // Ler o primeiro número
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double numero1 = Double.parseDouble(valor1);
        
        // Ler o segundo número
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double numero2 = Double.parseDouble(valor2);
        
        // Ler o terceiro número
        String valor3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        double numero3 = Double.parseDouble(valor3);
        
        // Determinar o maior número
        double maiorNumero = Math.max(numero1, Math.max(numero2, numero3));
        
        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero);
    }
}