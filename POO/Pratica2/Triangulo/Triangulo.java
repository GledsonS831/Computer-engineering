package triangulo;

public class Triangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(), t2 = new Triangulo(), t3 = new Triangulo();
        t1.setBase(10);
        t2.setBase(20);
        t3.setBase(15);
        t1.setAltura(14);
        t2.setAltura(30);
        t3.setAltura(22);
        
        t1.info();
        System.out.println(t1.getArea());
        t2.info();
        System.out.println(t2.getAltura());
        t3.info();
        System.out.println(t3.getArea());
        
    }
    private double t_base, t_altura;
    
    public void setBase(double b){
        this.t_base = b;
    }
    public void setAltura(double h){
        this.t_altura = h;
    }
    public double getBase(){return this.t_base;}
    public double getAltura(){return this.t_altura;}
    public void info(){
        System.out.println("Triangulo: Base="+this.t_base+", Altura="+this.t_altura);
    }
    public double getArea(){return (this.t_base*this.t_altura)/2;}
    
}
