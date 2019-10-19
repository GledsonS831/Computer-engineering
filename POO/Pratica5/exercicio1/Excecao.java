public class Excecao {
 public static void main(String[] args) {
         try{
             int []vetor = new int[4];
             System.out.println("Antes da Exceção.");
             vetor[4] = 1;
             System.out.println("Essa mensagem não será exibida.");
             } catch(ArrayIndexOutOfBoundsException exception){
             System.out.println("Acesso a um índide do vetor que não existe.");
             }
         System.out.println("Essa mensagem será exibida após a exceção.");
         }
}