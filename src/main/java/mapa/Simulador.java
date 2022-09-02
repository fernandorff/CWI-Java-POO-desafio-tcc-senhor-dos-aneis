package mapa;

public class Simulador {

    Mapa mapa;

    public Simulador(Mapa mapa) {

        this.mapa = mapa;
    }

    public void simular() {
        mapa.atualizarMapa();


        while (!mapa.isVitoriaSociedadeDoAnel()) {
            mapa.passarTurnoHerois();
            if (mapa.isVitoriaSociedadeDoAnel()) {
                break;
            }

            mapa.passarTurnoViloes();

        }



    }

    public boolean isVitoriaDaSociedadeDoAnel(){
        simular();
        return mapa.isVitoriaSociedadeDoAnel();

    }

}
