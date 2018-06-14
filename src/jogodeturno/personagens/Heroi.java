package jogodeturno.personagens;

public class Heroi extends Personagem {

    //atributos
    private int qtdKitsCura;
    
    //construtor implicito
    public Heroi(){}
    
    //construtor explicito
    public Heroi(int qtdKitsCura, String nome, int ataque, String nomeAtaque) {
        super(nome, ataque, nomeAtaque);
        this.qtdKitsCura = qtdKitsCura;
    }
    
    //Gets e Sets dos atributos que pertecem ao heroi
    public void setQtdKitsCura(int qtdKitsCura) {
        this.qtdKitsCura = qtdKitsCura;
    }

    public int getQtdKitsCura() {
        return qtdKitsCura;
    }
}
