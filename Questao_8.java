import javax.swing.JOptionPane;

public class Questao_8
{
    
   public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Números de 120 a 300:\n");

        for (int i = 120; i <= 300; i++) {
            resultado.append(i).append("\n"); // Adiciona o número à String
        }

        // Exibe os números em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}