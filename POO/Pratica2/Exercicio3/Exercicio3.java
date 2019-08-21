
package exercicio3;


public class Exercicio3 {

    
    public static void main(String[] args) {
        AppCliente c1, c2;
        c1 = new AppCliente();
        c1.setNome("Bart");
        c1.setEndereco("Springfield");
        c1.setSexo('M');
        c2 = new AppCliente();
        c2.setNome("Lisa");
        c2.setEndereco("Springfield");
        c2.setSexo('F');
        c1.imprima();
        c2.imprima();
    }
    
}
