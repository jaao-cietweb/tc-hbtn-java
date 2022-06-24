import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{
    public int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor<=0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        else if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        else this.saldo = saldo - valor - 0.10;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor<=0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        else this.saldo = saldo + valor - 0.10;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
