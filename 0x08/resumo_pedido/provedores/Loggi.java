package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 5000) {
            valor = valor * 0.12;
        } else {
            valor = valor * 0.04;
        }
        return new Frete(valor, TipoProvedorFrete.LOGGI);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.LOGGI;
    }
}
