import java.util.ArrayList;
import java.util.Iterator;

public class Pessoa {
    private String nome;
    private ArrayList<Endereco> arr_end = new ArrayList<>();

    public Pessoa(){}

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setArr_end(ArrayList<Endereco> arr_end) {
        this.arr_end = arr_end;
    }

    public void imprimirEnderecos1(){
        for(int i = 0; i < arr_end.size(); i++){
            System.out.println(arr_end.get(i).toString());
        }
    }

    public void imprimirEnderecos2(){
        Iterator<Endereco> it = arr_end.iterator();

        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}

