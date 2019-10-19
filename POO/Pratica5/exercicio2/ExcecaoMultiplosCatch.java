public class ExcecaoMultiplosCatch {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128};
        int[] den = {2, 0, 4, 8, 0};
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + "/" + den[i] + " = " + (num[i] / den[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero.");
            } catch (Throwable e) {
                System.out.println("Ocorreu um erro.");
            }
        }
    }
}