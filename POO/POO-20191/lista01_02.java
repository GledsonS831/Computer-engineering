//Crie um programa Java que determine a idade atual da pessoa, baseado no ano de nascimento.
//Create a Java program that set a current age of the person, based on year of the birth.

import java.util.Scanner;

class lista01_02{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int year_birth = read.nextInt();
        System.out.printf("The age him in year 2019 is %d", (2019-year_birth));
    }
}