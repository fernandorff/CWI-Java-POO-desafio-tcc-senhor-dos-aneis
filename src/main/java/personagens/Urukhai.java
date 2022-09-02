package personagens;

import interfaceClasses.Guerreiro;
import racas.Humano;
import racas.Monstro;

public class Urukhai extends Personagem implements Guerreiro, Humano, Monstro {

    public Urukhai() {

        setForca(8);
        setAgilidade(6);
        setInteligencia(3);
        setConstituicao(45);
        setSociedadeDoAnel(false);
    }

    @Override
    public String falar() {

        return "Looks like meat's back on the menu boys!";

    }

    @Override
    public void envelhecer() {

        if (this.getConstituicao() > 2) {
            setConstituicao(this.getConstituicao() - 2);
            System.out.println(this.getName() + " envelhece e perde 2 de vida!");
        }

    }

    @Override
    public String toString() {

        return "⚔ Uru-" + this.getConstituicao();
    }

    @Override
    public String getName() {

        return "Urukhai";
    }

    @Override
    public String grunhir() {

        return "Uuurrrrrr";
    }

}
