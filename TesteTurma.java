import javax.swing.JOptionPane;
public class TesteTurma 
{

   // cadastrar uma nova turma no metodo main
   public static void main(String[] args) {

   // coletando os dados da turma a ser cadastrada
   String nome = JOptionPane.showInputDialog("Nome");
   String curso = JOptionPane.showInputDialog("Curso");
   int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
   int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));

   // cria um objeto turma
   Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

   // monta a String de saida chamando os metodos de acesso da turma
   String msg = "Nome: " + turma.getNome() + "\nCurso: "
   + turma.getCurso() + " " + "\nQuantidade De Alunos: " + turma.getQuantidadeDeAlunos() + "\nSerie: " +
   turma.getSerie() + " ";
   
   // mostra a turma
   JOptionPane.showMessageDialog(null, msg);

   // altera informacoes; nao precisa criar todas as variaveis novamente
   serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
   quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade De Alunos"));
 
   
   
   // muda usando os metodo modificadores
   turma.setNome(nome);
   turma.setCurso(curso);
   turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
   turma.setSerie(serie);

   // mostra novamente o cadastro da turma

   // monta a String de saida chamando os metodos de acesso do aluno
   msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso()
   + " " + "\nQuantidadeDeAlunos: " + turma.getQuantidadeDeAlunos() + "\nSerie" + turma.getSerie();
  
   // mostra o aluno
   JOptionPane.showMessageDialog(null, msg);
   }
}