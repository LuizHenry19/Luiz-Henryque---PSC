import javax.swing.JOptionPane;

public class Questao_17
 {
    public static void main(String[] args) {
        // Ler o primeiro número
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double numero1 = Double.parseDouble(valor1);
        
        // Ler o segundo número
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double numero2 = Double.parseDouble(valor2);
        
        // Verificar e encontrar o menor número
        double menorNumero = (numero1 < numero2) ? numero1 : numero2;
        
        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O menor número é: " + menorNumero);
    }
}