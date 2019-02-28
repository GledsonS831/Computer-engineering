//Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de serviços é de:
//R$ 5.50 por diária, se o número de diárias for maior que 15;
//R$ 6.00 por diária, se o número de diárias for igual a 15;
//R$ 8.00 por diária, se o número de diárias for menor que 15;

import java.util.Scanner;

public class lista01_06{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        double daily = read.nextDouble();
        if(daily > 15){
            System.out.printf("daily price %f", (5.5 * daily) + 60);
        }
        else if(daily == 15){
            System.out.printf("daily price %f", (6 * daily) + 60);
        }
        else{
            System.out.printf("daily price %.2f", (8 * daily) + 60);
        }
    }
}