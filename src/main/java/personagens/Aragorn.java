package personagens;

import interfaceClasses.Guerreiro;
import racas.Humano;



public class Aragorn extends Personagem implements Guerreiro, Humano {



    public Aragorn() {

        super();

        setForca(10);
        setAgilidade(7);
        setInteligencia(6);
        setConstituicao(60);
        setSociedadeDoAnel(true);


    }


    public String falar() {

        return "A day may come when the courage of men fails… but it is not THIS day.";

    }


    public void envelhecer() {

        if (this.getConstituicao() > 1) {
            setConstituicao(this.getConstituicao() - 1);
            System.out.println(this.getName() + " envelhece e perde 1 de vida!");
        }

    }

    @Override
    public String toString() {

        return this.getConstituicao() + "-Ara ⚔";
    }

    @Override
    public String getName() {

        return "Aragorn";
    }

}
