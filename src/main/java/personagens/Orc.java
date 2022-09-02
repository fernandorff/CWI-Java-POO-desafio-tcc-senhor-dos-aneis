package personagens;

import profissoes.Guerreiro;
import racas.Monstro;

public class Orc extends Personagem implements Guerreiro, Monstro {

    public Orc() {

        setForca(7);
        setAgilidade(4);
        setInteligencia(1);
        setConstituicao(30);
        setSociedadeDoAnel(false);
    }

    public String toString() {

        return "⚔ Orc-" + this.getConstituicao();
    }

    @Override
    public String getName() {

        return "Orc";
    }

    public String grunhir() {

        return "Arrrggghhh";
    }

}
