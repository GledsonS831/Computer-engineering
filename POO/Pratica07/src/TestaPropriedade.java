import java.io.*;
import java.util.Properties;

public class TestaPropriedade {
    public static void main(String []args) throws IOException {
        FileReader fr = new FileReader("/home/gledson/Documentos/propriedades.properties");
        BufferedReader bf = new BufferedReader(fr);
        Properties pr = new Properties();
        pr.load(new FileInputStream("/home/gledson/Documentos/propriedades.properties"));

        while(bf.ready()){
            String []a = bf.readLine().split("=");
            System.out.println(pr.getProperty(a[0]));
        }

    }
}
