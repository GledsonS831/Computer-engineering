package br.edu.ifpb;

import java.io.IOException;
import java.util.Scanner;

public class Menu{
    private int opção;
    private double sacado = 0;
    private double depositado = 0;

    public void exibirMenu(ContaCorrente conta) throws Exception {
        System.out.println("--- Projeto Conta Corrente ---");
        System.out.println("1. Saque");
        System.out.println("2. Deposito");
        System.out.println("3. Saldo na tela");
        System.out.println("4. Extrato na tela");
        System.out.println("5. Sair");
        System.out.println("----------------------------------------");
        while(opção != 5){
            System.out.print("    Digite uma opção: ");
            Scanner input = new Scanner(System.in);
            String op;
            op = input.next();
            if(Character.isLetter(op.codePointAt(0))){
                throw new EntradaInvalidaException();
            }
            else{
                this.opção = Integer.parseInt(op);
            }


            if(this.opção == 1){
                double sac = 0;
                System.out.print("    Digite um saque: ");
                sac = input.nextDouble();
                if(sac < 0){
                    throw new QuantiaNegativaException();
                }
                else{
                    conta.Sacar(sac);
                    this.sacado += sac;
                }

            }
            else if(this.opção == 2){
                double dep = 0;
                Scanner valor = new Scanner(System.in);
                System.out.print("    Digite um deposito: ");
                dep = valor.nextDouble();
                if(dep < 0){
                    throw new QuantiaNegativaException();
                }
                this.depositado += dep;
                conta.Deposito(dep);
            }
            else if(this.opção == 3){
                System.out.println("    Saldo: "+conta.getSaldo());
            }
            else if(this.opção == 4){
                System.out.println(conta.toString());
            }
        }
        System.out.println("Obrigado por comparesser ao banco!");
    }
}
