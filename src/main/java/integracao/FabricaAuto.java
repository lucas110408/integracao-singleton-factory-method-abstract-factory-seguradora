package integracao;

public class FabricaAuto implements FabricaAbstrata {

    @Override
    public Apolice createApolice() {
        return new ApoliceAuto();
    }

    @Override
    public Vistoria createVistoria() {
        return new VistoriaAuto();
    }
}
