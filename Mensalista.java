public class Mensalista extends Empregado {
    public Mensalista() {
        super();
    }

    public Mensalista(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
    }

    @Override
    public String dados() {
        return "Mensalista[" + super.dados() + "]";
    }
}
