import javax.swing.JOptionPane;

public class Questao_22
 {
    public static void main(String[] args) {
        // Ler o primeiro número
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double numero1 = Double.parseDouble(input1);
        
        // Ler o segundo número
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double numero2 = Double.parseDouble(input2);
        
        // Ler o terceiro número
        String input3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        double numero3 = Double.parseDouble(input3);
        
        // Inicializar a variável maior
        double maior;

        // Determinar o maior número
        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }
        
        // Exibir o maior número
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}