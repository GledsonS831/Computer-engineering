//Crie um programa Java para receber uma velocidade em m/s e alterar para km/h.
//Create a Java program to receive the speed in m/s and change to km/h.

import java.util.Scanner;

class lista01_01{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        double speed = read.nextDouble();
        System.out.printf("the speed in km/h is %.2f", (speed*3.6));
    }
}
