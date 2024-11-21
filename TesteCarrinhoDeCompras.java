public class TesteCarrinhoDeCompras {
    public static void main(String[] args) {
        // Criando instâncias de produtos
        ItemCarrinho produto1 = new ItemProduto("Camiseta", 50.0);
        ItemCarrinho produto2 = new ItemProduto("Calça Jeans", 120.0);
        ItemCarrinho produto3 = new ItemProduto("Tênis", 200.0);

        // Criando o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionaItem(produto1);
        carrinho.adicionaItem(produto2);
        carrinho.adicionaItem(produto3);

        // Exibindo os itens no carrinho
        System.out.println("Itens no Carrinho:");
        carrinho.exibeItens();

        // Calculando o total
        double total = carrinho.calculaTotal();
        System.out.println("\nTotal do Carrinho: R$ " + total);

        // Removendo um item do carrinho
        carrinho.removeItem(produto2);

        // Exibindo os itens após remoção
        System.out.println("\nItens no Carrinho após remoção:");
        carrinho.exibeItens();

        // Recalculando o total após remoção
        total = carrinho.calculaTotal();
        System.out.println("\nTotal do Carrinho após remoção: R$ " + total);
    }
}