package integracao;

public class FabricaFactory {

    public static FabricaAbstrata obterFabrica(String tipoSeguro) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("integracao.Fabrica" + tipoSeguro);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de seguro inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Tipo de seguro inválido");
        }
        return (FabricaAbstrata) objeto;
    }
}
