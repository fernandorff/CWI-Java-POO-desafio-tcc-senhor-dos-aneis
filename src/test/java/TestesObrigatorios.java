import erros.SauronDominaOMundoException;
import mapa.Mapa;
import mapa.Simulador;
import org.junit.Assert;
import org.junit.Test;
import personagens.*;

public class TestesObrigatorios {

    Aragorn aragorn = new Aragorn();

    Boromir boromir = new Boromir();

    Gimli gimli = new Gimli();

    Legolas legolas = new Legolas();

    Gandalf gandalf = new Gandalf();

    Urukhai urukhai = new Urukhai();

    Orc orc = new Orc();

    Goblin goblin = new Goblin();

    Saruman saruman = new Saruman();

    Mapa mapa = new Mapa();

    Simulador simulador = new Simulador(mapa);

    @Test
    public void deveVencerSociedadeQuandoAragornELegolasBatalharemContraOrcEGoblim() {

        mapa.inserir(0, legolas);
        mapa.inserir(1, aragorn);
        mapa.inserir(8, orc);
        mapa.inserir(9, goblin);

        Assert.assertTrue(simulador.isVitoriaDaSociedadeDoAnel());

    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoInimigosDerrotaremMembrosDaSociedade() {

        mapa.inserir(0, legolas);
        mapa.inserir(1, gimli);
        mapa.inserir(6, urukhai);
        mapa.inserir(7, orc);
        mapa.inserir(8, goblin);
        mapa.inserir(9, saruman);

        simulador.simular();

    }

    @Test
    public void deveVencerSociedadeQuandoGandalfBatalharSozinhoContraSaruman() {

        mapa.inserir(0, gandalf);

        mapa.inserir(9, saruman);

        Assert.assertTrue(simulador.isVitoriaDaSociedadeDoAnel());

    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoLegolasBatalharSozinhoContraOrcEUrukhai() {

        mapa.inserir(0, legolas);

        mapa.inserir(1, urukhai);

        mapa.inserir(2, orc);

        simulador.simular();

    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoBoromirBatalharSozinhoContraUrukhai() {

        mapa.inserir(4, boromir);

        mapa.inserir(6, urukhai);

        simulador.simular();

    }



}
