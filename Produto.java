public class Produto 
{

   // atributos
   private String nome;
   private int preço;
   private double quantidade;


   // método construtor
   public Produto (String n, int p, double q) {
   nome = n;
   preço = p;
   quantidade = q;

 
}

   // métodos de acesso
   public String getNome()   
   {
   return nome;
   }
   public int getPreço()    
   {
   return preço;
   }
   public double getQuantidade()   
   {
   return quantidade;
   }
  
   
   // métodos modificadores
   public void setNome(String n) 
   {
   nome = n;
   }
   public void setPreço(int p) 
   {
   preço = p;
   }
   public void setQuantidade(double q) 
   {
   quantidade = q;
   }
}