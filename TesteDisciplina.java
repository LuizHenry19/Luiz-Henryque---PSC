import javax.swing.JOptionPane;
public class TesteDisciplina 
{

   // cadastrar uma nova disciplina no metodo main
   public static void main(String[] args) {

   // coletando os dados da disciplina a ser cadastrada
   String nome = JOptionPane.showInputDialog("Nome");
   String professor = JOptionPane.showInputDialog("Professor");
   int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre"));
   boolean ofertado = Boolean.parseBoolean(JOptionPane.showInputDialog("Ofertado"));
     
    // cria um objeto disciplina
   Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertado);

   // monta a String de saida chamando os metodos de acesso da disciplina
   String msg = "Nome: " + disciplina.getNome() + "\nProfessor: "
   + disciplina.getProfessor() + " " + "\nSemestre: " + disciplina.getSemestre();
   
   if(disciplina.getOfertada()){
      msg += "\nOfertada: sim";
   }else{
      msg += "\nOfertada: nao";
   }
      
   // mostra a disciplina
   JOptionPane.showMessageDialog(null, msg);

   // altera informacoes; nao precisa criar todas as variaveis novamente
   semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre"));
 
   // tem que digitar true or false
   boolean ofertada = Boolean.parseBoolean(JOptionPane.showInputDialog("E'ofertado?true/false"));
   
   // muda usando os metodo modificadores
   disciplina.setNome(nome);
   disciplina.setProfessor(professor);
   disciplina.setSemestre(semestre);

   // mostra novamente o cadastro da turma

   // monta a String de saida chamando os metodos de acesso do aluno
   msg = "Nome: " + disciplina.getNome() + "\nProfessor: "
   + disciplina.getProfessor() + " " + "\nSemestre: " + disciplina.getSemestre();
   
   if(disciplina.getOfertada()){
      msg += "\nOfertada: sim";
   }else{
      msg += "\nOfertada: nao";
   }
   
      // mostra o aluno
   JOptionPane.showMessageDialog(null, msg);
   }
}