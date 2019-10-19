public class ExcecaoGenerica {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128}; // vetor de numeradores
         int[] den = {2, 0, 4, 8, 0}; // vetor de denominadores
         for (int i=0; i<num.length; i++){
             try {
                 System.out.println(num[i] + "/" + den[i] + " = " + (num[i]/den[i]));
                 } catch(Exception e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                 }
            }
        }
}
