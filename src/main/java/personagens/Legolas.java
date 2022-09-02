package personagens;

import classes.Arqueiro;
import racas.Elfo;

public class Legolas extends Arqueiro implements Elfo {

    public Legolas() {

        setForca(5);
        setAgilidade(10);
        setInteligencia(6);
        setConstituicao(80);
        setSociedadeDoAnel(true);
    }

    @Override
    public String falarElfico() {

        return "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";
    }

    @Override
    public String falar() {

        return "They're taking the Hobbits to Isengard!";

    }

    @Override
    public String toString() {

        return this.getConstituicao() + "-Leg \uD83C\uDFF9";
    }

    @Override
    public String getName() {

        return "Legolas";
    }

}
