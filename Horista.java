public class Horista extends Empregado {
    private double valorPorHora;
    private int horasTrabalhadas;

    public Horista() {
        super();
        this.valorPorHora = 0.0;
        this.horasTrabalhadas = 0;
    }

    public Horista(String nome, String sobrenome, String cpf, double valorPorHora, int horasTrabalhadas) {
        super(nome, sobrenome, cpf, valorPorHora * horasTrabalhadas);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        setSalario(valorPorHora * horasTrabalhadas); // Atualiza salário
    }

    @Override
    public String dados() {
        return "Horista[valorPorHora=" + valorPorHora + ", horasTrabalhadas=" + horasTrabalhadas + ", " + super.dados() + "]";
    }
}