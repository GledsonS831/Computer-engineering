import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class TesteString {
    public static void main(String []args){

        Boolean ok = true;

        Scanner input = new Scanner(System.in);

        String s;

        int cnt = 0;

        Set<String> st = new HashSet<>();

        Set<String> aux = new HashSet<>();

        while(cnt < 2){
            s = input.next();
            if(s.equals("fim")){
                cnt += 1;
            }
            if(cnt == 0){
                if(!s.equals("fim")) {
                    st.add(s);
                }
            }
            if(cnt == 1){
                if(!s.equals("fim")) {

                    aux.add(s);
                }
            }
        }

        Iterator<String> it = aux.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        for(String i : aux){
            ok = false;
            for(String j : st){
                if(i.equals(j)){
                    ok = true;
                    break;
                }
            }
            if(ok){
                System.out.printf(i +" encontrado\n");
            }
            else{
                System.out.printf(i + " nao foi encontrado\n");
            }
        }

    }
}
