import java.util.ArrayList;

public class TesteString {
    public static void main(String []args){
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        al.add("aa");
        al.add("bb");
        al.add("cc");
        al.add("dd");
        al.add("ee");
        al.remove(6);
        for(String i : al){
            System.out.println(i);
        }
    }
}
