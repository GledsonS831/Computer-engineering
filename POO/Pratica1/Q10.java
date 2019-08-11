import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        while(true){
            n = s.nextInt();
            double soma = 0;
            for(int i = 1; i <= n; i++){
                soma += (double)i/(3*i);
                if(i == n){
                    System.out.printf("%d/%d\n", i, 3*i);
                }
                else{
                    System.out.printf("%d/%d + ", i, 3*i);
                }
            }
            System.out.printf("%.2f\n",soma);
        }
    }
}
