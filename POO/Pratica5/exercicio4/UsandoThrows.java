import java.util.Scanner;
public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Entre com um número decimal: ");
        try {
            double num = leNumero();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
            e.printStackTrace();
        }
    }
    public static double leNumero() throws Exception{
        double num = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextDouble();
        return num;
    }
}