// Implementação da classe ItemProduto
public class ItemProduto implements ItemCarrinho {
    private String descricao;
    private double preco;
    
    public ItemProduto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public String getDescricao() {
        return descricao;
    }
}