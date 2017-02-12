package capitaesdoracha;

import java.util.Arrays;

public class Jogos
{
    public Jogador ZeroOuUm(Jogador _jogador1, Jogador _jogador2, Jogador _jogador3)
    {
        Jogador[] jogadores = {_jogador1, _jogador2, _jogador3};
        Arrays.sort(jogadores, new JogadorComparator());
        
        if(jogadores[0].getEscolha() == jogadores[1].getEscolha())
        {
            if(jogadores[0].getEscolha() == jogadores[2].getEscolha())
                return null;
            else
                return jogadores[2];
        }
        else
            return jogadores[0];
    }
    
    public Jogador ImparOuPar(Jogador _jogador1, Jogador _jogador2)
    {
        int soma = _jogador1.getEscolha() + _jogador2.getEscolha();
        
        if(soma%2 == 0)
        {
            if(_jogador1.getCategoria() == ImparOuPar.PAR)
                return _jogador1;
            else
                return _jogador2;
        }
        else
        {
            if(_jogador1.getCategoria() == ImparOuPar.IMPAR)
                return _jogador1;
            else
                return _jogador2;
        }
    }
}
