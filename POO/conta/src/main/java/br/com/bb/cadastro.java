package br.com.bb;

public class cadastro {
    public static void main(String[] args){
        participanteForum participante = new participanteForum();
        leitor leitor = participante;
        programador programador = participante;
        programador.falando();
    }
}
