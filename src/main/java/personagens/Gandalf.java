package personagens;

import interfaceClasses.Mago;
import racas.Maia;

public class Gandalf extends Personagem implements Mago, Maia {

    public Gandalf() {

        setForca(2);
        setAgilidade(3);
        setInteligencia(10);
        setConstituicao(80);
        setSociedadeDoAnel(true);
    }

    public Gandalf ressucitar() {

        return null;
    }

    public String falar() {

        return "A Wizard is never late, nor is he early. He arrives precisely when he means to.";

    }

    public String toString() {

        return this.getConstituicao() + "-Gan ⚚";
    }

    public String getName() {

        return "Gandalf";
    }

}
