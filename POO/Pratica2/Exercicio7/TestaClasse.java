public class TestaClasse {
    public static void main(String[]args){
        Aluno al = new Aluno("Gledson");
        al.setNota1(4);
        al.setNota2(5);
        System.out.println("Media final: "+al.calculaMediaf());
        System.out.println("Nota para aprovar: "+al.notaNecessaria());
    }
}
