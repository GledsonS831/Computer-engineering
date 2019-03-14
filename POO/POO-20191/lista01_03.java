//O sistema de avaliação de determinada disciplina, é composto por três provas. A primeira prova tem peso 2, a segunda tem 
//peso 3 e a terceira tem peso 5. Faça um programa em Java para calcular a média final de um aluno desta disciplina.

//The evaluation system of a discipline is composed for three exam. The first weight 2, the second 3 and the third 5.
//Make a Java program that calculates the average final.

import java.util.Scanner;

public class lista01_03{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        double sum = 0;
        
        for(int i =1; i < 3; i++){
            double grade = read.nextDouble();
            grade = grade*(i+1);
            sum += grade;
        }
        double grade = read.nextDouble();
        grade = grade*5;
        sum += grade;
        System.out.printf("weighted average %.2f", sum/10);
    }
}