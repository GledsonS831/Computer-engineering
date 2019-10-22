import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteString {
    public static void main(String []args){

        Set<Integer> st = new HashSet<>();

        st.add(19);
        st.add(2);
        st.add(5);
        st.add(3);
        st.add(9);
        st.add(2);
        st.add(4);
        st.add(3);
        st.add(3);
        st.add(8);
        st.add(5);

        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
