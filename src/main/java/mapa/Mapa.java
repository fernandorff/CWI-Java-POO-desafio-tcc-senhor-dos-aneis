package mapa;

import erros.SauronDominaOMundoException;
import personagens.Personagem;
import racas.Humano;

import java.util.LinkedList;
import java.util.List;

public class Mapa {

    public boolean vitoriaSociedadeDoAnel = false;

    List<String> mapa = new LinkedList<>();

    List<Personagem> heroisNoMapa = new LinkedList<>();

    List<Personagem> viloesNoMapa = new LinkedList<>();

    public Mapa() {

        for (int i = 0; i < 10; i++) {
            mapa.add(i, " ");

        }
    }

    public boolean isVitoriaSociedadeDoAnel() {

        return vitoriaSociedadeDoAnel;
    }

    public void inserir(int posicao, Personagem personagem) {

        personagem.setPosicao(posicao);

        if (personagem.isSociedadeDoAnel()) {
            mapa.add(posicao, "\033[0;34m" + personagem.toString() + "\033[0m");
            heroisNoMapa.add(personagem);
        } else {
            mapa.add(posicao, "\033[0;31m" + personagem.toString() + "\033[0m");
            viloesNoMapa.add(personagem);
        }

    }

    public void mostrarMapa() {

        System.out.println("          ");
        System.out.println(" _   |~  _                                                                                                        \uD83C\uDF29 \uD83C\uDF29(\uD83D\uDC41️)\uD83C\uDF29 \uD83C\uDF29\n" +
                "[_]--'--[_]                                                                                                           /vvv\\\n" +
                "|'|\"\"`\"\"|'|                                                                                                          /V V V\\\n" +
                "| | /^\\ | |                                                                                                         /V  V  V\\\n" +
                "|_|_|I|_|_|                                                                                                        /,,,,,,,,,\\ ");
        System.out.print(".............");

        for (int i = 0; i < 10; i++) {
            System.out.print("\uD83C\uDF32");
            System.out.print(mapa.get(i));
        }
        System.out.print("\uD83C\uDF32");
        System.out.print("...............");
        System.out.println("\n");

    }

    public void atualizarMapa() {

        verificarFim();

        mapa.clear();
        for (int i = 0; i < 10; i++) {
            mapa.add(i, "........");

        }
        for (Personagem personagem : heroisNoMapa) {

            mapa.set(personagem.getPosicao(), "\033[0;34m" + personagem.toString() + "\033[0m");
            if (personagem.getConstituicao() <= 0) {
                mapa.remove(personagem.toString());
                heroisNoMapa.remove(personagem);
                System.out.println(personagem.getName() + " morre!");
                atualizarMapa();
                break;
            }

        }
        for (Personagem personagem : viloesNoMapa) {
            mapa.set(personagem.getPosicao(), "\033[0;31m" + personagem.toString() + "\033[0m");
            if (personagem.getConstituicao() <= 0) {
                mapa.remove(personagem.toString());
                viloesNoMapa.remove(personagem);
                System.out.println(personagem.getName() + " morre!");
                atualizarMapa();
                break;
            }

        }

    }

    public void verificarFim() {

        if (heroisNoMapa.isEmpty()) {
            throw new SauronDominaOMundoException();
        }

        for (Personagem heroi : heroisNoMapa) {
            if (heroi.getPosicao() == 9) {
                this.vitoriaSociedadeDoAnel = true;
                break;

            }
        }
    }

    public void movimento(Personagem personagem, LinkedList<Personagem> aliados) {

        int direcao = -1;
        if (!personagem.isSociedadeDoAnel()) {
            direcao = 1;
        }

        for (Personagem aliado : aliados) {
            if (personagem.getPosicao() == aliado.getPosicao() + direcao) {
                System.out.println(personagem.getName() + " esta travado e nao pode se mover nem atacar!");
                personagem.setPodeSeMover(false);

            }

        }
        if ((personagem.getPosicao() >= 0 && personagem.getPosicao() < 10 && personagem.isPodeSeMover())) {
            personagem.mover();
            System.out.println(personagem.fimDeTurno());
            personagem.setPodeSeMover(false);

        }

    }

    public void passarTurnoHerois() {

        System.out.println("\n### TURNO DOS HEROIS ###\n");

        for (Personagem personagem : heroisNoMapa) {
            personagem.setPodeSeMover(true);
            System.out.println(">>> Turno do " + personagem.getName());

            if (personagem instanceof Humano) {
                ((Humano) personagem).envelhecer();
            }

            personagem.atacar(viloesNoMapa);

            if (personagem.isPodeSeMover()) {
                movimento(personagem, (LinkedList<Personagem>) heroisNoMapa);
            }

            atualizarMapa();

            mostrarMapa();

        }

    }

    public void passarTurnoViloes() {

        System.out.println("\n### TURNO DOS VILOES ###\n");

        for (Personagem personagem : viloesNoMapa) {
            personagem.setPodeSeMover(true);
            System.out.println(">>> Turno do " + personagem.getName());

            if (personagem instanceof Humano) {
                ((Humano) personagem).envelhecer();
            }

            personagem.atacar(heroisNoMapa);

            if (personagem.isPodeSeMover()) {
                movimento(personagem, (LinkedList<Personagem>) viloesNoMapa);
            }

            atualizarMapa();

            mostrarMapa();

        }

    }

}
