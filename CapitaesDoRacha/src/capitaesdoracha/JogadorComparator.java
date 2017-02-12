package capitaesdoracha;

import java.util.Comparator;

public class JogadorComparator implements Comparator<Jogador>
{

    @Override
    public int compare(Jogador o1, Jogador o2) {
        return o1.compareTo(o2);
    }
}
