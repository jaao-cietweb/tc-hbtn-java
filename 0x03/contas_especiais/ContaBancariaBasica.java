import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    protected double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor<=0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        else saldo =+ valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor<=0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        else if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        else this.saldo -= valor;
    }

    public double calcularTarifaMensal(){
        double tarifa = this.saldo * 0.1;
        if (tarifa > 10){
            return 10;
        }
        return tarifa;

    }

    public double calcularJurosMensal(){
        if (this.saldo > 0){
            return  getSaldo() * (getTaxaJurosAnual()/100) / 12;
        }
        return 0;
    }

    public void aplicarAtualizacaoMensal(){
        saldo = getSaldo() + calcularJurosMensal() - calcularTarifaMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
