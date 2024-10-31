public class Tarefeiro extends Empregado {
    private double valorPorTarefa;
    private int tarefasCompletas;

    public Tarefeiro() {
        super();
        this.valorPorTarefa = 0.0;
        this.tarefasCompletas = 0;
    }

    public Tarefeiro(String nome, String sobrenome, String cpf, double valorPorTarefa, int tarefasCompletas) {
        super(nome, sobrenome, cpf, valorPorTarefa * tarefasCompletas);
        this.valorPorTarefa = valorPorTarefa;
        this.tarefasCompletas = tarefasCompletas;
    }

    public double getValorPorTarefa() {
        return valorPorTarefa;
    }

    public void setValorPorTarefa(double valorPorTarefa) {
        this.valorPorTarefa = valorPorTarefa;
    }

    public int getTarefasCompletas() {
        return tarefasCompletas;
    }

    public void setTarefasCompletas(int tarefasCompletas) {
        this.tarefasCompletas = tarefasCompletas;
        setSalario(valorPorTarefa * tarefasCompletas); // Atualiza salário
    }

    @Override
    public String dados() {
        return "Tarefeiro[valorPorTarefa=" + valorPorTarefa + ", tarefasCompletas=" + tarefasCompletas + ", " + super.dados() + "]";
    }
}