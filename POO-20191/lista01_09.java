//Crie um programa Java que receba dois números do usuário e que mostre a
//quantidade de números pares, a quantidade de números ímpares e a soma entre os valores

//Create a Java program that receive two numbers of the user and show the amount of numbers pairs, odds and the sum between them.



import java.util.Scanner;

public class lista01_09{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int num_pair = 0;
        int num_odd = 0;
        int sum = 0;
        for(int i = 0; i < 2; i++){
            int num = read.nextInt();
            sum += num;
            if(num % 2 == 0){
                num_pair++;
            }
            else if(num % 2 != 0){
                num_odd++;
            }
        }
        System.out.printf("%d numbers pair\n", num_pair);
        System.out.printf("%d numbers odd\n", num_odd);
        System.out.printf("sum = %d\n", sum);
    }
}