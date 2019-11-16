public class Latao extends Sopro{

    public Latao(String n){
        super(n);
    }
    @Override
    public void tocar() {
        System.out.println("Tocando Latao");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajuste do Latao");
    }

    @Override
    public String qual() {
        return super.qual();
    }
}
