import javax.swing.JOptionPane;

public class Questão_1
 {
    public static void main(String[] args) {
        String resultado = "";

        for (int i = 100; i >= 1; i--) {
            resultado += i + "\n"; // Adiciona o número e uma nova linha
        }

        JOptionPane.showMessageDialog(null, resultado, "Contagem Regressiva", JOptionPane.INFORMATION_MESSAGE);
    }
}