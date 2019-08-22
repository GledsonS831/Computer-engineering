public class Aluno {
    private int mat;
    private double nota1, nota2, nota_trab, mf;
    private String nome;
    public Aluno(String nome){
        this.nome = nome;
    }
    public void setNota1(double n){
        this.nota1 = n;
    }
    public void setNota2(double n){
        this.nota2 = n;
    }
    public void setNota_trab(double n){
        this.nota_trab = n;
    }
    public double getNota1(){return this.nota1;}
    public double getNota2(){return this.nota2;}
    public double getNota_trab(){return this.nota_trab;}
    public double calculaMediaf(){
        this.mf = (this.nota1*2.5 + this.nota2*2.5 +this.nota_trab*2)/4.5;
        return this.mf;
    }
    public double notaNecessaria(){
        double aux = this.mf;
        if(7- aux >= 0){
            return 7-aux;
        }
        else{
            return -1;
        }
    }
}
