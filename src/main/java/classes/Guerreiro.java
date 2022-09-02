package classes;

import personagens.Personagem;

import java.util.List;

public class Guerreiro extends Personagem {

    @Override
    public int calcularDano(int multiplicador) {

        return this.getForca() * multiplicador;
    }

    @Override
    public void atacar(List<Personagem> alvos) {

        int direcao = 1;
        if (this.isSociedadeDoAnel()) {
            direcao = -1;
        }

        for (Personagem alvo : alvos) {
            if (this.getPosicao() == alvo.getPosicao() + direcao) {

                System.out.println(this.getName() + " ataca " + alvo.getName() + " causando " + (this.getForca() * 2) + " de dano!");

                System.out.println(this.fimDeTurno());

                alvo.levarDano(this.getForca() * 2);
                this.setPodeSeMover(false);
                break;

            }

        }

    }

}
