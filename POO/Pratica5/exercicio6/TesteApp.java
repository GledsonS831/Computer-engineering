import java.io.EOFException;

public class TesteApp {
    public static void f (int i) {
        try {
            switch (i) {
                default:
                case 1: throw new Exception();
                case 2: throw new NumberFormatException();
                case 3: throw new EOFException();
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (EOFException e) {
            System.out.println("EOFException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}