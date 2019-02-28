//Crie um programa Java que peça 10 números inteiros e apresente: a média, o maior e o menor.
//Create a Java program that ask 10 numbers integers and show: the average, the biggest and the smaller.

import java.util.Scanner;

public class lista01_08{
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        double sum = 0;
        int biggest = 0;
        int smaller = 0;
        for(int i = 0; i < 10; i++){
            int grade = read.nextInt();
            if(i == 0){
                smaller = grade;
            }
            if (grade > biggest){
                biggest = grade;
            }
            sum += grade;
        }
        System.out.println(sum/10);
        System.out.println(biggest);
        System.out.println(smaller);
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
}