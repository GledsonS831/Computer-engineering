public class Aplicacao {
    public static void main(String[] args) throws NullPointerException{
        byte arr[] = new byte[10];
        ArqDados arq = new ArqDados("Minha prova", arr);
        Arquivo arquivo = arq;
        Link link = new Link("Novo pc", arquivo);
        Data data = new Data();
        Pasta p1 = new Pasta("Minha pasta",  data.hoje(), arquivo);
    }
}
