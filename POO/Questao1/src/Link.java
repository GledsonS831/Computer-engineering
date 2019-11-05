public class Link implements Arquivo {
    private String nome;
    private Arquivo destino;
    private String data;

    public Link(String nome, Arquivo destino){
        this.nome = nome;
        this.destino = destino;
        this.data = Data.hoje();
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setDestino(Arquivo destino) {
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }

    public Arquivo getDestino() {
        return destino;
    }

    @Override
    public int tamanho() {
        return 0;
    }
}
