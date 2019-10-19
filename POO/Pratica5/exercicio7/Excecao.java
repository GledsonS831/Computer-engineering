import java.io.IOException;

public class Excecao{
    public static void metodo01() throws ClassNotFoundException {
        Class.forName("ClasseQueNaoExiste");
    }
    public static void metodo02() throws IOException {
        java.io.File.createTempFile("pre", "suf");
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        metodo01();
        metodo02();
    }
}