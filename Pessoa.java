public class Pessoa
{
   private String nome;
   private int idade;
   private String endereco;
   private String telefone;
   
   //Costrutor
   public Pessoa(String nome,int idade,String endereco, String telefone)
   {
      this.nome = nome; 
      this.idade = idade;
      this.endereco = endereco; 
      this.telefone = telefone;
   }
   
   // Métodos getters
   public String getNome()
   {  return nome;
   }
   
   public int getIdade()
   {  return idade;
   }
   
   public String getEndereco()
   {  return endereco;
   }
   
   public String getTelefone()
   {  return telefone;
   }
   
   //Métodos setters
   public void setNome(String nome)
   {  this.nome = nome;
   }
   
   public void setIdade(int idade)
   {  this.idade = idade;
   }
   
   public void setEndereco(String endereco)
   {  this.endereco = endereco;
   }
   
   public void setTelefone(String telefone)
   {  this.telefone = telefone;
   }
   
   // Outros métodos relacionados apenas a operações com Pessoa
   public boolean isMaiorDeIdade()
   {  return idade >= 18;
   }
   
   public boolean temTelefone()
   {  return telefone != null && !telefone.isEmpty();
   }
}