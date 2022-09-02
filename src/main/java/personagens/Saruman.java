package personagens;

import interfaceClasses.Mago;
import racas.Maia;

public class Saruman extends Personagem implements Mago, Maia {

    public Saruman() {

        setForca(2);
        setAgilidade(2);
        setInteligencia(9);
        setConstituicao(70);
        setSociedadeDoAnel(false);
    }

    @Override
    public Gandalf ressucitar() {

        return null;
    }

    @Override
    public String falar() {

        return "Against the power of Mordor there can be no victory.";

    }

    @Override
    public String toString() {

        return "⚚ Sar-" + this.getConstituicao();
    }

    @Override
    public String getName() {

        return "Saruman";
    }

}
