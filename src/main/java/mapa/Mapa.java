package mapa;

import erros.SauronDominaOMundoException;
import personagens.Personagem;
import racas.Humano;

import java.util.LinkedList;
import java.util.List;

public class Mapa {

    private boolean vitoriaSociedadeDoAnel = false;

    List<String> mapaStrings = new LinkedList<>();

    List<Personagem> heroisNoMapa = new LinkedList<>();

    List<Personagem> viloesNoMapa = new LinkedList<>();

    public Mapa() {

        for (int i = 0; i < 10; i++) {
            mapaStrings.add(i, " ");

        }
    }

    protected boolean isVitoriaSociedadeDoAnel() {

        return vitoriaSociedadeDoAnel;
    }

    public void inserir(int posicao, Personagem personagem) {

        personagem.setPosicao(posicao);

        if (personagem.isSociedadeDoAnel()) {
            mapaStrings.add(posicao, personagem.toString());
            heroisNoMapa.add(personagem);
        } else {
            mapaStrings.add(posicao, personagem.toString());
            viloesNoMapa.add(personagem);
        }

    }

    public void atualizarMapa() {

        verificarFim();

        mapaStrings.clear();
        for (int i = 0; i < 10; i++) {
            mapaStrings.add(i, "........");

        }
        for (Personagem personagem : heroisNoMapa) {

            mapaStrings.set(personagem.getPosicao(), personagem.toString());
            if (personagem.getConstituicao() <= 0) {
                mapaStrings.remove(personagem.toString());
                heroisNoMapa.remove(personagem);

                atualizarMapa();
                break;
            }

        }
        for (Personagem personagem : viloesNoMapa) {
            mapaStrings.set(personagem.getPosicao(), personagem.toString());
            if (personagem.getConstituicao() <= 0) {
                mapaStrings.remove(personagem.toString());
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

    public void movimento(Personagem personagem, List<Personagem> aliados) {

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
                movimento(personagem, heroisNoMapa);
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
                movimento(personagem, viloesNoMapa);
            }

            atualizarMapa();

        }

    }

}
