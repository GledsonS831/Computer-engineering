import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContaPalavras {
    public static void main(String []args) throws IOException {
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);
        int c = 0;
        while(br.ready()){
            br.readLine();
            c++;
        }
        System.out.println(c + " palavra(s)");
    }
}
