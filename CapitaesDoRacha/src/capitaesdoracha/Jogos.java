package capitaesdoracha;

import java.util.Arrays;

public class Jogos 
{
    public Jogador ZeroOuUm(Jogador _jogador1, Jogador _jogador2, Jogador _jogador3)
    {
        int[] entradas = {_jogador1.getEscolha(), _jogador2.getEscolha(), _jogador3.getEscolha()};
        Arrays.sort(entradas);
        
        if(entradas[0] == entradas[1])
        {
            if(entradas[2] != entradas[1])
                return null;
            else
                return _jogador3;
        }
        else if(entradas[1] == entradas[2])
            return _jogador1;
        else
            return _jogador2;               
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
