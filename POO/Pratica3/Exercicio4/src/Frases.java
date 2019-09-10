public class Frases {
    public static void main(String[] args){
        String []artigo = {"o", "a", "uma", "algum", "qualquer"};
        String []substantivo = {"menino", "menina", "cachorro", "cidade", "carro"};
        String []verbo = {"dirigiu", "pulou", "correu", "caminhou", "saltou"};
        String []preposição = {"para de", "acima de", "debaixo de", "sobre"};
        String frase = null;

        for(int i = 0; i < 20; i++){
            int n= (int)(Math.random()*4);
            String nova = artigo[n];
            nova = nova.substring(0, 1).toUpperCase().concat(nova.substring(1));
            frase = nova+" ";
            n = (int)(Math.random()*4);
            frase = frase+substantivo[n]+" ";
            n = (int)(Math.random()*4);
            frase=frase+verbo[n]+" ";
            n = (int)(Math.random()*4);
            frase=frase+preposição[n]+" ";
            n = (int)(Math.random()*4);
            frase=frase+artigo[n]+" ";
            n = (int)(Math.random()*4);
            frase = frase+substantivo[n]+".";
            System.out.println(frase);
            frase = null;
        }
    }
}
