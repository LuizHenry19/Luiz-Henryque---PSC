import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> notas;

    public BlocoDeNotas() {
        this.notas = new ArrayList<>();
    }

    public void inserirNota(String nota) {
        notas.add(nota);
        System.out.println("Nota inserida com sucesso!");
    }

    public void removerNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            notas.remove(indice);
            System.out.println("Nota removida com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void alterarNota(int indice, String novaNota) {
        if (indice >= 0 && indice < notas.size()) {
            notas.set(indice, novaNota);
            System.out.println("Nota alterada com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public String buscarNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            return notas.get(indice);
        } else {
            return "Índice inválido.";
        }
    }

    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("Não há notas cadastradas.");
        } else {
            System.out.println("Notas cadastradas:");
            for (int i = 0; i < notas.size(); i++) {
                System.out.println(i + ": " + notas.get(i));
            }
        }
    }
}