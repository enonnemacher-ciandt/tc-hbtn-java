import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0)
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        this.saldo = getSaldo() + valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0)
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        if (valor > getSaldo())
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");

        this.saldo = getSaldo() - valor;
    }

    public double calcularTarifaMensal() {
        double tarifa = getSaldo() * 0.1;
        if (tarifa > 10.00)
            return 10.00;
        else
            return tarifa;
    }

    public double calcularJurosMensal() {
        double jurosMensal = getTaxaJurosAnual() / 12;
        if (this.saldo <= 0)
            return 0;
        else
            return jurosMensal;
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = this.getSaldo() - calcularTarifaMensal() + (this.getSaldo() * calcularJurosMensal() / 100);
    }
}
