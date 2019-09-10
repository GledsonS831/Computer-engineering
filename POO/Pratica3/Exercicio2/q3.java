import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        String m;
        Scanner input = new Scanner(System.in);
        m = input.next();
        int tam = m.length();
        tam = 8 - tam;
        String nova = new String();
        for(int i = 0; i < tam; i++){
            nova+="*";
        }
        nova+=m;
        System.out.println(nova);
    }
}
