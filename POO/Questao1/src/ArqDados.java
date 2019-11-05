public class ArqDados implements Arquivo{
    private String nome;
    private byte[] dados;
    private String data;

    public ArqDados(String nome, byte[] dados){
        this.nome = nome;
        this.dados = dados;
        this.data = Data.hoje();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public byte[] getDados() {
        return dados;
    }

    public void setDados(byte[] dados) {
        this.dados = dados;
    }

    @Override
    public int tamanho() {
        return dados.length;
    }
}
