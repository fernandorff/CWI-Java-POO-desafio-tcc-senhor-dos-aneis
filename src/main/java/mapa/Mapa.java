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

                atualizarMapa();
                break;
            }

        }
        for (Personagem personagem : viloesNoMapa) {
            mapa.set(personagem.getPosicao(), "\033[0;31m" + personagem.toString() + "\033[0m");
            if (personagem.getConstituicao() <= 0) {
                mapa.remove(personagem.toString());
                viloesNoMapa.remove(personagem);

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

                personagem.setPodeSeMover(false);

            }

        }
        if ((personagem.getPosicao() >= 0 && personagem.getPosicao() < 10 && personagem.isPodeSeMover())) {
            personagem.mover();

            personagem.setPodeSeMover(false);

        }

    }

    public void passarTurnoHerois() {

        for (Personagem personagem : heroisNoMapa) {
            personagem.setPodeSeMover(true);

            if (personagem instanceof Humano) {
                ((Humano) personagem).envelhecer();
            }

            personagem.atacar(viloesNoMapa);

            if (personagem.isPodeSeMover()) {
                movimento(personagem, (LinkedList<Personagem>) heroisNoMapa);
            }

            atualizarMapa();

        }

    }

    public void passarTurnoViloes() {

        for (Personagem personagem : viloesNoMapa) {
            personagem.setPodeSeMover(true);

            if (personagem instanceof Humano) {
                ((Humano) personagem).envelhecer();
            }

            personagem.atacar(heroisNoMapa);

            if (personagem.isPodeSeMover()) {
                movimento(personagem, (LinkedList<Personagem>) viloesNoMapa);
            }

            atualizarMapa();

        }

    }

}
