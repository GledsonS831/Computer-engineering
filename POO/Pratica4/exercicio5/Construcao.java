public abstract class Construcao {
    protected double area;
    protected double precoArea;

    public Construcao(){
    }
    public Construcao(double a, double p){
        area = a;
        precoArea = p;
    }
    public String getDados(){
        return area+", "+precoArea;
    }

    public void printDados(){
        System.out.println(getDados());
    }

    public abstract double getPrecoTotal();
}
