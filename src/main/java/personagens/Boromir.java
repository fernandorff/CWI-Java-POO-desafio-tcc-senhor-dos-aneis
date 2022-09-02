package personagens;

import interfaceClasses.Guerreiro;
import racas.Humano;

public class Boromir extends Personagem implements Guerreiro, Humano {

    public Boromir() {

        setForca(7);
        setAgilidade(6);
        setInteligencia(3);
        setConstituicao(40);
        setSociedadeDoAnel(true);
    }

    public String falar() {

        final String FALA = "One does not simply walk into Mordor.";
        return FALA;

    }

    public void envelhecer() {

        if (this.getConstituicao() > 2) {
            setConstituicao(this.getConstituicao() - 2);
            System.out.println(this.getName() + " envelhece e perde 2 de vida!");
        }

    }

    public String toString() {

        return this.getConstituicao() + "-Bor ⚔";
    }

    public String getName() {

        return "Boromir";
    }

}
