import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Q4 q4 = new Q4();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(q4.ehPrimo(n)){
            System.out.println("esse numero eh primo");
        }
        else {
            System.out.println("nao eh primo");
        }
    }
    public boolean ehPrimo(int n){
        if(n == 2){return true;};
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
