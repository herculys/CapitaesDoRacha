package capitaesdoracha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapitaesDoRacha 
{
    static Jogador jogador1 = new Jogador();
    static Jogador jogador2 = new Jogador();
    static Jogador jogador3 = new Jogador();
    static Time timeA =  new Time();
    static Time timeB = new Time();
    static Menu menu = new Menu();
    static Jogos jogos = new Jogos();
    
    
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
        
        System.out.println("Digite o nome do Time 1: ");
        timeA.setNome(entrada.nextLine());
        System.out.println("Digite o nome do Time 2: ");
        timeB.setNome(entrada.nextLine());
        System.out.println();
        System.out.println("Times Adicionados");
    }
    
    public static void EntradasZeroOuUm()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("============ Zero ou Um ===========");
        System.out.println("Digite a escolha do " + jogador1.getNome() + " :");
        jogador1.setEscolha(entrada.nextInt());
        System.out.println("Digite a escolha do " + jogador2.getNome() + " :");
        jogador2.setEscolha(entrada.nextInt());
        System.out.println("Digite a escolha do " + jogador3.getNome() + " :");
        jogador3.setEscolha(entrada.nextInt());
        System.out.println();
        System.out.println("Escolhas Adicionadas");
    }
    
    public static void EntradasImparOuPar(Jogador _jogador1, Jogador _jogador2)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(_jogador1.getNome() + " Digite um valor entre 0 e 10: ");
        _jogador1.setEscolha(entrada.nextInt());
        System.out.println(_jogador2.getNome() + " Digite um valor entre 0 e 10: ");
        _jogador2.setEscolha(entrada.nextInt()); 
        System.out.println();
        System.out.println("Escolhas Adicionadas");
    }
    
    public static void EscolherImparOuPar(Jogador _jogador1, Jogador _jogador2)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua escolha: ");
        SalvandoEscolha(entrada.nextInt(), _jogador1, _jogador2);
        System.out.println(""); 
        System.out.println("Escolhas Adicionadas");
    }
    
    public static void SalvandoEscolha(int escolha, Jogador _jogador1, Jogador _jogador2)
    {
        switch (escolha) {
            case 1:
                _jogador1.setCategoria(ImparOuPar.IMPAR);
                _jogador2.setCategoria(ImparOuPar.PAR);
                System.out.println(_jogador1.getNome() + " Ficou com a opção IMPAR");
                System.out.println(_jogador2.getNome() + " Ficou com a opção PAR");
                System.out.println("");
                break;
            case 2:
                _jogador1.setCategoria(ImparOuPar.PAR);
                _jogador2.setCategoria(ImparOuPar.IMPAR);
                System.out.println(_jogador1.getNome() + " Ficou com a opção PAR");
                System.out.println(_jogador2.getNome() + " Ficou com a opção ÍMPAR");
                System.out.println("");
                break;
            default:                
                System.out.println("Escolha Inválida");
                menu.MenuImparOuPar();
                EscolherImparOuPar(_jogador1, _jogador2);
                break;
        }
    }
    
    public static void DefinirUltimoCapitão(Jogador _ultimoGanhador)
    {
        if(_ultimoGanhador.getNome() == jogador1.getNome())
        {
            EscolherImparOuPar(jogador2, jogador3);
            EntradasImparOuPar(jogador2, jogador3);
            ResultadoFinal(jogador2, jogador3);
        }
        else if(_ultimoGanhador.getNome() == jogador2.getNome())
        {
            EscolherImparOuPar(jogador1, jogador3);
            EntradasImparOuPar(jogador1, jogador3);
            ResultadoFinal(jogador1, jogador3);
        }
        else
        {
            EscolherImparOuPar(jogador1, jogador2);
            EntradasImparOuPar(jogador1, jogador2);
            ResultadoFinal(jogador1, jogador2);
        }
    }
    
    public static void ResultadoFinal(Jogador _jogador1, Jogador _jogador2)
    {
        Jogador ganhador = jogos.ImparOuPar(_jogador1, _jogador2);
        System.out.println("O Capitão do " + timeB.getNome() + " é " + ganhador.getNome());
    }
    
    public static void menuImparOuPar()
    {  
        System.out.println("##### Escolhendo os Capitães ######");
        EntradasZeroOuUm();
        
        try
        {
            Jogador ganhador = jogos.ZeroOuUm(jogador1, jogador2, jogador3);
            System.out.println("O Capitão do " + timeA.getNome() + " é " + ganhador.getNome());
            
            menu.MenuImparOuPar();
            DefinirUltimoCapitão(ganhador);
            
        }
        catch(NullPointerException e)
        {
            System.out.println("Ninguém saiu, jogue novamente");
        }
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
