

import java.util.Scanner;

public class lista01_10{
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int count = 0;
        while(num > 1){
            num = num / 2;
            System.out.println(num);
            count += 1;
        }
        System.out.printf("A quantidade de divisoes foram %d\n", count);
    }
}