import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaExcecao {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("eu sei dividir");
        System.out.println("Informe o primeiro valor");
        int x = 0, y = 0;
        try{
            x = teclado.nextInt();

        }catch (InputMismatchException e){
            System.out.println("nao é valido esse valor");
        }
        System.out.println("Informe o segundo o valor");
        try{
            y = teclado.nextInt();

        }catch (InputMismatchException e){
            System.out.println("nao é valido esse valor");
        }

        double r;
        try {
            r = x / y;
            System.out.println("O resultado da divisao é " + r);
        }
        catch (ArithmeticException e) {
            System.out.println("nao pode dividor por 0");
            e.printStackTrace();
        }

    }
}
