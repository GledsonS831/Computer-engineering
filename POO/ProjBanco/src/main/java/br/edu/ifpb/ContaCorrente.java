package br.edu.ifpb;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;


    public ContaCorrente(int num, String titular, double saldo){
        this.saldo = saldo;
        this.numero = num;
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double Deposito(double v){
        this.saldo += v;
        return v;
    }
    public double calculaCPMF(){
        return this.saldo*0.01;
    }
    public double descontaCPMF(){
        return this.saldo -= calculaCPMF();
    }
    public boolean Sacar(double saque) throws SaldoInsuficienteException {
        if(saque <= this.saldo){
            this.saldo -= saque;
            this.saldo = descontaCPMF();
            return true;
        }
        else{
            throw new SaldoInsuficienteException();
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "    Conta: "+getNumero() +
                " titula: "+getTitular()+
                " Saldo: R$ "+getSaldo();
    }
}
