package classes;

import personagens.Personagem;

import java.util.List;

public class Arqueiro extends Personagem {

    @Override
    public int calcularDano(int multiplicador) {

        return this.getAgilidade() * multiplicador;
    }

    @Override
    public void atacar(List<Personagem> alvos) {
        int distancia = 3;

        int direcao = 1;
        if (this.isSociedadeDoAnel()) {
            direcao = -1;
        }
        while(distancia > 0){
            if (isPodeSeMover()) {
                for (Personagem alvo : alvos) {
                    if (this.getPosicao() == alvo.getPosicao() + (distancia * direcao)) {

                        System.out.println(this.getName() + " ataca " + alvo.getName() + " causando " + (this.calcularDano(distancia)) + " de dano!");

                        System.out.println(this.fimDeTurno());

                        alvo.levarDano(this.calcularDano(distancia));
                        this.setPodeSeMover(false);

                        break;
                    }
                }
            }
            distancia -= 1;
        }

    }

}
