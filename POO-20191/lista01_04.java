//Crie um programa Java para verificar se o aluno foi aprovado (média maior ou igual
//a 7,0), se vai fazer final (média maior ou igual a 5,0 e menor do que 7,0) ou se foi 
//reprovado (média abaixo de 5,0). O usuário deverá informar 4 notas.

//Create a Java program to check if the student was approved (average >= 7.0) make the final (average >= 5 and < 7) or disapproved (average < 5)
//The user inform 4 grades



import java.util.Scanner;

public class lista01_04{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        double sum = 0;
        for(int i = 0; i < 4; i++){
            double grade = read.nextDouble();
            sum += grade;
        }
        System.out.printf("avarage is %.2f", (sum / 4));
    }
}