package EscolaInfantil;

/**
 * Hello world!
 *
 */
public class Professor
{
    private String Nome;
    private int Matricula;
    private String GrauInstrução;
    private double Salario;

    public Professor(String nome, int matricula, String GrauInstrução, double salario){
        this.Nome = nome;
        this.Matricula = matricula;
        this.GrauInstrução = GrauInstrução;
        this.Salario = salario;
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
