public class Aplicacao {
    public static void main(String []args) throws TemperaturaException{
        //double c1 = Utilitaria.toCelsius(-500);
        //System.out.println(c1);
        //double c2 = Utilitaria.toCelsius(43);
        //System.out.println(c2);

        //vou usar com try e catch também além de deixar somente com o throws
        double c;
        try{
            c = Utilitaria.toCelsius(-500);
            System.out.println(c);
        }catch (FahrenheitException f){
            f.printStackTrace();
        }
        try{
            c = Utilitaria.toCelsius(111);
            System.out.println(c);
        }catch (FahrenheitException f){
            f.printStackTrace();
        }
    }
}
