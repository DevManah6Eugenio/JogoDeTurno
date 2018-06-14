package jogodeturno.personagens;

public class Personagem {

    private String nome;
    private int ataque;
    private String nomeAtaque;

    public Personagem(String nome, int ataque, String nomeAtaque) {
        this.nome = nome;
        this.ataque = ataque;
        this.nomeAtaque = nomeAtaque;
    }
    
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
