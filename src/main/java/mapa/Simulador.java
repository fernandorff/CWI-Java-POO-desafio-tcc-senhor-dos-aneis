package mapa;

public class Simulador {

    Mapa mapa;

    public Simulador(Mapa mapa) {

        this.mapa = mapa;
    }

    public void simular() {
        mapa.atualizarMapa();
        mapa.mostrarMapa();

        while (!mapa.isVitoriaSociedadeDoAnel()) {
            mapa.passarTurnoHerois();
            if (mapa.isVitoriaSociedadeDoAnel()) {
                break;
            }

            mapa.passarTurnoViloes();

        }

        System.out.println("VITORIA DA SOCIEDADE DO ANEL");

    }

    public boolean isVitoriaDaSociedadeDoAnel(){
        simular();
        return mapa.isVitoriaSociedadeDoAnel();

    }

}
