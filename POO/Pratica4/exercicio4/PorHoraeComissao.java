public final class PorHoraeComissao extends PorHora implements Comission {
    private double sales = 0.0;

    @Override
    public void setNumHora(int nhora) {
        super.setNumHora(nhora);
    }

    @Override
    public void setValorHora(double vhora) {
        super.setValorHora(vhora);
    }

    @Override
    public double getValorHora() {
        return super.getValorHora();
    }

    @Override
    public int getNumHora() {
        return super.getNumHora();
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public PorHoraeComissao() {
        this("Sem Nome",0.0,0,0.0);
    }
    public PorHoraeComissao(String name, double vhora, int nhora){
        this(name,vhora,nhora,0.0);
    }
    public PorHoraeComissao(String name, double vhora, int nhora, double s) {
        super(name,vhora,nhora);
        setVendas(s);
    }

    public void setVendas(double s) {
        sales = Math.max(s, 0.0);
    }

    public double getPay() {
        double pay = getValorHora() * getNumHora() + COMMISSION_RATE * sales;
        return pay;
    }

    public void printPay() {
        super.printPay();

        System.out.printf("Ganho por hora : %8.2f \n",getValorHora()*
                getNumHora());
        System.out.printf("Ganho por comissao: %8.2f \n",COMMISSION_RATE *
                sales);
    }

}