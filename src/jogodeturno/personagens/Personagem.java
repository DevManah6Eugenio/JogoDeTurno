package jogodeturno.personagens;

//essa classe é de que os demais personagens devem extender
public class Personagem {

    private int vida;
    private String nome;
    private int ataque;
    private String nomeAtaque;

    //construtor implicito
    public Personagem() {
    }

    //construtor explicito
    public Personagem(String nome, int ataque, String nomeAtaque) {
        this.nome = nome;
        this.ataque = ataque;
        this.nomeAtaque = nomeAtaque;
        this.vida = 200;
    }
    
    //construtor explicito
    public Personagem(String nome, int ataque, String nomeAtaque, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.nomeAtaque = nomeAtaque;
        this.vida = vida;
    }

    //todos os demais Gets e Sets dos atributos
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
