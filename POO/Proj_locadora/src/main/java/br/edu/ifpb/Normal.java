package br.edu.ifpb;

public class Normal implements Preco {
    private double valor = 5.0;
    @Override
    public void setValor(double v) {
        this.valor = v;
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}
