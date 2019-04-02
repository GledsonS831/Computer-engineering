package EscolaInfantil;

public class Aluno {
    private String Nome;
    private int Matricula;
    private String DataNascimento;
    private String NomeMae;
    private String MaterialEntregar;
    public static int totalAlunos;

    public Aluno(){
        Aluno.totalAlunos = totalAlunos + 1;
    }

    public void getTotalAlunos(){
        System.out.println("qnt");
        System.out.println(Aluno.totalAlunos);

    }

    public void setNome(String nome){
        this.Nome = nome;
    }
    public void setMatricula(int matricula){
        this.Matricula = matricula;
    }
    public  void setDataNascimento(String data){
        this.DataNascimento = data;
    }
    public void setNomeMae(String nome){
        this.NomeMae = nome;
    }
    public void setMaterialEntregar(String material){
        this.MaterialEntregar = material;
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
