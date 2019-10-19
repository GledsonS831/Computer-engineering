import java.util.LinkedList;

public class Venda {
    LinkedList<Produto> lp = new LinkedList<>();


    public Produto getProduto(int index){
        return lp.get(index);
    }

    public int getNumProdutos(){
        return lp.size();
    }

    public void adiciocaProduto(Produto p){
        lp.add(p);
    }

    public double getTotal(){
        double t = 0;
        for(Produto i: lp){
            t += i.getPreco();
        }
        return t;
    }


}
