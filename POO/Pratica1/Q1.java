
public class Q1 {
    private int x1, x2, y1, y2;
    Q1(){
        System.out.println("ditancia entre 2 pontos");
    }
    public void setCoordenadas(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double getDistancia(){
        double soma = Math.pow(this.x2-this.x1, 2) + Math.pow(this.y2-this.y1, 2);
        double d = Math.sqrt(soma);
        return d;
    }
}
