package br.edu.ifpb;

import java.util.Comparator;

public class Lancamento implements Preco {
    private double valor = 10.0;
    public void setValor(double v) {
        this.valor = v;
    }
    public double getValor(){
        return this.valor;
    }

    public int hashCode(){
        return 10;
    }

}
