package personagens;

import java.util.List;

public class Personagem {

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
        System.out.println(this.getName() + " se move para a posicao " + this.getPosicao());

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

    public int calcularDano(int multiplicador) {

        return this.getForca();
    }

    public void atacar(List<Personagem> alvo){

    }

}
