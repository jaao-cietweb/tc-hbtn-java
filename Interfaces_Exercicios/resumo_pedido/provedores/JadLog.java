package provedores;

public class JadLog implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete;
        if (peso > 2000){
            frete = new Frete(valor * 0.07, obterTipoProvedorFrete());
        }
        else {
            frete = new Frete(valor * 0.45, obterTipoProvedorFrete());
        }
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
