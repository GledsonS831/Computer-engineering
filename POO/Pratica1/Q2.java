import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Q2 q2 = new Q2(0);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        q2.set_metroQ(n);
        System.out.println("preco "+q2.getPreco());
        System.out.println("quantidade de latas: "+q2.getTotal_latas());

    }

    private int metrosQ = 0, qnt_latas = 0;
    public Q2(int t){
        System.out.println("digite os m²:");
        this.metrosQ = t;
    }
    public void set_metroQ(int t){
        this.metrosQ = t;
    }
    public int getTotal_latas(){
        double litros = this.metrosQ/3;
        double qnt = litros/18;
        int qnt2 = (int)qnt;
        if(qnt - qnt2 != 0){
            this.qnt_latas = qnt2+1;
            return qnt2+1;
        }
        else{
            this.qnt_latas = qnt2;
            return qnt2;
        }
    }

    public double getPreco(){
        return getTotal_latas()*80;
    }
}
