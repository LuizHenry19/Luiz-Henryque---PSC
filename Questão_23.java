import javax.swing.JOptionPane;

public class Questão_23
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
        
        double maior, intermediario, menor;

        // Determinar o maior, intermediário e menor
        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
            if (numero2 > numero3) {
                intermediario = numero2;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
            if (numero1 > numero3) {
                intermediario = numero1;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 > numero2) {
                intermediario = numero1;
                menor = numero2;
            } else {
                intermediario = numero2;
                menor = numero1;
            }
        }
        
        // Exibir os resultados
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + intermediario + "\nMenor: " + menor);
    }
}