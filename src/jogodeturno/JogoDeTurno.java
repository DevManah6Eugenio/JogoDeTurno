package jogodeturno;

import java.util.Scanner;
import jogodeturno.personagens.Heroi;
import jogodeturno.personagens.Vilao;

public class JogoDeTurno {

    //aqui vai ser a primeira classe a ser executada
    public static void main(String[] args) {

        int opcao;

        Scanner scan = new Scanner(System.in);

        Heroi heroi = new Heroi(3, "Heroi", 50, "Super Espada");
        Vilao vilao = new Vilao("Vilão", 0, "Larva Acida");

        Partida partida = new Partida(heroi, vilao);

        boolean heroiGanhou = false;
        boolean vilaoGanhou = false;

        while (!(heroiGanhou) || !(vilaoGanhou)) {
            System.out.println("Heroi\n(1) para ataque\2(2) para poção");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    heroiGanhou = partida.ataqueHeroi();
                    break;
                case 2:
                    partida.pocaoHeroi();
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
                vilaoGanhou = partida.ataqueVilao();
            System.out.println(partida.status());
        }

        if (heroiGanhou) {
            System.out.println("\n\nO Heroi Ganhou!!!!!!!!!!!");
        } else {
            System.out.println("\n\nO Vilão Ganhou!!!!!!!!!!!");
        }
    }
}
