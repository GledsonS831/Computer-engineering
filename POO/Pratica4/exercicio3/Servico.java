public class Servico implements Classificavel{
    private double preco;

    public Servico(double s){
        this.preco = s;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    @Override
    public boolean eMenorQue(Classificavel obj) {
        Servico s = ( Servico ) obj;

        if( this.preco < s.preco ) return true;
        else return false;
    }
}
