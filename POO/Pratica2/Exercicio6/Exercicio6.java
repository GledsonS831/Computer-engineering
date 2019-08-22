/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author ifpb
 */
public class Exercicio6 {

   
    public static void main(String[] args) {
        TrocaDinheiro troca = new TrocaDinheiro(1234);
        System.out.println("Notas de 100: "+troca.getCelulas100());
        System.out.println("Notas de 50: "+troca.getCelulas50());
        System.out.println("Notas de 20: "+troca.getCelulas20());
        System.out.println("Notas de 10 "+troca.getCelulas10());
        System.out.println("Notas de 5: "+troca.getCelulas5());
        System.out.println("Notas de 2: "+troca.getCelulas2());
        System.out.println("NOtas de 1: "+troca.getCelulas1());

    }

}
