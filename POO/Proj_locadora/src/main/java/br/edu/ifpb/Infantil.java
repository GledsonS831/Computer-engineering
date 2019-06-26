package br.edu.ifpb;

public class Infantil implements Preco {
    private double valor = 3.5;
    @Override
    public void setValor(double v) {
        this.valor = v;
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
