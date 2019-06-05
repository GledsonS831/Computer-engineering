package br.edu.ifpb;

import java.util.Scanner;

public class SaldoInsuficienteException extends Exception{
    @Override
    public String getMessage() {
        return "saldo errado idiota";
    }
}
