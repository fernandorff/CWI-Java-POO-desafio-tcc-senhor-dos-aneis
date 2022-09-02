package personagens;

import classes.Guerreiro;
import racas.Monstro;

public class Orc extends Guerreiro implements Monstro {

    public Orc() {

        setForca(7);
        setAgilidade(4);
        setInteligencia(1);
        setConstituicao(30);
        setSociedadeDoAnel(false);
    }

    @Override
    public String toString() {

        return "⚔ Orc-" + this.getConstituicao();
    }

    @Override
    public String getName() {

        return "Orc";
    }

    @Override
    public String grunhir() {

        return "Arrrggghhh";
    }

}
