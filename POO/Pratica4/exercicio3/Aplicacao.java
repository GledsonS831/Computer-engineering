import java.util.LinkedList;

public class Aplicacao {
    public static void main(String args[]){
        //LinkedList<Produto> lp = new LinkedList<>();
        Produto p1 = new Produto(14);
        Produto p2 = new Produto(19);
        Produto p3 = new Produto(8);

        Classificador cl = new Classificador();
        Produto []lp = new Produto[50];
        lp[0] = p1;
        lp[1] = p2;
        lp[2] = p3;

        Servico s1 = new Servico(90);
        Servico s2 = new Servico(7);
        Servico s3 = new Servico(45);
        Servico[]ls = new Servico[50];
        ls[0] = s1;
        ls[1] = s2;
        ls[2] = s3;
        cl.ordena(ls);
        cl.ordena(lp);
        for(Produto i: lp){
            System.out.println(i.getCodigo());
        }
        for(Servico i: ls){
            System.out.println(i.getPreco());
        }


    }
}
