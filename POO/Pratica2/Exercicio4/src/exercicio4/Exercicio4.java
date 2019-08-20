/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author ifpb
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppCliente c1, c2;
        c1 = new AppCliente();
        c1.nome("Bart");
        c1.setEndereco("Springfield");
        c1.setSexo('M');
        c2 = new AppCliente();
        c2.setNome("Lisa");
        c2.setEndereco("Springfield");
        c2.setSexo('F');
        c1.imprima();
        c2.imprima();
    }
    //ao compilar essa classe ocorre um erro, pois o atributo nome esta encapsulado
    //sendo necessario um metodo dentro da propria classe para poder utiliza-lo
}
