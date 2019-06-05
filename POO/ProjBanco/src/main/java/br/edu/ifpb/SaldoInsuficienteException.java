package br.edu.ifpb;


public class SaldoInsuficienteException extends Exception{
    @Override
    public String getMessage() {
        return "saldo errado idiota";
    }
}
