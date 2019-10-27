
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String []args){
        String num = null;
        int n;
        ArrayList arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            num = input.next();
            if(num.equals("fim")){
                break;
            }
            n = Integer.parseInt(num);
            arr.add(n);
        }
        Comp c = new Comp();

        //arr.sort(c);
        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
