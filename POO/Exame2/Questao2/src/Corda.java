public class Corda implements  Instrumento{
    private String nome;

    public Corda(String nome){
        this.nome = nome;
    }
    @Override
    public void tocar() {
        System.out.println("Tocando Corda");
    }

    @Override
    public String qual() {
        return nome;
    }

    @Override
    public void ajustar() {
        System.out.println("Ajuste do instrumento corda");
    }
}
