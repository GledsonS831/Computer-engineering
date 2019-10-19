import java.util.Random;

public class Imobiliaria {
    public static  void main(String args[]){
        Random r = new Random();
        int n = r.nextInt(2);

        Construcao lc[] = new Construcao[6];
        if(n == 0){
            for(int i = 0; i < 6; i++){
                lc[i] = new Loja(i * 12, i*100, 30*i);
            }
        }
        else if(n == 1){
            for(int i = 0; i < 6; i++){
                lc[i] = new Apto(i * 12, i*100, 30*i);
            }
        }
        else {
            for(int i = 0; i < 6; i++){
                lc[i] = new Apto(i * 1, i*103, 39*i);
            }
        }
    }
}
