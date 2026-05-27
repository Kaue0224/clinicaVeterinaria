import java.util.Scanner;

public class Main{

    public static void main(String args[]){

    
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;



        while (opcao != 0) {

            System.out.print("Menu de selecao: \n\n1 - Cliente \n2 - Medico\n3 - Animal\n0 - sair\nEscolha: ");
            opcao = scanner.nextInt();


            switch (opcao) {
                
                case 0: 
                    System.out.println("Saindo...");
                    break;
                
                case 1:
                    System.out.println("Opcoes Cliente");
                    break;
                
                case 2:
                    System.out.println("Opcoes Medico");
                    break;
                
                    case 3:
                    System.out.println("Opcoes Animal");
                    break;
                    
                default:
                    System.out.println("opcao errada digite novamente");
                    break;
            }


            
        }


        




        


    }



}
