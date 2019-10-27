import java.security.PublicKey;

public class Pedido {
    private String nome;
    private double valor;

    public Pedido(){}

    public Pedido(String n, double v){
        nome = n;
        valor = v;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nome + ", " + valor;
    }
}
