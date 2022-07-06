package provedores;

public class Loggi implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete;
        if (peso > 5000){
            frete = new Frete(valor * 0.12, obterTipoProvedorFrete());
        }
        else {
            frete = new Frete(valor * 0.04, obterTipoProvedorFrete());
        }
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
