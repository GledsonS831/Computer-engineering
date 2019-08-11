import java.util.LinkedList;
import java.util.Scanner;

public class Loja {
    private LinkedList lista = new LinkedList();
    public void usaLoja(){
        Scanner in = new Scanner(System.in);
        double p = 1, dinheiro = 0;
        LinkedList lista = new LinkedList();
        while (true){
            registraProduto();
            double tot = getTotal();
            System.out.printf("Total: R$ %.2f\n", tot);
            System.out.print("Dinheiro: R$ ");
            dinheiro = in.nextDouble();

            System.out.printf("Troco: R$ %.2f\n", dinheiro-tot);
            System.out.println();
        }
    }
    public void registraProduto(){
        Scanner in = new Scanner(System.in);
        double p =1;
        int i = 0;
        while(true){
            i+=1;
            System.out.printf("Produto %d: R$ ", i);
            p = in.nextDouble();

            if(p == 0){
                break;
            }
            this.lista.add(p);
        }
    }
    public double getTotal(){
        double s = 0;
        for(int i = 0; i < this.lista.size(); i++){
            s += (double)lista.get(i);
        }
        return s;
    }
}
