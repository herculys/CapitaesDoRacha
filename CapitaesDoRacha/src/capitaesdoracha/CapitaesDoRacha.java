package capitaesdoracha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapitaesDoRacha 
{
    static Jogador jogador1 = new Jogador();
    static Jogador jogador2 = new Jogador();
    static Jogador jogador3 = new Jogador();
    static Time TimeA =  new Time();
    static Time TimeB = new Time();
    
    
    public static void AdicionarNomesJogadores()
    {
        Scanner entrada = new Scanner(System.in);
                       
        System.out.println("Digite o nome do jogadaor 1: ");
        jogador1.setNome(entrada.nextLine());
        System.out.println("Digite o nome do jogadaor 2: ");
        jogador2.setNome(entrada.nextLine());
        System.out.println("Digite o nome do jogadaor 3: ");
        jogador3.setNome(entrada.nextLine());
        System.out.println();
        System.out.println("Nomes Adicionados");
    }
    
    public static void AdicionarNomesTimes()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do jogadaor 1: ");
        TimeA.setNome(entrada.nextLine());
        System.out.println("Digite o nome do jogadaor 2: ");
        TimeB.setNome(entrada.nextLine());
        System.out.println();
        System.out.println("Times Adicionados");
    }
    
    public static void EntradasZeroOuUm()
    {
        
    }

    public static void main(String[] args) 
    {

        Menu menu = new Menu();
        boolean loop = true;
        
        do
        {
           try
           { 
               Scanner entrada = new Scanner(System.in);
               
               menu.MenuPricipal();
               int escolha = entrada.nextInt();
               
               switch(escolha){
                    case 1:
                       AdicionarNomesJogadores();
                       break;
                    case 2:
                        AdicionarNomesTimes();
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        System.out.print("Escolha uma opção válida");
                        System.out.println();
               }
           }
           catch(InputMismatchException e)
           {
                System.out.println("Digite uma opção válida");
           }
        }while(loop != false);
        
    }  
}
