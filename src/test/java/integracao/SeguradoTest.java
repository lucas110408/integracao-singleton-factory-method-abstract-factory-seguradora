package integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguradoTest {

    @Test
    void deveEmitirApoliceAuto() {
        FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Auto");
        Segurado segurado = new Segurado(fabrica);
        assertEquals("Apólice de Seguro de Automóvel", segurado.emitirApolice());
    }

    @Test
    void deveEmitirApoliceResidencial() {
        FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Residencial");
        Segurado segurado = new Segurado(fabrica);
        assertEquals("Apólice de Seguro Residencial", segurado.emitirApolice());
    }

    @Test
    void deveEmitirVistoriaAuto() {
        FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Auto");
        Segurado segurado = new Segurado(fabrica);
        assertEquals("Laudo de Vistoria Veicular", segurado.emitirVistoria());
    }

    @Test
    void deveEmitirVistoriaResidencial() {
        FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Residencial");
        Segurado segurado = new Segurado(fabrica);
        assertEquals("Laudo de Vistoria do Imóvel", segurado.emitirVistoria());
    }

    @Test
    void deveGerarNumeroDaApoliceDoSegurado() {
        NumeradorApolice.getInstance().setAno("2026");
        int ultimoNumero = NumeradorApolice.getInstance().getUltimoNumero();
        Segurado segurado = new Segurado(FabricaFactory.obterFabrica("Auto"));
        assertEquals("2026-" + (ultimoNumero + 1), segurado.getNumeroApolice());
    }

    @Test
    void naoDeveRepetirNumeroDaApoliceEntreSegurados() {
        Segurado seguradoAuto = new Segurado(FabricaFactory.obterFabrica("Auto"));
        Segurado seguradoResidencial = new Segurado(FabricaFactory.obterFabrica("Residencial"));
        assertNotEquals(seguradoAuto.getNumeroApolice(), seguradoResidencial.getNumeroApolice());
    }

}
