package integracao;

public class Segurado {

    private Apolice apolice;
    private Vistoria vistoria;
    private String numeroApolice;

    public Segurado (FabricaAbstrata fabrica) {
        this.apolice = fabrica.createApolice();
        this.vistoria = fabrica.createVistoria();
        this.numeroApolice = NumeradorApolice.getInstance().gerarNumero();
    }

    public String emitirApolice() {
        return this.apolice.emitir();
    }

    public String emitirVistoria() {
        return this.vistoria.emitir();
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }
}
