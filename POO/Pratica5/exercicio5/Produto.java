public class Produto {
    private String descricao;
    private double preco;

    public Produto(String s, double p){
        descricao = s;
        preco = p;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

}
