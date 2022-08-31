package personagens;

import classes.Guerreiro;
import racas.Humano;

public class Boromir extends Guerreiro implements Humano {

    public Boromir() {

        setForca(7);
        setAgilidade(6);
        setInteligencia(3);
        setConstituicao(40);
        setSociedadeDoAnel(true);
    }

    @Override
    public String falar() {

        return "One does not simply walk into Mordor.";

    }

    @Override
    public void envelhecer() {

        if (this.getConstituicao() > 2) {
            setConstituicao(this.getConstituicao() - 2);
            System.out.println(this.getName() + " envelhece e perde 2 de vida!");
        }

    }

    @Override
    public String toString() {

        return " Bor ⚔ ";
    }

    @Override
    public String getName() {

        return "Boromir";
    }

}
