public class InteiroPositivo {
    private int valor;

    public InteiroPositivo (int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        else {
            this.valor = valor;
        }
    }

    public InteiroPositivo (String valor){
        if(Integer.parseInt(valor) <= 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        else {
            this.valor = Integer.parseInt(valor);
        }
    }

    boolean ehPrimo (){
        if (valor == 1){
            return false;
        }
        for (int n = 2; n < valor; n++ ){
            if(valor % n == 0){
                return false;
            }
        }
        return true;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }
}
