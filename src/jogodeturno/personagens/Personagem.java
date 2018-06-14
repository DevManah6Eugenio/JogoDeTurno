package jogodeturno.personagens;

//essa classe é de que os demais personagens devem extender
public class Personagem {

    private String nome;
    private int ataque;
    private String nomeAtaque;

    //construtor implicito
    public Personagem(){}
    
    //construtor explicito
    public Personagem(String nome, int ataque, String nomeAtaque) {
        this.nome = nome;
        this.ataque = ataque;
        this.nomeAtaque = nomeAtaque;
    }
    
    //todos os demais Gets e Sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public String getNomeAtaque() {
        return nomeAtaque;
    }

    public void setNomeAtaque(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }
}
