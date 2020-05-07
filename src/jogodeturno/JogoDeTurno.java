package jogodeturno;

import java.util.Scanner;
import jogodeturno.models.Heroi;
import jogodeturno.models.StatusAcao;
import jogodeturno.models.Vilao;

public class JogoDeTurno {

    //aqui vai ser a primeira classe a ser executada
    public static void main(String[] args) {

        int opcao;

        Scanner scan = new Scanner(System.in);

        Heroi heroi = new Heroi(3, "Heroi", 50, "Super Espada", 500);
        Vilao vilao = new Vilao("Vilão", 50, "Larva Acida", 500);

        Partida partida = new Partida(heroi, vilao);

        StatusAcao statusAcaoHeroi = null;
        StatusAcao statusAcaoVilao = null;

        do {
            System.out.println("Heroi\n(1) para ataque\2(2) para poção");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    statusAcaoHeroi = partida.ataqueHeroi();
                    break;
                case 2:
                    statusAcaoHeroi = partida.HeroiTomarPocao();
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
            statusAcaoVilao = partida.ataqueVilao();

            System.out.println(statusAcaoHeroi.getMensagem());
            System.out.println(statusAcaoVilao.getMensagem());
            System.out.println(partida.Status());

        } while (!statusAcaoHeroi.isGanhou() || !statusAcaoVilao.isGanhou());

        if (statusAcaoHeroi.isGanhou()) {
            System.out.println("\n\nO Heroi Ganhou!!!!!!!!!!!");
        } else if (statusAcaoVilao.isGanhou()) {
            System.out.println("\n\nO Vilão Ganhou!!!!!!!!!!!");
        }

        System.out.println("fim");
    }
}
