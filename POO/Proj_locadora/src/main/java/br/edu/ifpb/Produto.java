package br.edu.ifpb;

public class Produto {
    private String Tipo;
    private String Nome;
    private double Preco;

    public Produto(String tipo, String nome, Preco p){
        this.Preco = p.getValor();
        this.Tipo = tipo;
        this.Nome = nome;
    }

    public void setTipo(String nome){
        this.Tipo = nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    public void setPreco(Preco p){
        this.Preco = p.getValor();
    }
    public String getTipo(){return this.Tipo;}
    public String getNome(){return this.Nome;}
    public double getPreco(){return this.Preco;}

    @Override
    public String toString() {
        return this.Nome+", "+this.Tipo+", "+this.Preco;
    }
}
