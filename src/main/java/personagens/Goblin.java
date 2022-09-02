package personagens;

import classes.Arqueiro;
import racas.Monstro;

public class Goblin extends Arqueiro implements Monstro {

    public Goblin() {

        setForca(3);
        setAgilidade(6);
        setInteligencia(1);
        setConstituicao(20);
        setSociedadeDoAnel(false);
    }

    @Override
    public String toString() {

        return "\uD83C\uDFF9 Gob-" + this.getConstituicao();
    }

    @Override
    public String getName() {

        return "Goblin";
    }

    @Override
    public String grunhir() {

        return "Iiisshhhh";
    }

}
