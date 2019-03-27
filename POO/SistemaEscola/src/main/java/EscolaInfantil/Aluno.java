package EscolaInfantil;

public class Aluno {
    private String Nome;
    private int Matricula;
    private String DataNascimento;
    private String NomeMae;
    private String MaterialEntregar;

    public Aluno(String nome, int matricula, String dataNasciento, String mae){
        this.Nome = nome;
        this.Matricula = matricula;
        this.DataNascimento = dataNasciento;
        this.NomeMae = mae;
    }

    public String getNome(){
        return this.Nome;
    }
    public int getMatricula(){
        return this.Matricula;
    }
    public String getDataNascimento(){
        return this.DataNascimento;
    }
    public String getNomeMae(){
        return this.NomeMae;
    }
    public String getMaterialEntregar(){
        return this.MaterialEntregar;
    }
}
