package jogodeturno.personagens;

import java.util.Random;

public class Vilao extends Personagem {

    private Random gerador = null;
    
    public Vilao(String nome, int ataque, String nomeAtaque) {
        super(nome, ataque, nomeAtaque);
    }

    @Override
    public int getAtaque() {
        gerador = new Random();
        super.setAtaque(gerador.nextInt(100)+1);
        gerador = null;
        return super.getAtaque();
    }
}
