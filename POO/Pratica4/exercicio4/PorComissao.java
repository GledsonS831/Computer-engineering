public class PorComissao extends Empregado implements Comission {
    private double sales = 0.0;

    public PorComissao() {
        this("Sem Nome",0.0);
    }
    public PorComissao(String name) {
        this(name,0.0);
    }
    public PorComissao(String name, double sales){
        super(name);
        setVendas(sales);
    }

    public void setVendas(double sales) {
        this.sales = (sales < 0)?0.0:sales;
    }
    // Definindo o metodo abstrato.
    public double getPay() {
        double pay = COMMISSION_RATE * sales;
        return pay;
    }
}