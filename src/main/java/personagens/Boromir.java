package personagens;

import profissoes.Guerreiro;
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

        return "One does not simply walk into";

    }

    public void envelhecer() {

        if (this.getConstituicao() > 2) {
            setConstituicao(this.getConstituicao() - 2);

        }

    }

    @Override
    public String getName() {

        return "Boromir";
    }

    public String toString() {

        return this.getConstituicao() + "-Bor ⚔";
    }

}
