package jogodeturno.personagens;

import java.util.Random;

public class Vilao extends Personagem {

    //objeto do tipo Random para poder gerar valores aleatorios
    private Random gerador = null;

    //construtor implicito
    public Vilao() {
    }

    //construtor explicito
    public Vilao(String nome, int ataque, String nomeAtaque) {
        super(nome, ataque, nomeAtaque);
    }

    //sobscrevi esse metodo para poder retorna os valores aleatorios de 1 a 100
    @Override
    public int getAtaque() {
        gerador = new Random();
        super.setAtaque(gerador.nextInt(100) + 1);
        gerador = null;
        return super.getAtaque();
    }
}
