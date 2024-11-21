public class TestePessoa {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa com o construtor
        Pessoa pessoa1 = new Pessoa("Luiz", 23, "Rua Assupa, 133", "969598784");

        // Exibindo os dados usando os getters
        System.out.println("Dados da Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());

        // Verificando se a pessoa é maior de idade
        System.out.println("Maior de Idade? " + (pessoa1.isMaiorDeIdade() ? "Sim" : "Não"));
        System.out.println("Tem telefone? " + (pessoa1.temTelefone() ? "Sim" : "Não"));

        // Alterando os dados da pessoa usando setters
        pessoa1.setNome("Luiz Henryque ");
        pessoa1.setIdade(30);
        pessoa1.setEndereco("Avenida Brasil, 456");
        pessoa1.setTelefone("123456789");

        // Exibindo os novos dados da pessoa
        System.out.println("\nDados atualizados da Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());

        // Criando uma segunda pessoa
        Pessoa pessoa2 = new Pessoa("Maria", 17, "Rua das Laranjeiras, 789", "");

        // Exibindo os dados da pessoa2
        System.out.println("\nDados da Pessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());

        // Verificando as condições para a pessoa2
        System.out.println("Maior de Idade? " + (pessoa2.isMaiorDeIdade() ? "Sim" : "Não"));
        System.out.println("Tem telefone? " + (pessoa2.temTelefone() ? "Sim" : "Não"));
    }
}