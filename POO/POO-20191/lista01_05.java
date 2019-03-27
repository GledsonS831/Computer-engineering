import java.util.ArrayList;

import java.util.Scanner;

class lista01_05{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        ArrayList meses = new ArrayList();
        
        meses.add("janeiro");
        meses.add("fevereiro");
        meses.add("março");
        meses.add("abril");
        meses.add("maio");
        meses.add("junho");
        meses.add("julho");
        meses.add("agosto");
        meses.add("setembro");
        meses.add("outubro");
        meses.add("novembro");
        meses.add("dezembro");
       
        System.out.println(meses.get(num-1));
    }
}