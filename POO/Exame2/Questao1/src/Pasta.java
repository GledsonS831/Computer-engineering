import java.util.HashSet;

public class Pasta implements Arquivo{
    private String nome, data;
    private HashSet<Arquivo> conteudo;

    public Pasta(String nome, String data, Arquivo destino) throws NullPointerException{
        this.nome = nome;
        this.data = data;
        conteudo.add(destino);
    }

    public void setConteudo(HashSet<Arquivo> conteudo) {
        this.conteudo = conteudo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public HashSet<Arquivo> getConteudo() {
        return conteudo;
    }

    @Override
    public int tamanho() {
        int soma = 0;
        for(Arquivo a: conteudo){
            soma += a.tamanho();
        }
        return soma;
    }
}
