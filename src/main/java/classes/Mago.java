package classes;

import personagens.Personagem;

public class Mago extends Personagem {

    @Override
    public int calcularDano(int multiplicador) {

        return this.getInteligencia() * multiplicador;
    }

}
