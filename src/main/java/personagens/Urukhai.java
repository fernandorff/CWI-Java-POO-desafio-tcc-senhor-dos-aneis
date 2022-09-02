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

    public String falar() {

        return "Looks like meat's back on the menu boys!";

    }

    public void envelhecer() {

        if (this.getConstituicao() > 2) {
            setConstituicao(this.getConstituicao() - 2);
            System.out.println(this.getName() + " envelhece e perde 2 de vida!");
        }

    }

    public String toString() {

        return "⚔ Uru-" + this.getConstituicao();
    }

    public String getName() {

        return "Urukhai";
    }

    public String grunhir() {

        return "Uuurrrrrr";
    }

}
