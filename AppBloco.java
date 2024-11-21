import java.util.Scanner;

public class AppBloco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();
        int opcao;

        do {
            
            System.out.println("\n===== Menu =====");
            System.out.println("1) Inserir uma nota");
            System.out.println("2) Remover uma nota");
            System.out.println("3) Alterar uma nota");
            System.out.println("4) Listar todas as notas");
            System.out.println("5) Sair");
            System.out.print("Digite a operacao desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1: {
                    
                    System.out.print("Digite a nota: ");
                    String nota = scanner.nextLine();
                    blocoDeNotas.inserirNota(nota);
                    break;
                }
                case 2: {
                    
                    System.out.print("Digite o índice da nota a ser removida: ");
                    int indice = scanner.nextInt();
                    blocoDeNotas.removerNota(indice);
                    break;
                }
                case 3: {
                    
                    System.out.print("Digite o índice da nota a ser alterada: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Digite a nova nota: ");
                    String novaNota = scanner.nextLine();
                    blocoDeNotas.alterarNota(indice, novaNota);
                    break;
                }
                case 4: {
                    
                    blocoDeNotas.listarNotas();
                    break;
                }
                case 5: {
                    
                    System.out.println("Saindo");
                    break;
                }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}