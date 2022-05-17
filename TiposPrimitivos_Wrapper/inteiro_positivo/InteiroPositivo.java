public class InteiroPositivo {

    private int valor;

    public InteiroPositivo(int valor) {
        verificaPositivo(valor);
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        verificaPositivo(Integer.parseInt(valor));
        this.valor = Integer.parseInt(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        verificaPositivo(valor);
        this.valor = valor;
    }

    public Boolean ehPrimo() {
        if (this.valor == 1)
            return false;
        for (int i = 2; i < this.valor; i++) {
            if (this.valor % i == 0)
                return false;
        }
        return true;
    }

    private void verificaPositivo(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }
}