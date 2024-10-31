import javax.swing.JOptionPane;

public class Questao_5
 {
    public static void main(String[] args) {
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite um nome (ou 'FIM' para sair):");

            if (nome == null || nome.equalsIgnoreCase("FIM")) {
                break; // Encerra o loop se o nome for "FIM"
            }

            JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
        }
    }
}