public class Escritorio extends Apto implements Commission{
    private double sales;

    @Override
    public void setVendas(double sales) {
        this.sales = sales;
    }

    @Override
    public String getDados() {
        return super.getDados()+", "+sales;
    }

    @Override
    public double getPrecoTotal() {
        return super.getPrecoTotal()+sales;
    }
}
