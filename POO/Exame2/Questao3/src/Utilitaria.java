public class Utilitaria {

    public static double toCelsius(double f) throws FahrenheitException{
        double c = (5 * (f - 32))/9;

        if(f < -459.67){
            throw new FahrenheitException();
        }
        else{
            return c;
        }
    }

}
