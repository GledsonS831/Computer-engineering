import java.util.Arrays;

public class Arranjos {
    public static void main(String args[]){
        String nomes[] = new String[]{"Maria", "Joao", "Antonio"};
        System.out.println(nomes.length);
        Arrays.sort(nomes);

        Livro[] meusLivros = new Livro[3];
        meusLivros[0] = new Livro();
        meusLivros[1] = new Livro();
        meusLivros[2] = new Livro();
        meusLivros[0].setAutor("Katy Sierra");
        meusLivros[0].setTitulo("Head First Java");
        meusLivros[1].setTitulo("Core Java");
        meusLivros[1].setAutor("Marty Hall");
        meusLivros[2].setAutor("David Flanagan");
        meusLivros[2].setTitulo("Java in a nutshell");
    }
    //b)nao imprime posi a lista so acessa ate index 2
    public static void printArray(String []array){
        for(String i: array){
            System.out.println(i);
        }
    }
}
