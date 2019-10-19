public class Apto extends Construcao {
    private int nQuartos;

    public Apto(){}

    public Apto(double a, double p, int q){
        super.area = a;
        super.precoArea = p;
        nQuartos = q;
    }

    public void setnQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }

    public int getnQuartos() {
        return nQuartos;
    }

    @Override
    public String getDados() {
        return nQuartos+", "+area+", "+precoArea;
    }

    @Override
    public void printDados() {
        System.out.println(getDados());
    }

    @Override
    public double getPrecoTotal() {
        return super.area+super.precoArea;
    }
}
