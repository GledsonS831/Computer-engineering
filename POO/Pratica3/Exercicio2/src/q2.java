import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome1, nome2;
        boolean ok = false;
        int qnt_strings = 0;
        int maior_string = 0;
        String concatenada = new String();
        String []lista = new String[10];
        int c= 0;
        while(true) {
            if(ok){break;}
            nome1 = input.next();
            if(c < 10)lista[c] = nome1;
            c++;

            nome2 = input.next();
            if(c < 10)lista[c] = nome2;
            c++;
            if(nome1.length() > maior_string)maior_string = nome1.length();
            if(nome2.length() > maior_string)maior_string = nome2.length();
            ok = iguais(nome1, nome2);
            qnt_strings+=2;

            if(ok){
                for(String i: lista){
                    System.out.println(i);
                }
                System.out.println("quantidade ->"+qnt_strings);
                System.out.println("Tamanho da maior string ->"+maior_string);
                System.out.println(concatenada);
                break;
            }
            concatenada+=nome1;
            concatenada+=nome2;

        }

    }
    public static boolean iguais(String s1, String s2){
        return s1.equals(s2);
    }
}
