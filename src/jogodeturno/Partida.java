package jogodeturno;

import jogodeturno.models.Heroi;
import jogodeturno.models.StatusAcao;
import jogodeturno.models.Vilao;

/**
 *
 * @author manases
 */
public class Partida {

    private Heroi heroi;
    private Vilao vilao;

    public Partida(Heroi heroi, Vilao vilao) {
        this.heroi = heroi;
        this.vilao = vilao;
    }

    public StatusAcao ataqueHeroi() {
        vilao.setVida(vilao.getVida() - heroi.getAtaque());
        return new StatusAcao(heroi.getNome() + " - Ataca - " + heroi.getAtaque() + " com " + heroi.getNomeAtaque(), (vilao.getVida() <= 0));
    }

    public StatusAcao ataqueVilao() {
        heroi.setVida(heroi.getVida() - vilao.getAtaque());
        return new StatusAcao(vilao.getNome() + " - Ataca - " + vilao.getAtaque() + " com " + vilao.getNomeAtaque(), (heroi.getVida() <= 0));
    }

    public StatusAcao HeroiTomarPocao() {
        int adicionalVida = 0;
        if (heroi.getQtdKitsCura() > 0) {
            adicionalVida = 10;
            heroi.setQtdKitsCura(heroi.getQtdKitsCura() - 1);
        }
        heroi.setVida(heroi.getVida() + adicionalVida);
        return new StatusAcao(heroi.getNome() + " - Usa Kit - +" + adicionalVida + " Vida", false);
    }

    public String Status() {
        String status = ("******************************\n");
                status += heroi.status() + "\n";
                status += vilao.status() + "\n";
                status += ("******************************\n");
        return status;
    }
}
