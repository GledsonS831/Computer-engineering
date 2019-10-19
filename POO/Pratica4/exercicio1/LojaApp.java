public class LojaApp {
    public static void main(String args[]){
        Produto p1 = new Produto("casa", 100);
        Produto p2 = new Produto("sapato", 200);
        Produto p3 = new Produto("algo", 7);
        Venda v = new Venda();
        v.adiciocaProduto(p1);
        v.adiciocaProduto(p2);
        v.adiciocaProduto(p3);
        System.out.println(v.getTotal());
    }
}
