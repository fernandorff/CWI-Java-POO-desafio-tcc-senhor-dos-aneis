package personagens;

import profissoes.Arqueiro;
import racas.Monstro;

public class Goblin extends Personagem implements Arqueiro, Monstro {

    public Goblin() {

        setForca(3);
        setAgilidade(6);
        setInteligencia(1);
        setConstituicao(20);
        setSociedadeDoAnel(false);
    }

    public String grunhir() {

        return "Iiisshhhh";
    }

    public String toString() {

        return "\uD83C\uDFF9 Gob-" + this.getConstituicao();
    }

    @Override
    public String getName() {

        return "Goblin";
    }

}
