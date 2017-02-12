package capitaesdoracha;

public class Jogador implements Comparable<Jogador>
{
    private String Nome;
    private Time Time;
    private int Escolha;
    private ImparOuPar Categoria;

    public String getNome() {
        return Nome;
    }

    public void setNome(String _nome) {
        this.Nome = _nome;
    }

    public Time getTime() {
        return Time;
    }


    public void setTime(Time _time) {
        this.Time = _time;
    }

    public int getEscolha() {
        return Escolha;
    }

    public void setEscolha(int _escolha) {
        this.Escolha = _escolha;
    }

    public ImparOuPar getCategoria() {
        return Categoria;
    }

    public void setCategoria(ImparOuPar _categoria) {
        this.Categoria = _categoria;
    }

    @Override
    public int compareTo(Jogador o) {
        if(o.Escolha > this.Escolha)
            return -1;
        else if(o.Escolha == this.Escolha)
            return 0;
        else
            return 1;     
    }
    
}
