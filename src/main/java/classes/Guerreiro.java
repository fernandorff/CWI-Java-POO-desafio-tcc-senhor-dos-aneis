package classes;

import personagens.Personagem;

public class Guerreiro extends Personagem {

    @Override
    public int calcularDano(int multiplicador) {

        return this.getForca() * multiplicador;
    }

}
