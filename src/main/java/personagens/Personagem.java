package personagens;

import profissoes.Arqueiro;
import profissoes.Guerreiro;
import profissoes.Mago;

import java.util.List;

public class Personagem {


    public Personagem() {

    }

    private int forca;

    private int agilidade;

    private int inteligencia;

    private int constituicao;

    private boolean sociedadeDoAnel;

    private int posicao;

    private boolean podeSeMover = true;

    public boolean isPodeSeMover() {

        return podeSeMover;
    }

    public void setPodeSeMover(boolean podeSeMover) {

        this.podeSeMover = podeSeMover;
    }

    public void mover() {

        if (this.isSociedadeDoAnel()) {
            setPosicao(getPosicao() + 1);
        } else {
            setPosicao(getPosicao() - 1);
        }

    }

    public int getPosicao() {

        return posicao;
    }

    public void setPosicao(int posicao) {

        this.posicao = posicao;
    }

    public int getForca() {

        return forca;
    }

    public void setForca(int forca) {

        this.forca = forca;
    }

    public int getAgilidade() {

        return agilidade;
    }

    public void setAgilidade(int agilidade) {

        this.agilidade = agilidade;
    }

    public int getInteligencia() {

        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {

        this.inteligencia = inteligencia;
    }

    public int getConstituicao() {

        return constituicao;
    }

    public void setConstituicao(int constituicao) {

        this.constituicao = constituicao;
    }

    public void levarDano(int dano) {

        this.constituicao -= dano;
    }

    public boolean isSociedadeDoAnel() {

        return sociedadeDoAnel;
    }

    public void setSociedadeDoAnel(boolean sociedadeDoAnel) {

        this.sociedadeDoAnel = sociedadeDoAnel;
    }

    public String getName() {

        return "sem nome";
    }

    @Override
    public String toString() {

        return "P";
    }

    public String fimDeTurno() {

        return this.getName() + " encerra seu turno na posicao " + this.getPosicao() + " com " + this.getConstituicao() + " de vida restante.";
    }

    public void atacar(List<Personagem> alvos){

        if (this instanceof Guerreiro){
            int direcao = 1;
            if (this.isSociedadeDoAnel()) {
                direcao = -1;
            }

            for (Personagem alvo : alvos) {
                if (this.getPosicao() == alvo.getPosicao() + direcao) {

                    alvo.levarDano(this.forca * 2);
                    this.setPodeSeMover(false);
                    break;

                }

            }
        }

        if (this instanceof Arqueiro){
            int distancia = 3;

            int direcao = 1;
            if (this.isSociedadeDoAnel()) {
                direcao = -1;
            }
            while(distancia > 0){
                if (isPodeSeMover()) {
                    for (Personagem alvo : alvos) {
                        if (this.getPosicao() == alvo.getPosicao() + (distancia * direcao)) {

                            alvo.levarDano(this.agilidade*distancia);
                            this.setPodeSeMover(false);

                            break;
                        }
                    }
                }
                distancia -= 1;
            }
        }

        if (this instanceof Mago){
            if (isPodeSeMover()) {
                for (Personagem alvo : alvos) {

                    this.setPodeSeMover(false);

                    alvo.levarDano(this.inteligencia);

                }
            }
        }

    }


}
