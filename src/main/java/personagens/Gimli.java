package personagens;

import profissoes.Guerreiro;
import racas.Anao;

public class Gimli extends Personagem implements Guerreiro, Anao {

    public Gimli() {

        setForca(9);
        setAgilidade(2);
        setInteligencia(4);
        setConstituicao(60);
        setSociedadeDoAnel(true);
    }

    public void beber() {
        // nao implementado

    }

    public String falarSobrio() {

        return "Let them come. There is one Dwarf yet in Moria who still draws breath.";

    }

    public String falarBebado() {

        return "What did I say? He can't hold his liquor!";
    }

    public String toString() {

        return this.getConstituicao() + "-Gim ⚔";
    }

    @Override
    public String getName() {

        return "Gimli";
    }

}
