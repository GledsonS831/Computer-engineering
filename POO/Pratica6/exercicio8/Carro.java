public class Carro {
    private String nome, placa;

    public Carro(String n, String p){
        nome = n;
        placa = p;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return nome+" "+placa;
    }
}
