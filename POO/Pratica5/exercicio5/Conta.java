public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        saldo += valor;
        System.out.println("Depositou R$ " + valor);
    }

    public void saque(double valor) throws ValorInsuficienteSaqueException {
        if (valor > this.saldo) {
            throw new ValorInsuficienteSaqueException("Saque maior do que o esperado na conta!");
        } else {
            saldo -= valor;
            System.out.println("Sacou R$ " + valor);
        }
    }
}
