import java.util.LinkedList;
import java.util.Scanner;

class lista01_11{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qnt_pedidos = read.nextInt();
        double preco = 0;
        for(int i = 0; i < qnt_pedidos; i++){
            int cod = read.nextInt();
            int qnt_lanche = read.nextInt();
            if(cod == 10){
                preco += 1.5 * qnt_lanche;
            }
            else if(cod == 11){
                preco += 1.8 * qnt_lanche;
            }
            else if(cod == 12){
                preco += 1.9 * qnt_lanche;
            }
            else if(cod == 20){
                preco += 10 * qnt_lanche;
            }
            else if(cod == 30){
                preco += 8*qnt_lanche;
            }
            else if(cod == 50){
                preco += 2.5*qnt_lanche;
            }
        }
        if(preco > 50){
            preco = preco - (preco * 0.05);
        }
        System.out.printf("preco total foi %.2f", preco);
    }
}