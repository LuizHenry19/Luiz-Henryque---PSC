import javax.swing.JOptionPane;

public class Questao_7
 {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Múltiplos de 5 entre 1 e 500:\n");

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                resultado.append(i).append("\n"); // Adiciona o múltiplo de 5 à String
            }
        }

        // Exibe os múltiplos de 5 em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}