package jogodeturno.personagens;

public class Heroi extends Personagem {

    private int qtdKitsCura;
    
    public Heroi(int qtdKitsCura, String nome, int ataque, String nomeAtaque) {
        super(nome, ataque, nomeAtaque);
        this.qtdKitsCura = qtdKitsCura;
    }
    
    public void setQtdKitsCura(int qtdKitsCura) {
        this.qtdKitsCura = qtdKitsCura;
    }

    public int getQtdKitsCura() {
        return qtdKitsCura;
    }
}
