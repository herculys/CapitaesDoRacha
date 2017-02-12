/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitaesdoracha;

import java.util.Comparator;

/**
 *
 * @author Hall-9000
 */
public class JogadorComparator implements Comparator<Jogador>
{

    @Override
    public int compare(Jogador o1, Jogador o2) {
        return o1.compareTo(o2);
    }
}
