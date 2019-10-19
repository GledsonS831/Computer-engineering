public class PorHora extends Empregado {
    private double valorHora = 0.0;
    private int numHora = 0;

    public PorHora() {
        this("Sem Nome",0.0,0);
    }
    public PorHora(String name, double vhora) {
        this(name,vhora,0);
    }
    public PorHora(String name, double vhora, int nhora) {
        super(name);
        setValorHora(vhora);
        setNumHora(nhora);
    }

    public void setValorHora(double vhora) {
        this.valorHora = Math.max(vhora, 0.0);
    }
    public void setNumHora(int nhora) {
        this.numHora = Math.max(nhora, 0);
    }
    public double getValorHora() {
        return valorHora;
    }
    public int getNumHora() {

        return numHora;
    }
    // Definindo o metodo abstrato.
    public double getPay() {
        double pay = valorHora * numHora; return pay;
    }
}