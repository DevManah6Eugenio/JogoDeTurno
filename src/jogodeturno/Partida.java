package jogodeturno;

import jogodeturno.personagens.Heroi;
import jogodeturno.personagens.Vilao;

public class Partida {

    private Heroi heroi = null;
    private Vilao vilao = null;
    private String status;
    private int vida;
    private int ataqueVilao;
    private boolean heroiAtacou;
    
    public Partida(Heroi heroi, Vilao vilao) {
        this.heroi = heroi;
        this.vilao = vilao;
    }

    public boolean ataqueHeroi() {
        this.vida = vilao.getVida() - heroi.getAtaque();
        heroiAtacou = true;

        if (vida > 0) {
            vilao.setVida(this.vida);
            return false;
        } else {
            return true;
        }
    }

    public boolean ataqueVilao() {
        
        this.ataqueVilao = vilao.getAtaque();
        this.vida = heroi.getVida() - this.ataqueVilao;

        if (this.vida > 0) {
            heroi.setVida(this.vida);
            return false;
        } else {
            return true;
        }
    }

    public void pocaoHeroi() {
        if (heroi.getQtdKitsCura() > 0) {
            heroi.setQtdKitsCura(heroi.getQtdKitsCura() - 1);
            heroi.setVida(heroi.getVida() + 10);
            heroiAtacou = false;
        }
    }

    public String status() {
        status = "";
        
        status += ("******************************\n");
        status += (heroi.getNome() + " - Vida: " + heroi.getVida() + " - Kits: " + heroi.getQtdKitsCura() + "\n");
        status += (vilao.getNome() + " - Vida: " + vilao.getVida() + "\n");
        status += ("******************************\n");
        return status;
    }
}
