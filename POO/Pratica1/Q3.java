public class Q3 {
    public static void main(String[] args){
        Q3 q3 = new Q3();
        q3.setGramas(10000);
        q3.calculaMassa();
        System.out.println(q3.getMassaIni());
        System.out.println(q3.getMassaF());
        System.out.println(q3.getTempo());
        q3.showTempoTotal();
    }
    private double massaIni = 0.0, massaF = 0.0;
    private int tempo = 0;

    public void setGramas(double g){this.massaIni = g;}
    public void calculaMassa(){
        double m = this.massaIni;
        int total = 0;
        while(m >= 0.5){
            m = m/2;
            total += 350;
        }
        this.massaF = m;
        this.tempo = total;
    }
    public int getTempo(){
        return this.tempo;
    }
    public double getMassaIni(){
        return this.massaIni;
    }
    public double getMassaF(){
        return this.massaF;
    }
    public void showTempoTotal(){
        int horas = this.tempo/3600;
        int min = (tempo - horas*3600)/60;
        int seg = (tempo-(horas*3600) - (min*60));
        System.out.println(horas+":"+min+":"+seg+"ss.");
    }
}
