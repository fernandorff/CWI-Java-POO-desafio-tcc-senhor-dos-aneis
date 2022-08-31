package personagens;

import classes.Mago;
import racas.Maia;

public class Gandalf extends Mago implements Maia {

    public Gandalf() {

        setForca(2);
        setAgilidade(3);
        setInteligencia(10);
        setConstituicao(80);
        setSociedadeDoAnel(true);
    }

    @Override
    public Gandalf ressucitar() {

        return null;
    }

    @Override
    public String falar() {

        return "A Wizard is never late, nor is he early. He arrives precisely when he means to.";

    }

    @Override
    public String toString() {

        return " Gan ⚚ ";
    }

    @Override
    public String getName() {

        return "Gandalf";
    }

}
