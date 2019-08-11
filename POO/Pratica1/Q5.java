import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Q5 q5 = new Q5();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(q5.getFatorial(n));
    }
    public int getFatorial(int n){
        if(n == 1){
            return 1;
        }
        return n*getFatorial(n-1);
    }

}
