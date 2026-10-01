package integracao;

public class NumeradorApolice {

    private NumeradorApolice() {};
    private static NumeradorApolice instance = new NumeradorApolice();
    public static NumeradorApolice getInstance() {
        return instance;
    }

    private String ano;
    private int ultimoNumero;

    public String gerarNumero() {
        this.ultimoNumero = this.ultimoNumero + 1;
        return this.ano + "-" + this.ultimoNumero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getUltimoNumero() {
        return ultimoNumero;
    }
}
