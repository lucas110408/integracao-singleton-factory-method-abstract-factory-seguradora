package integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaFactoryTest {

    @Test
    void deveRetornarFabricaAuto() {
        FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Auto");
        assertTrue(fabrica instanceof FabricaAuto);
    }

    @Test
    void deveRetornarFabricaResidencial() {
        FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Residencial");
        assertTrue(fabrica instanceof FabricaResidencial);
    }

    @Test
    void deveRetornarExcecaoParaTipoSeguroInexistente() {
        try {
            FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Vida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de seguro inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTipoSeguroInvalido() {
        try {
            FabricaAbstrata fabrica = FabricaFactory.obterFabrica("Viagem");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de seguro inválido", e.getMessage());
        }
    }
}
