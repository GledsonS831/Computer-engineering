import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double v = s.nextDouble();
        System.out.println("Preço do pão: R$ "+v);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for(int i = 1; i < 51; i++){
            System.out.printf(i+" - R$ %.2f\n",v*i);
        }
    }
}
