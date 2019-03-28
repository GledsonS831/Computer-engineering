package EscolaInfantil;

public class Professor
{
    private String Nome;
    private int Matricula;
    private String GrauInstrução;
    private double Salario;

    public void setNome(String nome){
        this.Nome = nome;
    }
    public void setMatricula(int matricula){
        this.Matricula = matricula;
    }
    public void setGrauInstrução(String grau){
        this.GrauInstrução = grau;
    }
    public  void setSalario(double valor){
        this.Salario = valor;
    }
    public String getNome(){
        return this.Nome;
    }
    public int getMatricula(){
        return this.Matricula;
    }
    public String getGrauInstrução(){
        return this.GrauInstrução;
    }
    public double getSalario(){
        return this.Salario;
    }
}
