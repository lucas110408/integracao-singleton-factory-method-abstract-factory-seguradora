package integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeradorApoliceTest {

    @Test
    public void deveRetornarSempreAMesmaInstancia() {
        assertSame(NumeradorApolice.getInstance(), NumeradorApolice.getInstance());
    }

    @Test
    public void deveRetornarAnoConfigurado() {
        NumeradorApolice.getInstance().setAno("2026");
        assertEquals("2026", NumeradorApolice.getInstance().getAno());
    }

    @Test
    public void deveGerarNumerosSequenciais() {
        int ultimoNumero = NumeradorApolice.getInstance().getUltimoNumero();
        NumeradorApolice.getInstance().gerarNumero();
        assertEquals(ultimoNumero + 1, NumeradorApolice.getInstance().getUltimoNumero());
    }

    @Test
    public void naoDeveRepetirNumeroDeApolice() {
        String primeiro = NumeradorApolice.getInstance().gerarNumero();
        String segundo = NumeradorApolice.getInstance().gerarNumero();
        assertNotEquals(primeiro, segundo);
    }

}
