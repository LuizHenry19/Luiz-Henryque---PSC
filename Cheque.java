public class Cheque extends Pagamento {
    private String numeroDoCheque;

    public Cheque() {
        super();
        this.numeroDoCheque = "000000";
    }

    public Cheque(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCheque = numeroDoCheque;
    }

    public String getNumeroDoCheque() {
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }

    @Override
    public String toString() {
        return "Cheque[numeroDoCheque=" + numeroDoCheque + ", " + super.toString() + "]";
    }
}

