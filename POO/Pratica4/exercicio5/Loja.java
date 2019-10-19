public class Loja extends Construcao{
    private double sales;

    public Loja(double a, double p, double s){
        super.area = a;
        super.precoArea = p;
        sales = s;
    }

    public void setVendas(double s) {
        this.sales = s;
    }

    public double getSales() {
        return sales;
    }

    @Override
    public double getPrecoTotal() {
        return sales;
    }
}
