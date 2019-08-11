import java.util.Scanner;

public class Q6 {
    private int n = 0;
    public static void main(String[] args){
        Q6 q6 = new Q6();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        q6.setN(n);
        System.out.println(q6.serieH(4));

    }
    public void setN(int n){
        this.n = n;
    }
    public double getSerieH(){
        double h = 1, d;
        for(int i = 2; i <= this.n; i++){
            d = 1/i;
            h += d;
        }

        return h;
    }
    public double serieH(int n){
        if(n == 1){
            return 1;
        }
        else{
            return (double) 1/n + (double)1/(serieH(n-1));
        }

    }
}
