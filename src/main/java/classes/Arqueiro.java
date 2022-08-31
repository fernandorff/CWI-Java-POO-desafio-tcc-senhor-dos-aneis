package classes;

import personagens.Personagem;

public class Arqueiro extends Personagem {

    @Override
    public int calcularDano(int multiplicador) {

        return this.getAgilidade() * multiplicador;
    }

}
