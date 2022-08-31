package mapa;

import classes.Arqueiro;
import classes.Guerreiro;
import classes.Mago;
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

        System.out.println("");
        System.out.println(" _   |~  _                                                                                              \uD83C\uDF29 \uD83C\uDF29(\uD83D\uDC41️)\uD83C\uDF29 \uD83C\uDF29\n" +
                "[_]--'--[_]                                                                                                 /vvv\\\n" +
                "|'|\"\"`\"\"|'|                                                                                                /V V V\\\n" +
                "| | /^\\ | |                                                                                               /V  V  V\\\n" +
                "|_|_|I|_|_|                                                                                              /,,,,,,,,,\\ ");
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
            mapa.add(i, ".......");

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

    public void ataqueDoGuerreiro(Personagem personagem, LinkedList<Personagem> alvos) {

        int direcao = -1;
        if (!personagem.isSociedadeDoAnel()) {
            direcao = 1;
        }

        if (personagem instanceof Guerreiro) {
            for (Personagem alvo : alvos) {
                if (personagem.getPosicao() == alvo.getPosicao() + direcao) {

                    System.out.println(personagem.getName() + " ataca " + alvo.getName() + " causando " + (personagem.getForca() * 2) + " de dano!");

                    System.out.println(personagem.fimDeTurno());

                    alvo.levarDano(personagem.getForca() * 2);
                    personagem.setPodeSeMover(false);
                    break;

                }

            }

        }
    }

    public void ataqueDoArqueiro(Personagem personagem, LinkedList<Personagem> alvos) {

        int direcao = -1;
        if (!personagem.isSociedadeDoAnel()) {
            direcao = 1;
        }
        int distancia = 3;

        if (personagem instanceof Arqueiro) {
            boolean atacou = false;

            for (Personagem alvo : alvos) {
                if (personagem.getPosicao() == alvo.getPosicao() + (distancia * direcao)) {

                    System.out.println(personagem.getName() + " ataca " + alvo.getName() + " causando " + (personagem.calcularDano(distancia)) + " de dano!");

                    System.out.println(personagem.fimDeTurno());

                    atacou = true;

                    alvo.levarDano(personagem.calcularDano(distancia));
                    personagem.setPodeSeMover(false);
                    break;
                }
            }
            distancia -= 1;

            if (!atacou) {
                for (Personagem alvo : alvos) {
                    if (personagem.getPosicao() == alvo.getPosicao() + (distancia * direcao)) {

                        System.out.println(personagem.getName() + " ataca " + alvo.getName() + " causando " + (personagem.calcularDano(distancia)) + " de dano!");

                        System.out.println(personagem.fimDeTurno());

                        atacou = true;

                        alvo.levarDano(personagem.calcularDano(distancia));
                        personagem.setPodeSeMover(false);
                        break;
                    }
                }
            }
            distancia -= 1;

            if (!atacou) {
                for (Personagem alvo : alvos) {
                    if (personagem.getPosicao() == alvo.getPosicao() + (distancia * direcao)) {

                        System.out.println(personagem.getName() + " ataca " + alvo.getName() + " causando " + (personagem.calcularDano(distancia)) + " de dano!");

                        System.out.println(personagem.fimDeTurno());

                        alvo.levarDano(personagem.calcularDano(distancia));
                        personagem.setPodeSeMover(false);
                        break;
                    }
                }
            }

        }

    }

    public void ataqueDoMago(Personagem personagem, LinkedList<Personagem> alvos) {

        if (personagem instanceof Mago) {

            for (Personagem alvo : alvos) {

                System.out.println(personagem.getName() + " ataca " + alvo.getName() + " causando " + (personagem.getInteligencia()) + " de dano!");

                personagem.setPodeSeMover(false);

                alvo.levarDano(personagem.getInteligencia());

            }
            System.out.println(personagem.fimDeTurno());

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

            ataqueDoGuerreiro(personagem, (LinkedList<Personagem>) viloesNoMapa);

            ataqueDoArqueiro(personagem, (LinkedList<Personagem>) viloesNoMapa);

            ataqueDoMago(personagem, (LinkedList<Personagem>) viloesNoMapa);

            if (personagem.isPodeSeMover()) {
                movimento(personagem, (LinkedList<Personagem>) heroisNoMapa);
            }

            atualizarMapa();

            mostrarMapa();

        }

    }

    public void passarTurnoViloes() {

        System.out.println("\n### TURNO DOS HEROIS ###\n");

        for (Personagem personagem : viloesNoMapa) {
            personagem.setPodeSeMover(true);
            System.out.println(">>> Turno do " + personagem.getName());

            if (personagem instanceof Humano) {
                ((Humano) personagem).envelhecer();
            }

            ataqueDoGuerreiro(personagem, (LinkedList<Personagem>) heroisNoMapa);

            ataqueDoArqueiro(personagem, (LinkedList<Personagem>) heroisNoMapa);

            ataqueDoMago(personagem, (LinkedList<Personagem>) heroisNoMapa);

            if (personagem.isPodeSeMover()) {
                movimento(personagem, (LinkedList<Personagem>) viloesNoMapa);
            }

            atualizarMapa();

            mostrarMapa();

        }

    }

}
