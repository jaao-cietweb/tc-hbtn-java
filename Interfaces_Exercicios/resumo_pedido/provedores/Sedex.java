package provedores;

public class Sedex implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete;
        if (peso > 1000){
            frete = new Frete(valor * 0.1, obterTipoProvedorFrete());
        }
        else {
            frete = new Frete(valor * 0.05, obterTipoProvedorFrete());
        }
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
