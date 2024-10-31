public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor() {
        super();
        this.comissao = 0.0;
    }

    public Vendedor(String nome, String sobrenome, String cpf, double salario, double comissao) {
        super(nome, sobrenome, cpf, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String dados() {
        return "Vendedor[comissao=" + comissao + ", " + super.dados() + "]";
    }
}