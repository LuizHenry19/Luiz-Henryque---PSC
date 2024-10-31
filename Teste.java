public class Teste {
    public static void main(String[] args) {
        // Testando Pagamento
        Pagamento pagamento = new Pagamento("João", "123.456.789-00", 100.0);
        System.out.println(pagamento);

        CartaoDeCredito cartao = new CartaoDeCredito("Maria", "987.654.321-00", 150.0, "1234-5678-9012-3456");
        System.out.println(cartao);

        Cheque cheque = new Cheque("Ana", "456.789.123-00", 200.0, "987654");
        System.out.println(cheque);

        Boleto boleto = new Boleto("Lucas", "321.654.987-00", 250.0, "123456", 15, 12, 2024);
        System.out.println(boleto);

        // Testando Empregados
        Desempregado desempregado = new Desempregado("Carlos", "Silva", "111.222.333-44", 500.0);
        System.out.println(desempregado.dados());

        Mensalista mensalista = new Mensalista("Roberta", "Lima", "222.333.444-55", 2000.0);
        System.out.println(mensalista.dados());

        Horista horista = new Horista("Gustavo", "Soares", "333.444.555-66", 50.0, 40);
        System.out.println(horista.dados());

        Tarefeiro tarefeiro = new Tarefeiro("Ana", "Oliveira", "444.555.666-77", 30.0, 10);
        System.out.println(tarefeiro.dados());

        Vendedor vendedor = new Vendedor("Fernando", "Pereira", "555.666.777-88", 3000.0, 500.0);
        System.out.println(vendedor.dados());
    }
}