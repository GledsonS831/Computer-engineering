import java.util.HashMap;
import java.util.Iterator;
import java.util.function.BiConsumer;

public class TesteCarro {


    public static void main(String [] args){
        String cpf1 = "675.987.312";
        String cpf2 = "019.927.725";
        String cpf3 = "018.745.817";

        Carro c1 = new Carro("auto", "9878");
        Carro c2 = new Carro("ford", "9871");
        Carro c3 = new Carro("fiat", "9870");

        HashMap<String, Carro>hm = new HashMap<String, Carro>();

        inserir(cpf1, c1, hm);
        inserir(cpf2, c2, hm);
        inserir(cpf3, c3, hm);

        Iterator<String> it1 = hm.keySet().iterator();
        Iterator<Carro> it2 = hm.values().iterator();
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
            System.out.println(it2.next().toString());
        }
    }

    public static void  inserir(String cpf, Carro c, HashMap<String, Carro> hm){
        if(hm.containsKey(cpf) || hm.containsValue(c)){
            System.out.println("ja tem pateta");
        }
        else{
            hm.put(cpf, c);
        }
    }
}
