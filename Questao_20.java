import javax.swing.JOptionPane;

public class Questao_20
 {
    public static void main(String[] args) {
        // Ler o primeiro número
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double numero1 = Double.parseDouble(input1);
        
        // Ler o segundo número
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double numero2 = Double.parseDouble(input2);
        
        // Determinar o menor e o maior número
        double menorNumero = Math.min(numero1, numero2);
        double maiorNumero = Math.max(numero1, numero2);
        
        // Calcular o quadrado do menor número
        double quadrado = menorNumero * menorNumero;
        
        // Calcular a raiz quadrada do maior número se for possível
        double raizQuadrada = maiorNumero >= 0 ? Math.sqrt(maiorNumero) : Double.NaN; // Para garantir que a raiz só seja calculada para números não-negativos
        
        // Exibir os resultados
        JOptionPane.showMessageDialog(null, "Quadrado do menor número (" + menorNumero + "): " + quadrado);
        if (!Double.isNaN(raizQuadrada)) {
            JOptionPane.showMessageDialog(null, "Raiz quadrada do maior número (" + maiorNumero + "): " + raizQuadrada);
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível calcular a raiz quadrada de um número negativo.");
        }
    }
}