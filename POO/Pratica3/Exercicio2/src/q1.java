import java.util.Scanner;

public class q1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome1, nome2;
        boolean ok = false;
        int qnt_strings = 0;
        int maior_string = 0;
        String concatenada = new String();
        while(true) {
            nome1 = input.next();
            if(nome1.length() > maior_string)maior_string = nome1.length();
            nome2 = input.next();
            if(nome2.length() > maior_string)maior_string = nome2.length();
            qnt_strings+=2;
            ok = iguais(nome1, nome2);

            if(ok){
                System.out.println("quantidade ->"+qnt_strings);
                System.out.println("Tamanho da maior string ->"+maior_string);
                System.out.println(concatenada);
                break;
            }
            concatenada+=nome1;
            concatenada+=nome2;
            System.out.println(nome1+" "+nome2);
        }
    }
    public static boolean iguais(String s1, String s2){
        return s1.equals(s2);
    }
}
