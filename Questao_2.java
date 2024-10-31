import javax.swing.JOptionPane;

public class Questao_2
 {
    public static void main(String[] args) {
        String resultado = "";

        for (int i = 0; i < 200; i += 2) {
            resultado += i + "\n"; // Adiciona o número par e uma nova linha
        }

        JOptionPane.showMessageDialog(null, resultado, "100 Primeiros Números Pares", JOptionPane.INFORMATION_MESSAGE);
    }
}