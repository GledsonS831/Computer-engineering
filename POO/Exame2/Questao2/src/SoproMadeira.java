public class SoproMadeira extends Sopro{
    public SoproMadeira(String n){
        super(n);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Sopro de Madeira");;
    }

    @Override
    public String qual() {
        return super.qual();
    }

    @Override
    public void ajustar() {
        System.out.println("Ajuste intrumento Sopro de Madeira");
    }
}
