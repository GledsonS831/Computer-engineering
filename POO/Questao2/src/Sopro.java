public class Sopro implements Instrumento{
    protected String nome;

    public Sopro(String n){
        this.nome = n;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Sopro");
    }

    @Override
    public String qual() {
        return nome;
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustando Instrumento de Sopro");
    }
}
