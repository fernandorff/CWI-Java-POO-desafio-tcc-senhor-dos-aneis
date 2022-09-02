package classes;

import personagens.Personagem;

import java.util.List;

public class Mago extends Personagem {

    @Override
    public int calcularDano(int multiplicador) {

        return this.getInteligencia() * multiplicador;
    }

    @Override
    public void atacar(List<Personagem> alvos) {

        if (isPodeSeMover()) {
            for (Personagem alvo : alvos) {

                System.out.println(this.getName() + " ataca " + alvo.getName() + " causando " + (this.getInteligencia()) + " de dano!");

                this.setPodeSeMover(false);

                alvo.levarDano(this.getInteligencia());

            }
        }
    }

}
