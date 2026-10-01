package integracao;

public class FabricaResidencial implements FabricaAbstrata {

    @Override
    public Apolice createApolice() {
        return new ApoliceResidencial();
    }

    @Override
    public Vistoria createVistoria() {
        return new VistoriaResidencial();
    }
}
