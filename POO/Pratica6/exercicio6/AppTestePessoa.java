import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class AppTestePessoa {
    public static void main(String []args){
        Pessoa p1 = new Pessoa("puts");
        ArrayList arr = new ArrayList();

        Scanner input = new Scanner(System.in);

        String verifica = null;


        while(true){
            System.out.print("Deseja informar algo? Y/N  -> ");
            verifica = input.next();
            if(verifica.equals("N")){
                break;
            }
            Endereco end = new Endereco();
            System.out.print("Infome Logradouro: ");
            end.setLogradouro(input.next());
            System.out.print("Informe Numero: ");
            end.setNumero(input.nextInt());
            System.out.print("Informe Complemento: ");
            end.setComplemento(input.next());
            arr.add(end);
        }
        p1.setArr_end(arr);

        p1.imprimirEnderecos1();
        p1.imprimirEnderecos2();

    }
}
