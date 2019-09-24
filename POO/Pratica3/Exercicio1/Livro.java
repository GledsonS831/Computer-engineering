public class Livro {
    private String titulo;
    private String autor;
    public Livro(){}
    public Livro(String t, String a){
        this.titulo = t;
        this.autor = a;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String nome) {
        this.titulo = nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
