package jogodeturno.models;

/**
 *
 * @author manases
 */
public class Heroi extends Personagem {
    
    private int QtdKitsCura; 

    public Heroi(int qtdKitsCura, String nome, int ataque, String nomeAtaque, int vida) {
        super(nome, ataque, nomeAtaque, vida);
        this.QtdKitsCura = qtdKitsCura;
    }

    public int getQtdKitsCura() {
        return QtdKitsCura;
    }

    public void setQtdKitsCura(int QtdKitsCura) {
        this.QtdKitsCura = QtdKitsCura;
    }
    
    @Override
    public String status() {
        return super.status() + " - Kits " + this.QtdKitsCura;
    }
}
