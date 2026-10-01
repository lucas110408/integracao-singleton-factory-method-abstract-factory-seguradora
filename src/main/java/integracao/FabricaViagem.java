package integracao;

public class FabricaViagem {

    public Apolice createApolice() {
        return new ApoliceViagem();
    }
}
