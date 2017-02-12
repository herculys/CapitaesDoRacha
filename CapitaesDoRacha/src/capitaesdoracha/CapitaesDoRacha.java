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
    static Menu menu = new Menu();
    
    
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
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("============ Zero ou Um ===========");
        System.out.println("Digite a escolha do jogadaor 1: ");
        jogador1.setEscolha(entrada.nextInt());
        System.out.println("Digite a escolha jogadaor 2: ");
        jogador2.setEscolha(entrada.nextInt());
        System.out.println("Digite a escolha jogadaor 3: ");
        jogador3.setEscolha(entrada.nextInt());
        System.out.println();
        System.out.println("Escolhas Adicionadas");
    }
    
    public static void EntradasImparOuPar()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um valor entre 0 e 10: ");
        jogador1.setEscolha(entrada.nextInt());
        System.out.println("Digite um valor entre 0 e 10: ");
        jogador2.setEscolha(entrada.nextInt()); 
        System.out.println();
        System.out.println("Escolhas Adicionadas");
    }
    
    public static void EscolherImparOuPar()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua escolha: ");
        SalvandoEscolha(entrada.nextInt(), jogador1, jogador2);
        System.out.println(""); 
        System.out.println("Escolhas Adicionadas");
    }
    
    public static void SalvandoEscolha(int escolha, Jogador _jogador1, Jogador _jogador2)
    {
        if(escolha == 1)
        {
            _jogador1.setCategoria(ImparOuPar.IMPAR);
            _jogador2.setCategoria(ImparOuPar.PAR);
            System.out.println("O Jogador 2 Ficou com a opção PAR");
            System.out.println("");
        }
        else
        {
            _jogador1.setCategoria(ImparOuPar.PAR);
            _jogador2.setCategoria(ImparOuPar.IMPAR);
            System.out.println("O Jogador 2 Ficou com a opção ÍMPAR");
            System.out.println("");
        }
    }
    
    public static void menuImparOuPar()
    {
        System.out.println("##### Escolhendo os Capitães ######");
        EntradasZeroOuUm();
        
        menu.MenuImparOuPar();
        
        
        EscolherImparOuPar();
    }

    public static void main(String[] args) 
    {
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
                        menuImparOuPar();
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
