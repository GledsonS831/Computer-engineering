//Suponha que o conceito de um aluno seja determinado em função da sua nota. 
//Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100, conforme a seguinte faixa:
//(0 a 49) - Insuficiente, (50 a 64) - Regular, (65 - 84) - Bom, (85 - 100) - Otimo

import java.util.Scanner;

public class lista01_07{
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        int grade = read.nextInt();
        if (grade <= 49){
            System.out.printf("Insuficiente");
        }
        else if(grade >= 50 && grade <= 64){
            System.out.printf("Regular");
        }
        else if(grade >= 65 && grade <= 84){
            System.out.printf("Bom");
        }
        else if(grade >= 85 && grade <= 100){
            System.out.printf("Otimo");
        }
    }
}