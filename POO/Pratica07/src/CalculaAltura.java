import java.io.*;

public class CalculaAltura{
    public static void main(String []args) throws IOException {
        FileReader fr = new FileReader("/home/gledson/Documentos/pacientes.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/gledson/Documentos/acimadopeso.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String[] f;
        String []NomeIdade = null;
        int j = 0;
        double calculaPeso = 0;
        while(br.ready()){
            j++;
            if(j % 2 == 0){
                f = br.readLine().split(" ");
                bw.write(NomeIdade[0] + " " + f[0]);
                bw.newLine();
            }
            else{
                NomeIdade = br.readLine().split(" ");
            }
        }
        bw.close();
        br.close();
    }
}
