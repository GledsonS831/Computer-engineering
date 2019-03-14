package br.com.bb;

public class conta
{
    //area de atributos
    private int num;
    private String titular;
    private double saldo;
    private double quantia;

    // area de construtores
    public conta() {
        setNum(0);
        setTitular("---------sem nome---------");
        saldo = 1000;
    }

    public conta(int n, String t, double s) {
        setNum(n);
        setTitular(t);
        saldo = s;
    }

    // area de metodos
    public void setNum (int novo) {
        if (novo > 0)
            this.num = novo;
    }

    public void setTitular( String titular) {
        if (titular != null && titular != "")
            this.titular = titular;
    }

    public void sacar(double quantia){
        if(this.saldo > 0 && quantia > 0 && this.saldo > quantia){
            this.saldo -= quantia;
        }
    }

    public void depositar(double quantia){
        this.saldo += quantia;
    }

    public int getNum() {
        return num;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }




}
