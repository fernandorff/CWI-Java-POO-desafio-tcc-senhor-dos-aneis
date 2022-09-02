package personagens;

import profissoes.Mago;
import racas.Maia;

public class Saruman extends Personagem implements Mago, Maia {

    public Saruman() {

        setForca(2);
        setAgilidade(2);
        setInteligencia(9);
        setConstituicao(70);
        setSociedadeDoAnel(false);
    }

    public Gandalf ressucitar() {

        return null;
    }

    public String falar() {

        return "Against the power of Mordor there can be no victory.";

    }

    public String toString() {

        return "⚚ Sar-" + this.getConstituicao();
    }

    public String getName() {

        return "Saruman";
    }

}
