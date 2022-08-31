package personagens;

import classes.Guerreiro;
import racas.Anao;

public class Gimli extends Guerreiro implements Anao {

    public Gimli() {

        setForca(9);
        setAgilidade(2);
        setInteligencia(4);
        setConstituicao(60);
        setSociedadeDoAnel(true);
    }

    @Override
    public void beber() {

    }

    @Override
    public String falarSobrio() {

        return "Let them come. There is one Dwarf yet in Moria who still draws breath.";

    }

    @Override
    public String falarBebado() {

        return "What did I say? He can't hold his liquor!";
    }

    @Override
    public String toString() {

        return " Gim ⚔ ";
    }

    @Override
    public String getName() {

        return "Gimli";
    }

}
