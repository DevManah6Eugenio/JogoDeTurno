package jogodeturno.models;

/**
 *
 * @author manases
 */
public class StatusAcao {
    
    private String mensagem;
    private boolean ganhou;

    public StatusAcao(String mensagem, boolean ganhou) {
        this.mensagem = mensagem;
        this.ganhou = ganhou;
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }
}
