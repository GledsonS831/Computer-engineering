package br.com.bb;



public class participanteForum implements leitor, programador{
    String pensamento;
    public String lendo(){
        this.pensamento = "ala";
        return pensamento;
    }
    public void pensando(String ideias){
        String pensamento = new String();
    }
    public String digitando(){
        return pensamento;
    }
    public void falando(){
        System.out.println("nada");
    }
}
