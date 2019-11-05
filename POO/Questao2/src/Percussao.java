public class Percussao implements Instrumento {
    private String nome;

    public Percussao(String nome){
        this.nome = nome;
    }
    @Override
    public void tocar() {
        System.out.println("Tocando Percussao");
    }

    @Override
    public String qual() {
        return nome;
    }

    @Override
    public void ajustar() {
        System.out.println("Ajuste da Percussao");
    }
}
