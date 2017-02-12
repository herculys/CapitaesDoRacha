package capitaesdoracha;


public class teste 
{
    public static void main(String[] args)
    {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();
        Time TimeA =  new Time();
        Time TimeB = new Time();
        Jogos jogos = new Jogos();
        
        jogador1.setCategoria(ImparOuPar.IMPAR);
        jogador1.setNome("Thiago");
        jogador1.setEscolha(1);
        jogador2.setCategoria(ImparOuPar.IMPAR);
        jogador2.setNome("Filipe");
        jogador2.setEscolha(1);
        jogador3.setNome("João");
        jogador3.setEscolha(1);
        
        Jogador ganhador = jogos.ZeroOuUm(jogador1, jogador2, jogador3);
        
        System.out.println(ganhador.getNome());
        
    }
}
