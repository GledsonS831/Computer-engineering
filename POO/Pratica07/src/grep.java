import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class grep {
    public static void main(String []args) throws IOException {
        File arq = new File("/home/gledson/Documentos/arqTest.txt");
        FileReader in = new FileReader(arq);
        BufferedReader bf = new BufferedReader(in);
        Scanner input = new Scanner(System.in);
        String s = input.next();
        boolean eh = false;
        while(bf.ready()){
            if(bf.readLine().equals(s)){
                eh = true;
            }
        }
        if(eh){
            System.out.println("encontrou");
        }
        else{
            System.out.println("nao encontrou");
        }
    }
}
