import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSet {
    private int codigo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean equals(TesteHashSet obj) {

        if(obj.codigo == this.codigo){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return this.codigo;
    }

    public static void main(String []args){
        TesteHashSet ts = new TesteHashSet();
        String ver = null;
        Scanner inp = new Scanner(System.in);

        int n;

        Set hs = new HashSet();

        while(true){
            System.out.print("deseja digitar algum cod? Y/N -> ");
            ver = inp.next();
            if(ver.equals("N")){
                break;
            }

            n = inp.nextInt();
            ts.setCodigo(n);

            if(hs.contains(ts)){
                System.out.println("ja tem cara, digite outro");
            }
            else{
                hs.add(ts);
            }
        }

        Iterator<TesteHashSet> it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next().codigo);
        }
    }
}
