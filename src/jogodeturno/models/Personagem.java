package jogodeturno.models;

/**
 *
 * @author manases
 */
public abstract class Personagem {
    
    private String nome;
    private int ataque;
    private String nomeAtaque;
    private int vida;

    public Personagem() {
    }

    public Personagem(String nome, int ataque, String nomeAtaque, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.nomeAtaque = nomeAtaque;
        this.vida = vida;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
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
    
    public String status() {
        return this.nome + " - vida:" + this.vida;
    }
}