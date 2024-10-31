import javax.swing.JOptionPane;
public class TesteProduto 
{

   // cadastrar um novo produto no metodo main
   public static void main(String[] args) {

   // coletando os dados do produto a ser cadastrado
   String nome = JOptionPane.showInputDialog("Nome");
   double preço = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
   int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
  
     // cria um objeto produto
   Produto produto = new Produto(nome, preço, quantidade);

   // monta a String de saida chamando os metodos de acesso do produto
   String msg = "Nome: " + produto.getNome() + "\nPreço: "
   + produto.getPreço() + " " + "\nQuantidade: " + produto.getQuantidade();
   
   // mostra o produto
   JOptionPane.showMessageDialog(null, msg);

   // altera informacoes; nao precisa criar todas as variaveis novamente
   preço = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
   quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
 
   
   
   // muda usando os metodo modificadores
   produto.setNome(nome);
   produto.setPreço(preço);
   produto.setQuantidade(quantidade);
 

   // mostra novamente o cadastro do produto

   // monta a String de saida chamando os metodos de acesso do produto
   msg = "Nome: " + produto.getNome() + "\nPreço: "
   + produto.getPreço() + " " + "\nQuantidade: " + produto.getQuantidade();
   
  
   // mostra o aluno
   JOptionPane.showMessageDialog(null, msg);
   }
}