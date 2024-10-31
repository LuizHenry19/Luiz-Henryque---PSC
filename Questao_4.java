import javax.swing.JOptionPane;

public class Questao_4 
{
    public static void main(String[] args) {
        int contador = 0;

        while (true) {
            String entrada = JOptionPane.showInputDialog("Digite um número (0 para sair):");
            int numero = Integer.parseInt(entrada);

            if (numero == 0) {
                break; // Encerra o loop se o número for 0
            }

            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de números entre 100 e 200: " + contador);
    }
}